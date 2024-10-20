package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dt")
public class class122 {

    @ObfuscatedName("dt.d")
    public Inflater field2013;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dt.d(Ldo;[BB)V")
    public void method2329(class127 arg0, byte[] arg1) {
        if (arg0.field2035[arg0.field2042] != 31 || arg0.field2035[arg0.field2042 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2013 == null) {
            this.field2013 = new Inflater(true);
        }
        try {
            this.field2013.setInput(arg0.field2035, arg0.field2042 + 10, arg0.field2035.length - (arg0.field2042 + 10 + 8));
            this.field2013.inflate(arg1);
        } catch (Exception var4) {
            this.field2013.reset();
            throw new RuntimeException("");
        }
        this.field2013.reset();
    }
}
