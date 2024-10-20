package deob;

import java.util.zip.Inflater;

@ObfuscatedName("do")
public class class105 {

    @ObfuscatedName("do.e")
    public Inflater field1830;

    public class105() {
        this(-1, 1000000, 1000000);
    }

    public class105(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("do.e(Ldd;[BB)V")
    public void method2061(class108 arg0, byte[] arg1) {
        if (arg0.field1842[arg0.field1841] != 31 || arg0.field1842[arg0.field1841 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1830 == null) {
            this.field1830 = new Inflater(true);
        }
        try {
            this.field1830.setInput(arg0.field1842, arg0.field1841 + 10, arg0.field1842.length - (arg0.field1841 + 10 + 8));
            this.field1830.inflate(arg1);
        } catch (Exception var4) {
            this.field1830.reset();
            throw new RuntimeException("");
        }
        this.field1830.reset();
    }
}
