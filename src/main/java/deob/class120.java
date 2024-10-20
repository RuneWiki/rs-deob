package deob;

import java.util.zip.Inflater;

@ObfuscatedName("da")
public class class120 {

    @ObfuscatedName("da.a")
    public Inflater field2060;

    public class120() {
        this(-1, 1000000, 1000000);
    }

    public class120(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("da.a(Ldb;[BI)V")
    public void method2342(class123 arg0, byte[] arg1) {
        if (arg0.field2076[arg0.field2071] != 31 || arg0.field2076[arg0.field2071 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2060 == null) {
            this.field2060 = new Inflater(true);
        }
        try {
            this.field2060.setInput(arg0.field2076, arg0.field2071 + 10, arg0.field2076.length - (arg0.field2071 + 10 + 8));
            this.field2060.inflate(arg1);
        } catch (Exception var4) {
            this.field2060.reset();
            throw new RuntimeException("");
        }
        this.field2060.reset();
    }
}
