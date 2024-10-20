package deob;

@ObfuscatedName("dy")
public class class119 {

    @ObfuscatedName("dy.g")
    public int field1628;

    @ObfuscatedName("dy.e")
    public int field1627;

    @ObfuscatedName("dy.b")
    public int[] field1629;

    @ObfuscatedName("dy.z")
    public int[] field1626;

    public class119() {
        class105.method2103(16);
        this.field1628 = class105.method2105() == 0 ? 1 : class105.method2103(4) + 1;
        if (class105.method2105() != 0) {
            class105.method2103(8);
        }
        class105.method2103(2);
        if (this.field1628 > 1) {
            this.field1627 = class105.method2103(4);
        }
        this.field1629 = new int[this.field1628];
        this.field1626 = new int[this.field1628];
        for (int var1 = 0; var1 < this.field1628; var1++) {
            class105.method2103(8);
            this.field1629[var1] = class105.method2103(8);
            this.field1626[var1] = class105.method2103(8);
        }
    }
}
