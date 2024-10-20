package deob;

@ObfuscatedName("dh")
public class class118 {

    @ObfuscatedName("dh.p")
    public int field1603;

    @ObfuscatedName("dh.i")
    public int field1604;

    @ObfuscatedName("dh.w")
    public int[] field1606;

    @ObfuscatedName("dh.s")
    public int[] field1605;

    public class118() {
        class104.method1976(16);
        this.field1603 = class104.method1973() == 0 ? 1 : class104.method1976(4) + 1;
        if (class104.method1973() != 0) {
            class104.method1976(8);
        }
        class104.method1976(2);
        if (this.field1603 > 1) {
            this.field1604 = class104.method1976(4);
        }
        this.field1606 = new int[this.field1603];
        this.field1605 = new int[this.field1603];
        for (int var1 = 0; var1 < this.field1603; var1++) {
            class104.method1976(8);
            this.field1606[var1] = class104.method1976(8);
            this.field1605[var1] = class104.method1976(8);
        }
    }
}
