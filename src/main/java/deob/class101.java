package deob;

@ObfuscatedName("ct")
public class class101 extends class142 {

    @ObfuscatedName("ct.i")
    public int field1564;

    @ObfuscatedName("ct.c")
    public int field1555;

    @ObfuscatedName("ct.e")
    public int field1557;

    @ObfuscatedName("ct.v")
    public int field1558;

    @ObfuscatedName("ct.b")
    public int field1554;

    @ObfuscatedName("ct.y")
    public int field1556;

    @ObfuscatedName("ct.h")
    public class261 field1560;

    @ObfuscatedName("ct.x")
    public int field1561;

    @ObfuscatedName("ct.f")
    public int field1562;

    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class142 arg8) {
        this.field1564 = arg0;
        this.field1555 = arg1;
        this.field1557 = arg2;
        this.field1558 = arg3;
        this.field1554 = arg4;
        this.field1556 = arg5;
        if (arg6 != -1) {
            this.field1560 = class261.method3748(arg6);
            this.field1561 = 0;
            this.field1562 = client.field938 - 1;
            if (this.field1560.field3616 == 0 && arg8 != null && arg8 instanceof class101) {
                class101 var10 = (class101) arg8;
                if (this.field1560 == var10.field1560) {
                    this.field1561 = var10.field1561;
                    this.field1562 = var10.field1562;
                    return;
                }
            }
            if (arg7 && this.field1560.field3607 != -1) {
                this.field1561 = (int) (Math.random() * (double) this.field1560.field3600.length);
                this.field1562 -= (int) (Math.random() * (double) this.field1560.field3605[this.field1561]);
            }
        }
    }

    @ObfuscatedName("ct.e(I)Led;")
    public final class134 method1026() {
        if (this.field1560 != null) {
            int var1 = client.field938 - this.field1562;
            if (var1 > 100 && this.field1560.field3607 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1560.field3605[this.field1561]) {
                            break label47;
                        }
                        var1 -= this.field1560.field3605[this.field1561];
                        this.field1561++;
                    } while (this.field1561 < this.field1560.field3600.length);
                    this.field1561 -= this.field1560.field3607;
                } while (this.field1561 >= 0 && this.field1561 < this.field1560.field3600.length);
                this.field1560 = null;
            }
            this.field1562 = client.field938 - var1;
        }
        class256 var2 = Statics.method3743(this.field1564);
        if (var2.field3474 != null) {
            var2 = var2.method4204();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1557 == 1 || this.field1557 == 3) {
            var3 = var2.field3449;
            var4 = var2.field3469;
        } else {
            var3 = var2.field3469;
            var4 = var2.field3449;
        }
        int var5 = (var3 >> 1) + this.field1554;
        int var6 = (var3 + 1 >> 1) + this.field1554;
        int var7 = (var4 >> 1) + this.field1556;
        int var8 = (var4 + 1 >> 1) + this.field1556;
        int[][] var9 = class62.field766[this.field1558];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1554 << 7) + (var3 << 6);
        int var12 = (this.field1556 << 7) + (var4 << 6);
        return var2.method4181(this.field1555, this.field1557, var9, var11, var10, var12, this.field1560, this.field1561);
    }
}
