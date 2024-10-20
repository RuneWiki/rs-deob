package deob;

@ObfuscatedName("df")
public class class130 extends class128 {

    @ObfuscatedName("df.cy")
    public class130 field1888;

    @ObfuscatedName("df.cz")
    public class130 field1889;

    @ObfuscatedName("df.cc()V")
    public void method2318() {
        if (this.field1889 != null) {
            this.field1889.field1888 = this.field1888;
            this.field1888.field1889 = this.field1889;
            this.field1888 = null;
            this.field1889 = null;
        }
    }
}
