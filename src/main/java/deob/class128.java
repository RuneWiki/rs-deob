package deob;

@ObfuscatedName("dg")
public class class128 {

    @ObfuscatedName("dg.ct")
    public long field1879;

    @ObfuscatedName("dg.cq")
    public class128 field1877;

    @ObfuscatedName("dg.cb")
    public class128 field1878;

    @ObfuscatedName("dg.et()V")
    public void method2200() {
        if (this.field1878 != null) {
            this.field1878.field1877 = this.field1877;
            this.field1877.field1878 = this.field1878;
            this.field1877 = null;
            this.field1878 = null;
        }
    }

    @ObfuscatedName("dg.ey()Z")
    public boolean method2195() {
        return this.field1878 != null;
    }
}
