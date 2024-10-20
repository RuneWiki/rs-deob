package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dj")
public class class122 {

    @ObfuscatedName("dj.y")
    public Inflater field2013;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dj.y(Ldp;[BI)V")
    public void method2403(class127 arg0, byte[] arg1) {
        if (arg0.field2037[arg0.field2036] != 31 || arg0.field2037[arg0.field2036 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2013 == null) {
            this.field2013 = new Inflater(true);
        }
        try {
            this.field2013.setInput(arg0.field2037, arg0.field2036 + 10, arg0.field2037.length - (arg0.field2036 + 10 + 8));
            this.field2013.inflate(arg1);
        } catch (Exception var4) {
            this.field2013.reset();
            throw new RuntimeException("");
        }
        this.field2013.reset();
    }
}
