package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dp")
public class class116 {

    @ObfuscatedName("dp.j")
    public Inflater field1981;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dp.j(Ldc;[BI)V")
    public void method2264(class119 arg0, byte[] arg1) {
        if (arg0.field1996[arg0.field1999] != 31 || arg0.field1996[arg0.field1999 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1981 == null) {
            this.field1981 = new Inflater(true);
        }
        try {
            this.field1981.setInput(arg0.field1996, arg0.field1999 + 10, arg0.field1996.length - (arg0.field1999 + 10 + 8));
            this.field1981.inflate(arg1);
        } catch (Exception var4) {
            this.field1981.reset();
            throw new RuntimeException("");
        }
        this.field1981.reset();
    }
}
