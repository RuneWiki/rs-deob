package deob;

import java.util.zip.Inflater;

@ObfuscatedName("do")
public class class108 {

    @ObfuscatedName("do.o")
    public Inflater field1844;

    public class108() {
        this(-1, 1000000, 1000000);
    }

    public class108(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("do.o(Ldk;[BI)V")
    public void method2160(class111 arg0, byte[] arg1) {
        if (arg0.field1860[arg0.field1861] != 31 || arg0.field1860[arg0.field1861 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1844 == null) {
            this.field1844 = new Inflater(true);
        }
        try {
            this.field1844.setInput(arg0.field1860, arg0.field1861 + 10, arg0.field1860.length - (arg0.field1861 + 10 + 8));
            this.field1844.inflate(arg1);
        } catch (Exception var4) {
            this.field1844.reset();
            throw new RuntimeException("");
        }
        this.field1844.reset();
    }
}
