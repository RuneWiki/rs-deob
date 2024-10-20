package deob;

@ObfuscatedName("df")
public class class121 {

    @ObfuscatedName("df.n")
    public int field1728;

    @ObfuscatedName("df.p")
    public int field1731;

    @ObfuscatedName("df.i")
    public int[] field1730;

    @ObfuscatedName("df.j")
    public int[] field1729;

    public class121() {
        class107.method1802(16);
        this.field1728 = class107.method1801() == 0 ? 1 : class107.method1802(4) + 1;
        if (class107.method1801() != 0) {
            class107.method1802(8);
        }
        class107.method1802(2);
        if (this.field1728 > 1) {
            this.field1731 = class107.method1802(4);
        }
        this.field1730 = new int[this.field1728];
        this.field1729 = new int[this.field1728];
        for (int var1 = 0; var1 < this.field1728; var1++) {
            class107.method1802(8);
            this.field1730[var1] = class107.method1802(8);
            this.field1729[var1] = class107.method1802(8);
        }
    }
}
