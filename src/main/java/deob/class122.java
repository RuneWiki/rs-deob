package deob;

import java.util.zip.Inflater;

@ObfuscatedName("de")
public class class122 {

    @ObfuscatedName("de.q")
    public Inflater field2017;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("de.q(Ldo;[BI)V")
    public void method2358(class127 arg0, byte[] arg1) {
        if (arg0.field2042[arg0.field2039] != 31 || arg0.field2042[arg0.field2039 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2017 == null) {
            this.field2017 = new Inflater(true);
        }
        try {
            this.field2017.setInput(arg0.field2042, arg0.field2039 + 10, arg0.field2042.length - (arg0.field2039 + 10 + 8));
            this.field2017.inflate(arg1);
        } catch (Exception var4) {
            this.field2017.reset();
            throw new RuntimeException("");
        }
        this.field2017.reset();
    }
}
