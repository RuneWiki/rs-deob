package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dl")
public class class122 {

    @ObfuscatedName("dl.a")
    public Inflater field2000;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dl.a(Ldf;[BI)V")
    public void method2324(class126 arg0, byte[] arg1) {
        if (arg0.field2015[arg0.field2016] != 31 || arg0.field2015[arg0.field2016 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2000 == null) {
            this.field2000 = new Inflater(true);
        }
        try {
            this.field2000.setInput(arg0.field2015, arg0.field2016 + 10, arg0.field2015.length - (arg0.field2016 + 10 + 8));
            this.field2000.inflate(arg1);
        } catch (Exception var4) {
            this.field2000.reset();
            throw new RuntimeException("");
        }
        this.field2000.reset();
    }
}
