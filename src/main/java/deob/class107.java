package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dw")
public class class107 {

    @ObfuscatedName("dw.v")
    public Inflater field1835;

    public class107() {
        this(-1, 1000000, 1000000);
    }

    public class107(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dw.v(Ldp;[BI)V")
    public void method2104(class110 arg0, byte[] arg1) {
        if (arg0.field1853[arg0.field1847] != 31 || arg0.field1853[arg0.field1847 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1835 == null) {
            this.field1835 = new Inflater(true);
        }
        try {
            this.field1835.setInput(arg0.field1853, arg0.field1847 + 10, arg0.field1853.length - (arg0.field1847 + 10 + 8));
            this.field1835.inflate(arg1);
        } catch (Exception var4) {
            this.field1835.reset();
            throw new RuntimeException("");
        }
        this.field1835.reset();
    }
}
