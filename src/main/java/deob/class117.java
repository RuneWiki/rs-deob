package deob;

import java.util.zip.Inflater;

@ObfuscatedName("da")
public class class117 {

    @ObfuscatedName("da.e")
    public Inflater field1965;

    public class117() {
        this(-1, 1000000, 1000000);
    }

    public class117(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("da.e(Ldq;[BB)V")
    public void method2307(class120 arg0, byte[] arg1) {
        if (arg0.field1981[arg0.field1977] != 31 || arg0.field1981[arg0.field1977 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1965 == null) {
            this.field1965 = new Inflater(true);
        }
        try {
            this.field1965.setInput(arg0.field1981, arg0.field1977 + 10, arg0.field1981.length - (arg0.field1977 + 10 + 8));
            this.field1965.inflate(arg1);
        } catch (Exception var4) {
            this.field1965.reset();
            throw new RuntimeException("");
        }
        this.field1965.reset();
    }
}
