package deob;

@ObfuscatedName("j")
public class class13 extends class86 {

    @ObfuscatedName("j.w")
    public int field197;

    @ObfuscatedName("j.x")
    public int field195;

    @ObfuscatedName("j.t")
    public int field196;

    @ObfuscatedName("j.p")
    public int field198;

    @ObfuscatedName("j.e")
    public int field194;

    @ObfuscatedName("j.y")
    public int field199;

    @ObfuscatedName("j.m")
    public class43 field200;

    @ObfuscatedName("j.c")
    public int field201;

    @ObfuscatedName("j.v")
    public int field205;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class86 arg8) {
        this.field197 = arg0;
        this.field195 = arg1;
        this.field196 = arg2;
        this.field198 = arg3;
        this.field194 = arg4;
        this.field199 = arg5;
        if (arg6 != -1) {
            this.field200 = class43.method2054(arg6);
            this.field201 = 0;
            this.field205 = client.field306 - 1;
            if (this.field200.field1009 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field200 == var10.field200) {
                    this.field201 = var10.field201;
                    this.field205 = var10.field205;
                    return;
                }
            }
            if (arg7 && this.field200.field1000 != -1) {
                this.field201 = (int) (Math.random() * (double) this.field200.field996.length);
                this.field205 -= (int) (Math.random() * (double) this.field200.field998[this.field201]);
            }
        }
    }

    @ObfuscatedName("j.t(I)Ldp;")
    public final class106 method34() {
        if (this.field200 != null) {
            int var1 = client.field306 - this.field205;
            if (var1 > 100 && this.field200.field1000 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field200.field998[this.field201]) {
                            break label47;
                        }
                        var1 -= this.field200.field998[this.field201];
                        this.field201++;
                    } while (this.field201 < this.field200.field996.length);
                    this.field201 -= this.field200.field1000;
                } while (this.field201 >= 0 && this.field201 < this.field200.field996.length);
                this.field200 = null;
            }
            this.field205 = client.field306 - var1;
        }
        class41 var2 = class41.method589(this.field197);
        if (var2.field944 != null) {
            var2 = var2.method823();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field196 == 1 || this.field196 == 3) {
            var3 = var2.field943;
            var4 = var2.field980;
        } else {
            var3 = var2.field980;
            var4 = var2.field943;
        }
        int var5 = (var3 >> 1) + this.field194;
        int var6 = (var3 + 1 >> 1) + this.field194;
        int var7 = (var4 >> 1) + this.field199;
        int var8 = (var4 + 1 >> 1) + this.field199;
        int[][] var9 = class6.field97[this.field198];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field194 << 7) + (var3 << 6);
        int var12 = (this.field199 << 7) + (var4 << 6);
        return var2.method810(this.field195, this.field196, var9, var11, var10, var12, this.field200, this.field201);
    }
}
