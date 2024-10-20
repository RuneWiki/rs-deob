package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dt")
public class class121 {

    @ObfuscatedName("dt.z")
    public Inflater field1983;

    public class121() {
        this(-1, 1000000, 1000000);
    }

    public class121(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dt.z(Ldq;[BI)V")
    public void method2375(class126 arg0, byte[] arg1) {
        if (arg0.field2007[arg0.field2003] != 31 || arg0.field2007[arg0.field2003 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1983 == null) {
            this.field1983 = new Inflater(true);
        }
        try {
            this.field1983.setInput(arg0.field2007, arg0.field2003 + 10, arg0.field2007.length - (arg0.field2003 + 10 + 8));
            this.field1983.inflate(arg1);
        } catch (Exception var4) {
            this.field1983.reset();
            throw new RuntimeException("");
        }
        this.field1983.reset();
    }
}
