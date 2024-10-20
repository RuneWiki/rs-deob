package deob;

@ObfuscatedName("dg")
public class class128 {

    @ObfuscatedName("dg.cg")
    public long field1882;

    @ObfuscatedName("dg.cb")
    public class128 field1881;

    @ObfuscatedName("dg.cp")
    public class128 field1883;

    @ObfuscatedName("dg.et()V")
    public void method2310() {
        if (this.field1883 != null) {
            this.field1883.field1881 = this.field1881;
            this.field1881.field1883 = this.field1883;
            this.field1881 = null;
            this.field1883 = null;
        }
    }

    @ObfuscatedName("dg.fq()Z")
    public boolean method2308() {
        return this.field1883 != null;
    }
}
