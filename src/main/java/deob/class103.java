package deob;

@ObfuscatedName("cw")
public class class103 extends class145 {

    @ObfuscatedName("cw.n")
    public int field1307;

    @ObfuscatedName("cw.v")
    public int field1303;

    @ObfuscatedName("cw.d")
    public int field1310;

    @ObfuscatedName("cw.c")
    public int field1306;

    @ObfuscatedName("cw.y")
    public int field1308;

    @ObfuscatedName("cw.h")
    public int field1305;

    @ObfuscatedName("cw.z")
    public class270 field1309;

    @ObfuscatedName("cw.e")
    public int field1304;

    @ObfuscatedName("cw.q")
    public int field1311;

    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class145 arg8) {
        this.field1307 = arg0;
        this.field1303 = arg1;
        this.field1310 = arg2;
        this.field1306 = arg3;
        this.field1308 = arg4;
        this.field1305 = arg5;
        if (arg6 != -1) {
            this.field1309 = Statics.method1124(arg6);
            this.field1304 = 0;
            this.field1311 = client.field729 - 1;
            if (this.field1309.field3549 == 0 && arg8 != null && arg8 instanceof class103) {
                class103 var10 = (class103) arg8;
                if (this.field1309 == var10.field1309) {
                    this.field1304 = var10.field1304;
                    this.field1311 = var10.field1311;
                    return;
                }
            }
            if (arg7 && this.field1309.field3558 != -1) {
                this.field1304 = (int) (Math.random() * (double) this.field1309.field3554.length);
                this.field1311 -= (int) (Math.random() * (double) this.field1309.field3556[this.field1304]);
            }
        }
    }

    @ObfuscatedName("cw.q(B)Lef;")
    public final class137 method1214() {
        if (this.field1309 != null) {
            int var1 = client.field729 - this.field1311;
            if (var1 > 100 && this.field1309.field3558 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1309.field3556[this.field1304]) {
                            break label47;
                        }
                        var1 -= this.field1309.field3556[this.field1304];
                        this.field1304++;
                    } while (this.field1304 < this.field1309.field3554.length);
                    this.field1304 -= this.field1309.field3558;
                } while (this.field1304 >= 0 && this.field1304 < this.field1309.field3554.length);
                this.field1309 = null;
            }
            this.field1311 = client.field729 - var1;
        }
        class265 var2 = class265.method668(this.field1307);
        if (var2.field3422 != null) {
            var2 = var2.method4417();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1310 == 1 || this.field1310 == 3) {
            var3 = var2.field3397;
            var4 = var2.field3396;
        } else {
            var3 = var2.field3396;
            var4 = var2.field3397;
        }
        int var5 = (var3 >> 1) + this.field1308;
        int var6 = (var3 + 1 >> 1) + this.field1308;
        int var7 = (var4 >> 1) + this.field1305;
        int var8 = (var4 + 1 >> 1) + this.field1305;
        int[][] var9 = class65.field525[this.field1306];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1308 << 7) + (var3 << 6);
        int var12 = (this.field1305 << 7) + (var4 << 6);
        return var2.method4415(this.field1303, this.field1310, var9, var11, var10, var12, this.field1309, this.field1304);
    }
}
