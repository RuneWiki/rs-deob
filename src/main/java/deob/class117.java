package deob;

@ObfuscatedName("dp")
public class class117 {

    @ObfuscatedName("dp.q")
    public int field1501;

    @ObfuscatedName("dp.w")
    public int field1503;

    @ObfuscatedName("dp.e")
    public int[] field1502;

    @ObfuscatedName("dp.p")
    public int[] field1500;

    public class117() {
        class103.method2146(16);
        this.field1501 = class103.method2145() == 0 ? 1 : class103.method2146(4) + 1;
        if (class103.method2145() != 0) {
            class103.method2146(8);
        }
        class103.method2146(2);
        if (this.field1501 > 1) {
            this.field1503 = class103.method2146(4);
        }
        this.field1502 = new int[this.field1501];
        this.field1500 = new int[this.field1501];
        for (int var1 = 0; var1 < this.field1501; var1++) {
            class103.method2146(8);
            this.field1502[var1] = class103.method2146(8);
            this.field1500[var1] = class103.method2146(8);
        }
    }
}
