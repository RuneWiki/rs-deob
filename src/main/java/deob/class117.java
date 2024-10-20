package deob;

@ObfuscatedName("du")
public class class117 extends class120 {

    // $FF: synthetic field
    public final class121 this$0;

    @ObfuscatedName("du.s")
    public int field1395;

    @ObfuscatedName("du.t")
    public byte field1396;

    @ObfuscatedName("du.v")
    public int field1392;

    @ObfuscatedName("du.j")
    public String field1394;

    public class117(class121 arg0) {
        this.this$0 = arg0;
        this.field1395 = -1;
    }

    @ObfuscatedName("du.s(Lnv;I)V")
    public void method2140(class385 arg0) {
        arg0.method5958();
        this.field1395 = arg0.method6053();
        this.field1396 = arg0.method5959();
        this.field1392 = arg0.method6053();
        arg0.method5964();
        this.field1394 = arg0.method5967();
        arg0.method5958();
    }

    @ObfuscatedName("du.t(Ldt;B)V")
    public void method2135(class124 arg0) {
        class106 var2 = (class106) arg0.field1436.get(this.field1395);
        var2.field1306 = this.field1396;
        var2.field1302 = this.field1392;
        var2.field1303 = new class406(this.field1394);
    }
}
