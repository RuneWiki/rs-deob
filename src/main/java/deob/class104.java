package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cz")
public class class104 {

    @ObfuscatedName("cz.g")
    public Inflater field1832;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cz.g(Ldk;[BI)V")
    public void method2042(class107 arg0, byte[] arg1) {
        if (arg0.field1843[arg0.field1844] != 31 || arg0.field1843[arg0.field1844 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1832 == null) {
            this.field1832 = new Inflater(true);
        }
        try {
            this.field1832.setInput(arg0.field1843, arg0.field1844 + 10, arg0.field1843.length - (arg0.field1844 + 10 + 8));
            this.field1832.inflate(arg1);
        } catch (Exception var4) {
            this.field1832.reset();
            throw new RuntimeException("");
        }
        this.field1832.reset();
    }
}
