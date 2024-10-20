package deob;

@ObfuscatedName("de")
public class class121 {

    @ObfuscatedName("de.s")
    public int field1718;

    @ObfuscatedName("de.c")
    public int field1719;

    @ObfuscatedName("de.f")
    public int[] field1720;

    @ObfuscatedName("de.m")
    public int[] field1721;

    public class121() {
        class107.method1835(16);
        this.field1718 = class107.method1834() == 0 ? 1 : class107.method1835(4) + 1;
        if (class107.method1834() != 0) {
            class107.method1835(8);
        }
        class107.method1835(2);
        if (this.field1718 > 1) {
            this.field1719 = class107.method1835(4);
        }
        this.field1720 = new int[this.field1718];
        this.field1721 = new int[this.field1718];
        for (int var1 = 0; var1 < this.field1718; var1++) {
            class107.method1835(8);
            this.field1720[var1] = class107.method1835(8);
            this.field1721[var1] = class107.method1835(8);
        }
    }
}
