package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dl")
public class class120 {

    @ObfuscatedName("dl.s")
    public Inflater field2015;

    public class120() {
        this(-1, 1000000, 1000000);
    }

    public class120(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dl.s(Ldy;[BB)V")
    public void method2306(class123 arg0, byte[] arg1) {
        if (arg0.field2033[arg0.field2028] != 31 || arg0.field2033[arg0.field2028 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2015 == null) {
            this.field2015 = new Inflater(true);
        }
        try {
            this.field2015.setInput(arg0.field2033, arg0.field2028 + 10, arg0.field2033.length - (arg0.field2028 + 10 + 8));
            this.field2015.inflate(arg1);
        } catch (Exception var4) {
            this.field2015.reset();
            throw new RuntimeException("");
        }
        this.field2015.reset();
    }
}
