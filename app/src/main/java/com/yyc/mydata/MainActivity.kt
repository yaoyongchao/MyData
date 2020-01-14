package com.yyc.mydata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yyc.mydata.arry.ArrayActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 数据结构
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        btn1.setOnClickListener {
            startActivity(Intent(this,ArrayActivity::class.java))
        }
    }

}
