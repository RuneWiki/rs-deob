package deob;

@ObfuscatedName("dp")
public class class119 {

    @ObfuscatedName("dp.d")
    public int field1708;

    @ObfuscatedName("dp.k")
    public int field1709;

    @ObfuscatedName("dp.e")
    public int[] field1710;

    @ObfuscatedName("dp.p")
    public int[] field1711;

    public class119() {
        class105.method1864(16);
        this.field1708 = class105.method1863() == 0 ? 1 : class105.method1864(4) + 1;
        if (class105.method1863() != 0) {
            class105.method1864(8);
        }
        class105.method1864(2);
        if (this.field1708 > 1) {
            this.field1709 = class105.method1864(4);
        }
        this.field1710 = new int[this.field1708];
        this.field1711 = new int[this.field1708];
        for (int var1 = 0; var1 < this.field1708; var1++) {
            class105.method1864(8);
            this.field1710[var1] = class105.method1864(8);
            this.field1711[var1] = class105.method1864(8);
        }
    }
}
