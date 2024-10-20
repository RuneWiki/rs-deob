package deob;

@ObfuscatedName("dz")
public class class126 {

    @ObfuscatedName("dz.n")
    public int field1517;

    @ObfuscatedName("dz.v")
    public int field1516;

    @ObfuscatedName("dz.d")
    public int[] field1518;

    @ObfuscatedName("dz.c")
    public int[] field1515;

    public class126() {
        class112.method2357(16);
        this.field1517 = class112.method2385() == 0 ? 1 : class112.method2357(4) + 1;
        if (class112.method2385() != 0) {
            class112.method2357(8);
        }
        class112.method2357(2);
        if (this.field1517 > 1) {
            this.field1516 = class112.method2357(4);
        }
        this.field1518 = new int[this.field1517];
        this.field1515 = new int[this.field1517];
        for (int var1 = 0; var1 < this.field1517; var1++) {
            class112.method2357(8);
            this.field1518[var1] = class112.method2357(8);
            this.field1515[var1] = class112.method2357(8);
        }
    }
}
