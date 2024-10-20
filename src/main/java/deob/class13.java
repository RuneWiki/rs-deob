package deob;

@ObfuscatedName("k")
public class class13 extends class86 {

    @ObfuscatedName("k.t")
    public int field195;

    @ObfuscatedName("k.i")
    public int field184;

    @ObfuscatedName("k.g")
    public int field193;

    @ObfuscatedName("k.h")
    public int field186;

    @ObfuscatedName("k.z")
    public int field185;

    @ObfuscatedName("k.r")
    public int field192;

    @ObfuscatedName("k.f")
    public class43 field189;

    @ObfuscatedName("k.s")
    public int field190;

    @ObfuscatedName("k.d")
    public int field191;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class86 arg8) {
        this.field195 = arg0;
        this.field184 = arg1;
        this.field193 = arg2;
        this.field186 = arg3;
        this.field185 = arg4;
        this.field192 = arg5;
        if (arg6 != -1) {
            this.field189 = class43.method168(arg6);
            this.field190 = 0;
            this.field191 = client.field333 - 1;
            if (this.field189.field987 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field189 == var10.field189) {
                    this.field190 = var10.field190;
                    this.field191 = var10.field191;
                    return;
                }
            }
            if (arg7 && this.field189.field982 != -1) {
                this.field190 = (int) (Math.random() * (double) this.field189.field986.length);
                this.field191 -= (int) (Math.random() * (double) this.field189.field988[this.field190]);
            }
        }
    }

    @ObfuscatedName("k.g(I)Ldk;")
    public final class106 method11() {
        if (this.field189 != null) {
            int var1 = client.field333 - this.field191;
            if (var1 > 100 && this.field189.field982 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field189.field988[this.field190]) {
                            break label47;
                        }
                        var1 -= this.field189.field988[this.field190];
                        this.field190++;
                    } while (this.field190 < this.field189.field986.length);
                    this.field190 -= this.field189.field982;
                } while (this.field190 >= 0 && this.field190 < this.field189.field986.length);
                this.field189 = null;
            }
            this.field191 = client.field333 - var1;
        }
        class41 var2 = class41.method948(this.field195);
        if (var2.field956 != null) {
            var2 = var2.method766();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field193 == 1 || this.field193 == 3) {
            var3 = var2.field924;
            var4 = var2.field955;
        } else {
            var3 = var2.field955;
            var4 = var2.field924;
        }
        int var5 = (var3 >> 1) + this.field185;
        int var6 = (var3 + 1 >> 1) + this.field185;
        int var7 = (var4 >> 1) + this.field192;
        int var8 = (var4 + 1 >> 1) + this.field192;
        int[][] var9 = class6.field101[this.field186];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field185 << 7) + (var3 << 6);
        int var12 = (this.field192 << 7) + (var4 << 6);
        return var2.method764(this.field184, this.field193, var9, var11, var10, var12, this.field189, this.field190);
    }
}
