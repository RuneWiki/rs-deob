package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cw")
public class class104 {

    @ObfuscatedName("cw.t")
    public Inflater field1816;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cw.t(Ldg;[BB)V")
    public void method2068(class107 arg0, byte[] arg1) {
        if (arg0.field1826[arg0.field1827] != 31 || arg0.field1826[arg0.field1827 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1816 == null) {
            this.field1816 = new Inflater(true);
        }
        try {
            this.field1816.setInput(arg0.field1826, arg0.field1827 + 10, arg0.field1826.length - (arg0.field1827 + 10 + 8));
            this.field1816.inflate(arg1);
        } catch (Exception var4) {
            this.field1816.reset();
            throw new RuntimeException("");
        }
        this.field1816.reset();
    }
}
