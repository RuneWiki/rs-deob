package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dw")
public class class116 {

    @ObfuscatedName("dw.l")
    public Inflater field1974;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dw.l(Ldl;[BI)V")
    public void method2327(class119 arg0, byte[] arg1) {
        if (arg0.field1986[arg0.field1988] != 31 || arg0.field1986[arg0.field1988 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1974 == null) {
            this.field1974 = new Inflater(true);
        }
        try {
            this.field1974.setInput(arg0.field1986, arg0.field1988 + 10, arg0.field1986.length - (arg0.field1988 + 10 + 8));
            this.field1974.inflate(arg1);
        } catch (Exception var4) {
            this.field1974.reset();
            throw new RuntimeException("");
        }
        this.field1974.reset();
    }
}
