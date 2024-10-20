package deob;

import java.util.zip.Inflater;

@ObfuscatedName("db")
public class class122 {

    @ObfuscatedName("db.g")
    public Inflater field2003;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("db.g(Ldw;[BI)V")
    public void method2427(class127 arg0, byte[] arg1) {
        if (arg0.field2030[arg0.field2027] != 31 || arg0.field2030[arg0.field2027 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2003 == null) {
            this.field2003 = new Inflater(true);
        }
        try {
            this.field2003.setInput(arg0.field2030, arg0.field2027 + 10, arg0.field2030.length - (arg0.field2027 + 10 + 8));
            this.field2003.inflate(arg1);
        } catch (Exception var4) {
            this.field2003.reset();
            throw new RuntimeException("");
        }
        this.field2003.reset();
    }
}
