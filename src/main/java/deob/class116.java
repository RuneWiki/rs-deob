package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dt")
public class class116 {

    @ObfuscatedName("dt.h")
    public Inflater field1960;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dt.h(Ldm;[BB)V")
    public void method2337(class119 arg0, byte[] arg1) {
        if (arg0.field1978[arg0.field1973] != 31 || arg0.field1978[arg0.field1973 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1960 == null) {
            this.field1960 = new Inflater(true);
        }
        try {
            this.field1960.setInput(arg0.field1978, arg0.field1973 + 10, arg0.field1978.length - (arg0.field1973 + 10 + 8));
            this.field1960.inflate(arg1);
        } catch (Exception var4) {
            this.field1960.reset();
            throw new RuntimeException("");
        }
        this.field1960.reset();
    }
}
