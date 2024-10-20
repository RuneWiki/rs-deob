package deob;

@ObfuscatedName("o")
public class class13 extends class86 {

    @ObfuscatedName("o.f")
    public int field196;

    @ObfuscatedName("o.u")
    public int field191;

    @ObfuscatedName("o.x")
    public int field187;

    @ObfuscatedName("o.b")
    public int field188;

    @ObfuscatedName("o.l")
    public int field198;

    @ObfuscatedName("o.d")
    public int field190;

    @ObfuscatedName("o.n")
    public class43 field185;

    @ObfuscatedName("o.m")
    public int field192;

    @ObfuscatedName("o.g")
    public int field193;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class86 arg8) {
        this.field196 = arg0;
        this.field191 = arg1;
        this.field187 = arg2;
        this.field188 = arg3;
        this.field198 = arg4;
        this.field190 = arg5;
        if (arg6 != -1) {
            this.field185 = class43.method745(arg6);
            this.field192 = 0;
            this.field193 = client.field302 - 1;
            if (this.field185.field1016 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field185 == var10.field185) {
                    this.field192 = var10.field192;
                    this.field193 = var10.field193;
                    return;
                }
            }
            if (arg7 && this.field185.field1015 != -1) {
                this.field192 = (int) (Math.random() * (double) this.field185.field1000.length);
                this.field193 -= (int) (Math.random() * (double) this.field185.field1005[this.field192]);
            }
        }
    }

    @ObfuscatedName("o.x(S)Ldr;")
    public final class106 method29() {
        if (this.field185 != null) {
            int var1 = client.field302 - this.field193;
            if (var1 > 100 && this.field185.field1015 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field185.field1005[this.field192]) {
                            break label47;
                        }
                        var1 -= this.field185.field1005[this.field192];
                        this.field192++;
                    } while (this.field192 < this.field185.field1000.length);
                    this.field192 -= this.field185.field1015;
                } while (this.field192 >= 0 && this.field192 < this.field185.field1000.length);
                this.field185 = null;
            }
            this.field193 = client.field302 - var1;
        }
        class41 var2 = class41.method2950(this.field196);
        if (var2.field948 != null) {
            var2 = var2.method823();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field187 == 1 || this.field187 == 3) {
            var3 = var2.field938;
            var4 = var2.field946;
        } else {
            var3 = var2.field946;
            var4 = var2.field938;
        }
        int var5 = (var3 >> 1) + this.field198;
        int var6 = (var3 + 1 >> 1) + this.field198;
        int var7 = (var4 >> 1) + this.field190;
        int var8 = (var4 + 1 >> 1) + this.field190;
        int[][] var9 = class6.field100[this.field188];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field198 << 7) + (var3 << 6);
        int var12 = (this.field190 << 7) + (var4 << 6);
        return var2.method821(this.field191, this.field187, var9, var11, var10, var12, this.field185, this.field192);
    }
}
