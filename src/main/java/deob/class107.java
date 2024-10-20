package deob;

import java.util.zip.Inflater;

@ObfuscatedName("da")
public class class107 {

    @ObfuscatedName("da.p")
    public Inflater field1826;

    public class107() {
        this(-1, 1000000, 1000000);
    }

    public class107(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("da.p(Ldg;[BI)V")
    public void method2072(class110 arg0, byte[] arg1) {
        if (arg0.field1844[arg0.field1842] != 31 || arg0.field1844[arg0.field1842 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1826 == null) {
            this.field1826 = new Inflater(true);
        }
        try {
            this.field1826.setInput(arg0.field1844, arg0.field1842 + 10, arg0.field1844.length - (arg0.field1842 + 10 + 8));
            this.field1826.inflate(arg1);
        } catch (Exception var4) {
            this.field1826.reset();
            throw new RuntimeException("");
        }
        this.field1826.reset();
    }
}
