package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dc")
public class class122 {

    @ObfuscatedName("dc.x")
    public Inflater field1986;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dc.x(Ldg;[BI)V")
    public void method2347(class127 arg0, byte[] arg1) {
        if (arg0.field2015[arg0.field2008] != 31 || arg0.field2015[arg0.field2008 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1986 == null) {
            this.field1986 = new Inflater(true);
        }
        try {
            this.field1986.setInput(arg0.field2015, arg0.field2008 + 10, arg0.field2015.length - (arg0.field2008 + 10 + 8));
            this.field1986.inflate(arg1);
        } catch (Exception var4) {
            this.field1986.reset();
            throw new RuntimeException("");
        }
        this.field1986.reset();
    }
}
