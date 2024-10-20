package deob;

import java.util.zip.Inflater;

@ObfuscatedName("de")
public class class108 {

    @ObfuscatedName("de.n")
    public Inflater field1884;

    public class108() {
        this(-1, 1000000, 1000000);
    }

    public class108(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("de.n(Ldp;[BI)V")
    public void method2159(class111 arg0, byte[] arg1) {
        if (arg0.field1904[arg0.field1896] != 31 || arg0.field1904[arg0.field1896 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1884 == null) {
            this.field1884 = new Inflater(true);
        }
        try {
            this.field1884.setInput(arg0.field1904, arg0.field1896 + 10, arg0.field1904.length - (arg0.field1896 + 10 + 8));
            this.field1884.inflate(arg1);
        } catch (Exception var4) {
            this.field1884.reset();
            throw new RuntimeException("");
        }
        this.field1884.reset();
    }
}
