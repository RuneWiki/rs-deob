package deob;

import java.util.zip.Inflater;

@ObfuscatedName("di")
public class class121 {

    @ObfuscatedName("di.u")
    public Inflater field2002;

    public class121() {
        this(-1, 1000000, 1000000);
    }

    public class121(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("di.u(Ldl;[BI)V")
    public void method2388(class126 arg0, byte[] arg1) {
        if (arg0.field2022[arg0.field2024] != 31 || arg0.field2022[arg0.field2024 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2002 == null) {
            this.field2002 = new Inflater(true);
        }
        try {
            this.field2002.setInput(arg0.field2022, arg0.field2024 + 10, arg0.field2022.length - (arg0.field2024 + 10 + 8));
            this.field2002.inflate(arg1);
        } catch (Exception var4) {
            this.field2002.reset();
            throw new RuntimeException("");
        }
        this.field2002.reset();
    }
}
