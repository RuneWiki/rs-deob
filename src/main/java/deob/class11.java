package deob;

@ObfuscatedName("k")
public class class11 extends class78 {

    @ObfuscatedName("k.b")
    public int field171;

    @ObfuscatedName("k.u")
    public int field172;

    @ObfuscatedName("k.x")
    public int field173;

    @ObfuscatedName("k.j")
    public int field175;

    @ObfuscatedName("k.o")
    public int field174;

    @ObfuscatedName("k.n")
    public int field176;

    @ObfuscatedName("k.y")
    public class38 field180;

    @ObfuscatedName("k.f")
    public int field178;

    @ObfuscatedName("k.p")
    public int field179;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field171 = arg0;
        this.field172 = arg1;
        this.field173 = arg2;
        this.field175 = arg3;
        this.field174 = arg4;
        this.field176 = arg5;
        if (arg6 != -1) {
            this.field180 = Statics.method484(arg6);
            this.field178 = 0;
            this.field179 = client.field376 - 1;
            if (this.field180.field917 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field180 == var10.field180) {
                    this.field178 = var10.field178;
                    this.field179 = var10.field179;
                    return;
                }
            }
            if (arg7 && this.field180.field908 != -1) {
                this.field178 = (int) (Math.random() * (double) this.field180.field911.length);
                this.field179 -= (int) (Math.random() * (double) this.field180.field900[this.field178]);
            }
        }
    }

    @ObfuscatedName("k.u(I)Lcu;")
    public final class98 method19() {
        if (this.field180 != null) {
            int var1 = client.field376 - this.field179;
            if (var1 > 100 && this.field180.field908 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field180.field900[this.field178]) {
                            break label47;
                        }
                        var1 -= this.field180.field900[this.field178];
                        this.field178++;
                    } while (this.field178 < this.field180.field911.length);
                    this.field178 -= this.field180.field908;
                } while (this.field178 >= 0 && this.field178 < this.field180.field911.length);
                this.field180 = null;
            }
            this.field179 = client.field376 - var1;
        }
        class36 var2 = class36.method28(this.field171);
        if (var2.field852 != null) {
            var2 = var2.method663();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field173 == 1 || this.field173 == 3) {
            var3 = var2.field873;
            var4 = var2.field879;
        } else {
            var3 = var2.field879;
            var4 = var2.field873;
        }
        int var5 = (var3 >> 1) + this.field174;
        int var6 = (var3 + 1 >> 1) + this.field174;
        int var7 = (var4 >> 1) + this.field176;
        int var8 = (var4 + 1 >> 1) + this.field176;
        int[][] var9 = class6.field74[this.field175];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field174 << 7) + (var3 << 6);
        int var12 = (this.field176 << 7) + (var4 << 6);
        return var2.method645(this.field172, this.field173, var9, var11, var10, var12, this.field180, this.field178);
    }
}
