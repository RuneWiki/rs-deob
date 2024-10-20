package deob;

@ObfuscatedName("do")
public class class109 {

    @ObfuscatedName("do.y")
    public int field1436;

    @ObfuscatedName("do.c")
    public int field1437;

    @ObfuscatedName("do.n")
    public int[] field1438;

    @ObfuscatedName("do.u")
    public int[] field1439;

    public class109() {
        class95.method2007(16);
        this.field1436 = class95.method1987() == 0 ? 1 : class95.method2007(4) + 1;
        if (class95.method1987() != 0) {
            class95.method2007(8);
        }
        class95.method2007(2);
        if (this.field1436 > 1) {
            this.field1437 = class95.method2007(4);
        }
        this.field1438 = new int[this.field1436];
        this.field1439 = new int[this.field1436];
        for (int var1 = 0; var1 < this.field1436; var1++) {
            class95.method2007(8);
            this.field1438[var1] = class95.method2007(8);
            this.field1439[var1] = class95.method2007(8);
        }
    }
}
