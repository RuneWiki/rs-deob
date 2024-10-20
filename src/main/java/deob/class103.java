package deob;

@ObfuscatedName("cn")
public class class103 extends class145 {

    @ObfuscatedName("cn.h")
    public int field1318;

    @ObfuscatedName("cn.v")
    public int field1313;

    @ObfuscatedName("cn.x")
    public int field1308;

    @ObfuscatedName("cn.w")
    public int field1310;

    @ObfuscatedName("cn.t")
    public int field1307;

    @ObfuscatedName("cn.j")
    public int field1312;

    @ObfuscatedName("cn.n")
    public class270 field1309;

    @ObfuscatedName("cn.p")
    public int field1314;

    @ObfuscatedName("cn.l")
    public int field1315;

    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class145 arg8) {
        this.field1318 = arg0;
        this.field1313 = arg1;
        this.field1308 = arg2;
        this.field1310 = arg3;
        this.field1307 = arg4;
        this.field1312 = arg5;
        if (arg6 != -1) {
            this.field1309 = class270.method4174(arg6);
            this.field1314 = 0;
            this.field1315 = client.field656 - 1;
            if (this.field1309.field3549 == 0 && arg8 != null && arg8 instanceof class103) {
                class103 var10 = (class103) arg8;
                if (this.field1309 == var10.field1309) {
                    this.field1314 = var10.field1314;
                    this.field1315 = var10.field1315;
                    return;
                }
            }
            if (arg7 && this.field1309.field3559 != -1) {
                this.field1314 = (int) (Math.random() * (double) this.field1309.field3551.length);
                this.field1315 -= (int) (Math.random() * (double) this.field1309.field3553[this.field1314]);
            }
        }
    }

    @ObfuscatedName("cn.l(I)Leh;")
    public final class137 method1198() {
        if (this.field1309 != null) {
            int var1 = client.field656 - this.field1315;
            if (var1 > 100 && this.field1309.field3559 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1309.field3553[this.field1314]) {
                            break label47;
                        }
                        var1 -= this.field1309.field3553[this.field1314];
                        this.field1314++;
                    } while (this.field1314 < this.field1309.field3551.length);
                    this.field1314 -= this.field1309.field3559;
                } while (this.field1314 >= 0 && this.field1314 < this.field1309.field3551.length);
                this.field1309 = null;
            }
            this.field1315 = client.field656 - var1;
        }
        class265 var2 = class265.method325(this.field1318);
        if (var2.field3422 != null) {
            var2 = var2.method4263();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1308 == 1 || this.field1308 == 3) {
            var3 = var2.field3397;
            var4 = var2.field3419;
        } else {
            var3 = var2.field3419;
            var4 = var2.field3397;
        }
        int var5 = (var3 >> 1) + this.field1307;
        int var6 = (var3 + 1 >> 1) + this.field1307;
        int var7 = (var4 >> 1) + this.field1312;
        int var8 = (var4 + 1 >> 1) + this.field1312;
        int[][] var9 = class65.field520[this.field1310];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1307 << 7) + (var3 << 6);
        int var12 = (this.field1312 << 7) + (var4 << 6);
        return var2.method4251(this.field1313, this.field1308, var9, var11, var10, var12, this.field1309, this.field1314);
    }
}
