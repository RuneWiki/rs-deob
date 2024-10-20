package deob;

import java.util.zip.Inflater;

@ObfuscatedName("de")
public class class116 {

    @ObfuscatedName("de.o")
    public Inflater field1965;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("de.o(Ldc;[BB)V")
    public void method2239(class119 arg0, byte[] arg1) {
        if (arg0.field1989[arg0.field1984] != 31 || arg0.field1989[arg0.field1984 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1965 == null) {
            this.field1965 = new Inflater(true);
        }
        try {
            this.field1965.setInput(arg0.field1989, arg0.field1984 + 10, arg0.field1989.length - (arg0.field1984 + 10 + 8));
            this.field1965.inflate(arg1);
        } catch (Exception var4) {
            this.field1965.reset();
            throw new RuntimeException("");
        }
        this.field1965.reset();
    }
}
