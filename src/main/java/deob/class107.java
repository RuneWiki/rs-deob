package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dp")
public class class107 {

    @ObfuscatedName("dp.a")
    public Inflater field1845;

    public class107() {
        this(-1, 1000000, 1000000);
    }

    public class107(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dp.a(Ldi;[BI)V")
    public void method2079(class110 arg0, byte[] arg1) {
        if (arg0.field1865[arg0.field1861] != 31 || arg0.field1865[arg0.field1861 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1845 == null) {
            this.field1845 = new Inflater(true);
        }
        try {
            this.field1845.setInput(arg0.field1865, arg0.field1861 + 10, arg0.field1865.length - (arg0.field1861 + 10 + 8));
            this.field1845.inflate(arg1);
        } catch (Exception var4) {
            this.field1845.reset();
            throw new RuntimeException("");
        }
        this.field1845.reset();
    }
}
