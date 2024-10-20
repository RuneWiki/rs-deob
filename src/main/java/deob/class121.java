package deob;

@ObfuscatedName("di")
public class class121 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("di.i")
    public int field1401;

    @ObfuscatedName("di.w")
    public byte field1406;

    public class121(class120 arg0) {
        this.this$0 = arg0;
        this.field1401 = -1;
    }

    @ObfuscatedName("di.i(Lop;I)V")
    public void method2385(class401 arg0) {
        this.field1401 = arg0.method6242();
        this.field1406 = arg0.method6241();
    }

    @ObfuscatedName("di.w(Ldm;I)V")
    public void method2386(class128 arg0) {
        arg0.method2455(this.field1401, this.field1406);
    }
}
