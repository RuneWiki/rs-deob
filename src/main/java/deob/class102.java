package deob;

@ObfuscatedName("cx")
public class class102 extends class104 {

    // $FF: synthetic field
    public final class107 this$0;

    @ObfuscatedName("cx.s")
    public long field1285;

    @ObfuscatedName("cx.t")
    public String field1284;

    public class102(class107 arg0) {
        this.this$0 = arg0;
        this.field1285 = -1L;
        this.field1284 = null;
    }

    @ObfuscatedName("cx.s(Lnv;B)V")
    public void method2102(class385 arg0) {
        if (arg0.method5958() != 255) {
            arg0.field4182--;
            this.field1285 = arg0.method5964();
        }
        this.field1284 = arg0.method5966();
    }

    @ObfuscatedName("cx.t(Ldj;I)V")
    public void method2100(class115 arg0) {
        arg0.method2156(this.field1285, this.field1284, 0);
    }
}
