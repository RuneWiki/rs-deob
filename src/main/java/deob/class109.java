package deob;

@ObfuscatedName("dy")
public class class109 {

    @ObfuscatedName("dy.f")
    public int field1449;

    @ObfuscatedName("dy.l")
    public int field1446;

    @ObfuscatedName("dy.w")
    public int[] field1448;

    @ObfuscatedName("dy.s")
    public int[] field1447;

    public class109() {
        class95.method2038(16);
        this.field1449 = class95.method2039() == 0 ? 1 : class95.method2038(4) + 1;
        if (class95.method2039() != 0) {
            class95.method2038(8);
        }
        class95.method2038(2);
        if (this.field1449 > 1) {
            this.field1446 = class95.method2038(4);
        }
        this.field1448 = new int[this.field1449];
        this.field1447 = new int[this.field1449];
        for (int var1 = 0; var1 < this.field1449; var1++) {
            class95.method2038(8);
            this.field1448[var1] = class95.method2038(8);
            this.field1447[var1] = class95.method2038(8);
        }
    }
}
