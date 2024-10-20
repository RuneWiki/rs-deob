package deob;

@ObfuscatedName("dt")
public class class119 {

    @ObfuscatedName("dt.o")
    public int field1665;

    @ObfuscatedName("dt.k")
    public int field1662;

    @ObfuscatedName("dt.t")
    public int[] field1664;

    @ObfuscatedName("dt.d")
    public int[] field1663;

    public class119() {
        class105.method1960(16);
        this.field1665 = class105.method1958() == 0 ? 1 : class105.method1960(4) + 1;
        if (class105.method1958() != 0) {
            class105.method1960(8);
        }
        class105.method1960(2);
        if (this.field1665 > 1) {
            this.field1662 = class105.method1960(4);
        }
        this.field1664 = new int[this.field1665];
        this.field1663 = new int[this.field1665];
        for (int var1 = 0; var1 < this.field1665; var1++) {
            class105.method1960(8);
            this.field1664[var1] = class105.method1960(8);
            this.field1663[var1] = class105.method1960(8);
        }
    }
}
