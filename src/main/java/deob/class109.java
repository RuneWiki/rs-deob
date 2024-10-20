package deob;

@ObfuscatedName("dk")
public class class109 {

    @ObfuscatedName("dk.g")
    public int field1448;

    @ObfuscatedName("dk.r")
    public int field1450;

    @ObfuscatedName("dk.e")
    public int[] field1449;

    @ObfuscatedName("dk.q")
    public int[] field1447;

    public class109() {
        class95.method2150(16);
        this.field1448 = class95.method2165() == 0 ? 1 : class95.method2150(4) + 1;
        if (class95.method2165() != 0) {
            class95.method2150(8);
        }
        class95.method2150(2);
        if (this.field1448 > 1) {
            this.field1450 = class95.method2150(4);
        }
        this.field1449 = new int[this.field1448];
        this.field1447 = new int[this.field1448];
        for (int var1 = 0; var1 < this.field1448; var1++) {
            class95.method2150(8);
            this.field1449[var1] = class95.method2150(8);
            this.field1447[var1] = class95.method2150(8);
        }
    }
}
