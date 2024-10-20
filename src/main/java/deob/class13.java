package deob;

@ObfuscatedName("e")
public class class13 extends class93 {

    @ObfuscatedName("e.p")
    public int field217;

    @ObfuscatedName("e.j")
    public int field210;

    @ObfuscatedName("e.w")
    public int field211;

    @ObfuscatedName("e.h")
    public int field212;

    @ObfuscatedName("e.v")
    public int field213;

    @ObfuscatedName("e.k")
    public int field214;

    @ObfuscatedName("e.g")
    public class33 field220;

    @ObfuscatedName("e.n")
    public int field216;

    @ObfuscatedName("e.c")
    public int field215;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class93 arg8) {
        this.field217 = arg0;
        this.field210 = arg1;
        this.field211 = arg2;
        this.field212 = arg3;
        this.field213 = arg4;
        this.field214 = arg5;
        if (arg6 != -1) {
            this.field220 = class33.method751(arg6);
            this.field216 = 0;
            this.field215 = client.field568 - 1;
            if (this.field220.field894 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field220 == var10.field220) {
                    this.field216 = var10.field216;
                    this.field215 = var10.field215;
                    return;
                }
            }
            if (arg7 && this.field220.field885 != -1) {
                this.field216 = (int) (Math.random() * (double) this.field220.field876.length);
                this.field215 -= (int) (Math.random() * (double) this.field220.field883[this.field216]);
            }
        }
    }

    @ObfuscatedName("e.j(I)Ldm;")
    public final class111 method19() {
        if (this.field220 != null) {
            int var1 = client.field568 - this.field215;
            if (var1 > 100 && this.field220.field885 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field220.field883[this.field216]) {
                            break label47;
                        }
                        var1 -= this.field220.field883[this.field216];
                        this.field216++;
                    } while (this.field216 < this.field220.field876.length);
                    this.field216 -= this.field220.field885;
                } while (this.field216 >= 0 && this.field216 < this.field220.field876.length);
                this.field220 = null;
            }
            this.field215 = client.field568 - var1;
        }
        class31 var2 = class31.method187(this.field217);
        if (var2.field851 != null) {
            var2 = var2.method607();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field211 == 1 || this.field211 == 3) {
            var3 = var2.field831;
            var4 = var2.field830;
        } else {
            var3 = var2.field830;
            var4 = var2.field831;
        }
        int var5 = (var3 >> 1) + this.field213;
        int var6 = (var3 + 1 >> 1) + this.field213;
        int var7 = (var4 >> 1) + this.field214;
        int var8 = (var4 + 1 >> 1) + this.field214;
        int[][] var9 = class9.field156[this.field212];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field213 << 7) + (var3 << 6);
        int var12 = (this.field214 << 7) + (var4 << 6);
        return var2.method605(this.field210, this.field211, var9, var11, var10, var12, this.field220, this.field216);
    }
}
