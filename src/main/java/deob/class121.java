package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dp")
public class class121 {

    @ObfuscatedName("dp.g")
    public Inflater field1988;

    public class121() {
        this(-1, 1000000, 1000000);
    }

    public class121(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dp.g(Ldu;[BI)V")
    public void method2426(class126 arg0, byte[] arg1) {
        if (arg0.field2013[arg0.field2016] != 31 || arg0.field2013[arg0.field2016 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1988 == null) {
            this.field1988 = new Inflater(true);
        }
        try {
            this.field1988.setInput(arg0.field2013, arg0.field2016 + 10, arg0.field2013.length - (arg0.field2016 + 10 + 8));
            this.field1988.inflate(arg1);
        } catch (Exception var4) {
            this.field1988.reset();
            throw new RuntimeException("");
        }
        this.field1988.reset();
    }
}
