package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dp")
public class class111 {

    @ObfuscatedName("dp.j")
    public Inflater field1876;

    public class111() {
        this(-1, 1000000, 1000000);
    }

    public class111(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dp.j(Lde;[BB)V")
    public void method2276(class114 arg0, byte[] arg1) {
        if (arg0.field1891[arg0.field1894] != 31 || arg0.field1891[arg0.field1894 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1876 == null) {
            this.field1876 = new Inflater(true);
        }
        try {
            this.field1876.setInput(arg0.field1891, arg0.field1894 + 10, arg0.field1891.length - (arg0.field1894 + 10 + 8));
            this.field1876.inflate(arg1);
        } catch (Exception var4) {
            this.field1876.reset();
            throw new RuntimeException("");
        }
        this.field1876.reset();
    }
}
