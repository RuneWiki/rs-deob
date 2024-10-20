package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dq")
public class class117 {

    @ObfuscatedName("dq.s")
    public Inflater field1993;

    public class117() {
        this(-1, 1000000, 1000000);
    }

    public class117(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dq.s(Lds;[BI)V")
    public void method2291(class120 arg0, byte[] arg1) {
        if (arg0.field2008[arg0.field2006] != 31 || arg0.field2008[arg0.field2006 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1993 == null) {
            this.field1993 = new Inflater(true);
        }
        try {
            this.field1993.setInput(arg0.field2008, arg0.field2006 + 10, arg0.field2008.length - (arg0.field2006 + 10 + 8));
            this.field1993.inflate(arg1);
        } catch (Exception var4) {
            this.field1993.reset();
            throw new RuntimeException("");
        }
        this.field1993.reset();
    }
}
