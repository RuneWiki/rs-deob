package deob;

@ObfuscatedName("cu")
public class class100 extends class110 {

    @ObfuscatedName("cu.p")
    public long[] field1645 = new long[10];

    @ObfuscatedName("cu.g")
    public int field1643 = 256;

    @ObfuscatedName("cu.x")
    public int field1646 = 1;

    @ObfuscatedName("cu.q")
    public long field1644 = class156.method1597();

    @ObfuscatedName("cu.d")
    public int field1642 = 0;

    @ObfuscatedName("cu.k")
    public int field1647;

    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1645[var1] = this.field1644;
        }
    }

    @ObfuscatedName("cu.p(I)V")
    public void method1802() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1645[var1] = 0L;
        }
    }

    @ObfuscatedName("cu.g(III)I")
    public int method1803(int arg0, int arg1) {
        int var3 = this.field1643;
        int var4 = this.field1646;
        this.field1643 = 300;
        this.field1646 = 1;
        this.field1644 = class156.method1597();
        if (this.field1645[this.field1647] == 0L) {
            this.field1643 = var3;
            this.field1646 = var4;
        } else if (this.field1644 > this.field1645[this.field1647]) {
            this.field1643 = (int) ((long) (arg0 * 2560) / (this.field1644 - this.field1645[this.field1647]));
        }
        if (this.field1643 < 25) {
            this.field1643 = 25;
        }
        if (this.field1643 > 256) {
            this.field1643 = 256;
            this.field1646 = (int) ((long) arg0 - (this.field1644 - this.field1645[this.field1647]) / 10L);
        }
        if (this.field1646 > arg0) {
            this.field1646 = arg0;
        }
        this.field1645[this.field1647] = this.field1644;
        this.field1647 = (this.field1647 + 1) % 10;
        if (this.field1646 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1645[var5] != 0L) {
                    this.field1645[var5] += (long) this.field1646;
                }
            }
        }
        if (this.field1646 < arg1) {
            this.field1646 = arg1;
        }
        class162.method1858((long) this.field1646);
        int var6 = 0;
        while (this.field1642 < 256) {
            var6++;
            this.field1642 += this.field1643;
        }
        this.field1642 &= 0xFF;
        return var6;
    }
}
