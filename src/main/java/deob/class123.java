package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dc")
public class class123 {

    @ObfuscatedName("dc.i")
    public Inflater field2020;

    public class123() {
        this(-1, 1000000, 1000000);
    }

    public class123(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dc.i(Lds;[BI)V")
    public void method2399(class128 arg0, byte[] arg1) {
        if (arg0.field2050[arg0.field2048] != 31 || arg0.field2050[arg0.field2048 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2020 == null) {
            this.field2020 = new Inflater(true);
        }
        try {
            this.field2020.setInput(arg0.field2050, arg0.field2048 + 10, arg0.field2050.length - (arg0.field2048 + 10 + 8));
            this.field2020.inflate(arg1);
        } catch (Exception var4) {
            this.field2020.reset();
            throw new RuntimeException("");
        }
        this.field2020.reset();
    }
}
