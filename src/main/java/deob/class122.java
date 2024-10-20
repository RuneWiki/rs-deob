package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dj")
public class class122 {

    @ObfuscatedName("dj.b")
    public Inflater field2036;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dj.b(Ldv;[BI)V")
    public void method2335(class127 arg0, byte[] arg1) {
        if (arg0.field2056[arg0.field2051] != 31 || arg0.field2056[arg0.field2051 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2036 == null) {
            this.field2036 = new Inflater(true);
        }
        try {
            this.field2036.setInput(arg0.field2056, arg0.field2051 + 10, arg0.field2056.length - (arg0.field2051 + 10 + 8));
            this.field2036.inflate(arg1);
        } catch (Exception var4) {
            this.field2036.reset();
            throw new RuntimeException("");
        }
        this.field2036.reset();
    }
}
