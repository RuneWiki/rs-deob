package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dl")
public class class108 {

    @ObfuscatedName("dl.q")
    public Inflater field1840;

    public class108() {
        this(-1, 1000000, 1000000);
    }

    public class108(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dl.q(Ldx;[BI)V")
    public void method2096(class111 arg0, byte[] arg1) {
        if (arg0.field1859[arg0.field1852] != 31 || arg0.field1859[arg0.field1852 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1840 == null) {
            this.field1840 = new Inflater(true);
        }
        try {
            this.field1840.setInput(arg0.field1859, arg0.field1852 + 10, arg0.field1859.length - (arg0.field1852 + 10 + 8));
            this.field1840.inflate(arg1);
        } catch (Exception var4) {
            this.field1840.reset();
            throw new RuntimeException("");
        }
        this.field1840.reset();
    }
}
