package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dp")
public class class116 {

    @ObfuscatedName("dp.d")
    public Inflater field1952;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dp.d(Ldf;[BB)V")
    public void method2298(class119 arg0, byte[] arg1) {
        if (arg0.field1973[arg0.field1966] != 31 || arg0.field1973[arg0.field1966 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1952 == null) {
            this.field1952 = new Inflater(true);
        }
        try {
            this.field1952.setInput(arg0.field1973, arg0.field1966 + 10, arg0.field1973.length - (arg0.field1966 + 10 + 8));
            this.field1952.inflate(arg1);
        } catch (Exception var4) {
            this.field1952.reset();
            throw new RuntimeException("");
        }
        this.field1952.reset();
    }
}
