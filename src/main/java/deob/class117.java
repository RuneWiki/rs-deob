package deob;

import java.util.zip.Inflater;

@ObfuscatedName("du")
public class class117 {

    @ObfuscatedName("du.f")
    public Inflater field1985;

    public class117() {
        this(-1, 1000000, 1000000);
    }

    public class117(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("du.f(Ldj;[BI)V")
    public void method2332(class120 arg0, byte[] arg1) {
        if (arg0.field2001[arg0.field1999] != 31 || arg0.field2001[arg0.field1999 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1985 == null) {
            this.field1985 = new Inflater(true);
        }
        try {
            this.field1985.setInput(arg0.field2001, arg0.field1999 + 10, arg0.field2001.length - (arg0.field1999 + 10 + 8));
            this.field1985.inflate(arg1);
        } catch (Exception var4) {
            this.field1985.reset();
            throw new RuntimeException("");
        }
        this.field1985.reset();
    }
}
