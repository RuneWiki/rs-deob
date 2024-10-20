package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dw")
public class class120 {

    @ObfuscatedName("dw.k")
    public Inflater field2041;

    public class120() {
        this(-1, 1000000, 1000000);
    }

    public class120(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dw.k(Lde;[BB)V")
    public void method2374(class123 arg0, byte[] arg1) {
        if (arg0.field2054[arg0.field2060] != 31 || arg0.field2054[arg0.field2060 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2041 == null) {
            this.field2041 = new Inflater(true);
        }
        try {
            this.field2041.setInput(arg0.field2054, arg0.field2060 + 10, arg0.field2054.length - (arg0.field2060 + 10 + 8));
            this.field2041.inflate(arg1);
        } catch (Exception var4) {
            this.field2041.reset();
            throw new RuntimeException("");
        }
        this.field2041.reset();
    }
}
