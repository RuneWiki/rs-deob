package deob;

@ObfuscatedName("dz")
public class class121 {

    @ObfuscatedName("dz.i")
    public int field1731;

    @ObfuscatedName("dz.w")
    public int field1733;

    @ObfuscatedName("dz.a")
    public int[] field1732;

    @ObfuscatedName("dz.t")
    public int[] field1730;

    public class121() {
        class107.method1814(16);
        this.field1731 = class107.method1799() == 0 ? 1 : class107.method1814(4) + 1;
        if (class107.method1799() != 0) {
            class107.method1814(8);
        }
        class107.method1814(2);
        if (this.field1731 > 1) {
            this.field1733 = class107.method1814(4);
        }
        this.field1732 = new int[this.field1731];
        this.field1730 = new int[this.field1731];
        for (int var1 = 0; var1 < this.field1731; var1++) {
            class107.method1814(8);
            this.field1732[var1] = class107.method1814(8);
            this.field1730[var1] = class107.method1814(8);
        }
    }
}
