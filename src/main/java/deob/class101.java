package deob;

@ObfuscatedName("cx")
public class class101 extends class142 {

    @ObfuscatedName("cx.n")
    public int field1544;

    @ObfuscatedName("cx.p")
    public int field1548;

    @ObfuscatedName("cx.i")
    public int field1546;

    @ObfuscatedName("cx.j")
    public int field1547;

    @ObfuscatedName("cx.f")
    public int field1550;

    @ObfuscatedName("cx.m")
    public int field1549;

    @ObfuscatedName("cx.c")
    public class261 field1552;

    @ObfuscatedName("cx.z")
    public int field1551;

    @ObfuscatedName("cx.h")
    public int field1545;

    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class142 arg8) {
        this.field1544 = arg0;
        this.field1548 = arg1;
        this.field1546 = arg2;
        this.field1547 = arg3;
        this.field1550 = arg4;
        this.field1549 = arg5;
        if (arg6 != -1) {
            this.field1552 = class261.method2887(arg6);
            this.field1551 = 0;
            this.field1545 = client.field923 - 1;
            if (this.field1552.field3618 == 0 && arg8 != null && arg8 instanceof class101) {
                class101 var10 = (class101) arg8;
                if (this.field1552 == var10.field1552) {
                    this.field1551 = var10.field1551;
                    this.field1545 = var10.field1545;
                    return;
                }
            }
            if (arg7 && this.field1552.field3608 != -1) {
                this.field1551 = (int) (Math.random() * (double) this.field1552.field3617.length);
                this.field1545 -= (int) (Math.random() * (double) this.field1552.field3615[this.field1551]);
            }
        }
    }

    @ObfuscatedName("cx.i(S)Lek;")
    public final class134 method1012() {
        if (this.field1552 != null) {
            int var1 = client.field923 - this.field1545;
            if (var1 > 100 && this.field1552.field3608 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1552.field3615[this.field1551]) {
                            break label47;
                        }
                        var1 -= this.field1552.field3615[this.field1551];
                        this.field1551++;
                    } while (this.field1551 < this.field1552.field3617.length);
                    this.field1551 -= this.field1552.field3608;
                } while (this.field1551 >= 0 && this.field1551 < this.field1552.field3617.length);
                this.field1552 = null;
            }
            this.field1545 = client.field923 - var1;
        }
        class256 var2 = class256.method937(this.field1544);
        if (var2.field3484 != null) {
            var2 = var2.method4238();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1546 == 1 || this.field1546 == 3) {
            var3 = var2.field3446;
            var4 = var2.field3458;
        } else {
            var3 = var2.field3458;
            var4 = var2.field3446;
        }
        int var5 = (var3 >> 1) + this.field1550;
        int var6 = (var3 + 1 >> 1) + this.field1550;
        int var7 = (var4 >> 1) + this.field1549;
        int var8 = (var4 + 1 >> 1) + this.field1549;
        int[][] var9 = class62.field748[this.field1547];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1550 << 7) + (var3 << 6);
        int var12 = (this.field1549 << 7) + (var4 << 6);
        return var2.method4236(this.field1548, this.field1546, var9, var11, var10, var12, this.field1552, this.field1551);
    }
}
