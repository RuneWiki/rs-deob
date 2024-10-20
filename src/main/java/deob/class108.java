package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dp")
public class class108 {

    @ObfuscatedName("dp.e")
    public Inflater field1817;

    public class108() {
        this(-1, 1000000, 1000000);
    }

    public class108(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dp.e(Ldh;[BI)V")
    public void method2122(class111 arg0, byte[] arg1) {
        if (arg0.field1835[arg0.field1834] != 31 || arg0.field1835[arg0.field1834 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1817 == null) {
            this.field1817 = new Inflater(true);
        }
        try {
            this.field1817.setInput(arg0.field1835, arg0.field1834 + 10, arg0.field1835.length - (arg0.field1834 + 10 + 8));
            this.field1817.inflate(arg1);
        } catch (Exception var4) {
            this.field1817.reset();
            throw new RuntimeException("");
        }
        this.field1817.reset();
    }
}
