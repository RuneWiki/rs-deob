package deob;

import java.util.zip.Inflater;

@ObfuscatedName("da")
public class class116 {

    @ObfuscatedName("da.k")
    public Inflater field1934;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("da.k(Ldk;[BI)V")
    public void method2274(class119 arg0, byte[] arg1) {
        if (arg0.field1960[arg0.field1949] != 31 || arg0.field1960[arg0.field1949 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1934 == null) {
            this.field1934 = new Inflater(true);
        }
        try {
            this.field1934.setInput(arg0.field1960, arg0.field1949 + 10, arg0.field1960.length - (arg0.field1949 + 10 + 8));
            this.field1934.inflate(arg1);
        } catch (Exception var4) {
            this.field1934.reset();
            throw new RuntimeException("");
        }
        this.field1934.reset();
    }
}
