package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cf")
public class class104 {

    @ObfuscatedName("cf.y")
    public Inflater field1839;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cf.y(Ldo;[BB)V")
    public void method2056(class107 arg0, byte[] arg1) {
        if (arg0.field1856[arg0.field1854] != 31 || arg0.field1856[arg0.field1854 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1839 == null) {
            this.field1839 = new Inflater(true);
        }
        try {
            this.field1839.setInput(arg0.field1856, arg0.field1854 + 10, arg0.field1856.length - (arg0.field1854 + 10 + 8));
            this.field1839.inflate(arg1);
        } catch (Exception var4) {
            this.field1839.reset();
            throw new RuntimeException("");
        }
        this.field1839.reset();
    }
}
