package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dy")
public class class121 {

    @ObfuscatedName("dy.c")
    public Inflater field1990;

    public class121() {
        this(-1, 1000000, 1000000);
    }

    public class121(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dy.c(Ldl;[BI)V")
    public void method2255(class125 arg0, byte[] arg1) {
        if (arg0.field2002[arg0.field2003] != 31 || arg0.field2002[arg0.field2003 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1990 == null) {
            this.field1990 = new Inflater(true);
        }
        try {
            this.field1990.setInput(arg0.field2002, arg0.field2003 + 10, arg0.field2002.length - (arg0.field2003 + 10 + 8));
            this.field1990.inflate(arg1);
        } catch (Exception var4) {
            this.field1990.reset();
            throw new RuntimeException("");
        }
        this.field1990.reset();
    }
}
