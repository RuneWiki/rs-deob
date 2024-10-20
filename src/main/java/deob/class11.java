package deob;

@ObfuscatedName("h")
public class class11 extends class79 {

    @ObfuscatedName("h.p")
    public int field147;

    @ObfuscatedName("h.y")
    public int field148;

    @ObfuscatedName("h.d")
    public int field143;

    @ObfuscatedName("h.c")
    public int field144;

    @ObfuscatedName("h.r")
    public int field145;

    @ObfuscatedName("h.f")
    public int field146;

    @ObfuscatedName("h.z")
    public class39 field152;

    @ObfuscatedName("h.o")
    public int field141;

    @ObfuscatedName("h.k")
    public int field149;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class79 arg8) {
        this.field147 = arg0;
        this.field148 = arg1;
        this.field143 = arg2;
        this.field144 = arg3;
        this.field145 = arg4;
        this.field146 = arg5;
        if (arg6 != -1) {
            this.field152 = class39.method2920(arg6);
            this.field141 = 0;
            this.field149 = client.field243 - 1;
            if (this.field152.field897 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field152 == var10.field152) {
                    this.field141 = var10.field141;
                    this.field149 = var10.field149;
                    return;
                }
            }
            if (arg7 && this.field152.field888 != -1) {
                this.field141 = (int) (Math.random() * (double) this.field152.field892.length);
                this.field149 -= (int) (Math.random() * (double) this.field152.field886[this.field141]);
            }
        }
    }

    @ObfuscatedName("h.y(I)Lcy;")
    public final class99 method13() {
        if (this.field152 != null) {
            int var1 = client.field243 - this.field149;
            if (var1 > 100 && this.field152.field888 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field152.field886[this.field141]) {
                            break label47;
                        }
                        var1 -= this.field152.field886[this.field141];
                        this.field141++;
                    } while (this.field141 < this.field152.field892.length);
                    this.field141 -= this.field152.field888;
                } while (this.field141 >= 0 && this.field141 < this.field152.field892.length);
                this.field152 = null;
            }
            this.field149 = client.field243 - var1;
        }
        class37 var2 = class37.method2053(this.field147);
        if (var2.field828 != null) {
            var2 = var2.method678();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field143 == 1 || this.field143 == 3) {
            var3 = var2.field831;
            var4 = var2.field856;
        } else {
            var3 = var2.field856;
            var4 = var2.field831;
        }
        int var5 = (var3 >> 1) + this.field145;
        int var6 = (var3 + 1 >> 1) + this.field145;
        int var7 = (var4 >> 1) + this.field146;
        int var8 = (var4 + 1 >> 1) + this.field146;
        int[][] var9 = class6.field74[this.field144];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field145 << 7) + (var3 << 6);
        int var12 = (this.field146 << 7) + (var4 << 6);
        return var2.method677(this.field148, this.field143, var9, var11, var10, var12, this.field152, this.field141);
    }
}
