package deob;

import java.util.zip.Inflater;

@ObfuscatedName("db")
public class class105 {

    @ObfuscatedName("db.x")
    public Inflater field1827;

    public class105() {
        this(-1, 1000000, 1000000);
    }

    public class105(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("db.x(Ldm;[BI)V")
    public void method2078(class108 arg0, byte[] arg1) {
        if (arg0.field1839[arg0.field1841] != 31 || arg0.field1839[arg0.field1841 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1827 == null) {
            this.field1827 = new Inflater(true);
        }
        try {
            this.field1827.setInput(arg0.field1839, arg0.field1841 + 10, arg0.field1839.length - (arg0.field1841 + 10 + 8));
            this.field1827.inflate(arg1);
        } catch (Exception var4) {
            this.field1827.reset();
            throw new RuntimeException("");
        }
        this.field1827.reset();
    }
}
