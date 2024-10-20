package deob;

import java.util.zip.Inflater;

@ObfuscatedName("db")
public class class108 {

    @ObfuscatedName("db.b")
    public Inflater field1872;

    public class108() {
        this(-1, 1000000, 1000000);
    }

    public class108(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("db.b(Ldj;[BI)V")
    public void method2076(class111 arg0, byte[] arg1) {
        if (arg0.field1897[arg0.field1894] != 31 || arg0.field1897[arg0.field1894 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1872 == null) {
            this.field1872 = new Inflater(true);
        }
        try {
            this.field1872.setInput(arg0.field1897, arg0.field1894 + 10, arg0.field1897.length - (arg0.field1894 + 10 + 8));
            this.field1872.inflate(arg1);
        } catch (Exception var4) {
            this.field1872.reset();
            throw new RuntimeException("");
        }
        this.field1872.reset();
    }
}
