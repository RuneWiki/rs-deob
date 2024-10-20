package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cw")
public class class104 {

    @ObfuscatedName("cw.i")
    public Inflater field1817;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cw.i(Ldm;[BI)V")
    public void method2105(class107 arg0, byte[] arg1) {
        if (arg0.field1841[arg0.field1837] != 31 || arg0.field1841[arg0.field1837 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1817 == null) {
            this.field1817 = new Inflater(true);
        }
        try {
            this.field1817.setInput(arg0.field1841, arg0.field1837 + 10, arg0.field1841.length - (arg0.field1837 + 10 + 8));
            this.field1817.inflate(arg1);
        } catch (Exception var4) {
            this.field1817.reset();
            throw new RuntimeException("");
        }
        this.field1817.reset();
    }
}
