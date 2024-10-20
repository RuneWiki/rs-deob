package deob;

@ObfuscatedName("dd")
public class class114 {

    @ObfuscatedName("dd.a")
    public int field1476;

    @ObfuscatedName("dd.s")
    public int field1475;

    @ObfuscatedName("dd.g")
    public int[] field1474;

    @ObfuscatedName("dd.x")
    public int[] field1477;

    public class114() {
        class100.method2192(16);
        this.field1476 = class100.method2191() == 0 ? 1 : class100.method2192(4) + 1;
        if (class100.method2191() != 0) {
            class100.method2192(8);
        }
        class100.method2192(2);
        if (this.field1476 > 1) {
            this.field1475 = class100.method2192(4);
        }
        this.field1474 = new int[this.field1476];
        this.field1477 = new int[this.field1476];
        for (int var1 = 0; var1 < this.field1476; var1++) {
            class100.method2192(8);
            this.field1474[var1] = class100.method2192(8);
            this.field1477[var1] = class100.method2192(8);
        }
    }
}
