package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dk")
public class class121 {

    @ObfuscatedName("dk.v")
    public Inflater field2008;

    public class121() {
        this(-1, 1000000, 1000000);
    }

    public class121(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dk.v(Ldr;[BI)V")
    public void method2401(class126 arg0, byte[] arg1) {
        if (arg0.field2029[arg0.field2027] != 31 || arg0.field2029[arg0.field2027 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2008 == null) {
            this.field2008 = new Inflater(true);
        }
        try {
            this.field2008.setInput(arg0.field2029, arg0.field2027 + 10, arg0.field2029.length - (arg0.field2027 + 10 + 8));
            this.field2008.inflate(arg1);
        } catch (Exception var4) {
            this.field2008.reset();
            throw new RuntimeException("");
        }
        this.field2008.reset();
    }
}
