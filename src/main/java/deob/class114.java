package deob;

@ObfuscatedName("dc")
public class class114 {

    @ObfuscatedName("dc.n")
    public int field1454;

    @ObfuscatedName("dc.h")
    public int field1452;

    @ObfuscatedName("dc.l")
    public int[] field1453;

    @ObfuscatedName("dc.g")
    public int[] field1451;

    public class114() {
        class100.method2169(16);
        this.field1454 = class100.method2168() == 0 ? 1 : class100.method2169(4) + 1;
        if (class100.method2168() != 0) {
            class100.method2169(8);
        }
        class100.method2169(2);
        if (this.field1454 > 1) {
            this.field1452 = class100.method2169(4);
        }
        this.field1453 = new int[this.field1454];
        this.field1451 = new int[this.field1454];
        for (int var1 = 0; var1 < this.field1454; var1++) {
            class100.method2169(8);
            this.field1453[var1] = class100.method2169(8);
            this.field1451[var1] = class100.method2169(8);
        }
    }
}
