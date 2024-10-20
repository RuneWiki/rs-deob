package deob;

@ObfuscatedName("p")
public class class13 extends class85 {

    @ObfuscatedName("p.h")
    public int field198;

    @ObfuscatedName("p.q")
    public int field186;

    @ObfuscatedName("p.v")
    public int field188;

    @ObfuscatedName("p.n")
    public int field189;

    @ObfuscatedName("p.f")
    public int field195;

    @ObfuscatedName("p.g")
    public int field191;

    @ObfuscatedName("p.o")
    public class43 field192;

    @ObfuscatedName("p.s")
    public int field187;

    @ObfuscatedName("p.k")
    public int field194;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field198 = arg0;
        this.field186 = arg1;
        this.field188 = arg2;
        this.field189 = arg3;
        this.field195 = arg4;
        this.field191 = arg5;
        if (arg6 != -1) {
            this.field192 = class43.method733(arg6);
            this.field187 = 0;
            this.field194 = client.field303 - 1;
            if (this.field192.field1007 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field192 == var10.field192) {
                    this.field187 = var10.field187;
                    this.field194 = var10.field194;
                    return;
                }
            }
            if (arg7 && this.field192.field998 != -1) {
                this.field187 = (int) (Math.random() * (double) this.field192.field994.length);
                this.field194 -= (int) (Math.random() * (double) this.field192.field996[this.field187]);
            }
        }
    }

    @ObfuscatedName("p.v(B)Ldg;")
    public final class105 method32() {
        if (this.field192 != null) {
            int var1 = client.field303 - this.field194;
            if (var1 > 100 && this.field192.field998 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field192.field996[this.field187]) {
                            break label47;
                        }
                        var1 -= this.field192.field996[this.field187];
                        this.field187++;
                    } while (this.field187 < this.field192.field994.length);
                    this.field187 -= this.field192.field998;
                } while (this.field187 >= 0 && this.field187 < this.field192.field994.length);
                this.field192 = null;
            }
            this.field194 = client.field303 - var1;
        }
        class41 var2 = class41.method2325(this.field198);
        if (var2.field969 != null) {
            var2 = var2.method775();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field188 == 1 || this.field188 == 3) {
            var3 = var2.field978;
            var4 = var2.field928;
        } else {
            var3 = var2.field928;
            var4 = var2.field978;
        }
        int var5 = (var3 >> 1) + this.field195;
        int var6 = (var3 + 1 >> 1) + this.field195;
        int var7 = (var4 >> 1) + this.field191;
        int var8 = (var4 + 1 >> 1) + this.field191;
        int[][] var9 = class6.field89[this.field189];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field195 << 7) + (var3 << 6);
        int var12 = (this.field191 << 7) + (var4 << 6);
        return var2.method801(this.field186, this.field188, var9, var11, var10, var12, this.field192, this.field187);
    }
}
