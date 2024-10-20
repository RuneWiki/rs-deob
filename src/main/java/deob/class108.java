package deob;

import java.util.zip.Inflater;

@ObfuscatedName("df")
public class class108 {

    @ObfuscatedName("df.n")
    public Inflater field1875;

    public class108() {
        this(-1, 1000000, 1000000);
    }

    public class108(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("df.n(Ldl;[BS)V")
    public void method2177(class111 arg0, byte[] arg1) {
        if (arg0.field1889[arg0.field1890] != 31 || arg0.field1889[arg0.field1890 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1875 == null) {
            this.field1875 = new Inflater(true);
        }
        try {
            this.field1875.setInput(arg0.field1889, arg0.field1890 + 10, arg0.field1889.length - (arg0.field1890 + 10 + 8));
            this.field1875.inflate(arg1);
        } catch (Exception var4) {
            this.field1875.reset();
            throw new RuntimeException("");
        }
        this.field1875.reset();
    }
}
