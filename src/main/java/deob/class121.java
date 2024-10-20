package deob;

@ObfuscatedName("dv")
public class class121 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("dv.l")
    public int field1410;

    @ObfuscatedName("dv.q")
    public byte field1408;

    public class121(class120 arg0) {
        this.this$0 = arg0;
        this.field1410 = -1;
    }

    @ObfuscatedName("dv.l(Lot;I)V")
    public void method2365(class401 arg0) {
        this.field1410 = arg0.method6284();
        this.field1408 = arg0.method6273();
    }

    @ObfuscatedName("dv.q(Ldk;I)V")
    public void method2366(class128 arg0) {
        arg0.method2448(this.field1410, this.field1408);
    }
}
