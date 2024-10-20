package deob;

@ObfuscatedName("dr")
public class class130 extends class128 {

    @ObfuscatedName("dr.cu")
    public class130 field1886;

    @ObfuscatedName("dr.cm")
    public class130 field1887;

    @ObfuscatedName("dr.cg()V")
    public void method2345() {
        if (this.field1887 != null) {
            this.field1887.field1886 = this.field1886;
            this.field1886.field1887 = this.field1887;
            this.field1886 = null;
            this.field1887 = null;
        }
    }
}
