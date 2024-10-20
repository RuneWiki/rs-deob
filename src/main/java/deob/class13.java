package deob;

@ObfuscatedName("f")
public class class13 extends class85 {

    @ObfuscatedName("f.c")
    public int field175;

    @ObfuscatedName("f.h")
    public int field177;

    @ObfuscatedName("f.k")
    public int field181;

    @ObfuscatedName("f.t")
    public int field172;

    @ObfuscatedName("f.g")
    public int field176;

    @ObfuscatedName("f.o")
    public int field182;

    @ObfuscatedName("f.i")
    public class43 field178;

    @ObfuscatedName("f.w")
    public int field179;

    @ObfuscatedName("f.m")
    public int field180;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field175 = arg0;
        this.field177 = arg1;
        this.field181 = arg2;
        this.field172 = arg3;
        this.field176 = arg4;
        this.field182 = arg5;
        if (arg6 != -1) {
            this.field178 = class43.method2648(arg6);
            this.field179 = 0;
            this.field180 = client.field285 - 1;
            if (this.field178.field1002 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field178 == var10.field178) {
                    this.field179 = var10.field179;
                    this.field180 = var10.field180;
                    return;
                }
            }
            if (arg7 && this.field178.field993 != -1) {
                this.field179 = (int) (Math.random() * (double) this.field178.field987.length);
                this.field180 -= (int) (Math.random() * (double) this.field178.field991[this.field179]);
            }
        }
    }

    @ObfuscatedName("f.k(B)Ldt;")
    public final class105 method13() {
        if (this.field178 != null) {
            int var1 = client.field285 - this.field180;
            if (var1 > 100 && this.field178.field993 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field178.field991[this.field179]) {
                            break label47;
                        }
                        var1 -= this.field178.field991[this.field179];
                        this.field179++;
                    } while (this.field179 < this.field178.field987.length);
                    this.field179 -= this.field178.field993;
                } while (this.field179 >= 0 && this.field179 < this.field178.field987.length);
                this.field178 = null;
            }
            this.field180 = client.field285 - var1;
        }
        class41 var2 = class41.method2760(this.field175);
        if (var2.field953 != null) {
            var2 = var2.method783();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field181 == 1 || this.field181 == 3) {
            var3 = var2.field939;
            var4 = var2.field958;
        } else {
            var3 = var2.field958;
            var4 = var2.field939;
        }
        int var5 = (var3 >> 1) + this.field176;
        int var6 = (var3 + 1 >> 1) + this.field176;
        int var7 = (var4 >> 1) + this.field182;
        int var8 = (var4 + 1 >> 1) + this.field182;
        int[][] var9 = class6.field85[this.field172];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field176 << 7) + (var3 << 6);
        int var12 = (this.field182 << 7) + (var4 << 6);
        return var2.method751(this.field177, this.field181, var9, var11, var10, var12, this.field178, this.field179);
    }
}
