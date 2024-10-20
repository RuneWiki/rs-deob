package deob;

@ObfuscatedName("bo")
public class class118 extends class113 {

    @ObfuscatedName("bo.o")
    public int field1817 = 1;

    @ObfuscatedName("bo.j")
    public long[] field1818 = new long[10];

    @ObfuscatedName("bo.h")
    public int field1815 = 0;

    @ObfuscatedName("bo.t")
    public long field1823 = Statics.method1882();

    @ObfuscatedName("bo.r")
    public int field1816;

    @ObfuscatedName("bo.p")
    public int field1819 = 256;

    @ObfuscatedName("bo.j(I)V")
    public void method1933() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1818[var1] = 0L;
        }
    }

    public class118() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1818[var1] = this.field1823;
        }
    }

    @ObfuscatedName("bo.p(III)I")
    public int method1934(int arg0, int arg1) {
        int var3 = this.field1819;
        int var4 = this.field1817;
        this.field1819 = 300;
        this.field1817 = 1;
        this.field1823 = Statics.method1882();
        if (this.field1818[this.field1816] == 0L) {
            this.field1819 = var3;
            this.field1817 = var4;
        } else if (this.field1823 > this.field1818[this.field1816]) {
            this.field1819 = (int) ((long) (arg0 * 2560) / (this.field1823 - this.field1818[this.field1816]));
        }
        if (this.field1819 < 25) {
            this.field1819 = 25;
        }
        if (this.field1819 > 256) {
            this.field1819 = 256;
            this.field1817 = (int) ((long) arg0 - (this.field1823 - this.field1818[this.field1816]) / 10L);
        }
        if (this.field1817 > arg0) {
            this.field1817 = arg0;
        }
        this.field1818[this.field1816] = this.field1823;
        this.field1816 = (this.field1816 + 1) % 10;
        if (this.field1817 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field1818[var5] != 0L) {
                    this.field1818[var5] += (long) this.field1817;
                }
            }
        }
        if (this.field1817 < arg1) {
            this.field1817 = arg1;
        }
        class30.method1166((long) this.field1817);
        int var6 = 0;
        while (this.field1815 < 256) {
            var6++;
            this.field1815 += this.field1819;
        }
        this.field1815 &= 0xFF;
        return var6;
    }
}
