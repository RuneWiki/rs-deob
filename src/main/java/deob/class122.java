package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dt")
public class class122 {

    @ObfuscatedName("dt.p")
    public Inflater field2014;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dt.p(Ldj;[BI)V")
    public void method2421(class127 arg0, byte[] arg1) {
        if (arg0.field2033[arg0.field2029] != 31 || arg0.field2033[arg0.field2029 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2014 == null) {
            this.field2014 = new Inflater(true);
        }
        try {
            this.field2014.setInput(arg0.field2033, arg0.field2029 + 10, arg0.field2033.length - (arg0.field2029 + 10 + 8));
            this.field2014.inflate(arg1);
        } catch (Exception var4) {
            this.field2014.reset();
            throw new RuntimeException("");
        }
        this.field2014.reset();
    }
}
