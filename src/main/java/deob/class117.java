package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dc")
public class class117 {

    @ObfuscatedName("dc.w")
    public Inflater field1994;

    public class117() {
        this(-1, 1000000, 1000000);
    }

    public class117(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dc.w(Lde;[BI)V")
    public void method2311(class120 arg0, byte[] arg1) {
        if (arg0.field2013[arg0.field2012] != 31 || arg0.field2013[arg0.field2012 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1994 == null) {
            this.field1994 = new Inflater(true);
        }
        try {
            this.field1994.setInput(arg0.field2013, arg0.field2012 + 10, arg0.field2013.length - (arg0.field2012 + 10 + 8));
            this.field1994.inflate(arg1);
        } catch (Exception var4) {
            this.field1994.reset();
            throw new RuntimeException("");
        }
        this.field1994.reset();
    }
}
