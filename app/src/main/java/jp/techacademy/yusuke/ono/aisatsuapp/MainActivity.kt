package jp.techacademy.yusuke.ono.aisatsuapp

import android.app.TimePickerDialog
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() ,View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
        }
    }

        private fun showTimePickerDialog() {

            val timePickerDialog = TimePickerDialog(
                this,
               TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                 var str :String
                 when(hour) {
                    in 2..9 -> str = "おはよう"
                    in 10..17 -> str = "こんにちは"
                    else -> str = "こんばんは"
               }
                   TextView.text = str
               },
                13, 0, true)
            timePickerDialog.show()
        }
    }

//以下別の書き方

//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        button1.setOnClickListener {
//                val timePickerDialog = TimePickerDialog(
//                    this,
//                    TimePickerDialog.OnTimeSetListener { view, hour, minute ->
//                        var str: String
//                        when (hour) {
//                            in 2..9 -> str = "おはよう"
//                            in 10..17 -> str = "こんにちは"
//                            else -> str = "こんばんは"
//                        }
//                        TextView.text = str
//                    },
//                    13, 0, true
//                )
//                timePickerDialog.show()
//            }
//        }
//    }
