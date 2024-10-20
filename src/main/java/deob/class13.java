package deob;

@ObfuscatedName("i")
public class class13 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("i.f")
    public String field113;

    @ObfuscatedName("i.e")
    public int field110;

    @ObfuscatedName("i.v")
    public byte field111;

    public class13(class20 arg0) {
        this.this$0 = arg0;
        this.field113 = null;
    }

    @ObfuscatedName("i.f(Lnt;I)V")
    public void method53(class384 arg0) {
        if (arg0.method5902() != 255) {
            arg0.field4161--;
            arg0.method5896();
        }
        this.field113 = arg0.method5940();
        this.field110 = arg0.method5899();
        this.field111 = arg0.method5968();
        arg0.method5896();
    }

    @ObfuscatedName("i.e(Ly;I)V")
    public void method51(class4 arg0) {
        class10 var2 = new class10();
        var2.field67 = this.field113;
        var2.field65 = this.field110;
        var2.field71 = this.field111;
        arg0.method42(var2);
    }
}
