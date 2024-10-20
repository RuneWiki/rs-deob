package deob;

@ObfuscatedName("o")
public class class13 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("o.v")
    public String field126;

    @ObfuscatedName("o.n")
    public int field118;

    @ObfuscatedName("o.f")
    public byte field119;

    public class13(class20 arg0) {
        this.this$0 = arg0;
        this.field126 = null;
    }

    @ObfuscatedName("o.v(Lnd;I)V")
    public void method50(class383 arg0) {
        if (arg0.method5965() != 255) {
            arg0.field4158--;
            arg0.method5971();
        }
        this.field126 = arg0.method6180();
        this.field118 = arg0.method5967();
        this.field119 = arg0.method5966();
        arg0.method5971();
    }

    @ObfuscatedName("o.n(Ly;I)V")
    public void method44(class4 arg0) {
        class10 var2 = new class10();
        var2.field85 = this.field126;
        var2.field80 = this.field118;
        var2.field84 = this.field119;
        arg0.method38(var2);
    }
}
