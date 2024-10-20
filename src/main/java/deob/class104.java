package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ca")
public class class104 {

    @ObfuscatedName("ca.z")
    public Inflater field1801;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ca.z(Ldq;[BI)V")
    public void method2074(class107 arg0, byte[] arg1) {
        if (arg0.field1823[arg0.field1819] != 31 || arg0.field1823[arg0.field1819 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1801 == null) {
            this.field1801 = new Inflater(true);
        }
        try {
            this.field1801.setInput(arg0.field1823, arg0.field1819 + 10, arg0.field1823.length - (arg0.field1819 + 10 + 8));
            this.field1801.inflate(arg1);
        } catch (Exception var4) {
            this.field1801.reset();
            throw new RuntimeException("");
        }
        this.field1801.reset();
    }
}
