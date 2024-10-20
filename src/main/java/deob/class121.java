package deob;

@ObfuscatedName("dg")
public class class121 {

    @ObfuscatedName("dg.w")
    public int field1724;

    @ObfuscatedName("dg.o")
    public int field1725;

    @ObfuscatedName("dg.x")
    public int[] field1726;

    @ObfuscatedName("dg.k")
    public int[] field1727;

    public class121() {
        class107.method1763(16);
        this.field1724 = class107.method1762() == 0 ? 1 : class107.method1763(4) + 1;
        if (class107.method1762() != 0) {
            class107.method1763(8);
        }
        class107.method1763(2);
        if (this.field1724 > 1) {
            this.field1725 = class107.method1763(4);
        }
        this.field1726 = new int[this.field1724];
        this.field1727 = new int[this.field1724];
        for (int var1 = 0; var1 < this.field1724; var1++) {
            class107.method1763(8);
            this.field1726[var1] = class107.method1763(8);
            this.field1727[var1] = class107.method1763(8);
        }
    }
}
