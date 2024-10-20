package deob;

@ObfuscatedName("dn")
public class class130 extends class128 {

    @ObfuscatedName("dn.ci")
    public class130 field1900;

    @ObfuscatedName("dn.cc")
    public class130 field1899;

    @ObfuscatedName("dn.cp()V")
    public void method2232() {
        if (this.field1899 != null) {
            this.field1899.field1900 = this.field1900;
            this.field1900.field1899 = this.field1899;
            this.field1900 = null;
            this.field1899 = null;
        }
    }
}
