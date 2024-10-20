package deob;

import java.util.zip.Inflater;

@ObfuscatedName("db")
public class class117 {

    @ObfuscatedName("db.j")
    public Inflater field1959;

    public class117() {
        this(-1, 1000000, 1000000);
    }

    public class117(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("db.j(Ldx;[BB)V")
    public void method2305(class120 arg0, byte[] arg1) {
        if (arg0.field1974[arg0.field1972] != 31 || arg0.field1974[arg0.field1972 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1959 == null) {
            this.field1959 = new Inflater(true);
        }
        try {
            this.field1959.setInput(arg0.field1974, arg0.field1972 + 10, arg0.field1974.length - (arg0.field1972 + 10 + 8));
            this.field1959.inflate(arg1);
        } catch (Exception var4) {
            this.field1959.reset();
            throw new RuntimeException("");
        }
        this.field1959.reset();
    }
}
