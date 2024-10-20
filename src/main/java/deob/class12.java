package deob;

@ObfuscatedName("i")
public class class12 extends class80 {

    @ObfuscatedName("i.y")
    public int field179;

    @ObfuscatedName("i.k")
    public int field184;

    @ObfuscatedName("i.g")
    public int field177;

    @ObfuscatedName("i.n")
    public int field186;

    @ObfuscatedName("i.t")
    public int field181;

    @ObfuscatedName("i.e")
    public int field182;

    @ObfuscatedName("i.q")
    public class40 field183;

    @ObfuscatedName("i.z")
    public int field180;

    @ObfuscatedName("i.v")
    public int field185;

    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class80 arg8) {
        this.field179 = arg0;
        this.field184 = arg1;
        this.field177 = arg2;
        this.field186 = arg3;
        this.field181 = arg4;
        this.field182 = arg5;
        if (arg6 != -1) {
            this.field183 = class40.method547(arg6);
            this.field180 = 0;
            this.field185 = client.field423 - 1;
            if (this.field183.field944 == 0 && arg8 != null && arg8 instanceof class12) {
                class12 var10 = (class12) arg8;
                if (this.field183 == var10.field183) {
                    this.field180 = var10.field180;
                    this.field185 = var10.field185;
                    return;
                }
            }
            if (arg7 && this.field183.field943 != -1) {
                this.field180 = (int) (Math.random() * (double) this.field183.field949.length);
                this.field185 -= (int) (Math.random() * (double) this.field183.field950[this.field180]);
            }
        }
    }

    @ObfuscatedName("i.k(I)Lch;")
    public final class100 method16() {
        if (this.field183 != null) {
            int var1 = client.field423 - this.field185;
            if (var1 > 100 && this.field183.field943 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field183.field950[this.field180]) {
                            break label47;
                        }
                        var1 -= this.field183.field950[this.field180];
                        this.field180++;
                    } while (this.field180 < this.field183.field949.length);
                    this.field180 -= this.field183.field943;
                } while (this.field180 >= 0 && this.field180 < this.field183.field949.length);
                this.field183 = null;
            }
            this.field185 = client.field423 - var1;
        }
        class38 var2 = class38.method167(this.field179);
        if (var2.field894 != null) {
            var2 = var2.method717();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field177 == 1 || this.field177 == 3) {
            var3 = var2.field887;
            var4 = var2.field886;
        } else {
            var3 = var2.field886;
            var4 = var2.field887;
        }
        int var5 = (var3 >> 1) + this.field181;
        int var6 = (var3 + 1 >> 1) + this.field181;
        int var7 = (var4 >> 1) + this.field182;
        int var8 = (var4 + 1 >> 1) + this.field182;
        int[][] var9 = class6.field89[this.field186];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field181 << 7) + (var3 << 6);
        int var12 = (this.field182 << 7) + (var4 << 6);
        return var2.method715(this.field184, this.field177, var9, var11, var10, var12, this.field183, this.field180);
    }
}
