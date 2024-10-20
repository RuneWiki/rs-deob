package deob;

@ObfuscatedName("o")
public class class11 extends class78 {

    @ObfuscatedName("o.n")
    public int field176;

    @ObfuscatedName("o.x")
    public int field181;

    @ObfuscatedName("o.k")
    public int field167;

    @ObfuscatedName("o.i")
    public int field170;

    @ObfuscatedName("o.d")
    public int field168;

    @ObfuscatedName("o.q")
    public int field169;

    @ObfuscatedName("o.m")
    public class38 field164;

    @ObfuscatedName("o.a")
    public int field171;

    @ObfuscatedName("o.w")
    public int field172;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field176 = arg0;
        this.field181 = arg1;
        this.field167 = arg2;
        this.field170 = arg3;
        this.field168 = arg4;
        this.field169 = arg5;
        if (arg6 != -1) {
            this.field164 = class38.method658(arg6);
            this.field171 = 0;
            this.field172 = client.field440 - 1;
            if (this.field164.field899 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field164 == var10.field164) {
                    this.field171 = var10.field171;
                    this.field172 = var10.field172;
                    return;
                }
            }
            if (arg7 && this.field164.field908 != -1) {
                this.field171 = (int) (Math.random() * (double) this.field164.field916.length);
                this.field172 -= (int) (Math.random() * (double) this.field164.field906[this.field171]);
            }
        }
    }

    @ObfuscatedName("o.x(S)Lcy;")
    public final class98 method18() {
        if (this.field164 != null) {
            int var1 = client.field440 - this.field172;
            if (var1 > 100 && this.field164.field908 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field164.field906[this.field171]) {
                            break label47;
                        }
                        var1 -= this.field164.field906[this.field171];
                        this.field171++;
                    } while (this.field171 < this.field164.field916.length);
                    this.field171 -= this.field164.field908;
                } while (this.field171 >= 0 && this.field171 < this.field164.field916.length);
                this.field164 = null;
            }
            this.field172 = client.field440 - var1;
        }
        class36 var2 = class36.method2071(this.field176);
        if (var2.field865 != null) {
            var2 = var2.method670();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field167 == 1 || this.field167 == 3) {
            var3 = var2.field860;
            var4 = var2.field855;
        } else {
            var3 = var2.field855;
            var4 = var2.field860;
        }
        int var5 = (var3 >> 1) + this.field168;
        int var6 = (var3 + 1 >> 1) + this.field168;
        int var7 = (var4 >> 1) + this.field169;
        int var8 = (var4 + 1 >> 1) + this.field169;
        int[][] var9 = class6.field89[this.field170];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field168 << 7) + (var3 << 6);
        int var12 = (this.field169 << 7) + (var4 << 6);
        return var2.method668(this.field181, this.field167, var9, var11, var10, var12, this.field164, this.field171);
    }
}
