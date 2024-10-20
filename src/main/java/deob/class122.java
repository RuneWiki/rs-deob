package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dp")
public class class122 {

    @ObfuscatedName("dp.i")
    public Inflater field2022;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dp.i(Ldz;[BI)V")
    public void method2396(class127 arg0, byte[] arg1) {
        if (arg0.field2049[arg0.field2045] != 31 || arg0.field2049[arg0.field2045 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2022 == null) {
            this.field2022 = new Inflater(true);
        }
        try {
            this.field2022.setInput(arg0.field2049, arg0.field2045 + 10, arg0.field2049.length - (arg0.field2045 + 10 + 8));
            this.field2022.inflate(arg1);
        } catch (Exception var4) {
            this.field2022.reset();
            throw new RuntimeException("");
        }
        this.field2022.reset();
    }
}
