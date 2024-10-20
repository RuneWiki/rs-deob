package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cr")
public class class104 {

    @ObfuscatedName("cr.e")
    public Inflater field1827;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cr.e(Ldl;[BI)V")
    public void method2016(class107 arg0, byte[] arg1) {
        if (arg0.field1840[arg0.field1841] != 31 || arg0.field1840[arg0.field1841 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1827 == null) {
            this.field1827 = new Inflater(true);
        }
        try {
            this.field1827.setInput(arg0.field1840, arg0.field1841 + 10, arg0.field1840.length - (arg0.field1841 + 10 + 8));
            this.field1827.inflate(arg1);
        } catch (Exception var4) {
            this.field1827.reset();
            throw new RuntimeException("");
        }
        this.field1827.reset();
    }
}
