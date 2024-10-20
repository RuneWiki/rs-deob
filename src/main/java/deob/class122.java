package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dd")
public class class122 {

    @ObfuscatedName("dd.f")
    public Inflater field2004;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dd.f(Ldq;[BS)V")
    public void method2387(class127 arg0, byte[] arg1) {
        if (arg0.field2030[arg0.field2033] != 31 || arg0.field2030[arg0.field2033 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2004 == null) {
            this.field2004 = new Inflater(true);
        }
        try {
            this.field2004.setInput(arg0.field2030, arg0.field2033 + 10, arg0.field2030.length - (arg0.field2033 + 10 + 8));
            this.field2004.inflate(arg1);
        } catch (Exception var4) {
            this.field2004.reset();
            throw new RuntimeException("");
        }
        this.field2004.reset();
    }
}
