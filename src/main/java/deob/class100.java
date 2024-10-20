package deob;

@ObfuscatedName("ck")
public class class100 extends class110 {

    @ObfuscatedName("ck.u")
    public long[] field1638 = new long[10];

    @ObfuscatedName("ck.x")
    public int field1631 = 256;

    @ObfuscatedName("ck.i")
    public int field1637 = 1;

    @ObfuscatedName("ck.a")
    public long field1633 = class156.method118();

    @ObfuscatedName("ck.f")
    public int field1634 = 0;

    @ObfuscatedName("ck.c")
    public int field1632;

    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1638[var1] = this.field1633;
        }
    }

    @ObfuscatedName("ck.u(I)V")
    public void method1787() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1638[var1] = 0L;
        }
    }

    @ObfuscatedName("ck.x(IIB)I")
    public int method1789(int arg0, int arg1) {
        int var3 = this.field1631;
        int var4 = this.field1637;
        this.field1631 = 300;
        this.field1637 = 1;
        this.field1633 = class156.method118();
        if (this.field1638[this.field1632] == 0L) {
            this.field1631 = var3;
            this.field1637 = var4;
        } else if (this.field1633 > this.field1638[this.field1632]) {
            this.field1631 = (int) ((long) (arg0 * 2560) / (this.field1633 - this.field1638[this.field1632]));
        }
        if (this.field1631 < 25) {
            this.field1631 = 25;
        }
        if (this.field1631 > 256) {
            this.field1631 = 256;
            this.field1637 = (int) ((long) arg0 - (this.field1633 - this.field1638[this.field1632]) / 10L);
        }
        if (this.field1637 > arg0) {
            this.field1637 = arg0;
        }
        this.field1638[this.field1632] = this.field1633;
        this.field1632 = (this.field1632 + 1) % 10;
        if (this.field1637 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1638[var5] != 0L) {
                    this.field1638[var5] += (long) this.field1637;
                }
            }
        }
        if (this.field1637 < arg1) {
            this.field1637 = arg1;
        }
        class162.method1528((long) this.field1637);
        int var6 = 0;
        while (this.field1634 < 256) {
            var6++;
            this.field1634 += this.field1631;
        }
        this.field1634 &= 0xFF;
        return var6;
    }
}
