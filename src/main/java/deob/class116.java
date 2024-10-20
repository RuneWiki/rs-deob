package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dq")
public class class116 {

    @ObfuscatedName("dq.a")
    public Inflater field1970;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dq.a(Lds;[BI)V")
    public void method2286(class119 arg0, byte[] arg1) {
        if (arg0.field1981[arg0.field1980] != 31 || arg0.field1981[arg0.field1980 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1970 == null) {
            this.field1970 = new Inflater(true);
        }
        try {
            this.field1970.setInput(arg0.field1981, arg0.field1980 + 10, arg0.field1981.length - (arg0.field1980 + 10 + 8));
            this.field1970.inflate(arg1);
        } catch (Exception var4) {
            this.field1970.reset();
            throw new RuntimeException("");
        }
        this.field1970.reset();
    }
}
