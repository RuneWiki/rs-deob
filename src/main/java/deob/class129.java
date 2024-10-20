package deob;

@ObfuscatedName("dz")
public class class129 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("dz.l")
    public String field1475;

    @ObfuscatedName("dz.q")
    public int field1472;

    @ObfuscatedName("dz.f")
    public byte field1473;

    public class129(class134 arg0) {
        this.this$0 = arg0;
        this.field1475 = null;
    }

    @ObfuscatedName("dz.l(Lot;B)V")
    public void method2400(class401 arg0) {
        if (arg0.method6272() != 255) {
            arg0.field4292--;
            arg0.method6275();
        }
        this.field1475 = arg0.method6280();
        this.field1472 = arg0.method6284();
        this.field1473 = arg0.method6273();
        arg0.method6275();
    }

    @ObfuscatedName("dz.q(Leb;I)V")
    public void method2396(class137 arg0) {
        class119 var2 = new class119();
        var2.field1392 = new class422(this.field1475);
        var2.field1391 = this.field1472;
        var2.field1394 = this.field1473;
        arg0.method2514(var2);
    }
}
