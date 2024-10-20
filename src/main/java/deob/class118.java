package deob;

@ObfuscatedName("dr")
public class class118 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("dr.l")
    public int field1386;

    @ObfuscatedName("dr.q")
    public boolean field1384;

    public class118(class120 arg0) {
        this.this$0 = arg0;
        this.field1386 = -1;
    }

    @ObfuscatedName("dr.l(Lot;I)V")
    public void method2365(class401 arg0) {
        this.field1386 = arg0.method6284();
        this.field1384 = arg0.method6272() == 1;
    }

    @ObfuscatedName("dr.q(Ldk;I)V")
    public void method2366(class128 arg0) {
        arg0.method2424(this.field1386, this.field1384);
    }
}
