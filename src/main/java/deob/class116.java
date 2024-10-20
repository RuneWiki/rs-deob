package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dr")
public class class116 {

    @ObfuscatedName("dr.v")
    public Inflater field1973;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dr.v(Ldx;[BI)V")
    public void method2295(class119 arg0, byte[] arg1) {
        if (arg0.field1988[arg0.field1984] != 31 || arg0.field1988[arg0.field1984 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1973 == null) {
            this.field1973 = new Inflater(true);
        }
        try {
            this.field1973.setInput(arg0.field1988, arg0.field1984 + 10, arg0.field1988.length - (arg0.field1984 + 10 + 8));
            this.field1973.inflate(arg1);
        } catch (Exception var4) {
            this.field1973.reset();
            throw new RuntimeException("");
        }
        this.field1973.reset();
    }
}
