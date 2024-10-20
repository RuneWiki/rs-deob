package deob;

@ObfuscatedName("t")
public class class13 extends class85 {

    @ObfuscatedName("t.k")
    public int field173;

    @ObfuscatedName("t.h")
    public int field182;

    @ObfuscatedName("t.o")
    public int field175;

    @ObfuscatedName("t.z")
    public int field176;

    @ObfuscatedName("t.c")
    public int field177;

    @ObfuscatedName("t.d")
    public int field184;

    @ObfuscatedName("t.l")
    public class43 field179;

    @ObfuscatedName("t.b")
    public int field180;

    @ObfuscatedName("t.j")
    public int field181;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field173 = arg0;
        this.field182 = arg1;
        this.field175 = arg2;
        this.field176 = arg3;
        this.field177 = arg4;
        this.field184 = arg5;
        if (arg6 != -1) {
            this.field179 = class43.method3491(arg6);
            this.field180 = 0;
            this.field181 = client.field312 - 1;
            if (this.field179.field984 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field179 == var10.field179) {
                    this.field180 = var10.field180;
                    this.field181 = var10.field181;
                    return;
                }
            }
            if (arg7 && this.field179.field975 != -1) {
                this.field180 = (int) (Math.random() * (double) this.field179.field974.length);
                this.field181 -= (int) (Math.random() * (double) this.field179.field980[this.field180]);
            }
        }
    }

    @ObfuscatedName("t.o(I)Ldl;")
    public final class105 method11() {
        if (this.field179 != null) {
            int var1 = client.field312 - this.field181;
            if (var1 > 100 && this.field179.field975 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field179.field980[this.field180]) {
                            break label47;
                        }
                        var1 -= this.field179.field980[this.field180];
                        this.field180++;
                    } while (this.field180 < this.field179.field974.length);
                    this.field180 -= this.field179.field975;
                } while (this.field180 >= 0 && this.field180 < this.field179.field974.length);
                this.field179 = null;
            }
            this.field181 = client.field312 - var1;
        }
        class41 var2 = class41.method2962(this.field173);
        if (var2.field938 != null) {
            var2 = var2.method754();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field175 == 1 || this.field175 == 3) {
            var3 = var2.field913;
            var4 = var2.field912;
        } else {
            var3 = var2.field912;
            var4 = var2.field913;
        }
        int var5 = (var3 >> 1) + this.field177;
        int var6 = (var3 + 1 >> 1) + this.field177;
        int var7 = (var4 >> 1) + this.field184;
        int var8 = (var4 + 1 >> 1) + this.field184;
        int[][] var9 = class6.field76[this.field176];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field177 << 7) + (var3 << 6);
        int var12 = (this.field184 << 7) + (var4 << 6);
        return var2.method752(this.field182, this.field175, var9, var11, var10, var12, this.field179, this.field180);
    }
}
