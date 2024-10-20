package deob;

@ObfuscatedName("ck")
public class class103 extends class145 {

    @ObfuscatedName("ck.f")
    public int field1324;

    @ObfuscatedName("ck.b")
    public int field1329;

    @ObfuscatedName("ck.l")
    public int field1322;

    @ObfuscatedName("ck.m")
    public int field1323;

    @ObfuscatedName("ck.z")
    public int field1321;

    @ObfuscatedName("ck.q")
    public int field1325;

    @ObfuscatedName("ck.k")
    public class270 field1326;

    @ObfuscatedName("ck.c")
    public int field1327;

    @ObfuscatedName("ck.u")
    public int field1328;

    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class145 arg8) {
        this.field1324 = arg0;
        this.field1329 = arg1;
        this.field1322 = arg2;
        this.field1323 = arg3;
        this.field1321 = arg4;
        this.field1325 = arg5;
        if (arg6 != -1) {
            this.field1326 = class270.method2219(arg6);
            this.field1327 = 0;
            this.field1328 = client.field863 - 1;
            if (this.field1326.field3552 == 0 && arg8 != null && arg8 instanceof class103) {
                class103 var10 = (class103) arg8;
                if (this.field1326 == var10.field1326) {
                    this.field1327 = var10.field1327;
                    this.field1328 = var10.field1328;
                    return;
                }
            }
            if (arg7 && this.field1326.field3543 != -1) {
                this.field1327 = (int) (Math.random() * (double) this.field1326.field3539.length);
                this.field1328 -= (int) (Math.random() * (double) this.field1326.field3541[this.field1327]);
            }
        }
    }

    @ObfuscatedName("ck.u(I)Leh;")
    public final class137 method1175() {
        if (this.field1326 != null) {
            int var1 = client.field863 - this.field1328;
            if (var1 > 100 && this.field1326.field3543 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1326.field3541[this.field1327]) {
                            break label47;
                        }
                        var1 -= this.field1326.field3541[this.field1327];
                        this.field1327++;
                    } while (this.field1327 < this.field1326.field3539.length);
                    this.field1327 -= this.field1326.field3543;
                } while (this.field1327 >= 0 && this.field1327 < this.field1326.field3539.length);
                this.field1326 = null;
            }
            this.field1328 = client.field863 - var1;
        }
        class265 var2 = class265.method1122(this.field1324);
        if (var2.field3414 != null) {
            var2 = var2.method4361();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1322 == 1 || this.field1322 == 3) {
            var3 = var2.field3390;
            var4 = var2.field3389;
        } else {
            var3 = var2.field3389;
            var4 = var2.field3390;
        }
        int var5 = (var3 >> 1) + this.field1321;
        int var6 = (var3 + 1 >> 1) + this.field1321;
        int var7 = (var4 >> 1) + this.field1325;
        int var8 = (var4 + 1 >> 1) + this.field1325;
        int[][] var9 = class65.field531[this.field1323];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1321 << 7) + (var3 << 6);
        int var12 = (this.field1325 << 7) + (var4 << 6);
        return var2.method4377(this.field1329, this.field1322, var9, var11, var10, var12, this.field1326, this.field1327);
    }
}
