package deob;

@ObfuscatedName("dd")
public class class106 {

    @ObfuscatedName("dd.t")
    public long field1500;

    @ObfuscatedName("dd.n")
    public class106 field1498;

    @ObfuscatedName("dd.q")
    public class106 field1499;

    @ObfuscatedName("dd.t()V")
    public void method1307() {
        if (this.field1499 != null) {
            this.field1499.field1498 = this.field1498;
            this.field1498.field1499 = this.field1499;
            this.field1498 = null;
            this.field1499 = null;
        }
    }

    @ObfuscatedName("dd.n()Z")
    public boolean method1309() {
        return this.field1499 != null;
    }
}
