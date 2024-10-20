package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cx")
public class class104 {

    @ObfuscatedName("cx.k")
    public Inflater field1826;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cx.k(Ldy;[BI)V")
    public void method2078(class107 arg0, byte[] arg1) {
        if (arg0.field1844[arg0.field1838] != 31 || arg0.field1844[arg0.field1838 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1826 == null) {
            this.field1826 = new Inflater(true);
        }
        try {
            this.field1826.setInput(arg0.field1844, arg0.field1838 + 10, arg0.field1844.length - (arg0.field1838 + 10 + 8));
            this.field1826.inflate(arg1);
        } catch (Exception var4) {
            this.field1826.reset();
            throw new RuntimeException("");
        }
        this.field1826.reset();
    }
}
