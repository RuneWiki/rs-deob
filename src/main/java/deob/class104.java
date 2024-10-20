package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cu")
public class class104 {

    @ObfuscatedName("cu.t")
    public Inflater field1814;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cu.t(Ldb;[BI)V")
    public void method2047(class107 arg0, byte[] arg1) {
        if (arg0.field1831[arg0.field1830] != 31 || arg0.field1831[arg0.field1830 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1814 == null) {
            this.field1814 = new Inflater(true);
        }
        try {
            this.field1814.setInput(arg0.field1831, arg0.field1830 + 10, arg0.field1831.length - (arg0.field1830 + 10 + 8));
            this.field1814.inflate(arg1);
        } catch (Exception var4) {
            this.field1814.reset();
            throw new RuntimeException("");
        }
        this.field1814.reset();
    }
}
