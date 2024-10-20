package deob;

@ObfuscatedName("du")
public class class130 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("du.o")
    public int field1580;

    @ObfuscatedName("du.q")
    public boolean field1578;

    public class130(class132 arg0) {
        this.this$0 = arg0;
        this.field1580 = -1;
    }

    @ObfuscatedName("du.o(Lpx;I)V")
    public void method2639(class440 arg0) {
        this.field1580 = arg0.method7082();
        this.field1578 = arg0.method7071() == 1;
    }

    @ObfuscatedName("du.q(Lek;B)V")
    public void method2636(class140 arg0) {
        arg0.method2696(this.field1580, this.field1578);
    }
}
