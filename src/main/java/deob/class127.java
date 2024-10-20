package deob;

@ObfuscatedName("dy")
public class class127 extends class120 {

    // $FF: synthetic field
    public final class121 this$0;

    @ObfuscatedName("dy.s")
    public String field1453;

    @ObfuscatedName("dy.t")
    public byte field1455;

    @ObfuscatedName("dy.v")
    public byte field1451;

    public class127(class121 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("dy.s(Lnv;I)V")
    public void method2140(class385 arg0) {
        this.field1453 = arg0.method5966();
        if (this.field1453 != null) {
            arg0.method5958();
            this.field1455 = arg0.method5959();
            this.field1451 = arg0.method5959();
        }
    }

    @ObfuscatedName("dy.t(Ldt;B)V")
    public void method2135(class124 arg0) {
        arg0.field1430 = this.field1453;
        if (this.field1453 != null) {
            arg0.field1431 = this.field1455;
            arg0.field1437 = this.field1451;
        }
    }
}
