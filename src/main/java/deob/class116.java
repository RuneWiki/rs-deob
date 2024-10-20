package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dx")
public class class116 {

    @ObfuscatedName("dx.f")
    public Inflater field1981;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dx.f(Ldn;[BI)V")
    public void method2306(class119 arg0, byte[] arg1) {
        if (arg0.field2000[arg0.field1994] != 31 || arg0.field2000[arg0.field1994 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1981 == null) {
            this.field1981 = new Inflater(true);
        }
        try {
            this.field1981.setInput(arg0.field2000, arg0.field1994 + 10, arg0.field2000.length - (arg0.field1994 + 10 + 8));
            this.field1981.inflate(arg1);
        } catch (Exception var4) {
            this.field1981.reset();
            throw new RuntimeException("");
        }
        this.field1981.reset();
    }
}
