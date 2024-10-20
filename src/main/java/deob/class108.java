package deob;

import java.util.zip.Inflater;

@ObfuscatedName("du")
public class class108 {

    @ObfuscatedName("du.p")
    public Inflater field1874;

    public class108() {
        this(-1, 1000000, 1000000);
    }

    public class108(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("du.p(Lde;[BI)V")
    public void method2120(class111 arg0, byte[] arg1) {
        if (arg0.field1889[arg0.field1885] != 31 || arg0.field1889[arg0.field1885 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1874 == null) {
            this.field1874 = new Inflater(true);
        }
        try {
            this.field1874.setInput(arg0.field1889, arg0.field1885 + 10, arg0.field1889.length - (arg0.field1885 + 10 + 8));
            this.field1874.inflate(arg1);
        } catch (Exception var4) {
            this.field1874.reset();
            throw new RuntimeException("");
        }
        this.field1874.reset();
    }
}
