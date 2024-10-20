package deob;

@ObfuscatedName("dd")
public class class119 {

    @ObfuscatedName("dd.w")
    public int field1710;

    @ObfuscatedName("dd.s")
    public int field1711;

    @ObfuscatedName("dd.q")
    public int[] field1709;

    @ObfuscatedName("dd.o")
    public int[] field1708;

    public class119() {
        class105.method1872(16);
        this.field1710 = class105.method1868() == 0 ? 1 : class105.method1872(4) + 1;
        if (class105.method1868() != 0) {
            class105.method1872(8);
        }
        class105.method1872(2);
        if (this.field1710 > 1) {
            this.field1711 = class105.method1872(4);
        }
        this.field1709 = new int[this.field1710];
        this.field1708 = new int[this.field1710];
        for (int var1 = 0; var1 < this.field1710; var1++) {
            class105.method1872(8);
            this.field1709[var1] = class105.method1872(8);
            this.field1708[var1] = class105.method1872(8);
        }
    }
}
