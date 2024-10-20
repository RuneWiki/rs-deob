package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dq")
public class class116 {

    @ObfuscatedName("dq.m")
    public Inflater field1944;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    public class116(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("dq.m(Ldx;[BI)V")
    public void method2328(class119 arg0, byte[] arg1) {
        if (arg0.field1959[arg0.field1955] != 31 || arg0.field1959[arg0.field1955 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field1944 == null) {
            this.field1944 = new Inflater(true);
        }
        try {
            this.field1944.setInput(arg0.field1959, arg0.field1955 + 10, arg0.field1959.length - (arg0.field1955 + 10 + 8));
            this.field1944.inflate(arg1);
        } catch (Exception var4) {
            this.field1944.reset();
            throw new RuntimeException("");
        }
        this.field1944.reset();
    }
}
