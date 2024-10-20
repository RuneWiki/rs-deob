package deob;

import java.util.zip.Inflater;

@ObfuscatedName("de")
public class class123 {

    @ObfuscatedName("de.d")
    public Inflater field1888;

    public class123() {
        this(-1, 1000000, 1000000);
    }

    public class123(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("de.d(Ldu;[BI)V")
    public void method2160(class130 arg0, byte[] arg1) {
        if (arg0.field1955[arg0.field1956] != 31 || arg0.field1955[arg0.field1956 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1888 == null) {
            this.field1888 = new Inflater(true);
        }
        try {
            this.field1888.setInput(arg0.field1955, arg0.field1956 + 10, arg0.field1955.length - (arg0.field1956 + 10 + 8));
            this.field1888.inflate(arg1);
        } catch (Exception var4) {
            this.field1888.reset();
            throw new RuntimeException("");
        }
        this.field1888.reset();
    }
}
