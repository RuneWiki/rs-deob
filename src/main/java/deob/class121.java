package deob;

@ObfuscatedName("dp")
public class class121 {

    @ObfuscatedName("dp.a")
    public int field1712;

    @ObfuscatedName("dp.j")
    public int field1710;

    @ObfuscatedName("dp.n")
    public int[] field1711;

    @ObfuscatedName("dp.r")
    public int[] field1709;

    public class121() {
        class107.method1770(16);
        this.field1712 = class107.method1757() == 0 ? 1 : class107.method1770(4) + 1;
        if (class107.method1757() != 0) {
            class107.method1770(8);
        }
        class107.method1770(2);
        if (this.field1712 > 1) {
            this.field1710 = class107.method1770(4);
        }
        this.field1711 = new int[this.field1712];
        this.field1709 = new int[this.field1712];
        for (int var1 = 0; var1 < this.field1712; var1++) {
            class107.method1770(8);
            this.field1711[var1] = class107.method1770(8);
            this.field1709[var1] = class107.method1770(8);
        }
    }
}
