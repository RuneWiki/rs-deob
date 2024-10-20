package deob;

@ObfuscatedName("dx")
public class class130 extends class128 {

    @ObfuscatedName("dx.cj")
    public class130 field1883;

    @ObfuscatedName("dx.cq")
    public class130 field1884;

    @ObfuscatedName("dx.cj()V")
    public void method2307() {
        if (this.field1884 != null) {
            this.field1884.field1883 = this.field1883;
            this.field1883.field1884 = this.field1884;
            this.field1883 = null;
            this.field1884 = null;
        }
    }
}
