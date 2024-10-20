package deob;

@ObfuscatedName("z")
public class class13 extends class86 {

    @ObfuscatedName("z.a")
    public int field201;

    @ObfuscatedName("z.w")
    public int field193;

    @ObfuscatedName("z.d")
    public int field197;

    @ObfuscatedName("z.c")
    public int field203;

    @ObfuscatedName("z.y")
    public int field196;

    @ObfuscatedName("z.k")
    public int field205;

    @ObfuscatedName("z.r")
    public class43 field198;

    @ObfuscatedName("z.p")
    public int field199;

    @ObfuscatedName("z.q")
    public int field200;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class86 arg8) {
        this.field201 = arg0;
        this.field193 = arg1;
        this.field197 = arg2;
        this.field203 = arg3;
        this.field196 = arg4;
        this.field205 = arg5;
        if (arg6 != -1) {
            this.field198 = class43.method2137(arg6);
            this.field199 = 0;
            this.field200 = client.field307 - 1;
            if (this.field198.field1006 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field198 == var10.field198) {
                    this.field199 = var10.field199;
                    this.field200 = var10.field200;
                    return;
                }
            }
            if (arg7 && this.field198.field999 != -1) {
                this.field199 = (int) (Math.random() * (double) this.field198.field990.length);
                this.field200 -= (int) (Math.random() * (double) this.field198.field996[this.field199]);
            }
        }
    }

    @ObfuscatedName("z.d(I)Ldr;")
    public final class106 method32() {
        if (this.field198 != null) {
            int var1 = client.field307 - this.field200;
            if (var1 > 100 && this.field198.field999 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field198.field996[this.field199]) {
                            break label47;
                        }
                        var1 -= this.field198.field996[this.field199];
                        this.field199++;
                    } while (this.field199 < this.field198.field990.length);
                    this.field199 -= this.field198.field999;
                } while (this.field199 >= 0 && this.field199 < this.field198.field990.length);
                this.field198 = null;
            }
            this.field200 = client.field307 - var1;
        }
        class41 var2 = class41.method2809(this.field201);
        if (var2.field926 != null) {
            var2 = var2.method872();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field197 == 1 || this.field197 == 3) {
            var3 = var2.field940;
            var4 = var2.field939;
        } else {
            var3 = var2.field939;
            var4 = var2.field940;
        }
        int var5 = (var3 >> 1) + this.field196;
        int var6 = (var3 + 1 >> 1) + this.field196;
        int var7 = (var4 >> 1) + this.field205;
        int var8 = (var4 + 1 >> 1) + this.field205;
        int[][] var9 = class6.field95[this.field203];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field196 << 7) + (var3 << 6);
        int var12 = (this.field205 << 7) + (var4 << 6);
        return var2.method911(this.field193, this.field197, var9, var11, var10, var12, this.field198, this.field199);
    }
}
