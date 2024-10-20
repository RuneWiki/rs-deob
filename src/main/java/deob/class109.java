package deob;

@ObfuscatedName("di")
public class class109 {

    @ObfuscatedName("di.v")
    public int field1438;

    @ObfuscatedName("di.s")
    public int field1436;

    @ObfuscatedName("di.o")
    public int[] field1437;

    @ObfuscatedName("di.k")
    public int[] field1439;

    public class109() {
        class95.method1977(16);
        this.field1438 = class95.method1976() == 0 ? 1 : class95.method1977(4) + 1;
        if (class95.method1976() != 0) {
            class95.method1977(8);
        }
        class95.method1977(2);
        if (this.field1438 > 1) {
            this.field1436 = class95.method1977(4);
        }
        this.field1437 = new int[this.field1438];
        this.field1439 = new int[this.field1438];
        for (int var1 = 0; var1 < this.field1438; var1++) {
            class95.method1977(8);
            this.field1437[var1] = class95.method1977(8);
            this.field1439[var1] = class95.method1977(8);
        }
    }
}
