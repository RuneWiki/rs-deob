package deob;

@ObfuscatedName("de")
public class class130 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("de.l")
    public int field1481;

    @ObfuscatedName("de.q")
    public byte field1477;

    @ObfuscatedName("de.f")
    public int field1482;

    @ObfuscatedName("de.j")
    public String field1479;

    public class130(class134 arg0) {
        this.this$0 = arg0;
        this.field1481 = -1;
    }

    @ObfuscatedName("de.l(Lot;B)V")
    public void method2400(class401 arg0) {
        arg0.method6272();
        this.field1481 = arg0.method6284();
        this.field1477 = arg0.method6273();
        this.field1482 = arg0.method6284();
        arg0.method6275();
        this.field1479 = arg0.method6474();
        arg0.method6272();
    }

    @ObfuscatedName("de.q(Leb;I)V")
    public void method2396(class137 arg0) {
        class119 var2 = (class119) arg0.field1514.get(this.field1481);
        var2.field1394 = this.field1477;
        var2.field1391 = this.field1482;
        var2.field1392 = new class422(this.field1479);
    }
}
