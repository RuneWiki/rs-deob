package deob;

@ObfuscatedName("ds")
public class class121 {

    @ObfuscatedName("ds.i")
    public int field1739;

    @ObfuscatedName("ds.c")
    public int field1738;

    @ObfuscatedName("ds.e")
    public int[] field1737;

    @ObfuscatedName("ds.v")
    public int[] field1740;

    public class121() {
        class107.method1802(16);
        this.field1739 = class107.method1801() == 0 ? 1 : class107.method1802(4) + 1;
        if (class107.method1801() != 0) {
            class107.method1802(8);
        }
        class107.method1802(2);
        if (this.field1739 > 1) {
            this.field1738 = class107.method1802(4);
        }
        this.field1737 = new int[this.field1739];
        this.field1740 = new int[this.field1739];
        for (int var1 = 0; var1 < this.field1739; var1++) {
            class107.method1802(8);
            this.field1737[var1] = class107.method1802(8);
            this.field1740[var1] = class107.method1802(8);
        }
    }
}
