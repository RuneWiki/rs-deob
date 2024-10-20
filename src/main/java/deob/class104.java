package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ct")
public class class104 {

    @ObfuscatedName("ct.g")
    public Inflater field1820;

    public class104() {
        this(-1, 1000000, 1000000);
    }

    public class104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ct.g(Ldi;[BB)V")
    public void method2046(class107 arg0, byte[] arg1) {
        if (arg0.field1839[arg0.field1835] != 31 || arg0.field1839[arg0.field1835 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1820 == null) {
            this.field1820 = new Inflater(true);
        }
        try {
            this.field1820.setInput(arg0.field1839, arg0.field1835 + 10, arg0.field1839.length - (arg0.field1835 + 10 + 8));
            this.field1820.inflate(arg1);
        } catch (Exception var4) {
            this.field1820.reset();
            throw new RuntimeException("");
        }
        this.field1820.reset();
    }
}
