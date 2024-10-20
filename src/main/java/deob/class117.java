package deob;

@ObfuscatedName("dw")
public class class117 {

    @ObfuscatedName("dw.s")
    public int field1485;

    @ObfuscatedName("dw.j")
    public int field1482;

    @ObfuscatedName("dw.i")
    public int[] field1484;

    @ObfuscatedName("dw.k")
    public int[] field1483;

    public class117() {
        class103.method2171(16);
        this.field1485 = class103.method2153() == 0 ? 1 : class103.method2171(4) + 1;
        if (class103.method2153() != 0) {
            class103.method2171(8);
        }
        class103.method2171(2);
        if (this.field1485 > 1) {
            this.field1482 = class103.method2171(4);
        }
        this.field1484 = new int[this.field1485];
        this.field1483 = new int[this.field1485];
        for (int var1 = 0; var1 < this.field1485; var1++) {
            class103.method2171(8);
            this.field1484[var1] = class103.method2171(8);
            this.field1483[var1] = class103.method2171(8);
        }
    }
}
