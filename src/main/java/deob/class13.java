package deob;

@ObfuscatedName("u")
public class class13 extends class89 {

    @ObfuscatedName("u.a")
    public int field186;

    @ObfuscatedName("u.d")
    public int field174;

    @ObfuscatedName("u.v")
    public int field181;

    @ObfuscatedName("u.r")
    public int field175;

    @ObfuscatedName("u.z")
    public int field176;

    @ObfuscatedName("u.t")
    public int field178;

    @ObfuscatedName("u.n")
    public class45 field179;

    @ObfuscatedName("u.i")
    public int field180;

    @ObfuscatedName("u.g")
    public int field173;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class89 arg8) {
        this.field186 = arg0;
        this.field174 = arg1;
        this.field181 = arg2;
        this.field175 = arg3;
        this.field176 = arg4;
        this.field178 = arg5;
        if (arg6 != -1) {
            this.field179 = class45.method185(arg6);
            this.field180 = 0;
            this.field173 = client.field565 - 1;
            if (this.field179.field1027 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field179 == var10.field179) {
                    this.field180 = var10.field180;
                    this.field173 = var10.field173;
                    return;
                }
            }
            if (arg7 && this.field179.field1015 != -1) {
                this.field180 = (int) (Math.random() * (double) this.field179.field1010.length);
                this.field173 -= (int) (Math.random() * (double) this.field179.field1016[this.field180]);
            }
        }
    }

    @ObfuscatedName("u.v(I)Ldp;")
    public final class109 method40() {
        if (this.field179 != null) {
            int var1 = client.field565 - this.field173;
            if (var1 > 100 && this.field179.field1015 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field179.field1016[this.field180]) {
                            break label47;
                        }
                        var1 -= this.field179.field1016[this.field180];
                        this.field180++;
                    } while (this.field180 < this.field179.field1010.length);
                    this.field180 -= this.field179.field1015;
                } while (this.field180 >= 0 && this.field180 < this.field179.field1010.length);
                this.field179 = null;
            }
            this.field173 = client.field565 - var1;
        }
        class43 var2 = class43.method3046(this.field186);
        if (var2.field952 != null) {
            var2 = var2.method851();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field181 == 1 || this.field181 == 3) {
            var3 = var2.field965;
            var4 = var2.field964;
        } else {
            var3 = var2.field964;
            var4 = var2.field965;
        }
        int var5 = (var3 >> 1) + this.field176;
        int var6 = (var3 + 1 >> 1) + this.field176;
        int var7 = (var4 >> 1) + this.field178;
        int var8 = (var4 + 1 >> 1) + this.field178;
        int[][] var9 = class6.field90[this.field175];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field176 << 7) + (var3 << 6);
        int var12 = (this.field178 << 7) + (var4 << 6);
        return var2.method822(this.field174, this.field181, var9, var11, var10, var12, this.field179, this.field180);
    }
}
