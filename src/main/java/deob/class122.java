package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dw")
public class class122 {

    @ObfuscatedName("dw.a")
    public Inflater field2009;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dw.a(Ldy;[BI)V")
    public void method2348(class127 arg0, byte[] arg1) {
        if (arg0.field2036[arg0.field2035] != 31 || arg0.field2036[arg0.field2035 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2009 == null) {
            this.field2009 = new Inflater(true);
        }
        try {
            this.field2009.setInput(arg0.field2036, arg0.field2035 + 10, arg0.field2036.length - (arg0.field2035 + 10 + 8));
            this.field2009.inflate(arg1);
        } catch (Exception var4) {
            this.field2009.reset();
            throw new RuntimeException("");
        }
        this.field2009.reset();
    }
}
