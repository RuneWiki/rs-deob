package deob;

@ObfuscatedName("dn")
public class class126 {

    @ObfuscatedName("dn.z")
    public int field1524;

    @ObfuscatedName("dn.k")
    public int field1526;

    @ObfuscatedName("dn.s")
    public int[] field1525;

    @ObfuscatedName("dn.t")
    public int[] field1527;

    public class126() {
        class112.method2272(16);
        this.field1524 = class112.method2279() == 0 ? 1 : class112.method2272(4) + 1;
        if (class112.method2279() != 0) {
            class112.method2272(8);
        }
        class112.method2272(2);
        if (this.field1524 > 1) {
            this.field1526 = class112.method2272(4);
        }
        this.field1525 = new int[this.field1524];
        this.field1527 = new int[this.field1524];
        for (int var1 = 0; var1 < this.field1524; var1++) {
            class112.method2272(8);
            this.field1525[var1] = class112.method2272(8);
            this.field1527[var1] = class112.method2272(8);
        }
    }
}
