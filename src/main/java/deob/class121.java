package deob;

@ObfuscatedName("dl")
public class class121 {

    @ObfuscatedName("dl.i")
    public int field1711;

    @ObfuscatedName("dl.h")
    public int field1708;

    @ObfuscatedName("dl.u")
    public int[] field1710;

    @ObfuscatedName("dl.q")
    public int[] field1709;

    public class121() {
        class107.method1821(16);
        this.field1711 = class107.method1820() == 0 ? 1 : class107.method1821(4) + 1;
        if (class107.method1820() != 0) {
            class107.method1821(8);
        }
        class107.method1821(2);
        if (this.field1711 > 1) {
            this.field1708 = class107.method1821(4);
        }
        this.field1710 = new int[this.field1711];
        this.field1709 = new int[this.field1711];
        for (int var1 = 0; var1 < this.field1711; var1++) {
            class107.method1821(8);
            this.field1710[var1] = class107.method1821(8);
            this.field1709[var1] = class107.method1821(8);
        }
    }
}
