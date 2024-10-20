package deob;

@ObfuscatedName("db")
public class class121 {

    @ObfuscatedName("db.c")
    public int field1687;

    @ObfuscatedName("db.o")
    public int field1686;

    @ObfuscatedName("db.i")
    public int[] field1685;

    @ObfuscatedName("db.u")
    public int[] field1688;

    public class121() {
        class107.method1741(16);
        this.field1687 = class107.method1740() == 0 ? 1 : class107.method1741(4) + 1;
        if (class107.method1740() != 0) {
            class107.method1741(8);
        }
        class107.method1741(2);
        if (this.field1687 > 1) {
            this.field1686 = class107.method1741(4);
        }
        this.field1685 = new int[this.field1687];
        this.field1688 = new int[this.field1687];
        for (int var1 = 0; var1 < this.field1687; var1++) {
            class107.method1741(8);
            this.field1685[var1] = class107.method1741(8);
            this.field1688[var1] = class107.method1741(8);
        }
    }
}
