package deob;

@ObfuscatedName("dx")
public class class128 {

    @ObfuscatedName("dx.cm")
    public long field1889;

    @ObfuscatedName("dx.cf")
    public class128 field1888;

    @ObfuscatedName("dx.cq")
    public class128 field1887;

    @ObfuscatedName("dx.fi()V")
    public void method2179() {
        if (this.field1887 != null) {
            this.field1887.field1888 = this.field1888;
            this.field1888.field1887 = this.field1887;
            this.field1888 = null;
            this.field1887 = null;
        }
    }

    @ObfuscatedName("dx.fc()Z")
    public boolean method2175() {
        return this.field1887 != null;
    }
}
