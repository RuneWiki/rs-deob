package deob;

@ObfuscatedName("dr")
public class class115 extends class29 {

    @ObfuscatedName("dr.t")
    public long[] field1552 = new long[10];

    @ObfuscatedName("dr.n")
    public int field1553 = 256;

    @ObfuscatedName("dr.q")
    public int field1548 = 1;

    @ObfuscatedName("dr.h")
    public long field1551 = class63.method697();

    @ObfuscatedName("dr.k")
    public int field1549 = 0;

    @ObfuscatedName("dr.r")
    public int field1550;

    public class115() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1552[var1] = this.field1551;
        }
    }

    @ObfuscatedName("dr.t(I)V")
    public void method360() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1552[var1] = 0L;
        }
    }

    @ObfuscatedName("dr.n(III)I")
    public int method361(int arg0, int arg1) {
        int var3 = this.field1553;
        int var4 = this.field1548;
        this.field1553 = 300;
        this.field1548 = 1;
        this.field1551 = class63.method697();
        if (this.field1552[this.field1550] == 0L) {
            this.field1553 = var3;
            this.field1548 = var4;
        } else if (this.field1551 > this.field1552[this.field1550]) {
            this.field1553 = (int) ((long) (arg0 * 2560) / (this.field1551 - this.field1552[this.field1550]));
        }
        if (this.field1553 < 25) {
            this.field1553 = 25;
        }
        if (this.field1553 > 256) {
            this.field1553 = 256;
            this.field1548 = (int) ((long) arg0 - (this.field1551 - this.field1552[this.field1550]) / 10L);
        }
        if (this.field1548 > arg0) {
            this.field1548 = arg0;
        }
        this.field1552[this.field1550] = this.field1551;
        this.field1550 = (this.field1550 + 1) % 10;
        if (this.field1548 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1552[var5] != 0L) {
                    this.field1552[var5] += (long) this.field1548;
                }
            }
        }
        if (this.field1548 < arg1) {
            this.field1548 = arg1;
        }
        Statics.method101((long) this.field1548);
        int var6 = 0;
        while (this.field1549 < 256) {
            var6++;
            this.field1549 += this.field1553;
        }
        this.field1549 &= 0xFF;
        return var6;
    }
}
