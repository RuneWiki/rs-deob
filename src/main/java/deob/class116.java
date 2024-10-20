package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dv")
public class class116 {

    @ObfuscatedName("dv.o")
    public Inflater field1957;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dv.o(Ldi;[BB)V")
    public void method2279(class119 arg0, byte[] arg1) {
        if (arg0.field1977[arg0.field1974] != 31 || arg0.field1977[arg0.field1974 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1957 == null) {
            this.field1957 = new Inflater(true);
        }
        try {
            this.field1957.setInput(arg0.field1977, arg0.field1974 + 10, arg0.field1977.length - (arg0.field1974 + 10 + 8));
            this.field1957.inflate(arg1);
        } catch (Exception var4) {
            this.field1957.reset();
            throw new RuntimeException("");
        }
        this.field1957.reset();
    }
}
