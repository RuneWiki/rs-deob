package deob;

@ObfuscatedName("dq")
public class class128 {

    @ObfuscatedName("dq.cz")
    public long field1879;

    @ObfuscatedName("dq.cb")
    public class128 field1878;

    @ObfuscatedName("dq.ch")
    public class128 field1880;

    @ObfuscatedName("dq.gx()V")
    public void method2273() {
        if (this.field1880 != null) {
            this.field1880.field1878 = this.field1878;
            this.field1878.field1880 = this.field1880;
            this.field1878 = null;
            this.field1880 = null;
        }
    }

    @ObfuscatedName("dq.gt()Z")
    public boolean method2272() {
        return this.field1880 != null;
    }
}
