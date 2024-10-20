package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dm")
public class class122 {

    @ObfuscatedName("dm.p")
    public Inflater field2014;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dm.p(Ldt;[BI)V")
    public void method2426(class127 arg0, byte[] arg1) {
        if (arg0.field2037[arg0.field2038] != 31 || arg0.field2037[arg0.field2038 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2014 == null) {
            this.field2014 = new Inflater(true);
        }
        try {
            this.field2014.setInput(arg0.field2037, arg0.field2038 + 10, arg0.field2037.length - (arg0.field2038 + 10 + 8));
            this.field2014.inflate(arg1);
        } catch (Exception var4) {
            this.field2014.reset();
            throw new RuntimeException("");
        }
        this.field2014.reset();
    }
}
