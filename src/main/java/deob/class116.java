package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dq")
public class class116 {

    @ObfuscatedName("dq.y")
    public Inflater field1957;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dq.y(Ldd;[BB)V")
    public void method2266(class119 arg0, byte[] arg1) {
        if (arg0.field1974[arg0.field1973] != 31 || arg0.field1974[arg0.field1973 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1957 == null) {
            this.field1957 = new Inflater(true);
        }
        try {
            this.field1957.setInput(arg0.field1974, arg0.field1973 + 10, arg0.field1974.length - (arg0.field1973 + 10 + 8));
            this.field1957.inflate(arg1);
        } catch (Exception var4) {
            this.field1957.reset();
            throw new RuntimeException("");
        }
        this.field1957.reset();
    }
}
