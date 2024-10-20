package deob;

@ObfuscatedName("n")
public class class13 extends class85 {

    @ObfuscatedName("n.o")
    public int field173;

    @ObfuscatedName("n.e")
    public int field172;

    @ObfuscatedName("n.u")
    public int field182;

    @ObfuscatedName("n.b")
    public int field174;

    @ObfuscatedName("n.p")
    public int field175;

    @ObfuscatedName("n.s")
    public int field176;

    @ObfuscatedName("n.y")
    public class43 field177;

    @ObfuscatedName("n.t")
    public int field178;

    @ObfuscatedName("n.w")
    public int field179;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field173 = arg0;
        this.field172 = arg1;
        this.field182 = arg2;
        this.field174 = arg3;
        this.field175 = arg4;
        this.field176 = arg5;
        if (arg6 != -1) {
            this.field177 = class43.method774(arg6);
            this.field178 = 0;
            this.field179 = client.field288 - 1;
            if (this.field177.field997 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field177 == var10.field177) {
                    this.field178 = var10.field178;
                    this.field179 = var10.field179;
                    return;
                }
            }
            if (arg7 && this.field177.field992 != -1) {
                this.field178 = (int) (Math.random() * (double) this.field177.field984.length);
                this.field179 -= (int) (Math.random() * (double) this.field177.field986[this.field178]);
            }
        }
    }

    @ObfuscatedName("n.u(I)Ldk;")
    public final class105 method14() {
        if (this.field177 != null) {
            int var1 = client.field288 - this.field179;
            if (var1 > 100 && this.field177.field992 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field177.field986[this.field178]) {
                            break label47;
                        }
                        var1 -= this.field177.field986[this.field178];
                        this.field178++;
                    } while (this.field178 < this.field177.field984.length);
                    this.field178 -= this.field177.field992;
                } while (this.field178 >= 0 && this.field178 < this.field177.field984.length);
                this.field177 = null;
            }
            this.field179 = client.field288 - var1;
        }
        class41 var2 = class41.method2808(this.field173);
        if (var2.field960 != null) {
            var2 = var2.method790();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field182 == 1 || this.field182 == 3) {
            var3 = var2.field935;
            var4 = var2.field934;
        } else {
            var3 = var2.field934;
            var4 = var2.field935;
        }
        int var5 = (var3 >> 1) + this.field175;
        int var6 = (var3 + 1 >> 1) + this.field175;
        int var7 = (var4 >> 1) + this.field176;
        int var8 = (var4 + 1 >> 1) + this.field176;
        int[][] var9 = class6.field79[this.field174];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field175 << 7) + (var3 << 6);
        int var12 = (this.field176 << 7) + (var4 << 6);
        return var2.method788(this.field172, this.field182, var9, var11, var10, var12, this.field177, this.field178);
    }
}
