package deob;

@ObfuscatedName("dh")
public class class109 {

    @ObfuscatedName("dh.c")
    public int field1451;

    @ObfuscatedName("dh.q")
    public int field1454;

    @ObfuscatedName("dh.m")
    public int[] field1453;

    @ObfuscatedName("dh.j")
    public int[] field1452;

    public class109() {
        class95.method1931(16);
        this.field1451 = class95.method1943() == 0 ? 1 : class95.method1931(4) + 1;
        if (class95.method1943() != 0) {
            class95.method1931(8);
        }
        class95.method1931(2);
        if (this.field1451 > 1) {
            this.field1454 = class95.method1931(4);
        }
        this.field1453 = new int[this.field1451];
        this.field1452 = new int[this.field1451];
        for (int var1 = 0; var1 < this.field1451; var1++) {
            class95.method1931(8);
            this.field1453[var1] = class95.method1931(8);
            this.field1452[var1] = class95.method1931(8);
        }
    }
}
