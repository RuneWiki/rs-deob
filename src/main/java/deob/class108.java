package deob;

import java.util.zip.Inflater;

@ObfuscatedName("du")
public class class108 {

    @ObfuscatedName("du.n")
    public Inflater field1873;

    public class108() {
        this(-1, 1000000, 1000000);
    }

    public class108(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("du.n(Ldo;[BI)V")
    public void method2101(class111 arg0, byte[] arg1) {
        if (arg0.field1886[arg0.field1888] != 31 || arg0.field1886[arg0.field1888 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1873 == null) {
            this.field1873 = new Inflater(true);
        }
        try {
            this.field1873.setInput(arg0.field1886, arg0.field1888 + 10, arg0.field1886.length - (arg0.field1888 + 10 + 8));
            this.field1873.inflate(arg1);
        } catch (Exception var4) {
            this.field1873.reset();
            throw new RuntimeException("");
        }
        this.field1873.reset();
    }
}
