package deob;

@ObfuscatedName("dd")
public class class121 {

    @ObfuscatedName("dd.e")
    public int field1723;

    @ObfuscatedName("dd.o")
    public int field1720;

    @ObfuscatedName("dd.m")
    public int[] field1722;

    @ObfuscatedName("dd.g")
    public int[] field1721;

    public class121() {
        class107.method1803(16);
        this.field1723 = class107.method1801() == 0 ? 1 : class107.method1803(4) + 1;
        if (class107.method1801() != 0) {
            class107.method1803(8);
        }
        class107.method1803(2);
        if (this.field1723 > 1) {
            this.field1720 = class107.method1803(4);
        }
        this.field1722 = new int[this.field1723];
        this.field1721 = new int[this.field1723];
        for (int var1 = 0; var1 < this.field1723; var1++) {
            class107.method1803(8);
            this.field1722[var1] = class107.method1803(8);
            this.field1721[var1] = class107.method1803(8);
        }
    }
}
