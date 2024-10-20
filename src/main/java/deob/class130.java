package deob;

@ObfuscatedName("dq")
public class class130 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("dq.n")
    public int field1483;

    @ObfuscatedName("dq.c")
    public byte field1481;

    @ObfuscatedName("dq.m")
    public int field1482;

    @ObfuscatedName("dq.k")
    public String field1484;

    public class130(class134 arg0) {
        this.this$0 = arg0;
        this.field1483 = -1;
    }

    @ObfuscatedName("dq.n(Lot;I)V")
    public void method2371(class400 arg0) {
        arg0.method6217();
        this.field1483 = arg0.method6219();
        this.field1481 = arg0.method6218();
        this.field1482 = arg0.method6219();
        arg0.method6223();
        this.field1484 = arg0.method6226();
        arg0.method6217();
    }

    @ObfuscatedName("dq.c(Leb;B)V")
    public void method2372(class137 arg0) {
        class119 var2 = (class119) arg0.field1515.get(this.field1483);
        var2.field1394 = this.field1481;
        var2.field1395 = this.field1482;
        var2.field1396 = new class421(this.field1484);
    }
}
