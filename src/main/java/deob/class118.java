package deob;

@ObfuscatedName("ds")
public class class118 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("ds.i")
    public int field1379;

    @ObfuscatedName("ds.w")
    public boolean field1376;

    public class118(class120 arg0) {
        this.this$0 = arg0;
        this.field1379 = -1;
    }

    @ObfuscatedName("ds.i(Lop;I)V")
    public void method2385(class401 arg0) {
        this.field1379 = arg0.method6242();
        this.field1376 = arg0.method6240() == 1;
    }

    @ObfuscatedName("ds.w(Ldm;I)V")
    public void method2386(class128 arg0) {
        arg0.method2444(this.field1379, this.field1376);
    }
}
