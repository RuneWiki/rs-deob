package deob;

@ObfuscatedName("dm")
public class class116 extends class120 {

    // $FF: synthetic field
    public final class121 this$0;

    @ObfuscatedName("dm.s")
    public String field1389;

    @ObfuscatedName("dm.t")
    public int field1390;

    @ObfuscatedName("dm.v")
    public byte field1391;

    public class116(class121 arg0) {
        this.this$0 = arg0;
        this.field1389 = null;
    }

    @ObfuscatedName("dm.s(Lnv;I)V")
    public void method2140(class385 arg0) {
        if (arg0.method5958() != 255) {
            arg0.field4182--;
            arg0.method5964();
        }
        this.field1389 = arg0.method5966();
        this.field1390 = arg0.method6053();
        this.field1391 = arg0.method5959();
        arg0.method5964();
    }

    @ObfuscatedName("dm.t(Ldt;B)V")
    public void method2135(class124 arg0) {
        class106 var2 = new class106();
        var2.field1303 = new class406(this.field1389);
        var2.field1302 = this.field1390;
        var2.field1306 = this.field1391;
        arg0.method2253(var2);
    }
}
