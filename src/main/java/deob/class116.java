package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dq")
public class class116 {

    @ObfuscatedName("dq.j")
    public Inflater field1968;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dq.j(Ldc;[BI)V")
    public void method2305(class119 arg0, byte[] arg1) {
        if (arg0.field1981[arg0.field1982] != 31 || arg0.field1981[arg0.field1982 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1968 == null) {
            this.field1968 = new Inflater(true);
        }
        try {
            this.field1968.setInput(arg0.field1981, arg0.field1982 + 10, arg0.field1981.length - (arg0.field1982 + 10 + 8));
            this.field1968.inflate(arg1);
        } catch (Exception var4) {
            this.field1968.reset();
            throw new RuntimeException("");
        }
        this.field1968.reset();
    }
}
