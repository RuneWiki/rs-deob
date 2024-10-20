package deob;

@ObfuscatedName("dj")
public class class115 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("dj.i")
    public long field1365;

    @ObfuscatedName("dj.w")
    public String field1361;

    public class115(class120 arg0) {
        this.this$0 = arg0;
        this.field1365 = -1L;
        this.field1361 = null;
    }

    @ObfuscatedName("dj.i(Lop;I)V")
    public void method2385(class401 arg0) {
        if (arg0.method6240() != 255) {
            arg0.field4300--;
            this.field1365 = arg0.method6249();
        }
        this.field1361 = arg0.method6369();
    }

    @ObfuscatedName("dj.w(Ldm;I)V")
    public void method2386(class128 arg0) {
        arg0.method2437(this.field1365, this.field1361, 0);
    }
}
