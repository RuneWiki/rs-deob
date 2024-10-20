package deob;

@ObfuscatedName("dr")
public class class112 extends class120 {

    // $FF: synthetic field
    public final class121 this$0;

    @ObfuscatedName("dr.s")
    public int field1349;

    public class112(class121 arg0) {
        this.this$0 = arg0;
        this.field1349 = -1;
    }

    @ObfuscatedName("dr.s(Lnv;I)V")
    public void method2140(class385 arg0) {
        this.field1349 = arg0.method6053();
        arg0.method5958();
        if (arg0.method5958() != 255) {
            arg0.field4182--;
            arg0.method5964();
        }
    }

    @ObfuscatedName("dr.t(Ldt;B)V")
    public void method2135(class124 arg0) {
        arg0.method2244(this.field1349);
    }
}
