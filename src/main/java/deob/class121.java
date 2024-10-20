package deob;

import java.util.zip.Inflater;

@ObfuscatedName("da")
public class class121 {

    @ObfuscatedName("da.j")
    public Inflater field2000;

    public class121() {
        this(-1, 1000000, 1000000);
    }

    public class121(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("da.j(Ldr;[BI)V")
    public void method2314(class126 arg0, byte[] arg1) {
        if (arg0.field2025[arg0.field2020] != 31 || arg0.field2025[arg0.field2020 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2000 == null) {
            this.field2000 = new Inflater(true);
        }
        try {
            this.field2000.setInput(arg0.field2025, arg0.field2020 + 10, arg0.field2025.length - (arg0.field2020 + 10 + 8));
            this.field2000.inflate(arg1);
        } catch (Exception var4) {
            this.field2000.reset();
            throw new RuntimeException("");
        }
        this.field2000.reset();
    }
}
