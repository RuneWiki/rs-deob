package deob;

@ObfuscatedName("r")
public class class11 extends class78 {

    @ObfuscatedName("r.g")
    public int field168;

    @ObfuscatedName("r.s")
    public int field164;

    @ObfuscatedName("r.v")
    public int field165;

    @ObfuscatedName("r.o")
    public int field166;

    @ObfuscatedName("r.k")
    public int field177;

    @ObfuscatedName("r.m")
    public int field174;

    @ObfuscatedName("r.i")
    public class38 field169;

    @ObfuscatedName("r.t")
    public int field170;

    @ObfuscatedName("r.l")
    public int field171;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field168 = arg0;
        this.field164 = arg1;
        this.field165 = arg2;
        this.field166 = arg3;
        this.field177 = arg4;
        this.field174 = arg5;
        if (arg6 != -1) {
            this.field169 = class38.method1935(arg6);
            this.field170 = 0;
            this.field171 = client.field316 - 1;
            if (this.field169.field911 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field169 == var10.field169) {
                    this.field170 = var10.field170;
                    this.field171 = var10.field171;
                    return;
                }
            }
            if (arg7 && this.field169.field914 != -1) {
                this.field170 = (int) (Math.random() * (double) this.field169.field898.length);
                this.field171 -= (int) (Math.random() * (double) this.field169.field894[this.field170]);
            }
        }
    }

    @ObfuscatedName("r.s(I)Lcg;")
    public final class98 method17() {
        if (this.field169 != null) {
            int var1 = client.field316 - this.field171;
            if (var1 > 100 && this.field169.field914 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field169.field894[this.field170]) {
                            break label47;
                        }
                        var1 -= this.field169.field894[this.field170];
                        this.field170++;
                    } while (this.field170 < this.field169.field898.length);
                    this.field170 -= this.field169.field914;
                } while (this.field170 >= 0 && this.field170 < this.field169.field898.length);
                this.field169 = null;
            }
            this.field171 = client.field316 - var1;
        }
        class36 var2 = class36.method2624(this.field168);
        if (var2.field870 != null) {
            var2 = var2.method651();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field165 == 1 || this.field165 == 3) {
            var3 = var2.field844;
            var4 = var2.field843;
        } else {
            var3 = var2.field843;
            var4 = var2.field844;
        }
        int var5 = (var3 >> 1) + this.field177;
        int var6 = (var3 + 1 >> 1) + this.field177;
        int var7 = (var4 >> 1) + this.field174;
        int var8 = (var4 + 1 >> 1) + this.field174;
        int[][] var9 = class6.field93[this.field166];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field177 << 7) + (var3 << 6);
        int var12 = (this.field174 << 7) + (var4 << 6);
        return var2.method663(this.field164, this.field165, var9, var11, var10, var12, this.field169, this.field170);
    }
}
