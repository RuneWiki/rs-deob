package deob;

@ObfuscatedName("v")
public class class13 extends class93 {

    @ObfuscatedName("v.j")
    public int field208;

    @ObfuscatedName("v.y")
    public int field199;

    @ObfuscatedName("v.x")
    public int field200;

    @ObfuscatedName("v.z")
    public int field207;

    @ObfuscatedName("v.c")
    public int field202;

    @ObfuscatedName("v.e")
    public int field198;

    @ObfuscatedName("v.s")
    public class33 field203;

    @ObfuscatedName("v.i")
    public int field205;

    @ObfuscatedName("v.g")
    public int field206;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class93 arg8) {
        this.field208 = arg0;
        this.field199 = arg1;
        this.field200 = arg2;
        this.field207 = arg3;
        this.field202 = arg4;
        this.field198 = arg5;
        if (arg6 != -1) {
            this.field203 = class33.method2614(arg6);
            this.field205 = 0;
            this.field206 = client.field636 - 1;
            if (this.field203.field858 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field203 == var10.field203) {
                    this.field205 = var10.field205;
                    this.field206 = var10.field206;
                    return;
                }
            }
            if (arg7 && this.field203.field865 != -1) {
                this.field205 = (int) (Math.random() * (double) this.field203.field861.length);
                this.field206 -= (int) (Math.random() * (double) this.field203.field863[this.field205]);
            }
        }
    }

    @ObfuscatedName("v.y(B)Ldh;")
    public final class111 method13() {
        if (this.field203 != null) {
            int var1 = client.field636 - this.field206;
            if (var1 > 100 && this.field203.field865 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field203.field863[this.field205]) {
                            break label47;
                        }
                        var1 -= this.field203.field863[this.field205];
                        this.field205++;
                    } while (this.field205 < this.field203.field861.length);
                    this.field205 -= this.field203.field865;
                } while (this.field205 >= 0 && this.field205 < this.field203.field861.length);
                this.field203 = null;
            }
            this.field206 = client.field636 - var1;
        }
        class31 var2 = class31.method35(this.field208);
        if (var2.field835 != null) {
            var2 = var2.method630();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field200 == 1 || this.field200 == 3) {
            var3 = var2.field814;
            var4 = var2.field808;
        } else {
            var3 = var2.field808;
            var4 = var2.field814;
        }
        int var5 = (var3 >> 1) + this.field202;
        int var6 = (var3 + 1 >> 1) + this.field202;
        int var7 = (var4 >> 1) + this.field198;
        int var8 = (var4 + 1 >> 1) + this.field198;
        int[][] var9 = class9.field145[this.field207];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field202 << 7) + (var3 << 6);
        int var12 = (this.field198 << 7) + (var4 << 6);
        return var2.method621(this.field199, this.field200, var9, var11, var10, var12, this.field203, this.field205);
    }
}
