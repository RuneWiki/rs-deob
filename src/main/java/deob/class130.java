package deob;

@ObfuscatedName("dc")
public class class130 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("dc.s")
    public int field1540;

    @ObfuscatedName("dc.h")
    public boolean field1539;

    public class130(class132 arg0) {
        this.this$0 = arg0;
        this.field1540 = -1;
    }

    @ObfuscatedName("dc.s(Lqr;I)V")
    public void method2621(class444 arg0) {
        this.field1540 = arg0.method7120();
        this.field1539 = arg0.method6929() == 1;
    }

    @ObfuscatedName("dc.h(Leh;B)V")
    public void method2622(class140 arg0) {
        arg0.method2685(this.field1540, this.field1539);
    }
}
