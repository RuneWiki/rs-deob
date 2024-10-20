package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dd")
public class class122 {

    @ObfuscatedName("dd.c")
    public Inflater field2029;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dd.c(Ldg;[BI)V")
    public void method2264(class127 arg0, byte[] arg1) {
        if (arg0.field2057[arg0.field2052] != 31 || arg0.field2057[arg0.field2052 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2029 == null) {
            this.field2029 = new Inflater(true);
        }
        try {
            this.field2029.setInput(arg0.field2057, arg0.field2052 + 10, arg0.field2057.length - (arg0.field2052 + 10 + 8));
            this.field2029.inflate(arg1);
        } catch (Exception var4) {
            this.field2029.reset();
            throw new RuntimeException("");
        }
        this.field2029.reset();
    }
}
