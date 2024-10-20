package deob;

import java.util.zip.Inflater;

@ObfuscatedName("di")
public class class105 {

    @ObfuscatedName("di.g")
    public Inflater field1813;

    public class105() {
        this(-1, 1000000, 1000000);
    }

    public class105(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("di.g(Ldf;[BI)V")
    public void method2027(class108 arg0, byte[] arg1) {
        if (arg0.field1828[arg0.field1824] != 31 || arg0.field1828[arg0.field1824 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1813 == null) {
            this.field1813 = new Inflater(true);
        }
        try {
            this.field1813.setInput(arg0.field1828, arg0.field1824 + 10, arg0.field1828.length - (arg0.field1824 + 10 + 8));
            this.field1813.inflate(arg1);
        } catch (Exception var4) {
            this.field1813.reset();
            throw new RuntimeException("");
        }
        this.field1813.reset();
    }
}
