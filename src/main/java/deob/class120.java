package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dc")
public class class120 {

    @ObfuscatedName("dc.i")
    public Inflater field2030;

    public class120() {
        this(-1, 1000000, 1000000);
    }

    public class120(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dc.i(Ldn;[BI)V")
    public void method2347(class123 arg0, byte[] arg1) {
        if (arg0.field2049[arg0.field2046] != 31 || arg0.field2049[arg0.field2046 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2030 == null) {
            this.field2030 = new Inflater(true);
        }
        try {
            this.field2030.setInput(arg0.field2049, arg0.field2046 + 10, arg0.field2049.length - (arg0.field2046 + 10 + 8));
            this.field2030.inflate(arg1);
        } catch (Exception var4) {
            this.field2030.reset();
            throw new RuntimeException("");
        }
        this.field2030.reset();
    }
}
