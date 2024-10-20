package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dv")
public class class122 {

    @ObfuscatedName("dv.i")
    public Inflater field2020;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dv.i(Lda;[BI)V")
    public void method2428(class127 arg0, byte[] arg1) {
        if (arg0.field2041[arg0.field2039] != 31 || arg0.field2041[arg0.field2039 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2020 == null) {
            this.field2020 = new Inflater(true);
        }
        try {
            this.field2020.setInput(arg0.field2041, arg0.field2039 + 10, arg0.field2041.length - (arg0.field2039 + 10 + 8));
            this.field2020.inflate(arg1);
        } catch (Exception var4) {
            this.field2020.reset();
            throw new RuntimeException("");
        }
        this.field2020.reset();
    }
}
