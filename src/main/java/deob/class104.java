package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cj")
public class class104 {

    @ObfuscatedName("cj.e")
    public Inflater field1825;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cj.e(Ldp;[BI)V")
    public void method2085(class107 arg0, byte[] arg1) {
        if (arg0.field1845[arg0.field1841] != 31 || arg0.field1845[arg0.field1841 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1825 == null) {
            this.field1825 = new Inflater(true);
        }
        try {
            this.field1825.setInput(arg0.field1845, arg0.field1841 + 10, arg0.field1845.length - (arg0.field1841 + 10 + 8));
            this.field1825.inflate(arg1);
        } catch (Exception var4) {
            this.field1825.reset();
            throw new RuntimeException("");
        }
        this.field1825.reset();
    }
}
