package deob;

@ObfuscatedName("di")
public class class119 {

    @ObfuscatedName("di.c")
    public int field1643;

    @ObfuscatedName("di.i")
    public int field1646;

    @ObfuscatedName("di.o")
    public int[] field1645;

    @ObfuscatedName("di.j")
    public int[] field1644;

    public class119() {
        class105.method1998(16);
        this.field1643 = class105.method1990() == 0 ? 1 : class105.method1998(4) + 1;
        if (class105.method1990() != 0) {
            class105.method1998(8);
        }
        class105.method1998(2);
        if (this.field1643 > 1) {
            this.field1646 = class105.method1998(4);
        }
        this.field1645 = new int[this.field1643];
        this.field1644 = new int[this.field1643];
        for (int var1 = 0; var1 < this.field1643; var1++) {
            class105.method1998(8);
            this.field1645[var1] = class105.method1998(8);
            this.field1644[var1] = class105.method1998(8);
        }
    }
}
