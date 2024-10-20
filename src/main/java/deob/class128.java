package deob;

@ObfuscatedName("dr")
public class class128 {

    @ObfuscatedName("dr.ck")
    public long field1894;

    @ObfuscatedName("dr.cn")
    public class128 field1895;

    @ObfuscatedName("dr.cr")
    public class128 field1896;

    @ObfuscatedName("dr.ek()V")
    public void method2189() {
        if (this.field1896 != null) {
            this.field1896.field1895 = this.field1895;
            this.field1895.field1896 = this.field1896;
            this.field1895 = null;
            this.field1896 = null;
        }
    }

    @ObfuscatedName("dr.es()Z")
    public boolean method2191() {
        return this.field1896 != null;
    }
}
