package deob;

@ObfuscatedName("z")
public class class12 extends class80 {

    @ObfuscatedName("z.n")
    public int field179;

    @ObfuscatedName("z.o")
    public int field171;

    @ObfuscatedName("z.a")
    public int field177;

    @ObfuscatedName("z.w")
    public int field173;

    @ObfuscatedName("z.m")
    public int field174;

    @ObfuscatedName("z.h")
    public int field170;

    @ObfuscatedName("z.i")
    public class40 field180;

    @ObfuscatedName("z.r")
    public int field175;

    @ObfuscatedName("z.l")
    public int field178;

    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class80 arg8) {
        this.field179 = arg0;
        this.field171 = arg1;
        this.field177 = arg2;
        this.field173 = arg3;
        this.field174 = arg4;
        this.field170 = arg5;
        if (arg6 != -1) {
            this.field180 = Statics.method860(arg6);
            this.field175 = 0;
            this.field178 = client.field280 - 1;
            if (this.field180.field958 == 0 && arg8 != null && arg8 instanceof class12) {
                class12 var10 = (class12) arg8;
                if (this.field180 == var10.field180) {
                    this.field175 = var10.field175;
                    this.field178 = var10.field178;
                    return;
                }
            }
            if (arg7 && this.field180.field970 != -1) {
                this.field175 = (int) (Math.random() * (double) this.field180.field957.length);
                this.field178 -= (int) (Math.random() * (double) this.field180.field971[this.field175]);
            }
        }
    }

    @ObfuscatedName("z.o(I)Lcp;")
    public final class100 method13() {
        if (this.field180 != null) {
            int var1 = client.field280 - this.field178;
            if (var1 > 100 && this.field180.field970 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field180.field971[this.field175]) {
                            break label47;
                        }
                        var1 -= this.field180.field971[this.field175];
                        this.field175++;
                    } while (this.field175 < this.field180.field957.length);
                    this.field175 -= this.field180.field970;
                } while (this.field175 >= 0 && this.field175 < this.field180.field957.length);
                this.field180 = null;
            }
            this.field178 = client.field280 - var1;
        }
        class38 var2 = class38.method2180(this.field179);
        if (var2.field929 != null) {
            var2 = var2.method696();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field177 == 1 || this.field177 == 3) {
            var3 = var2.field904;
            var4 = var2.field907;
        } else {
            var3 = var2.field907;
            var4 = var2.field904;
        }
        int var5 = (var3 >> 1) + this.field174;
        int var6 = (var3 + 1 >> 1) + this.field174;
        int var7 = (var4 >> 1) + this.field170;
        int var8 = (var4 + 1 >> 1) + this.field170;
        int[][] var9 = class6.field79[this.field173];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field174 << 7) + (var3 << 6);
        int var12 = (this.field170 << 7) + (var4 << 6);
        return var2.method694(this.field171, this.field177, var9, var11, var10, var12, this.field180, this.field175);
    }
}
