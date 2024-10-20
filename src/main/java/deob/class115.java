package deob;

@ObfuscatedName("da")
public class class115 {

    @ObfuscatedName("da.f")
    public int field1458;

    @ObfuscatedName("da.i")
    public int field1457;

    @ObfuscatedName("da.y")
    public int[] field1459;

    @ObfuscatedName("da.w")
    public int[] field1460;

    public class115() {
        class101.method2175(16);
        this.field1458 = class101.method2192() == 0 ? 1 : class101.method2175(4) + 1;
        if (class101.method2192() != 0) {
            class101.method2175(8);
        }
        class101.method2175(2);
        if (this.field1458 > 1) {
            this.field1457 = class101.method2175(4);
        }
        this.field1459 = new int[this.field1458];
        this.field1460 = new int[this.field1458];
        for (int var1 = 0; var1 < this.field1458; var1++) {
            class101.method2175(8);
            this.field1459[var1] = class101.method2175(8);
            this.field1460[var1] = class101.method2175(8);
        }
    }
}
