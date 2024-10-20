package deob;

@ObfuscatedName("cr")
public class class103 extends class145 {

    @ObfuscatedName("cr.m")
    public int field1324;

    @ObfuscatedName("cr.o")
    public int field1323;

    @ObfuscatedName("cr.q")
    public int field1329;

    @ObfuscatedName("cr.j")
    public int field1325;

    @ObfuscatedName("cr.p")
    public int field1331;

    @ObfuscatedName("cr.g")
    public int field1327;

    @ObfuscatedName("cr.n")
    public class269 field1328;

    @ObfuscatedName("cr.u")
    public int field1326;

    @ObfuscatedName("cr.a")
    public int field1330;

    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class145 arg8) {
        this.field1324 = arg0;
        this.field1323 = arg1;
        this.field1329 = arg2;
        this.field1325 = arg3;
        this.field1331 = arg4;
        this.field1327 = arg5;
        if (arg6 != -1) {
            this.field1328 = class269.method3330(arg6);
            this.field1326 = 0;
            this.field1330 = client.field671 - 1;
            if (this.field1328.field3562 == 0 && arg8 != null && arg8 instanceof class103) {
                class103 var10 = (class103) arg8;
                if (this.field1328 == var10.field1328) {
                    this.field1326 = var10.field1326;
                    this.field1330 = var10.field1330;
                    return;
                }
            }
            if (arg7 && this.field1328.field3553 != -1) {
                this.field1326 = (int) (Math.random() * (double) this.field1328.field3552.length);
                this.field1330 -= (int) (Math.random() * (double) this.field1328.field3551[this.field1326]);
            }
        }
    }

    @ObfuscatedName("cr.a(I)Lef;")
    public final class137 method1131() {
        if (this.field1328 != null) {
            int var1 = client.field671 - this.field1330;
            if (var1 > 100 && this.field1328.field3553 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1328.field3551[this.field1326]) {
                            break label47;
                        }
                        var1 -= this.field1328.field3551[this.field1326];
                        this.field1326++;
                    } while (this.field1326 < this.field1328.field3552.length);
                    this.field1326 -= this.field1328.field3553;
                } while (this.field1326 >= 0 && this.field1326 < this.field1328.field3552.length);
                this.field1328 = null;
            }
            this.field1330 = client.field671 - var1;
        }
        class264 var2 = class264.method752(this.field1324);
        if (var2.field3422 != null) {
            var2 = var2.method4361();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1329 == 1 || this.field1329 == 3) {
            var3 = var2.field3397;
            var4 = var2.field3396;
        } else {
            var3 = var2.field3396;
            var4 = var2.field3397;
        }
        int var5 = (var3 >> 1) + this.field1331;
        int var6 = (var3 + 1 >> 1) + this.field1331;
        int var7 = (var4 >> 1) + this.field1327;
        int var8 = (var4 + 1 >> 1) + this.field1327;
        int[][] var9 = class65.field533[this.field1325];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1331 << 7) + (var3 << 6);
        int var12 = (this.field1327 << 7) + (var4 << 6);
        return var2.method4359(this.field1323, this.field1329, var9, var11, var10, var12, this.field1328, this.field1326);
    }
}
