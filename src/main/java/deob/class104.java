package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cg")
public class class104 {

    @ObfuscatedName("cg.k")
    public Inflater field1846;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cg.k(Lde;[BI)V")
    public void method2062(class107 arg0, byte[] arg1) {
        if (arg0.field1865[arg0.field1863] != 31 || arg0.field1865[arg0.field1863 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1846 == null) {
            this.field1846 = new Inflater(true);
        }
        try {
            this.field1846.setInput(arg0.field1865, arg0.field1863 + 10, arg0.field1865.length - (arg0.field1863 + 10 + 8));
            this.field1846.inflate(arg1);
        } catch (Exception var4) {
            this.field1846.reset();
            throw new RuntimeException("");
        }
        this.field1846.reset();
    }
}
