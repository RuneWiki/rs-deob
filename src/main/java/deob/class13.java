package deob;

@ObfuscatedName("p")
public class class13 extends class89 {

    @ObfuscatedName("p.i")
    public int field205;

    @ObfuscatedName("p.h")
    public int field195;

    @ObfuscatedName("p.e")
    public int field196;

    @ObfuscatedName("p.g")
    public int field194;

    @ObfuscatedName("p.n")
    public int field198;

    @ObfuscatedName("p.u")
    public int field199;

    @ObfuscatedName("p.d")
    public class45 field200;

    @ObfuscatedName("p.l")
    public int field209;

    @ObfuscatedName("p.m")
    public int field202;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class89 arg8) {
        this.field205 = arg0;
        this.field195 = arg1;
        this.field196 = arg2;
        this.field194 = arg3;
        this.field198 = arg4;
        this.field199 = arg5;
        if (arg6 != -1) {
            this.field200 = class45.method3523(arg6);
            this.field209 = 0;
            this.field202 = client.field333 - 1;
            if (this.field200.field1007 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field200 == var10.field200) {
                    this.field209 = var10.field209;
                    this.field202 = var10.field202;
                    return;
                }
            }
            if (arg7 && this.field200.field1013 != -1) {
                this.field209 = (int) (Math.random() * (double) this.field200.field1012.length);
                this.field202 -= (int) (Math.random() * (double) this.field200.field1020[this.field209]);
            }
        }
    }

    @ObfuscatedName("p.e(I)Ldo;")
    public final class109 method47() {
        if (this.field200 != null) {
            int var1 = client.field333 - this.field202;
            if (var1 > 100 && this.field200.field1013 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field200.field1020[this.field209]) {
                            break label47;
                        }
                        var1 -= this.field200.field1020[this.field209];
                        this.field209++;
                    } while (this.field209 < this.field200.field1012.length);
                    this.field209 -= this.field200.field1013;
                } while (this.field209 >= 0 && this.field209 < this.field200.field1012.length);
                this.field200 = null;
            }
            this.field202 = client.field333 - var1;
        }
        class43 var2 = class43.method117(this.field205);
        if (var2.field986 != null) {
            var2 = var2.method847();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field196 == 1 || this.field196 == 3) {
            var3 = var2.field961;
            var4 = var2.field960;
        } else {
            var3 = var2.field960;
            var4 = var2.field961;
        }
        int var5 = (var3 >> 1) + this.field198;
        int var6 = (var3 + 1 >> 1) + this.field198;
        int var7 = (var4 >> 1) + this.field199;
        int var8 = (var4 + 1 >> 1) + this.field199;
        int[][] var9 = class6.field96[this.field194];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field198 << 7) + (var3 << 6);
        int var12 = (this.field199 << 7) + (var4 << 6);
        return var2.method818(this.field195, this.field196, var9, var11, var10, var12, this.field200, this.field209);
    }
}
