package deob;

@ObfuscatedName("df")
public class class117 {

    @ObfuscatedName("df.a")
    public int field1475;

    @ObfuscatedName("df.t")
    public int field1472;

    @ObfuscatedName("df.n")
    public int[] field1474;

    @ObfuscatedName("df.q")
    public int[] field1473;

    public class117() {
        class103.method2285(16);
        this.field1475 = class103.method2284() == 0 ? 1 : class103.method2285(4) + 1;
        if (class103.method2284() != 0) {
            class103.method2285(8);
        }
        class103.method2285(2);
        if (this.field1475 > 1) {
            this.field1472 = class103.method2285(4);
        }
        this.field1474 = new int[this.field1475];
        this.field1473 = new int[this.field1475];
        for (int var1 = 0; var1 < this.field1475; var1++) {
            class103.method2285(8);
            this.field1474[var1] = class103.method2285(8);
            this.field1473[var1] = class103.method2285(8);
        }
    }
}
