package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dv")
public class class117 {

    @ObfuscatedName("dv.b")
    public Inflater field1963;

    public class117() {
        this(-1, 1000000, 1000000);
    }

    public class117(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dv.b(Lds;[BI)V")
    public void method2287(class120 arg0, byte[] arg1) {
        if (arg0.field1983[arg0.field1977] != 31 || arg0.field1983[arg0.field1977 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1963 == null) {
            this.field1963 = new Inflater(true);
        }
        try {
            this.field1963.setInput(arg0.field1983, arg0.field1977 + 10, arg0.field1983.length - (arg0.field1977 + 10 + 8));
            this.field1963.inflate(arg1);
        } catch (Exception var4) {
            this.field1963.reset();
            throw new RuntimeException("");
        }
        this.field1963.reset();
    }
}
