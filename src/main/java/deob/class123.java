package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dy")
public class class123 {

    @ObfuscatedName("dy.e")
    public Inflater field2021;

    public class123() {
        this(-1, 1000000, 1000000);
    }

    public class123(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dy.e(Ldl;[BB)V")
    public void method2401(class128 arg0, byte[] arg1) {
        if (arg0.field2043[arg0.field2045] != 31 || arg0.field2043[arg0.field2045 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2021 == null) {
            this.field2021 = new Inflater(true);
        }
        try {
            this.field2021.setInput(arg0.field2043, arg0.field2045 + 10, arg0.field2043.length - (arg0.field2045 + 10 + 8));
            this.field2021.inflate(arg1);
        } catch (Exception var4) {
            this.field2021.reset();
            throw new RuntimeException("");
        }
        this.field2021.reset();
    }
}
