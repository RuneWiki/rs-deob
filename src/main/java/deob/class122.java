package deob;

import java.util.zip.Inflater;

@ObfuscatedName("da")
public class class122 {

    @ObfuscatedName("da.i")
    public Inflater field2018;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("da.i(Ldn;[BI)V")
    public void method2339(class127 arg0, byte[] arg1) {
        if (arg0.field2039[arg0.field2037] != 31 || arg0.field2039[arg0.field2037 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2018 == null) {
            this.field2018 = new Inflater(true);
        }
        try {
            this.field2018.setInput(arg0.field2039, arg0.field2037 + 10, arg0.field2039.length - (arg0.field2037 + 10 + 8));
            this.field2018.inflate(arg1);
        } catch (Exception var4) {
            this.field2018.reset();
            throw new RuntimeException("");
        }
        this.field2018.reset();
    }
}
