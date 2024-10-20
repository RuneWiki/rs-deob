package deob;

@ObfuscatedName("dn")
public class class128 {

    @ObfuscatedName("dn.cl")
    public long field1884;

    @ObfuscatedName("dn.cb")
    public class128 field1885;

    @ObfuscatedName("dn.cz")
    public class128 field1886;

    @ObfuscatedName("dn.fm()V")
    public void method2327() {
        if (this.field1886 != null) {
            this.field1886.field1885 = this.field1885;
            this.field1885.field1886 = this.field1886;
            this.field1885 = null;
            this.field1886 = null;
        }
    }

    @ObfuscatedName("dn.fj()Z")
    public boolean method2328() {
        return this.field1886 != null;
    }
}
