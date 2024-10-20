package deob;

@ObfuscatedName("f")
public class class13 extends class85 {

    @ObfuscatedName("f.y")
    public int field193;

    @ObfuscatedName("f.d")
    public int field191;

    @ObfuscatedName("f.g")
    public int field196;

    @ObfuscatedName("f.w")
    public int field192;

    @ObfuscatedName("f.e")
    public int field194;

    @ObfuscatedName("f.c")
    public int field195;

    @ObfuscatedName("f.a")
    public class43 field198;

    @ObfuscatedName("f.q")
    public int field197;

    @ObfuscatedName("f.m")
    public int field190;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field193 = arg0;
        this.field191 = arg1;
        this.field196 = arg2;
        this.field192 = arg3;
        this.field194 = arg4;
        this.field195 = arg5;
        if (arg6 != -1) {
            this.field198 = class43.method750(arg6);
            this.field197 = 0;
            this.field190 = client.field303 - 1;
            if (this.field198.field996 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field198 == var10.field198) {
                    this.field197 = var10.field197;
                    this.field190 = var10.field190;
                    return;
                }
            }
            if (arg7 && this.field198.field994 != -1) {
                this.field197 = (int) (Math.random() * (double) this.field198.field986.length);
                this.field190 -= (int) (Math.random() * (double) this.field198.field985[this.field197]);
            }
        }
    }

    @ObfuscatedName("f.g(I)Ldg;")
    public final class105 method10() {
        if (this.field198 != null) {
            int var1 = client.field303 - this.field190;
            if (var1 > 100 && this.field198.field994 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field198.field985[this.field197]) {
                            break label47;
                        }
                        var1 -= this.field198.field985[this.field197];
                        this.field197++;
                    } while (this.field197 < this.field198.field986.length);
                    this.field197 -= this.field198.field994;
                } while (this.field197 >= 0 && this.field197 < this.field198.field986.length);
                this.field198 = null;
            }
            this.field190 = client.field303 - var1;
        }
        class41 var2 = class41.method2614(this.field193);
        if (var2.field962 != null) {
            var2 = var2.method769();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field196 == 1 || this.field196 == 3) {
            var3 = var2.field930;
            var4 = var2.field929;
        } else {
            var3 = var2.field929;
            var4 = var2.field930;
        }
        int var5 = (var3 >> 1) + this.field194;
        int var6 = (var3 + 1 >> 1) + this.field194;
        int var7 = (var4 >> 1) + this.field195;
        int var8 = (var4 + 1 >> 1) + this.field195;
        int[][] var9 = class6.field86[this.field192];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field194 << 7) + (var3 << 6);
        int var12 = (this.field195 << 7) + (var4 << 6);
        return var2.method772(this.field191, this.field196, var9, var11, var10, var12, this.field198, this.field197);
    }
}
