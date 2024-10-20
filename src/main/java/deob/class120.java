package deob;

import java.util.zip.Inflater;

@ObfuscatedName("da")
public class class120 {

    @ObfuscatedName("da.m")
    public Inflater field2034;

    public class120() {
        this(-1, 1000000, 1000000);
    }

    public class120(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("da.m(Ldj;[BI)V")
    public void method2359(class123 arg0, byte[] arg1) {
        if (arg0.field2048[arg0.field2046] != 31 || arg0.field2048[arg0.field2046 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2034 == null) {
            this.field2034 = new Inflater(true);
        }
        try {
            this.field2034.setInput(arg0.field2048, arg0.field2046 + 10, arg0.field2048.length - (arg0.field2046 + 10 + 8));
            this.field2034.inflate(arg1);
        } catch (Exception var4) {
            this.field2034.reset();
            throw new RuntimeException("");
        }
        this.field2034.reset();
    }
}
