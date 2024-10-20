package deob;

@ObfuscatedName("dw")
public class class123 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("dw.l")
    public int field1428;

    @ObfuscatedName("dw.q")
    public byte field1425;

    @ObfuscatedName("dw.f")
    public int field1424;

    @ObfuscatedName("dw.j")
    public String field1426;

    public class123(class134 arg0) {
        this.this$0 = arg0;
        this.field1428 = -1;
    }

    @ObfuscatedName("dw.l(Lot;B)V")
    public void method2400(class401 arg0) {
        this.field1428 = arg0.method6284();
        this.field1425 = arg0.method6273();
        this.field1424 = arg0.method6284();
        arg0.method6275();
        this.field1426 = arg0.method6474();
    }

    @ObfuscatedName("dw.q(Leb;I)V")
    public void method2396(class137 arg0) {
        class119 var2 = (class119) arg0.field1514.get(this.field1428);
        var2.field1394 = this.field1425;
        var2.field1391 = this.field1424;
        var2.field1392 = new class422(this.field1426);
    }
}
