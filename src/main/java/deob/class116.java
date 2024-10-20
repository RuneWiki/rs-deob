package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dl")
public class class116 {

    @ObfuscatedName("dl.n")
    public Inflater field1966;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dl.n(Ldq;[BI)V")
    public void method2286(class119 arg0, byte[] arg1) {
        if (arg0.field1981[arg0.field1977] != 31 || arg0.field1981[arg0.field1977 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1966 == null) {
            this.field1966 = new Inflater(true);
        }
        try {
            this.field1966.setInput(arg0.field1981, arg0.field1977 + 10, arg0.field1981.length - (arg0.field1977 + 10 + 8));
            this.field1966.inflate(arg1);
        } catch (Exception var4) {
            this.field1966.reset();
            throw new RuntimeException("");
        }
        this.field1966.reset();
    }
}
