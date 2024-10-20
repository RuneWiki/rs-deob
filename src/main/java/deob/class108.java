package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dk")
public class class108 {

    @ObfuscatedName("dk.t")
    public Inflater field1855;

    public class108() {
        this(-1, 1000000, 1000000);
    }

    public class108(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dk.t(Ldc;[BB)V")
    public void method2117(class111 arg0, byte[] arg1) {
        if (arg0.field1869[arg0.field1867] != 31 || arg0.field1869[arg0.field1867 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1855 == null) {
            this.field1855 = new Inflater(true);
        }
        try {
            this.field1855.setInput(arg0.field1869, arg0.field1867 + 10, arg0.field1869.length - (arg0.field1867 + 10 + 8));
            this.field1855.inflate(arg1);
        } catch (Exception var4) {
            this.field1855.reset();
            throw new RuntimeException("");
        }
        this.field1855.reset();
    }
}
