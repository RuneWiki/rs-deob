package deob;

@ObfuscatedName("de")
public class class123 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("de.n")
    public int field1423;

    @ObfuscatedName("de.c")
    public byte field1420;

    @ObfuscatedName("de.m")
    public int field1421;

    @ObfuscatedName("de.k")
    public String field1422;

    public class123(class134 arg0) {
        this.this$0 = arg0;
        this.field1423 = -1;
    }

    @ObfuscatedName("de.n(Lot;I)V")
    public void method2371(class400 arg0) {
        this.field1423 = arg0.method6219();
        this.field1420 = arg0.method6218();
        this.field1421 = arg0.method6219();
        arg0.method6223();
        this.field1422 = arg0.method6226();
    }

    @ObfuscatedName("de.c(Leb;B)V")
    public void method2372(class137 arg0) {
        class119 var2 = (class119) arg0.field1515.get(this.field1423);
        var2.field1394 = this.field1420;
        var2.field1395 = this.field1421;
        var2.field1396 = new class421(this.field1422);
    }
}
