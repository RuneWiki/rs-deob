package deob;

@ObfuscatedName("dz")
public class class128 {

    @ObfuscatedName("dz.cq")
    public long field1864;

    @ObfuscatedName("dz.cx")
    public class128 field1865;

    @ObfuscatedName("dz.ck")
    public class128 field1866;

    @ObfuscatedName("dz.ep()V")
    public void method2298() {
        if (this.field1866 != null) {
            this.field1866.field1865 = this.field1865;
            this.field1865.field1866 = this.field1866;
            this.field1865 = null;
            this.field1866 = null;
        }
    }

    @ObfuscatedName("dz.fa()Z")
    public boolean method2299() {
        return this.field1866 != null;
    }
}
