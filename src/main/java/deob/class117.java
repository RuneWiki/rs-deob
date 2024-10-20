package deob;

@ObfuscatedName("dz")
public class class117 {

    @ObfuscatedName("dz.c")
    public int field1464;

    @ObfuscatedName("dz.x")
    public int field1465;

    @ObfuscatedName("dz.t")
    public int[] field1466;

    @ObfuscatedName("dz.g")
    public int[] field1467;

    public class117() {
        class103.method2190(16);
        this.field1464 = class103.method2194() == 0 ? 1 : class103.method2190(4) + 1;
        if (class103.method2194() != 0) {
            class103.method2190(8);
        }
        class103.method2190(2);
        if (this.field1464 > 1) {
            this.field1465 = class103.method2190(4);
        }
        this.field1466 = new int[this.field1464];
        this.field1467 = new int[this.field1464];
        for (int var1 = 0; var1 < this.field1464; var1++) {
            class103.method2190(8);
            this.field1466[var1] = class103.method2190(8);
            this.field1467[var1] = class103.method2190(8);
        }
    }
}
