package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dc")
public class class122 {

    @ObfuscatedName("dc.l")
    public Inflater field2002;

    public class122() {
        this(-1, 1000000, 1000000);
    }

    public class122(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dc.l(Ldm;[BI)V")
    public void method2372(class127 arg0, byte[] arg1) {
        if (arg0.field2024[arg0.field2022] != 31 || arg0.field2024[arg0.field2022 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2002 == null) {
            this.field2002 = new Inflater(true);
        }
        try {
            this.field2002.setInput(arg0.field2024, arg0.field2022 + 10, arg0.field2024.length - (arg0.field2022 + 10 + 8));
            this.field2002.inflate(arg1);
        } catch (Exception var4) {
            this.field2002.reset();
            throw new RuntimeException("");
        }
        this.field2002.reset();
    }
}
