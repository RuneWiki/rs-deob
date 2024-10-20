package deob;

@ObfuscatedName("ev")
public class class132 extends class117 {

    // $FF: synthetic field
    public final class120 this$0;

    @ObfuscatedName("ev.l")
    public long field1487;

    @ObfuscatedName("ev.q")
    public String field1485;

    @ObfuscatedName("ev.f")
    public int field1488;

    public class132(class120 arg0) {
        this.this$0 = arg0;
        this.field1487 = -1L;
        this.field1485 = null;
        this.field1488 = 0;
    }

    @ObfuscatedName("ev.l(Lot;I)V")
    public void method2365(class401 arg0) {
        if (arg0.method6272() != 255) {
            arg0.field4292--;
            this.field1487 = arg0.method6275();
        }
        this.field1485 = arg0.method6280();
        this.field1488 = arg0.method6284();
    }

    @ObfuscatedName("ev.q(Ldk;I)V")
    public void method2366(class128 arg0) {
        arg0.method2475(this.field1487, this.field1485, this.field1488);
    }
}
