package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cl")
public class class104 {

    @ObfuscatedName("cl.b")
    public Inflater field1833;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cl.b(Ldh;[BI)V")
    public void method2076(class107 arg0, byte[] arg1) {
        if (arg0.field1844[arg0.field1845] != 31 || arg0.field1844[arg0.field1845 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1833 == null) {
            this.field1833 = new Inflater(true);
        }
        try {
            this.field1833.setInput(arg0.field1844, arg0.field1845 + 10, arg0.field1844.length - (arg0.field1845 + 10 + 8));
            this.field1833.inflate(arg1);
        } catch (Exception var4) {
            this.field1833.reset();
            throw new RuntimeException("");
        }
        this.field1833.reset();
    }
}
