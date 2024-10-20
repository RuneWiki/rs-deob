package deob;

@ObfuscatedName("dm")
public class class130 extends class128 {

    @ObfuscatedName("dm.ce")
    public class130 field1873;

    @ObfuscatedName("dm.cg")
    public class130 field1872;

    @ObfuscatedName("dm.cu()V")
    public void method2264() {
        if (this.field1872 != null) {
            this.field1872.field1873 = this.field1873;
            this.field1873.field1872 = this.field1872;
            this.field1873 = null;
            this.field1872 = null;
        }
    }
}
