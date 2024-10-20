package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cw")
public class class104 {

    @ObfuscatedName("cw.g")
    public Inflater field1828;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cw.g(Ldm;[BB)V")
    public void method2085(class107 arg0, byte[] arg1) {
        if (arg0.field1840[arg0.field1839] != 31 || arg0.field1840[arg0.field1839 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1828 == null) {
            this.field1828 = new Inflater(true);
        }
        try {
            this.field1828.setInput(arg0.field1840, arg0.field1839 + 10, arg0.field1840.length - (arg0.field1839 + 10 + 8));
            this.field1828.inflate(arg1);
        } catch (Exception var4) {
            this.field1828.reset();
            throw new RuntimeException("");
        }
        this.field1828.reset();
    }
}
