package deob;

@ObfuscatedName("dm")
public class class130 extends class128 {

    @ObfuscatedName("dm.cc")
    public class130 field1910;

    @ObfuscatedName("dm.cq")
    public class130 field1909;

    @ObfuscatedName("dm.ci()V")
    public void method2332() {
        if (this.field1909 != null) {
            this.field1909.field1910 = this.field1910;
            this.field1910.field1909 = this.field1909;
            this.field1910 = null;
            this.field1909 = null;
        }
    }
}
