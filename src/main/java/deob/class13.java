package deob;

@ObfuscatedName("v")
public class class13 extends class85 {

    @ObfuscatedName("v.n")
    public int field201;

    @ObfuscatedName("v.q")
    public int field192;

    @ObfuscatedName("v.c")
    public int field200;

    @ObfuscatedName("v.l")
    public int field194;

    @ObfuscatedName("v.r")
    public int field196;

    @ObfuscatedName("v.u")
    public int field198;

    @ObfuscatedName("v.j")
    public class43 field193;

    @ObfuscatedName("v.w")
    public int field199;

    @ObfuscatedName("v.y")
    public int field197;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field201 = arg0;
        this.field192 = arg1;
        this.field200 = arg2;
        this.field194 = arg3;
        this.field196 = arg4;
        this.field198 = arg5;
        if (arg6 != -1) {
            this.field193 = class43.method788(arg6);
            this.field199 = 0;
            this.field197 = client.field303 - 1;
            if (this.field193.field996 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field193 == var10.field193) {
                    this.field199 = var10.field199;
                    this.field197 = var10.field197;
                    return;
                }
            }
            if (arg7 && this.field193.field979 != -1) {
                this.field199 = (int) (Math.random() * (double) this.field193.field983.length);
                this.field197 -= (int) (Math.random() * (double) this.field193.field985[this.field199]);
            }
        }
    }

    @ObfuscatedName("v.c(I)Ldt;")
    public final class105 method14() {
        if (this.field193 != null) {
            int var1 = client.field303 - this.field197;
            if (var1 > 100 && this.field193.field979 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field193.field985[this.field199]) {
                            break label47;
                        }
                        var1 -= this.field193.field985[this.field199];
                        this.field199++;
                    } while (this.field199 < this.field193.field983.length);
                    this.field199 -= this.field193.field979;
                } while (this.field199 >= 0 && this.field199 < this.field193.field983.length);
                this.field193 = null;
            }
            this.field197 = client.field303 - var1;
        }
        class41 var2 = class41.method39(this.field201);
        if (var2.field964 != null) {
            var2 = var2.method804();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field200 == 1 || this.field200 == 3) {
            var3 = var2.field915;
            var4 = var2.field927;
        } else {
            var3 = var2.field927;
            var4 = var2.field915;
        }
        int var5 = (var3 >> 1) + this.field196;
        int var6 = (var3 + 1 >> 1) + this.field196;
        int var7 = (var4 >> 1) + this.field198;
        int var8 = (var4 + 1 >> 1) + this.field198;
        int[][] var9 = class6.field101[this.field194];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field196 << 7) + (var3 << 6);
        int var12 = (this.field198 << 7) + (var4 << 6);
        return var2.method807(this.field192, this.field200, var9, var11, var10, var12, this.field193, this.field199);
    }
}
