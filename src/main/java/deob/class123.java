package deob;

@ObfuscatedName("dc")
public class class123 {

    @ObfuscatedName("dc.d")
    public int field1713;

    @ObfuscatedName("dc.q")
    public int field1711;

    @ObfuscatedName("dc.x")
    public int[] field1712;

    @ObfuscatedName("dc.y")
    public int[] field1714;

    public class123() {
        class109.method1851(16);
        this.field1713 = class109.method1870() == 0 ? 1 : class109.method1851(4) + 1;
        if (class109.method1870() != 0) {
            class109.method1851(8);
        }
        class109.method1851(2);
        if (this.field1713 > 1) {
            this.field1711 = class109.method1851(4);
        }
        this.field1712 = new int[this.field1713];
        this.field1714 = new int[this.field1713];
        for (int var1 = 0; var1 < this.field1713; var1++) {
            class109.method1851(8);
            this.field1712[var1] = class109.method1851(8);
            this.field1714[var1] = class109.method1851(8);
        }
    }
}
