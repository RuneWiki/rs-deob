package deob;

@ObfuscatedName("cr")
public class class101 extends class142 {

    @ObfuscatedName("cr.a")
    public int field1540;

    @ObfuscatedName("cr.j")
    public int field1541;

    @ObfuscatedName("cr.n")
    public int field1542;

    @ObfuscatedName("cr.r")
    public int field1543;

    @ObfuscatedName("cr.v")
    public int field1546;

    @ObfuscatedName("cr.e")
    public int field1545;

    @ObfuscatedName("cr.l")
    public class261 field1544;

    @ObfuscatedName("cr.s")
    public int field1547;

    @ObfuscatedName("cr.w")
    public int field1548;

    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class142 arg8) {
        this.field1540 = arg0;
        this.field1541 = arg1;
        this.field1542 = arg2;
        this.field1543 = arg3;
        this.field1546 = arg4;
        this.field1545 = arg5;
        if (arg6 != -1) {
            this.field1544 = class261.method1884(arg6);
            this.field1547 = 0;
            this.field1548 = client.field934 - 1;
            if (this.field1544.field3620 == 0 && arg8 != null && arg8 instanceof class101) {
                class101 var10 = (class101) arg8;
                if (this.field1544 == var10.field1544) {
                    this.field1547 = var10.field1547;
                    this.field1548 = var10.field1548;
                    return;
                }
            }
            if (arg7 && this.field1544.field3611 != -1) {
                this.field1547 = (int) (Math.random() * (double) this.field1544.field3608.length);
                this.field1548 -= (int) (Math.random() * (double) this.field1544.field3619[this.field1547]);
            }
        }
    }

    @ObfuscatedName("cr.n(B)Lej;")
    public final class134 method1018() {
        if (this.field1544 != null) {
            int var1 = client.field934 - this.field1548;
            if (var1 > 100 && this.field1544.field3611 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1544.field3619[this.field1547]) {
                            break label47;
                        }
                        var1 -= this.field1544.field3619[this.field1547];
                        this.field1547++;
                    } while (this.field1547 < this.field1544.field3608.length);
                    this.field1547 -= this.field1544.field3611;
                } while (this.field1547 >= 0 && this.field1547 < this.field1544.field3608.length);
                this.field1544 = null;
            }
            this.field1548 = client.field934 - var1;
        }
        class256 var2 = class256.method3652(this.field1540);
        if (var2.field3476 != null) {
            var2 = var2.method4144();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1542 == 1 || this.field1542 == 3) {
            var3 = var2.field3443;
            var4 = var2.field3450;
        } else {
            var3 = var2.field3450;
            var4 = var2.field3443;
        }
        int var5 = (var3 >> 1) + this.field1546;
        int var6 = (var3 + 1 >> 1) + this.field1546;
        int var7 = (var4 >> 1) + this.field1545;
        int var8 = (var4 + 1 >> 1) + this.field1545;
        int[][] var9 = class62.field756[this.field1543];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1546 << 7) + (var3 << 6);
        int var12 = (this.field1545 << 7) + (var4 << 6);
        return var2.method4134(this.field1541, this.field1542, var9, var11, var10, var12, this.field1544, this.field1547);
    }
}
