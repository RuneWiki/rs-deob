package deob;

@ObfuscatedName("n")
public class class13 extends class85 {

    @ObfuscatedName("n.g")
    public int field190;

    @ObfuscatedName("n.b")
    public int field195;

    @ObfuscatedName("n.w")
    public int field189;

    @ObfuscatedName("n.d")
    public int field188;

    @ObfuscatedName("n.z")
    public int field191;

    @ObfuscatedName("n.l")
    public int field192;

    @ObfuscatedName("n.m")
    public class43 field193;

    @ObfuscatedName("n.p")
    public int field194;

    @ObfuscatedName("n.u")
    public int field196;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field190 = arg0;
        this.field195 = arg1;
        this.field189 = arg2;
        this.field188 = arg3;
        this.field191 = arg4;
        this.field192 = arg5;
        if (arg6 != -1) {
            this.field193 = class43.method2054(arg6);
            this.field194 = 0;
            this.field196 = client.field302 - 1;
            if (this.field193.field991 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field193 == var10.field193) {
                    this.field194 = var10.field194;
                    this.field196 = var10.field196;
                    return;
                }
            }
            if (arg7 && this.field193.field998 != -1) {
                this.field194 = (int) (Math.random() * (double) this.field193.field994.length);
                this.field196 -= (int) (Math.random() * (double) this.field193.field996[this.field194]);
            }
        }
    }

    @ObfuscatedName("n.w(I)Ldd;")
    public final class105 method19() {
        if (this.field193 != null) {
            int var1 = client.field302 - this.field196;
            if (var1 > 100 && this.field193.field998 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field193.field996[this.field194]) {
                            break label47;
                        }
                        var1 -= this.field193.field996[this.field194];
                        this.field194++;
                    } while (this.field194 < this.field193.field994.length);
                    this.field194 -= this.field193.field998;
                } while (this.field194 >= 0 && this.field194 < this.field193.field994.length);
                this.field193 = null;
            }
            this.field196 = client.field302 - var1;
        }
        class41 var2 = class41.method3251(this.field190);
        if (var2.field968 != null) {
            var2 = var2.method809();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field189 == 1 || this.field189 == 3) {
            var3 = var2.field943;
            var4 = var2.field942;
        } else {
            var3 = var2.field942;
            var4 = var2.field943;
        }
        int var5 = (var3 >> 1) + this.field191;
        int var6 = (var3 + 1 >> 1) + this.field191;
        int var7 = (var4 >> 1) + this.field192;
        int var8 = (var4 + 1 >> 1) + this.field192;
        int[][] var9 = class6.field87[this.field188];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field191 << 7) + (var3 << 6);
        int var12 = (this.field192 << 7) + (var4 << 6);
        return var2.method807(this.field195, this.field189, var9, var11, var10, var12, this.field193, this.field194);
    }
}
