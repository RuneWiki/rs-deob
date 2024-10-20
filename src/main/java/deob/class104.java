package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ct")
public class class104 {

    @ObfuscatedName("ct.n")
    public Inflater field1808;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ct.n(Ldw;[BB)V")
    public void method2086(class107 arg0, byte[] arg1) {
        if (arg0.field1829[arg0.field1826] != 31 || arg0.field1829[arg0.field1826 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1808 == null) {
            this.field1808 = new Inflater(true);
        }
        try {
            this.field1808.setInput(arg0.field1829, arg0.field1826 + 10, arg0.field1829.length - (arg0.field1826 + 10 + 8));
            this.field1808.inflate(arg1);
        } catch (Exception var4) {
            this.field1808.reset();
            throw new RuntimeException("");
        }
        this.field1808.reset();
    }
}
