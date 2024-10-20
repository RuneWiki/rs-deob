package deob;

@ObfuscatedName("p")
public class class13 extends class89 {

    @ObfuscatedName("p.l")
    public int field187;

    @ObfuscatedName("p.g")
    public int field189;

    @ObfuscatedName("p.r")
    public int field196;

    @ObfuscatedName("p.e")
    public int field201;

    @ObfuscatedName("p.h")
    public int field191;

    @ObfuscatedName("p.s")
    public int field190;

    @ObfuscatedName("p.k")
    public class45 field193;

    @ObfuscatedName("p.u")
    public int field194;

    @ObfuscatedName("p.n")
    public int field195;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class89 arg8) {
        this.field187 = arg0;
        this.field189 = arg1;
        this.field196 = arg2;
        this.field201 = arg3;
        this.field191 = arg4;
        this.field190 = arg5;
        if (arg6 != -1) {
            this.field193 = class45.method578(arg6);
            this.field194 = 0;
            this.field195 = client.field306 - 1;
            if (this.field193.field1032 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field193 == var10.field193) {
                    this.field194 = var10.field194;
                    this.field195 = var10.field195;
                    return;
                }
            }
            if (arg7 && this.field193.field1021 != -1) {
                this.field194 = (int) (Math.random() * (double) this.field193.field1031.length);
                this.field195 -= (int) (Math.random() * (double) this.field193.field1019[this.field194]);
            }
        }
    }

    @ObfuscatedName("p.r(I)Ldv;")
    public final class109 method18() {
        if (this.field193 != null) {
            int var1 = client.field306 - this.field195;
            if (var1 > 100 && this.field193.field1021 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field193.field1019[this.field194]) {
                            break label47;
                        }
                        var1 -= this.field193.field1019[this.field194];
                        this.field194++;
                    } while (this.field194 < this.field193.field1031.length);
                    this.field194 -= this.field193.field1021;
                } while (this.field194 >= 0 && this.field194 < this.field193.field1031.length);
                this.field193 = null;
            }
            this.field195 = client.field306 - var1;
        }
        class43 var2 = class43.method3115(this.field187);
        if (var2.field987 != null) {
            var2 = var2.method822();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field196 == 1 || this.field196 == 3) {
            var3 = var2.field971;
            var4 = var2.field961;
        } else {
            var3 = var2.field961;
            var4 = var2.field971;
        }
        int var5 = (var3 >> 1) + this.field191;
        int var6 = (var3 + 1 >> 1) + this.field191;
        int var7 = (var4 >> 1) + this.field190;
        int var8 = (var4 + 1 >> 1) + this.field190;
        int[][] var9 = class6.field86[this.field201];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field191 << 7) + (var3 << 6);
        int var12 = (this.field190 << 7) + (var4 << 6);
        return var2.method845(this.field189, this.field196, var9, var11, var10, var12, this.field193, this.field194);
    }
}
