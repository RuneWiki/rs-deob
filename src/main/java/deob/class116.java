package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dk")
public class class116 {

    @ObfuscatedName("dk.h")
    public Inflater field1976;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dk.h(Ldp;[BB)V")
    public void method2262(class119 arg0, byte[] arg1) {
        if (arg0.field1989[arg0.field1988] != 31 || arg0.field1989[arg0.field1988 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1976 == null) {
            this.field1976 = new Inflater(true);
        }
        try {
            this.field1976.setInput(arg0.field1989, arg0.field1988 + 10, arg0.field1989.length - (arg0.field1988 + 10 + 8));
            this.field1976.inflate(arg1);
        } catch (Exception var4) {
            this.field1976.reset();
            throw new RuntimeException("");
        }
        this.field1976.reset();
    }
}
