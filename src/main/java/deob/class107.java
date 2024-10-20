package deob;

@ObfuscatedName("dz")
public class class107 {

    @ObfuscatedName("dz.z")
    public int field1389;

    @ObfuscatedName("dz.w")
    public int field1388;

    @ObfuscatedName("dz.s")
    public int[] field1390;

    @ObfuscatedName("dz.l")
    public int[] field1387;

    public class107() {
        class93.method1973(16);
        this.field1389 = class93.method1958() == 0 ? 1 : class93.method1973(4) + 1;
        if (class93.method1958() != 0) {
            class93.method1973(8);
        }
        class93.method1973(2);
        if (this.field1389 > 1) {
            this.field1388 = class93.method1973(4);
        }
        this.field1390 = new int[this.field1389];
        this.field1387 = new int[this.field1389];
        for (int var1 = 0; var1 < this.field1389; var1++) {
            class93.method1973(8);
            this.field1390[var1] = class93.method1973(8);
            this.field1387[var1] = class93.method1973(8);
        }
    }
}
