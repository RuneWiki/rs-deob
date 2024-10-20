package deob;

@ObfuscatedName("cq")
public class class101 extends class142 {

    @ObfuscatedName("cq.d")
    public int field1514;

    @ObfuscatedName("cq.q")
    public int field1523;

    @ObfuscatedName("cq.x")
    public int field1522;

    @ObfuscatedName("cq.y")
    public int field1521;

    @ObfuscatedName("cq.e")
    public int field1513;

    @ObfuscatedName("cq.f")
    public int field1516;

    @ObfuscatedName("cq.v")
    public class261 field1517;

    @ObfuscatedName("cq.t")
    public int field1518;

    @ObfuscatedName("cq.i")
    public int field1519;

    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class142 arg8) {
        this.field1514 = arg0;
        this.field1523 = arg1;
        this.field1522 = arg2;
        this.field1521 = arg3;
        this.field1513 = arg4;
        this.field1516 = arg5;
        if (arg6 != -1) {
            this.field1517 = class261.method494(arg6);
            this.field1518 = 0;
            this.field1519 = client.field902 - 1;
            if (this.field1517.field3599 == 0 && arg8 != null && arg8 instanceof class101) {
                class101 var10 = (class101) arg8;
                if (this.field1517 == var10.field1517) {
                    this.field1518 = var10.field1518;
                    this.field1519 = var10.field1519;
                    return;
                }
            }
            if (arg7 && this.field1517.field3590 != -1) {
                this.field1518 = (int) (Math.random() * (double) this.field1517.field3586.length);
                this.field1519 -= (int) (Math.random() * (double) this.field1517.field3589[this.field1518]);
            }
        }
    }

    @ObfuscatedName("cq.x(I)Lev;")
    public final class134 method1046() {
        if (this.field1517 != null) {
            int var1 = client.field902 - this.field1519;
            if (var1 > 100 && this.field1517.field3590 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1517.field3589[this.field1518]) {
                            break label47;
                        }
                        var1 -= this.field1517.field3589[this.field1518];
                        this.field1518++;
                    } while (this.field1518 < this.field1517.field3586.length);
                    this.field1518 -= this.field1517.field3590;
                } while (this.field1518 >= 0 && this.field1518 < this.field1517.field3586.length);
                this.field1517 = null;
            }
            this.field1519 = client.field902 - var1;
        }
        class256 var2 = class256.method997(this.field1514);
        if (var2.field3457 != null) {
            var2 = var2.method4127();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1522 == 1 || this.field1522 == 3) {
            var3 = var2.field3453;
            var4 = var2.field3431;
        } else {
            var3 = var2.field3431;
            var4 = var2.field3453;
        }
        int var5 = (var3 >> 1) + this.field1513;
        int var6 = (var3 + 1 >> 1) + this.field1513;
        int var7 = (var4 >> 1) + this.field1516;
        int var8 = (var4 + 1 >> 1) + this.field1516;
        int[][] var9 = class63.field750[this.field1521];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1513 << 7) + (var3 << 6);
        int var12 = (this.field1516 << 7) + (var4 << 6);
        return var2.method4139(this.field1523, this.field1522, var9, var11, var10, var12, this.field1517, this.field1518);
    }
}
