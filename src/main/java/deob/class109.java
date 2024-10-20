package deob;

@ObfuscatedName("di")
public class class109 {

    @ObfuscatedName("di.f")
    public int field1434;

    @ObfuscatedName("di.h")
    public int field1432;

    @ObfuscatedName("di.e")
    public int[] field1433;

    @ObfuscatedName("di.b")
    public int[] field1435;

    public class109() {
        class95.method1994(16);
        this.field1434 = class95.method1977() == 0 ? 1 : class95.method1994(4) + 1;
        if (class95.method1977() != 0) {
            class95.method1994(8);
        }
        class95.method1994(2);
        if (this.field1434 > 1) {
            this.field1432 = class95.method1994(4);
        }
        this.field1433 = new int[this.field1434];
        this.field1435 = new int[this.field1434];
        for (int var1 = 0; var1 < this.field1434; var1++) {
            class95.method1994(8);
            this.field1433[var1] = class95.method1994(8);
            this.field1435[var1] = class95.method1994(8);
        }
    }
}
