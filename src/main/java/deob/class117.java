package deob;

@ObfuscatedName("dy")
public class class117 {

    @ObfuscatedName("dy.c")
    public int field1485;

    @ObfuscatedName("dy.t")
    public int field1483;

    @ObfuscatedName("dy.o")
    public int[] field1484;

    @ObfuscatedName("dy.e")
    public int[] field1482;

    public class117() {
        class103.method2222(16);
        this.field1485 = class103.method2221() == 0 ? 1 : class103.method2222(4) + 1;
        if (class103.method2221() != 0) {
            class103.method2222(8);
        }
        class103.method2222(2);
        if (this.field1485 > 1) {
            this.field1483 = class103.method2222(4);
        }
        this.field1484 = new int[this.field1485];
        this.field1482 = new int[this.field1485];
        for (int var1 = 0; var1 < this.field1485; var1++) {
            class103.method2222(8);
            this.field1484[var1] = class103.method2222(8);
            this.field1482[var1] = class103.method2222(8);
        }
    }
}
