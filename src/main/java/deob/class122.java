package deob;

@ObfuscatedName("dj")
public class class122 {

    @ObfuscatedName("dj.e")
    public int field1710;

    @ObfuscatedName("dj.n")
    public int field1711;

    @ObfuscatedName("dj.g")
    public int[] field1709;

    @ObfuscatedName("dj.y")
    public int[] field1712;

    public class122() {
        class108.method1837(16);
        this.field1710 = class108.method1848() == 0 ? 1 : class108.method1837(4) + 1;
        if (class108.method1848() != 0) {
            class108.method1837(8);
        }
        class108.method1837(2);
        if (this.field1710 > 1) {
            this.field1711 = class108.method1837(4);
        }
        this.field1709 = new int[this.field1710];
        this.field1712 = new int[this.field1710];
        for (int var1 = 0; var1 < this.field1710; var1++) {
            class108.method1837(8);
            this.field1709[var1] = class108.method1837(8);
            this.field1712[var1] = class108.method1837(8);
        }
    }
}
