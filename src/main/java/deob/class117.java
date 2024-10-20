package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dc")
public class class117 {

    @ObfuscatedName("dc.t")
    public Inflater field1988;

    public class117() {
        this(-1, 1000000, 1000000);
    }

    public class117(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dc.t(Ldr;[BI)V")
    public void method2252(class120 arg0, byte[] arg1) {
        if (arg0.field2002[arg0.field2001] != 31 || arg0.field2002[arg0.field2001 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1988 == null) {
            this.field1988 = new Inflater(true);
        }
        try {
            this.field1988.setInput(arg0.field2002, arg0.field2001 + 10, arg0.field2002.length - (arg0.field2001 + 10 + 8));
            this.field1988.inflate(arg1);
        } catch (Exception var4) {
            this.field1988.reset();
            throw new RuntimeException("");
        }
        this.field1988.reset();
    }
}
