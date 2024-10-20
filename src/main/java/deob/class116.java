package deob;

@ObfuscatedName("dp")
public class class116 extends class30 {

    @ObfuscatedName("dp.q")
    public long[] field1568 = new long[10];

    @ObfuscatedName("dp.l")
    public int field1564 = 256;

    @ObfuscatedName("dp.a")
    public int field1565 = 1;

    @ObfuscatedName("dp.o")
    public long field1566 = class64.method535();

    @ObfuscatedName("dp.c")
    public int field1567 = 0;

    @ObfuscatedName("dp.h")
    public int field1563;

    public class116() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1568[var1] = this.field1566;
        }
    }

    @ObfuscatedName("dp.q(I)V")
    public void method352() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1568[var1] = 0L;
        }
    }

    @ObfuscatedName("dp.l(IIB)I")
    public int method353(int arg0, int arg1) {
        int var3 = this.field1564;
        int var4 = this.field1565;
        this.field1564 = 300;
        this.field1565 = 1;
        this.field1566 = class64.method535();
        if (this.field1568[this.field1563] == 0L) {
            this.field1564 = var3;
            this.field1565 = var4;
        } else if (this.field1566 > this.field1568[this.field1563]) {
            this.field1564 = (int) ((long) (arg0 * 2560) / (this.field1566 - this.field1568[this.field1563]));
        }
        if (this.field1564 < 25) {
            this.field1564 = 25;
        }
        if (this.field1564 > 256) {
            this.field1564 = 256;
            this.field1565 = (int) ((long) arg0 - (this.field1566 - this.field1568[this.field1563]) / 10L);
        }
        if (this.field1565 > arg0) {
            this.field1565 = arg0;
        }
        this.field1568[this.field1563] = this.field1566;
        this.field1563 = (this.field1563 + 1) % 10;
        if (this.field1565 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1568[var5] != 0L) {
                    this.field1568[var5] += (long) this.field1565;
                }
            }
        }
        if (this.field1565 < arg1) {
            this.field1565 = arg1;
        }
        class68.method86((long) this.field1565);
        int var6 = 0;
        while (this.field1567 < 256) {
            var6++;
            this.field1567 += this.field1564;
        }
        this.field1567 &= 0xFF;
        return var6;
    }
}
