package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dh")
public class class105 {

    @ObfuscatedName("dh.c")
    public Inflater field1812;

    public class105() {
        this(-1, 1000000, 1000000);
    }

    public class105(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dh.c(Ldx;[BI)V")
    public void method2076(class108 arg0, byte[] arg1) {
        if (arg0.field1830[arg0.field1826] != 31 || arg0.field1830[arg0.field1826 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1812 == null) {
            this.field1812 = new Inflater(true);
        }
        try {
            this.field1812.setInput(arg0.field1830, arg0.field1826 + 10, arg0.field1830.length - (arg0.field1826 + 10 + 8));
            this.field1812.inflate(arg1);
        } catch (Exception var4) {
            this.field1812.reset();
            throw new RuntimeException("");
        }
        this.field1812.reset();
    }
}
