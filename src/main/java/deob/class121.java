package deob;

import java.util.zip.Inflater;

@ObfuscatedName("du")
public class class121 {

    @ObfuscatedName("du.p")
    public Inflater field2022;

    public class121() {
        this(-1, 1000000, 1000000);
    }

    public class121(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("du.p(Ldv;[BI)V")
    public void method2318(class126 arg0, byte[] arg1) {
        if (arg0.field2047[arg0.field2043] != 31 || arg0.field2047[arg0.field2043 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2022 == null) {
            this.field2022 = new Inflater(true);
        }
        try {
            this.field2022.setInput(arg0.field2047, arg0.field2043 + 10, arg0.field2047.length - (arg0.field2043 + 10 + 8));
            this.field2022.inflate(arg1);
        } catch (Exception var4) {
            this.field2022.reset();
            throw new RuntimeException("");
        }
        this.field2022.reset();
    }
}
