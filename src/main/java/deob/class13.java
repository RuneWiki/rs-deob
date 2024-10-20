package deob;

@ObfuscatedName("d")
public class class13 extends class17 {

    // $FF: synthetic field
    public final class20 this$0;

    @ObfuscatedName("d.f")
    public String field112;

    @ObfuscatedName("d.o")
    public int field111;

    @ObfuscatedName("d.u")
    public byte field110;

    public class13(class20 arg0) {
        this.this$0 = arg0;
        this.field112 = null;
    }

    @ObfuscatedName("d.f(Lnu;I)V")
    public void method62(class382 arg0) {
        if (arg0.method5856() != 255) {
            arg0.field4155--;
            arg0.method6069();
        }
        this.field112 = arg0.method5837();
        this.field111 = arg0.method5858();
        this.field110 = arg0.method6045();
        arg0.method6069();
    }

    @ObfuscatedName("d.o(Lp;I)V")
    public void method61(class4 arg0) {
        class10 var2 = new class10();
        var2.field66 = this.field112;
        var2.field65 = this.field111;
        var2.field67 = this.field110;
        arg0.method52(var2);
    }
}
