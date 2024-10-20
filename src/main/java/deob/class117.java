package deob;

@ObfuscatedName("dz")
public class class117 {

    @ObfuscatedName("dz.u")
    public int field1489;

    @ObfuscatedName("dz.f")
    public int field1491;

    @ObfuscatedName("dz.b")
    public int[] field1490;

    @ObfuscatedName("dz.g")
    public int[] field1488;

    public class117() {
        class103.method2178(16);
        this.field1489 = class103.method2177() == 0 ? 1 : class103.method2178(4) + 1;
        if (class103.method2177() != 0) {
            class103.method2178(8);
        }
        class103.method2178(2);
        if (this.field1489 > 1) {
            this.field1491 = class103.method2178(4);
        }
        this.field1490 = new int[this.field1489];
        this.field1488 = new int[this.field1489];
        for (int var1 = 0; var1 < this.field1489; var1++) {
            class103.method2178(8);
            this.field1490[var1] = class103.method2178(8);
            this.field1488[var1] = class103.method2178(8);
        }
    }
}
