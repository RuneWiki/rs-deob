package deob;

@ObfuscatedName("db")
public class class128 {

    @ObfuscatedName("db.cg")
    public long field1874;

    @ObfuscatedName("db.cz")
    public class128 field1875;

    @ObfuscatedName("db.cv")
    public class128 field1873;

    @ObfuscatedName("db.fy()V")
    public void method2214() {
        if (this.field1873 != null) {
            this.field1873.field1875 = this.field1875;
            this.field1875.field1873 = this.field1873;
            this.field1875 = null;
            this.field1873 = null;
        }
    }

    @ObfuscatedName("db.fm()Z")
    public boolean method2213() {
        return this.field1873 != null;
    }
}
