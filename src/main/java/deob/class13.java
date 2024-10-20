package deob;

@ObfuscatedName("i")
public class class13 extends class86 {

    @ObfuscatedName("i.s")
    public int field185;

    @ObfuscatedName("i.j")
    public int field177;

    @ObfuscatedName("i.p")
    public int field178;

    @ObfuscatedName("i.x")
    public int field180;

    @ObfuscatedName("i.d")
    public int field176;

    @ObfuscatedName("i.u")
    public int field190;

    @ObfuscatedName("i.o")
    public class43 field182;

    @ObfuscatedName("i.b")
    public int field183;

    @ObfuscatedName("i.k")
    public int field179;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class86 arg8) {
        this.field185 = arg0;
        this.field177 = arg1;
        this.field178 = arg2;
        this.field180 = arg3;
        this.field176 = arg4;
        this.field190 = arg5;
        if (arg6 != -1) {
            this.field182 = class43.method43(arg6);
            this.field183 = 0;
            this.field179 = client.field336 - 1;
            if (this.field182.field989 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field182 == var10.field182) {
                    this.field183 = var10.field183;
                    this.field179 = var10.field179;
                    return;
                }
            }
            if (arg7 && this.field182.field992 != -1) {
                this.field183 = (int) (Math.random() * (double) this.field182.field987.length);
                this.field179 -= (int) (Math.random() * (double) this.field182.field1000[this.field183]);
            }
        }
    }

    @ObfuscatedName("i.p(B)Ldh;")
    public final class106 method14() {
        if (this.field182 != null) {
            int var1 = client.field336 - this.field179;
            if (var1 > 100 && this.field182.field992 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field182.field1000[this.field183]) {
                            break label47;
                        }
                        var1 -= this.field182.field1000[this.field183];
                        this.field183++;
                    } while (this.field183 < this.field182.field987.length);
                    this.field183 -= this.field182.field992;
                } while (this.field183 >= 0 && this.field183 < this.field182.field987.length);
                this.field182 = null;
            }
            this.field179 = client.field336 - var1;
        }
        class41 var2 = class41.method118(this.field185);
        if (var2.field966 != null) {
            var2 = var2.method763();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field178 == 1 || this.field178 == 3) {
            var3 = var2.field967;
            var4 = var2.field940;
        } else {
            var3 = var2.field940;
            var4 = var2.field967;
        }
        int var5 = (var3 >> 1) + this.field176;
        int var6 = (var3 + 1 >> 1) + this.field176;
        int var7 = (var4 >> 1) + this.field190;
        int var8 = (var4 + 1 >> 1) + this.field190;
        int[][] var9 = class6.field94[this.field180];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field176 << 7) + (var3 << 6);
        int var12 = (this.field190 << 7) + (var4 << 6);
        return var2.method776(this.field177, this.field178, var9, var11, var10, var12, this.field182, this.field183);
    }
}
