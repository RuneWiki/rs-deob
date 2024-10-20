package deob;

@ObfuscatedName("dg")
public class class126 extends class104 {

    // $FF: synthetic field
    public final class107 this$0;

    @ObfuscatedName("dg.s")
    public long field1446;

    @ObfuscatedName("dg.t")
    public String field1447;

    public class126(class107 arg0) {
        this.this$0 = arg0;
        this.field1446 = -1L;
        this.field1447 = null;
    }

    @ObfuscatedName("dg.s(Lnv;B)V")
    public void method2102(class385 arg0) {
        if (arg0.method5958() != 255) {
            arg0.field4182--;
            this.field1446 = arg0.method5964();
        }
        this.field1447 = arg0.method5966();
    }

    @ObfuscatedName("dg.t(Ldj;I)V")
    public void method2100(class115 arg0) {
        arg0.method2159(this.field1446, this.field1447);
    }
}
