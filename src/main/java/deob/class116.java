package deob;

import java.util.zip.Inflater;

@ObfuscatedName("de")
public class class116 {

    @ObfuscatedName("de.z")
    public Inflater field1975;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("de.z(Lda;[BB)V")
    public void method2243(class119 arg0, byte[] arg1) {
        if (arg0.field1987[arg0.field1986] != 31 || arg0.field1987[arg0.field1986 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1975 == null) {
            this.field1975 = new Inflater(true);
        }
        try {
            this.field1975.setInput(arg0.field1987, arg0.field1986 + 10, arg0.field1987.length - (arg0.field1986 + 10 + 8));
            this.field1975.inflate(arg1);
        } catch (Exception var4) {
            this.field1975.reset();
            throw new RuntimeException("");
        }
        this.field1975.reset();
    }
}
