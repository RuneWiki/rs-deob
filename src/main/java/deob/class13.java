package deob;

@ObfuscatedName("u")
public class class13 extends class89 {

    @ObfuscatedName("u.m")
    public int field169;

    @ObfuscatedName("u.w")
    public int field164;

    @ObfuscatedName("u.e")
    public int field165;

    @ObfuscatedName("u.o")
    public int field166;

    @ObfuscatedName("u.g")
    public int field167;

    @ObfuscatedName("u.l")
    public int field173;

    @ObfuscatedName("u.j")
    public class45 field176;

    @ObfuscatedName("u.r")
    public int field170;

    @ObfuscatedName("u.x")
    public int field171;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class89 arg8) {
        this.field169 = arg0;
        this.field164 = arg1;
        this.field165 = arg2;
        this.field166 = arg3;
        this.field167 = arg4;
        this.field173 = arg5;
        if (arg6 != -1) {
            this.field176 = class45.method637(arg6);
            this.field170 = 0;
            this.field171 = client.field283 - 1;
            if (this.field176.field1023 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field176 == var10.field176) {
                    this.field170 = var10.field170;
                    this.field171 = var10.field171;
                    return;
                }
            }
            if (arg7 && this.field176.field1014 != -1) {
                this.field170 = (int) (Math.random() * (double) this.field176.field1010.length);
                this.field171 -= (int) (Math.random() * (double) this.field176.field1012[this.field170]);
            }
        }
    }

    @ObfuscatedName("u.e(I)Ldg;")
    public final class109 method22() {
        if (this.field176 != null) {
            int var1 = client.field283 - this.field171;
            if (var1 > 100 && this.field176.field1014 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field176.field1012[this.field170]) {
                            break label47;
                        }
                        var1 -= this.field176.field1012[this.field170];
                        this.field170++;
                    } while (this.field170 < this.field176.field1010.length);
                    this.field170 -= this.field176.field1014;
                } while (this.field170 >= 0 && this.field170 < this.field176.field1010.length);
                this.field176 = null;
            }
            this.field171 = client.field283 - var1;
        }
        class43 var2 = class43.method96(this.field169);
        if (var2.field984 != null) {
            var2 = var2.method817();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field165 == 1 || this.field165 == 3) {
            var3 = var2.field981;
            var4 = var2.field977;
        } else {
            var3 = var2.field977;
            var4 = var2.field981;
        }
        int var5 = (var3 >> 1) + this.field167;
        int var6 = (var3 + 1 >> 1) + this.field167;
        int var7 = (var4 >> 1) + this.field173;
        int var8 = (var4 + 1 >> 1) + this.field173;
        int[][] var9 = class6.field78[this.field166];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field167 << 7) + (var3 << 6);
        int var12 = (this.field173 << 7) + (var4 << 6);
        return var2.method825(this.field164, this.field165, var9, var11, var10, var12, this.field176, this.field170);
    }
}
