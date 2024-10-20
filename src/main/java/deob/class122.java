package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dn")
public class class122 {

    @ObfuscatedName("dn.t")
    public Inflater field2036;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dn.t(Ldo;[BS)V")
    public void method2376(class127 arg0, byte[] arg1) {
        if (arg0.field2061[arg0.field2059] != 31 || arg0.field2061[arg0.field2059 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2036 == null) {
            this.field2036 = new Inflater(true);
        }
        try {
            this.field2036.setInput(arg0.field2061, arg0.field2059 + 10, arg0.field2061.length - (arg0.field2059 + 10 + 8));
            this.field2036.inflate(arg1);
        } catch (Exception var4) {
            this.field2036.reset();
            throw new RuntimeException("");
        }
        this.field2036.reset();
    }
}
