package deob;

@ObfuscatedName("dp")
public class class128 {

    @ObfuscatedName("dp.cx")
    public long field1885;

    @ObfuscatedName("dp.cn")
    public class128 field1884;

    @ObfuscatedName("dp.cl")
    public class128 field1883;

    @ObfuscatedName("dp.ek()V")
    public void method2278() {
        if (this.field1883 != null) {
            this.field1883.field1884 = this.field1884;
            this.field1884.field1883 = this.field1883;
            this.field1884 = null;
            this.field1883 = null;
        }
    }

    @ObfuscatedName("dp.eg()Z")
    public boolean method2279() {
        return this.field1883 != null;
    }
}
