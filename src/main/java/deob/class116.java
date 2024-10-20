package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dw")
public class class116 {

    @ObfuscatedName("dw.g")
    public Inflater field1961;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dw.g(Ldm;[BI)V")
    public void method2307(class119 arg0, byte[] arg1) {
        if (arg0.field1986[arg0.field1977] != 31 || arg0.field1986[arg0.field1977 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1961 == null) {
            this.field1961 = new Inflater(true);
        }
        try {
            this.field1961.setInput(arg0.field1986, arg0.field1977 + 10, arg0.field1986.length - (arg0.field1977 + 10 + 8));
            this.field1961.inflate(arg1);
        } catch (Exception var4) {
            this.field1961.reset();
            throw new RuntimeException("");
        }
        this.field1961.reset();
    }
}
