package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dq")
public class class120 {

    @ObfuscatedName("dq.f")
    public Inflater field2042;

    public class120() {
        this(-1, 1000000, 1000000);
    }

    public class120(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dq.f(Ldx;[BB)V")
    public void method2344(class123 arg0, byte[] arg1) {
        if (arg0.field2053[arg0.field2052] != 31 || arg0.field2053[arg0.field2052 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2042 == null) {
            this.field2042 = new Inflater(true);
        }
        try {
            this.field2042.setInput(arg0.field2053, arg0.field2052 + 10, arg0.field2053.length - (arg0.field2052 + 10 + 8));
            this.field2042.inflate(arg1);
        } catch (Exception var4) {
            this.field2042.reset();
            throw new RuntimeException("");
        }
        this.field2042.reset();
    }
}
