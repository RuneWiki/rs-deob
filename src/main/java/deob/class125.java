package deob;

@ObfuscatedName("dh")
public class class125 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("dh.l")
    public int field1435;

    public class125(class134 arg0) {
        this.this$0 = arg0;
        this.field1435 = -1;
    }

    @ObfuscatedName("dh.l(Lot;B)V")
    public void method2400(class401 arg0) {
        this.field1435 = arg0.method6284();
        arg0.method6272();
        if (arg0.method6272() != 255) {
            arg0.field4292--;
            arg0.method6275();
        }
    }

    @ObfuscatedName("dh.q(Leb;I)V")
    public void method2396(class137 arg0) {
        arg0.method2515(this.field1435);
    }
}
