package deob;

@ObfuscatedName("dg")
public class class115 {

    @ObfuscatedName("dg.m")
    public int field1454;

    @ObfuscatedName("dg.f")
    public int field1455;

    @ObfuscatedName("dg.q")
    public int[] field1453;

    @ObfuscatedName("dg.w")
    public int[] field1456;

    public class115() {
        class101.method2162(16);
        this.field1454 = class101.method2148() == 0 ? 1 : class101.method2162(4) + 1;
        if (class101.method2148() != 0) {
            class101.method2162(8);
        }
        class101.method2162(2);
        if (this.field1454 > 1) {
            this.field1455 = class101.method2162(4);
        }
        this.field1453 = new int[this.field1454];
        this.field1456 = new int[this.field1454];
        for (int var1 = 0; var1 < this.field1454; var1++) {
            class101.method2162(8);
            this.field1453[var1] = class101.method2162(8);
            this.field1456[var1] = class101.method2162(8);
        }
    }
}
