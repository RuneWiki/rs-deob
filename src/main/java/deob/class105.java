package deob;

import java.util.zip.Inflater;

@ObfuscatedName("df")
public class class105 {

    @ObfuscatedName("df.f")
    public Inflater field1833;

    public class105() {
        this(-1, 1000000, 1000000);
    }

    public class105(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("df.f(Ldu;[BI)V")
    public void method2111(class108 arg0, byte[] arg1) {
        if (arg0.field1854[arg0.field1859] != 31 || arg0.field1854[arg0.field1859 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1833 == null) {
            this.field1833 = new Inflater(true);
        }
        try {
            this.field1833.setInput(arg0.field1854, arg0.field1859 + 10, arg0.field1854.length - (arg0.field1859 + 10 + 8));
            this.field1833.inflate(arg1);
        } catch (Exception var4) {
            this.field1833.reset();
            throw new RuntimeException("");
        }
        this.field1833.reset();
    }
}
