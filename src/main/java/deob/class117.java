package deob;

@ObfuscatedName("di")
public class class117 {

    @ObfuscatedName("di.z")
    public int field1469;

    @ObfuscatedName("di.n")
    public int field1466;

    @ObfuscatedName("di.v")
    public int[] field1468;

    @ObfuscatedName("di.u")
    public int[] field1467;

    public class117() {
        class103.method2152(16);
        this.field1469 = class103.method2143() == 0 ? 1 : class103.method2152(4) + 1;
        if (class103.method2143() != 0) {
            class103.method2152(8);
        }
        class103.method2152(2);
        if (this.field1469 > 1) {
            this.field1466 = class103.method2152(4);
        }
        this.field1468 = new int[this.field1469];
        this.field1467 = new int[this.field1469];
        for (int var1 = 0; var1 < this.field1469; var1++) {
            class103.method2152(8);
            this.field1468[var1] = class103.method2152(8);
            this.field1467[var1] = class103.method2152(8);
        }
    }
}
