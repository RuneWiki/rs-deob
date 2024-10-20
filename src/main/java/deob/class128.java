package deob;

@ObfuscatedName("dz")
public class class128 {

    @ObfuscatedName("dz.cb")
    public long field1879;

    @ObfuscatedName("dz.ct")
    public class128 field1877;

    @ObfuscatedName("dz.cf")
    public class128 field1878;

    @ObfuscatedName("dz.fk()V")
    public void method2313() {
        if (this.field1878 != null) {
            this.field1878.field1877 = this.field1877;
            this.field1877.field1878 = this.field1878;
            this.field1877 = null;
            this.field1878 = null;
        }
    }

    @ObfuscatedName("dz.fh()Z")
    public boolean method2314() {
        return this.field1878 != null;
    }
}
