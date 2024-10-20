package deob;

@ObfuscatedName("cv")
public class class103 extends class145 {

    @ObfuscatedName("cv.x")
    public int field1314;

    @ObfuscatedName("cv.m")
    public int field1311;

    @ObfuscatedName("cv.k")
    public int field1310;

    @ObfuscatedName("cv.d")
    public int field1313;

    @ObfuscatedName("cv.w")
    public int field1316;

    @ObfuscatedName("cv.v")
    public int field1312;

    @ObfuscatedName("cv.q")
    public class269 field1318;

    @ObfuscatedName("cv.z")
    public int field1315;

    @ObfuscatedName("cv.t")
    public int field1317;

    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class145 arg8) {
        this.field1314 = arg0;
        this.field1311 = arg1;
        this.field1310 = arg2;
        this.field1313 = arg3;
        this.field1316 = arg4;
        this.field1312 = arg5;
        if (arg6 != -1) {
            this.field1318 = class269.method4110(arg6);
            this.field1315 = 0;
            this.field1317 = client.field690 - 1;
            if (this.field1318.field3526 == 0 && arg8 != null && arg8 instanceof class103) {
                class103 var10 = (class103) arg8;
                if (this.field1318 == var10.field1318) {
                    this.field1315 = var10.field1315;
                    this.field1317 = var10.field1317;
                    return;
                }
            }
            if (arg7 && this.field1318.field3517 != -1) {
                this.field1315 = (int) (Math.random() * (double) this.field1318.field3514.length);
                this.field1317 -= (int) (Math.random() * (double) this.field1318.field3515[this.field1315]);
            }
        }
    }

    @ObfuscatedName("cv.t(I)Lel;")
    public final class137 method1182() {
        if (this.field1318 != null) {
            int var1 = client.field690 - this.field1317;
            if (var1 > 100 && this.field1318.field3517 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1318.field3515[this.field1315]) {
                            break label47;
                        }
                        var1 -= this.field1318.field3515[this.field1315];
                        this.field1315++;
                    } while (this.field1315 < this.field1318.field3514.length);
                    this.field1315 -= this.field1318.field3517;
                } while (this.field1315 >= 0 && this.field1315 < this.field1318.field3514.length);
                this.field1318 = null;
            }
            this.field1317 = client.field690 - var1;
        }
        class264 var2 = class264.method363(this.field1314);
        if (var2.field3386 != null) {
            var2 = var2.method4277();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1310 == 1 || this.field1310 == 3) {
            var3 = var2.field3361;
            var4 = var2.field3360;
        } else {
            var3 = var2.field3360;
            var4 = var2.field3361;
        }
        int var5 = (var3 >> 1) + this.field1316;
        int var6 = (var3 + 1 >> 1) + this.field1316;
        int var7 = (var4 >> 1) + this.field1312;
        int var8 = (var4 + 1 >> 1) + this.field1312;
        int[][] var9 = class65.field550[this.field1313];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1316 << 7) + (var3 << 6);
        int var12 = (this.field1312 << 7) + (var4 << 6);
        return var2.method4273(this.field1311, this.field1310, var9, var11, var10, var12, this.field1318, this.field1315);
    }
}
