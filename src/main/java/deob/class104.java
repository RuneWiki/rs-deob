package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ci")
public class class104 {

    @ObfuscatedName("ci.k")
    public Inflater field1841;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ci.k(Ldi;[BI)V")
    public void method2062(class107 arg0, byte[] arg1) {
        if (arg0.field1857[arg0.field1862] != 31 || arg0.field1857[arg0.field1862 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1841 == null) {
            this.field1841 = new Inflater(true);
        }
        try {
            this.field1841.setInput(arg0.field1857, arg0.field1862 + 10, arg0.field1857.length - (arg0.field1862 + 10 + 8));
            this.field1841.inflate(arg1);
        } catch (Exception var4) {
            this.field1841.reset();
            throw new RuntimeException("");
        }
        this.field1841.reset();
    }
}
