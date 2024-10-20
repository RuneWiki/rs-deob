package deob;

@ObfuscatedName("cb")
public class class103 extends class145 {

    @ObfuscatedName("cb.z")
    public int field1322;

    @ObfuscatedName("cb.k")
    public int field1319;

    @ObfuscatedName("cb.s")
    public int field1325;

    @ObfuscatedName("cb.t")
    public int field1321;

    @ObfuscatedName("cb.i")
    public int field1323;

    @ObfuscatedName("cb.o")
    public int field1327;

    @ObfuscatedName("cb.x")
    public class269 field1324;

    @ObfuscatedName("cb.w")
    public int field1318;

    @ObfuscatedName("cb.g")
    public int field1326;

    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class145 arg8) {
        this.field1322 = arg0;
        this.field1319 = arg1;
        this.field1325 = arg2;
        this.field1321 = arg3;
        this.field1323 = arg4;
        this.field1327 = arg5;
        if (arg6 != -1) {
            this.field1324 = class269.method536(arg6);
            this.field1318 = 0;
            this.field1326 = client.field674 - 1;
            if (this.field1324.field3536 == 0 && arg8 != null && arg8 instanceof class103) {
                class103 var10 = (class103) arg8;
                if (this.field1324 == var10.field1324) {
                    this.field1318 = var10.field1318;
                    this.field1326 = var10.field1326;
                    return;
                }
            }
            if (arg7 && this.field1324.field3543 != -1) {
                this.field1318 = (int) (Math.random() * (double) this.field1324.field3535.length);
                this.field1326 -= (int) (Math.random() * (double) this.field1324.field3541[this.field1318]);
            }
        }
    }

    @ObfuscatedName("cb.g(I)Ler;")
    public final class137 method1141() {
        if (this.field1324 != null) {
            int var1 = client.field674 - this.field1326;
            if (var1 > 100 && this.field1324.field3543 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1324.field3541[this.field1318]) {
                            break label47;
                        }
                        var1 -= this.field1324.field3541[this.field1318];
                        this.field1318++;
                    } while (this.field1318 < this.field1324.field3535.length);
                    this.field1318 -= this.field1324.field3543;
                } while (this.field1318 >= 0 && this.field1318 < this.field1324.field3535.length);
                this.field1324 = null;
            }
            this.field1326 = client.field674 - var1;
        }
        class264 var2 = class264.method3595(this.field1322);
        if (var2.field3413 != null) {
            var2 = var2.method4325();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1325 == 1 || this.field1325 == 3) {
            var3 = var2.field3388;
            var4 = var2.field3387;
        } else {
            var3 = var2.field3387;
            var4 = var2.field3388;
        }
        int var5 = (var3 >> 1) + this.field1323;
        int var6 = (var3 + 1 >> 1) + this.field1323;
        int var7 = (var4 >> 1) + this.field1327;
        int var8 = (var4 + 1 >> 1) + this.field1327;
        int[][] var9 = class65.field527[this.field1321];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1323 << 7) + (var3 << 6);
        int var12 = (this.field1327 << 7) + (var4 << 6);
        return var2.method4354(this.field1319, this.field1325, var9, var11, var10, var12, this.field1324, this.field1318);
    }
}
