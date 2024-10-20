package deob;

@ObfuscatedName("di")
public class class126 {

    @ObfuscatedName("di.f")
    public int field1526;

    @ObfuscatedName("di.b")
    public int field1525;

    @ObfuscatedName("di.l")
    public int[] field1524;

    @ObfuscatedName("di.m")
    public int[] field1527;

    public class126() {
        class112.method2289(16);
        this.field1526 = class112.method2288() == 0 ? 1 : class112.method2289(4) + 1;
        if (class112.method2288() != 0) {
            class112.method2289(8);
        }
        class112.method2289(2);
        if (this.field1526 > 1) {
            this.field1525 = class112.method2289(4);
        }
        this.field1524 = new int[this.field1526];
        this.field1527 = new int[this.field1526];
        for (int var1 = 0; var1 < this.field1526; var1++) {
            class112.method2289(8);
            this.field1524[var1] = class112.method2289(8);
            this.field1527[var1] = class112.method2289(8);
        }
    }
}
