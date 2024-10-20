package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dd")
public class class120 {

    @ObfuscatedName("dd.l")
    public Inflater field2037;

    public class120() {
        this(-1, 1000000, 1000000);
    }

    public class120(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dd.l(Ldc;[BI)V")
    public void method2427(class123 arg0, byte[] arg1) {
        if (arg0.field2052[arg0.field2051] != 31 || arg0.field2052[arg0.field2051 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2037 == null) {
            this.field2037 = new Inflater(true);
        }
        try {
            this.field2037.setInput(arg0.field2052, arg0.field2051 + 10, arg0.field2052.length - (arg0.field2051 + 10 + 8));
            this.field2037.inflate(arg1);
        } catch (Exception var4) {
            this.field2037.reset();
            throw new RuntimeException("");
        }
        this.field2037.reset();
    }
}
