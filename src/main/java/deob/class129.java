package deob;

@ObfuscatedName("dw")
public class class129 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("dw.n")
    public String field1475;

    @ObfuscatedName("dw.c")
    public int field1476;

    @ObfuscatedName("dw.m")
    public byte field1477;

    public class129(class134 arg0) {
        this.this$0 = arg0;
        this.field1475 = null;
    }

    @ObfuscatedName("dw.n(Lot;I)V")
    public void method2371(class400 arg0) {
        if (arg0.method6217() != 255) {
            arg0.field4272--;
            arg0.method6223();
        }
        this.field1475 = arg0.method6198();
        this.field1476 = arg0.method6219();
        this.field1477 = arg0.method6218();
        arg0.method6223();
    }

    @ObfuscatedName("dw.c(Leb;B)V")
    public void method2372(class137 arg0) {
        class119 var2 = new class119();
        var2.field1396 = new class421(this.field1475);
        var2.field1395 = this.field1476;
        var2.field1394 = this.field1477;
        arg0.method2474(var2);
    }
}
