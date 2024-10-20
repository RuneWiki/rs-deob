package deob;

@ObfuscatedName("e")
public class class11 extends class78 {

    @ObfuscatedName("e.i")
    public int field170;

    @ObfuscatedName("e.c")
    public int field168;

    @ObfuscatedName("e.h")
    public int field169;

    @ObfuscatedName("e.v")
    public int field175;

    @ObfuscatedName("e.q")
    public int field171;

    @ObfuscatedName("e.s")
    public int field172;

    @ObfuscatedName("e.g")
    public class38 field173;

    @ObfuscatedName("e.u")
    public int field174;

    @ObfuscatedName("e.d")
    public int field167;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field170 = arg0;
        this.field168 = arg1;
        this.field169 = arg2;
        this.field175 = arg3;
        this.field171 = arg4;
        this.field172 = arg5;
        if (arg6 != -1) {
            this.field173 = class38.method3551(arg6);
            this.field174 = 0;
            this.field167 = client.field269 - 1;
            if (this.field173.field921 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field173 == var10.field173) {
                    this.field174 = var10.field174;
                    this.field167 = var10.field167;
                    return;
                }
            }
            if (arg7 && this.field173.field913 != -1) {
                this.field174 = (int) (Math.random() * (double) this.field173.field919.length);
                this.field167 -= (int) (Math.random() * (double) this.field173.field906[this.field174]);
            }
        }
    }

    @ObfuscatedName("e.c(B)Lcc;")
    public final class98 method16() {
        if (this.field173 != null) {
            int var1 = client.field269 - this.field167;
            if (var1 > 100 && this.field173.field913 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field173.field906[this.field174]) {
                            break label47;
                        }
                        var1 -= this.field173.field906[this.field174];
                        this.field174++;
                    } while (this.field174 < this.field173.field919.length);
                    this.field174 -= this.field173.field913;
                } while (this.field174 >= 0 && this.field174 < this.field173.field919.length);
                this.field173 = null;
            }
            this.field167 = client.field269 - var1;
        }
        class36 var2 = class36.method565(this.field170);
        if (var2.field882 != null) {
            var2 = var2.method664();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field169 == 1 || this.field169 == 3) {
            var3 = var2.field857;
            var4 = var2.field856;
        } else {
            var3 = var2.field856;
            var4 = var2.field857;
        }
        int var5 = (var3 >> 1) + this.field171;
        int var6 = (var3 + 1 >> 1) + this.field171;
        int var7 = (var4 >> 1) + this.field172;
        int var8 = (var4 + 1 >> 1) + this.field172;
        int[][] var9 = class6.field85[this.field175];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field171 << 7) + (var3 << 6);
        int var12 = (this.field172 << 7) + (var4 << 6);
        return var2.method659(this.field168, this.field169, var9, var11, var10, var12, this.field173, this.field174);
    }
}
