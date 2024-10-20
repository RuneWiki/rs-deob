package deob;

@ObfuscatedName("dp")
public class class130 extends class128 {

    @ObfuscatedName("dp.cv")
    public class130 field1888;

    @ObfuscatedName("dp.cj")
    public class130 field1889;

    @ObfuscatedName("dp.cj()V")
    public void method2265() {
        if (this.field1889 != null) {
            this.field1889.field1888 = this.field1888;
            this.field1888.field1889 = this.field1889;
            this.field1888 = null;
            this.field1889 = null;
        }
    }
}
