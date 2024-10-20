package deob;

@ObfuscatedName("dv")
public class class128 {

    @ObfuscatedName("dv.cm")
    public long field1867;

    @ObfuscatedName("dv.cq")
    public class128 field1868;

    @ObfuscatedName("dv.cu")
    public class128 field1869;

    @ObfuscatedName("dv.fg()V")
    public void method2228() {
        if (this.field1869 != null) {
            this.field1869.field1868 = this.field1868;
            this.field1868.field1869 = this.field1869;
            this.field1868 = null;
            this.field1869 = null;
        }
    }

    @ObfuscatedName("dv.fn()Z")
    public boolean method2227() {
        return this.field1869 != null;
    }
}
