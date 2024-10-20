package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dn")
public class class122 {

    @ObfuscatedName("dn.g")
    public Inflater field1998;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dn.g(Ldr;[BB)V")
    public void method2352(class127 arg0, byte[] arg1) {
        if (arg0.field2028[arg0.field2023] != 31 || arg0.field2028[arg0.field2023 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1998 == null) {
            this.field1998 = new Inflater(true);
        }
        try {
            this.field1998.setInput(arg0.field2028, arg0.field2023 + 10, arg0.field2028.length - (arg0.field2023 + 10 + 8));
            this.field1998.inflate(arg1);
        } catch (Exception var4) {
            this.field1998.reset();
            throw new RuntimeException("");
        }
        this.field1998.reset();
    }
}
