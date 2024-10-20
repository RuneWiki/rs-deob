package deob;

import java.util.zip.Inflater;

@ObfuscatedName("cu")
public class class101 {

    @ObfuscatedName("cu.z")
    public Inflater field1802;

    public class101() {
        this(-1, 1000000, 1000000);
    }

    public class101(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("cu.z(Lcj;[BI)V")
    public void method2075(class104 arg0, byte[] arg1) {
        if (arg0.field1819[arg0.field1815] != 31 || arg0.field1819[arg0.field1815 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1802 == null) {
            this.field1802 = new Inflater(true);
        }
        try {
            this.field1802.setInput(arg0.field1819, arg0.field1815 + 10, arg0.field1819.length - (arg0.field1815 + 10 + 8));
            this.field1802.inflate(arg1);
        } catch (Exception var4) {
            this.field1802.reset();
            throw new RuntimeException("");
        }
        this.field1802.reset();
    }
}
