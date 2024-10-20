package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cr")
public class class104 {

    @ObfuscatedName("cr.p")
    public Inflater field1823;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cr.p(Ldp;[BI)V")
    public void method2120(class107 arg0, byte[] arg1) {
        if (arg0.field1838[arg0.field1837] != 31 || arg0.field1838[arg0.field1837 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1823 == null) {
            this.field1823 = new Inflater(true);
        }
        try {
            this.field1823.setInput(arg0.field1838, arg0.field1837 + 10, arg0.field1838.length - (arg0.field1837 + 10 + 8));
            this.field1823.inflate(arg1);
        } catch (Exception var4) {
            this.field1823.reset();
            throw new RuntimeException("");
        }
        this.field1823.reset();
    }
}
