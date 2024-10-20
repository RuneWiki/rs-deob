package deob;

@ObfuscatedName("da")
public class class119 {

    @ObfuscatedName("da.d")
    public int field1646;

    @ObfuscatedName("da.z")
    public int field1643;

    @ObfuscatedName("da.n")
    public int[] field1645;

    @ObfuscatedName("da.r")
    public int[] field1644;

    public class119() {
        class105.method2030(16);
        this.field1646 = class105.method2018() == 0 ? 1 : class105.method2030(4) + 1;
        if (class105.method2018() != 0) {
            class105.method2030(8);
        }
        class105.method2030(2);
        if (this.field1646 > 1) {
            this.field1643 = class105.method2030(4);
        }
        this.field1645 = new int[this.field1646];
        this.field1644 = new int[this.field1646];
        for (int var1 = 0; var1 < this.field1646; var1++) {
            class105.method2030(8);
            this.field1645[var1] = class105.method2030(8);
            this.field1644[var1] = class105.method2030(8);
        }
    }
}
