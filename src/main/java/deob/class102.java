package deob;

@ObfuscatedName("cu")
public class class102 extends class143 {

    @ObfuscatedName("cu.j")
    public int field1558;

    @ObfuscatedName("cu.h")
    public int field1550;

    @ObfuscatedName("cu.f")
    public int field1551;

    @ObfuscatedName("cu.p")
    public int field1553;

    @ObfuscatedName("cu.x")
    public int field1554;

    @ObfuscatedName("cu.g")
    public int field1555;

    @ObfuscatedName("cu.c")
    public class262 field1552;

    @ObfuscatedName("cu.l")
    public int field1557;

    @ObfuscatedName("cu.w")
    public int field1556;

    public class102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class143 arg8) {
        this.field1558 = arg0;
        this.field1550 = arg1;
        this.field1551 = arg2;
        this.field1553 = arg3;
        this.field1554 = arg4;
        this.field1555 = arg5;
        if (arg6 != -1) {
            this.field1552 = class262.method1389(arg6);
            this.field1557 = 0;
            this.field1556 = client.field944 - 1;
            if (this.field1552.field3607 == 0 && arg8 != null && arg8 instanceof class102) {
                class102 var10 = (class102) arg8;
                if (this.field1552 == var10.field1552) {
                    this.field1557 = var10.field1557;
                    this.field1556 = var10.field1556;
                    return;
                }
            }
            if (arg7 && this.field1552.field3592 != -1) {
                this.field1557 = (int) (Math.random() * (double) this.field1552.field3595.length);
                this.field1556 -= (int) (Math.random() * (double) this.field1552.field3596[this.field1557]);
            }
        }
    }

    @ObfuscatedName("cu.f(I)Leo;")
    public final class135 method1077() {
        if (this.field1552 != null) {
            int var1 = client.field944 - this.field1556;
            if (var1 > 100 && this.field1552.field3592 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1552.field3596[this.field1557]) {
                            break label47;
                        }
                        var1 -= this.field1552.field3596[this.field1557];
                        this.field1557++;
                    } while (this.field1557 < this.field1552.field3595.length);
                    this.field1557 -= this.field1552.field3592;
                } while (this.field1557 >= 0 && this.field1557 < this.field1552.field3595.length);
                this.field1552 = null;
            }
            this.field1556 = client.field944 - var1;
        }
        class257 var2 = class257.method483(this.field1558);
        if (var2.field3468 != null) {
            var2 = var2.method4210();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1551 == 1 || this.field1551 == 3) {
            var3 = var2.field3443;
            var4 = var2.field3442;
        } else {
            var3 = var2.field3442;
            var4 = var2.field3443;
        }
        int var5 = (var3 >> 1) + this.field1554;
        int var6 = (var3 + 1 >> 1) + this.field1554;
        int var7 = (var4 >> 1) + this.field1555;
        int var8 = (var4 + 1 >> 1) + this.field1555;
        int[][] var9 = class62.field763[this.field1553];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1554 << 7) + (var3 << 6);
        int var12 = (this.field1555 << 7) + (var4 << 6);
        return var2.method4208(this.field1550, this.field1551, var9, var11, var10, var12, this.field1552, this.field1557);
    }
}
