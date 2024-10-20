package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dv")
public class class105 {

    @ObfuscatedName("dv.l")
    public Inflater field1810;

    public class105() {
        this(-1, 1000000, 1000000);
    }

    public class105(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dv.l(Ldk;[BI)V")
    public void method2102(class108 arg0, byte[] arg1) {
        if (arg0.field1828[arg0.field1823] != 31 || arg0.field1828[arg0.field1823 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1810 == null) {
            this.field1810 = new Inflater(true);
        }
        try {
            this.field1810.setInput(arg0.field1828, arg0.field1823 + 10, arg0.field1828.length - (arg0.field1823 + 10 + 8));
            this.field1810.inflate(arg1);
        } catch (Exception var4) {
            this.field1810.reset();
            throw new RuntimeException("");
        }
        this.field1810.reset();
    }
}
