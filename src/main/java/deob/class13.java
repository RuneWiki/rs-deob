package deob;

@ObfuscatedName("b")
public class class13 extends class85 {

    @ObfuscatedName("b.z")
    public int field192;

    @ObfuscatedName("b.q")
    public int field177;

    @ObfuscatedName("b.k")
    public int field178;

    @ObfuscatedName("b.f")
    public int field190;

    @ObfuscatedName("b.d")
    public int field180;

    @ObfuscatedName("b.l")
    public int field179;

    @ObfuscatedName("b.r")
    public class43 field182;

    @ObfuscatedName("b.g")
    public int field183;

    @ObfuscatedName("b.h")
    public int field184;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field192 = arg0;
        this.field177 = arg1;
        this.field178 = arg2;
        this.field190 = arg3;
        this.field180 = arg4;
        this.field179 = arg5;
        if (arg6 != -1) {
            this.field182 = class43.method72(arg6);
            this.field183 = 0;
            this.field184 = client.field290 - 1;
            if (this.field182.field992 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field182 == var10.field182) {
                    this.field183 = var10.field183;
                    this.field184 = var10.field184;
                    return;
                }
            }
            if (arg7 && this.field182.field977 != -1) {
                this.field183 = (int) (Math.random() * (double) this.field182.field974.length);
                this.field184 -= (int) (Math.random() * (double) this.field182.field981[this.field183]);
            }
        }
    }

    @ObfuscatedName("b.k(I)Ldb;")
    public final class105 method18() {
        if (this.field182 != null) {
            int var1 = client.field290 - this.field184;
            if (var1 > 100 && this.field182.field977 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field182.field981[this.field183]) {
                            break label47;
                        }
                        var1 -= this.field182.field981[this.field183];
                        this.field183++;
                    } while (this.field183 < this.field182.field974.length);
                    this.field183 -= this.field182.field977;
                } while (this.field183 >= 0 && this.field183 < this.field182.field974.length);
                this.field182 = null;
            }
            this.field184 = client.field290 - var1;
        }
        class41 var2 = class41.method3664(this.field192);
        if (var2.field954 != null) {
            var2 = var2.method770();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field178 == 1 || this.field178 == 3) {
            var3 = var2.field929;
            var4 = var2.field928;
        } else {
            var3 = var2.field928;
            var4 = var2.field929;
        }
        int var5 = (var3 >> 1) + this.field180;
        int var6 = (var3 + 1 >> 1) + this.field180;
        int var7 = (var4 >> 1) + this.field179;
        int var8 = (var4 + 1 >> 1) + this.field179;
        int[][] var9 = class6.field98[this.field190];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field180 << 7) + (var3 << 6);
        int var12 = (this.field179 << 7) + (var4 << 6);
        return var2.method768(this.field177, this.field178, var9, var11, var10, var12, this.field182, this.field183);
    }
}
