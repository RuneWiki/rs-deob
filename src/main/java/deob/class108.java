package deob;

import java.util.zip.Inflater;

@ObfuscatedName("do")
public class class108 {

    @ObfuscatedName("do.n")
    public Inflater field1876;

    public class108() {
        this(-1, 1000000, 1000000);
    }

    public class108(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("do.n(Ldl;[BB)V")
    public void method2170(class111 arg0, byte[] arg1) {
        if (arg0.field1888[arg0.field1889] != 31 || arg0.field1888[arg0.field1889 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1876 == null) {
            this.field1876 = new Inflater(true);
        }
        try {
            this.field1876.setInput(arg0.field1888, arg0.field1889 + 10, arg0.field1888.length - (arg0.field1889 + 10 + 8));
            this.field1876.inflate(arg1);
        } catch (Exception var4) {
            this.field1876.reset();
            throw new RuntimeException("");
        }
        this.field1876.reset();
    }
}
