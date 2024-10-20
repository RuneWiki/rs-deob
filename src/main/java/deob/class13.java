package deob;

@ObfuscatedName("z")
public class class13 extends class85 {

    @ObfuscatedName("z.i")
    public int field181;

    @ObfuscatedName("z.v")
    public int field189;

    @ObfuscatedName("z.r")
    public int field177;

    @ObfuscatedName("z.n")
    public int field178;

    @ObfuscatedName("z.x")
    public int field179;

    @ObfuscatedName("z.q")
    public int field180;

    @ObfuscatedName("z.h")
    public class43 field176;

    @ObfuscatedName("z.d")
    public int field182;

    @ObfuscatedName("z.c")
    public int field175;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field181 = arg0;
        this.field189 = arg1;
        this.field177 = arg2;
        this.field178 = arg3;
        this.field179 = arg4;
        this.field180 = arg5;
        if (arg6 != -1) {
            this.field176 = class43.method2299(arg6);
            this.field182 = 0;
            this.field175 = client.field290 - 1;
            if (this.field176.field995 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field176 == var10.field176) {
                    this.field182 = var10.field182;
                    this.field175 = var10.field175;
                    return;
                }
            }
            if (arg7 && this.field176.field987 != -1) {
                this.field182 = (int) (Math.random() * (double) this.field176.field983.length);
                this.field175 -= (int) (Math.random() * (double) this.field176.field985[this.field182]);
            }
        }
    }

    @ObfuscatedName("z.r(I)Ldj;")
    public final class105 method18() {
        if (this.field176 != null) {
            int var1 = client.field290 - this.field175;
            if (var1 > 100 && this.field176.field987 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field176.field985[this.field182]) {
                            break label47;
                        }
                        var1 -= this.field176.field985[this.field182];
                        this.field182++;
                    } while (this.field182 < this.field176.field983.length);
                    this.field182 -= this.field176.field987;
                } while (this.field182 >= 0 && this.field182 < this.field176.field983.length);
                this.field176 = null;
            }
            this.field175 = client.field290 - var1;
        }
        class41 var2 = class41.method1767(this.field181);
        if (var2.field962 != null) {
            var2 = var2.method809();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field177 == 1 || this.field177 == 3) {
            var3 = var2.field937;
            var4 = var2.field936;
        } else {
            var3 = var2.field936;
            var4 = var2.field937;
        }
        int var5 = (var3 >> 1) + this.field179;
        int var6 = (var3 + 1 >> 1) + this.field179;
        int var7 = (var4 >> 1) + this.field180;
        int var8 = (var4 + 1 >> 1) + this.field180;
        int[][] var9 = class6.field74[this.field178];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field179 << 7) + (var3 << 6);
        int var12 = (this.field180 << 7) + (var4 << 6);
        return var2.method807(this.field189, this.field177, var9, var11, var10, var12, this.field176, this.field182);
    }
}
