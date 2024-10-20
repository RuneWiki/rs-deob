package deob;

@ObfuscatedName("d")
public class class13 extends class93 {

    @ObfuscatedName("d.z")
    public int field214;

    @ObfuscatedName("d.h")
    public int field196;

    @ObfuscatedName("d.c")
    public int field197;

    @ObfuscatedName("d.p")
    public int field198;

    @ObfuscatedName("d.i")
    public int field199;

    @ObfuscatedName("d.v")
    public int field200;

    @ObfuscatedName("d.l")
    public class33 field201;

    @ObfuscatedName("d.m")
    public int field202;

    @ObfuscatedName("d.g")
    public int field203;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class93 arg8) {
        this.field214 = arg0;
        this.field196 = arg1;
        this.field197 = arg2;
        this.field198 = arg3;
        this.field199 = arg4;
        this.field200 = arg5;
        if (arg6 != -1) {
            this.field201 = class33.method2674(arg6);
            this.field202 = 0;
            this.field203 = client.field481 - 1;
            if (this.field201.field897 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field201 == var10.field201) {
                    this.field202 = var10.field202;
                    this.field203 = var10.field203;
                    return;
                }
            }
            if (arg7 && this.field201.field888 != -1) {
                this.field202 = (int) (Math.random() * (double) this.field201.field884.length);
                this.field203 -= (int) (Math.random() * (double) this.field201.field894[this.field202]);
            }
        }
    }

    @ObfuscatedName("d.h(I)Ldh;")
    public final class111 method15() {
        if (this.field201 != null) {
            int var1 = client.field481 - this.field203;
            if (var1 > 100 && this.field201.field888 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field201.field894[this.field202]) {
                            break label47;
                        }
                        var1 -= this.field201.field894[this.field202];
                        this.field202++;
                    } while (this.field202 < this.field201.field884.length);
                    this.field202 -= this.field201.field888;
                } while (this.field202 >= 0 && this.field202 < this.field201.field884.length);
                this.field201 = null;
            }
            this.field203 = client.field481 - var1;
        }
        class31 var2 = class31.method2662(this.field214);
        if (var2.field817 != null) {
            var2 = var2.method657();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field197 == 1 || this.field197 == 3) {
            var3 = var2.field829;
            var4 = var2.field832;
        } else {
            var3 = var2.field832;
            var4 = var2.field829;
        }
        int var5 = (var3 >> 1) + this.field199;
        int var6 = (var3 + 1 >> 1) + this.field199;
        int var7 = (var4 >> 1) + this.field200;
        int var8 = (var4 + 1 >> 1) + this.field200;
        int[][] var9 = class9.field121[this.field198];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field199 << 7) + (var3 << 6);
        int var12 = (this.field200 << 7) + (var4 << 6);
        return var2.method655(this.field196, this.field197, var9, var11, var10, var12, this.field201, this.field202);
    }
}
