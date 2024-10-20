package deob;

@ObfuscatedName("c")
public class class11 extends class78 {

    @ObfuscatedName("c.y")
    public int field161;

    @ObfuscatedName("c.u")
    public int field160;

    @ObfuscatedName("c.k")
    public int field159;

    @ObfuscatedName("c.v")
    public int field165;

    @ObfuscatedName("c.l")
    public int field171;

    @ObfuscatedName("c.g")
    public int field164;

    @ObfuscatedName("c.a")
    public class38 field163;

    @ObfuscatedName("c.x")
    public int field166;

    @ObfuscatedName("c.r")
    public int field167;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field161 = arg0;
        this.field160 = arg1;
        this.field159 = arg2;
        this.field165 = arg3;
        this.field171 = arg4;
        this.field164 = arg5;
        if (arg6 != -1) {
            this.field163 = class38.method1866(arg6);
            this.field166 = 0;
            this.field167 = client.field262 - 1;
            if (this.field163.field899 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field163 == var10.field163) {
                    this.field166 = var10.field166;
                    this.field167 = var10.field167;
                    return;
                }
            }
            if (arg7 && this.field163.field890 != -1) {
                this.field166 = (int) (Math.random() * (double) this.field163.field886.length);
                this.field167 -= (int) (Math.random() * (double) this.field163.field881[this.field166]);
            }
        }
    }

    @ObfuscatedName("c.u(I)Lcz;")
    public final class98 method14() {
        if (this.field163 != null) {
            int var1 = client.field262 - this.field167;
            if (var1 > 100 && this.field163.field890 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field163.field881[this.field166]) {
                            break label47;
                        }
                        var1 -= this.field163.field881[this.field166];
                        this.field166++;
                    } while (this.field166 < this.field163.field886.length);
                    this.field166 -= this.field163.field890;
                } while (this.field166 >= 0 && this.field166 < this.field163.field886.length);
                this.field163 = null;
            }
            this.field167 = client.field262 - var1;
        }
        class36 var2 = class36.method6(this.field161);
        if (var2.field831 != null) {
            var2 = var2.method628();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field159 == 1 || this.field159 == 3) {
            var3 = var2.field851;
            var4 = var2.field834;
        } else {
            var3 = var2.field834;
            var4 = var2.field851;
        }
        int var5 = (var3 >> 1) + this.field171;
        int var6 = (var3 + 1 >> 1) + this.field171;
        int var7 = (var4 >> 1) + this.field164;
        int var8 = (var4 + 1 >> 1) + this.field164;
        int[][] var9 = class6.field85[this.field165];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field171 << 7) + (var3 << 6);
        int var12 = (this.field164 << 7) + (var4 << 6);
        return var2.method633(this.field160, this.field159, var9, var11, var10, var12, this.field163, this.field166);
    }
}
