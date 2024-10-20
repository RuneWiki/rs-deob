package deob;

@ObfuscatedName("m")
public class class12 extends class83 {

    @ObfuscatedName("m.j")
    public int field194;

    @ObfuscatedName("m.y")
    public int field179;

    @ObfuscatedName("m.z")
    public int field181;

    @ObfuscatedName("m.l")
    public int field178;

    @ObfuscatedName("m.w")
    public int field192;

    @ObfuscatedName("m.d")
    public int field183;

    @ObfuscatedName("m.f")
    public class41 field182;

    @ObfuscatedName("m.i")
    public int field185;

    @ObfuscatedName("m.a")
    public int field197;

    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class83 arg8) {
        this.field194 = arg0;
        this.field179 = arg1;
        this.field181 = arg2;
        this.field178 = arg3;
        this.field192 = arg4;
        this.field183 = arg5;
        if (arg6 != -1) {
            this.field182 = class41.method1016(arg6);
            this.field185 = 0;
            this.field197 = client.field477 - 1;
            if (this.field182.field981 == 0 && arg8 != null && arg8 instanceof class12) {
                class12 var10 = (class12) arg8;
                if (this.field182 == var10.field182) {
                    this.field185 = var10.field185;
                    this.field197 = var10.field197;
                    return;
                }
            }
            if (arg7 && this.field182.field972 != -1) {
                this.field185 = (int) (Math.random() * (double) this.field182.field970.length);
                this.field197 -= (int) (Math.random() * (double) this.field182.field963[this.field185]);
            }
        }
    }

    @ObfuscatedName("m.y(I)Lcw;")
    public final class103 method14() {
        if (this.field182 != null) {
            int var1 = client.field477 - this.field197;
            if (var1 > 100 && this.field182.field972 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field182.field963[this.field185]) {
                            break label47;
                        }
                        var1 -= this.field182.field963[this.field185];
                        this.field185++;
                    } while (this.field185 < this.field182.field970.length);
                    this.field185 -= this.field182.field972;
                } while (this.field185 >= 0 && this.field185 < this.field182.field970.length);
                this.field182 = null;
            }
            this.field197 = client.field477 - var1;
        }
        class39 var2 = class39.method902(this.field194);
        if (var2.field944 != null) {
            var2 = var2.method771();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field181 == 1 || this.field181 == 3) {
            var3 = var2.field949;
            var4 = var2.field918;
        } else {
            var3 = var2.field918;
            var4 = var2.field949;
        }
        int var5 = (var3 >> 1) + this.field192;
        int var6 = (var3 + 1 >> 1) + this.field192;
        int var7 = (var4 >> 1) + this.field183;
        int var8 = (var4 + 1 >> 1) + this.field183;
        int[][] var9 = class6.field88[this.field178];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field192 << 7) + (var3 << 6);
        int var12 = (this.field183 << 7) + (var4 << 6);
        return var2.method780(this.field179, this.field181, var9, var11, var10, var12, this.field182, this.field185);
    }
}
