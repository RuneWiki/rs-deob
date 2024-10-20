package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cx")
public class class104 {

    @ObfuscatedName("cx.g")
    public Inflater field1836;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cx.g(Lde;[BI)V")
    public void method2040(class107 arg0, byte[] arg1) {
        if (arg0.field1854[arg0.field1851] != 31 || arg0.field1854[arg0.field1851 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1836 == null) {
            this.field1836 = new Inflater(true);
        }
        try {
            this.field1836.setInput(arg0.field1854, arg0.field1851 + 10, arg0.field1854.length - (arg0.field1851 + 10 + 8));
            this.field1836.inflate(arg1);
        } catch (Exception var4) {
            this.field1836.reset();
            throw new RuntimeException("");
        }
        this.field1836.reset();
    }
}
