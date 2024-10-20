package deob;

@ObfuscatedName("db")
public class class128 {

    @ObfuscatedName("db.ch")
    public long field1885;

    @ObfuscatedName("db.cy")
    public class128 field1883;

    @ObfuscatedName("db.cs")
    public class128 field1884;

    @ObfuscatedName("db.fp()V")
    public void method2225() {
        if (this.field1884 != null) {
            this.field1884.field1883 = this.field1883;
            this.field1883.field1884 = this.field1884;
            this.field1883 = null;
            this.field1884 = null;
        }
    }

    @ObfuscatedName("db.fd()Z")
    public boolean method2226() {
        return this.field1884 != null;
    }
}
