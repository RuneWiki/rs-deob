package deob;

@ObfuscatedName("db")
public class class119 extends class104 {

    // $FF: synthetic field
    public final class107 this$0;

    @ObfuscatedName("db.s")
    public long field1404;

    @ObfuscatedName("db.t")
    public String field1403;

    @ObfuscatedName("db.v")
    public int field1405;

    public class119(class107 arg0) {
        this.this$0 = arg0;
        this.field1404 = -1L;
        this.field1403 = null;
        this.field1405 = 0;
    }

    @ObfuscatedName("db.s(Lnv;B)V")
    public void method2102(class385 arg0) {
        if (arg0.method5958() != 255) {
            arg0.field4182--;
            this.field1404 = arg0.method5964();
        }
        this.field1403 = arg0.method5966();
        this.field1405 = arg0.method6053();
    }

    @ObfuscatedName("db.t(Ldj;I)V")
    public void method2100(class115 arg0) {
        arg0.method2156(this.field1404, this.field1403, this.field1405);
    }
}
