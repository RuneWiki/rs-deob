package deob;

@ObfuscatedName("cr")
public class class101 extends class142 {

    @ObfuscatedName("cr.w")
    public int field1560;

    @ObfuscatedName("cr.o")
    public int field1554;

    @ObfuscatedName("cr.x")
    public int field1555;

    @ObfuscatedName("cr.k")
    public int field1556;

    @ObfuscatedName("cr.f")
    public int field1557;

    @ObfuscatedName("cr.i")
    public int field1558;

    @ObfuscatedName("cr.j")
    public class264 field1559;

    @ObfuscatedName("cr.m")
    public int field1553;

    @ObfuscatedName("cr.u")
    public int field1561;

    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class142 arg8) {
        this.field1560 = arg0;
        this.field1554 = arg1;
        this.field1555 = arg2;
        this.field1556 = arg3;
        this.field1557 = arg4;
        this.field1558 = arg5;
        if (arg6 != -1) {
            this.field1559 = class264.method3098(arg6);
            this.field1553 = 0;
            this.field1561 = client.field936 - 1;
            if (this.field1559.field3633 == 0 && arg8 != null && arg8 instanceof class101) {
                class101 var10 = (class101) arg8;
                if (this.field1559 == var10.field1559) {
                    this.field1553 = var10.field1553;
                    this.field1561 = var10.field1561;
                    return;
                }
            }
            if (arg7 && this.field1559.field3624 != -1) {
                this.field1553 = (int) (Math.random() * (double) this.field1559.field3620.length);
                this.field1561 -= (int) (Math.random() * (double) this.field1559.field3622[this.field1553]);
            }
        }
    }

    @ObfuscatedName("cr.x(I)Lev;")
    public final class134 method1017() {
        if (this.field1559 != null) {
            int var1 = client.field936 - this.field1561;
            if (var1 > 100 && this.field1559.field3624 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1559.field3622[this.field1553]) {
                            break label47;
                        }
                        var1 -= this.field1559.field3622[this.field1553];
                        this.field1553++;
                    } while (this.field1553 < this.field1559.field3620.length);
                    this.field1553 -= this.field1559.field3624;
                } while (this.field1553 >= 0 && this.field1553 < this.field1559.field3620.length);
                this.field1559 = null;
            }
            this.field1561 = client.field936 - var1;
        }
        class259 var2 = class259.method997(this.field1560);
        if (var2.field3489 != null) {
            var2 = var2.method4176();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1555 == 1 || this.field1555 == 3) {
            var3 = var2.field3488;
            var4 = var2.field3471;
        } else {
            var3 = var2.field3471;
            var4 = var2.field3488;
        }
        int var5 = (var3 >> 1) + this.field1557;
        int var6 = (var3 + 1 >> 1) + this.field1557;
        int var7 = (var4 >> 1) + this.field1558;
        int var8 = (var4 + 1 >> 1) + this.field1558;
        int[][] var9 = class62.field770[this.field1556];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1557 << 7) + (var3 << 6);
        int var12 = (this.field1558 << 7) + (var4 << 6);
        return var2.method4185(this.field1554, this.field1555, var9, var11, var10, var12, this.field1559, this.field1553);
    }
}
