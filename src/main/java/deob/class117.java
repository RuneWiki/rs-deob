package deob;

import java.util.zip.Inflater;

@ObfuscatedName("do")
public class class117 {

    @ObfuscatedName("do.a")
    public Inflater field1976;

    public class117() {
        this(-1, 1000000, 1000000);
    }

    public class117(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("do.a(Ldx;[BI)V")
    public void method2401(class120 arg0, byte[] arg1) {
        if (arg0.field1994[arg0.field1993] != 31 || arg0.field1994[arg0.field1993 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1976 == null) {
            this.field1976 = new Inflater(true);
        }
        try {
            this.field1976.setInput(arg0.field1994, arg0.field1993 + 10, arg0.field1994.length - (arg0.field1993 + 10 + 8));
            this.field1976.inflate(arg1);
        } catch (Exception var4) {
            this.field1976.reset();
            throw new RuntimeException("");
        }
        this.field1976.reset();
    }
}
