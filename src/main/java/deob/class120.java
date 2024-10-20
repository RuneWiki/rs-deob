package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dz")
public class class120 {

    @ObfuscatedName("dz.x")
    public Inflater field2040;

    public class120() {
        this(-1, 1000000, 1000000);
    }

    public class120(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dz.x(Ldp;[BB)V")
    public void method2356(class123 arg0, byte[] arg1) {
        if (arg0.field2056[arg0.field2057] != 31 || arg0.field2056[arg0.field2057 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2040 == null) {
            this.field2040 = new Inflater(true);
        }
        try {
            this.field2040.setInput(arg0.field2056, arg0.field2057 + 10, arg0.field2056.length - (arg0.field2057 + 10 + 8));
            this.field2040.inflate(arg1);
        } catch (Exception var4) {
            this.field2040.reset();
            throw new RuntimeException("");
        }
        this.field2040.reset();
    }
}
