package deob;

@ObfuscatedName("w")
public class class11 extends class78 {

    @ObfuscatedName("w.k")
    public int field164;

    @ObfuscatedName("w.b")
    public int field163;

    @ObfuscatedName("w.e")
    public int field160;

    @ObfuscatedName("w.i")
    public int field161;

    @ObfuscatedName("w.t")
    public int field159;

    @ObfuscatedName("w.z")
    public int field165;

    @ObfuscatedName("w.g")
    public class38 field162;

    @ObfuscatedName("w.c")
    public int field158;

    @ObfuscatedName("w.o")
    public int field166;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field164 = arg0;
        this.field163 = arg1;
        this.field160 = arg2;
        this.field161 = arg3;
        this.field159 = arg4;
        this.field165 = arg5;
        if (arg6 != -1) {
            this.field162 = class38.method595(arg6);
            this.field158 = 0;
            this.field166 = client.field265 - 1;
            if (this.field162.field913 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field162 == var10.field162) {
                    this.field158 = var10.field158;
                    this.field166 = var10.field166;
                    return;
                }
            }
            if (arg7 && this.field162.field904 != -1) {
                this.field158 = (int) (Math.random() * (double) this.field162.field906.length);
                this.field166 -= (int) (Math.random() * (double) this.field162.field902[this.field158]);
            }
        }
    }

    @ObfuscatedName("w.b(I)Lck;")
    public final class98 method19() {
        if (this.field162 != null) {
            int var1 = client.field265 - this.field166;
            if (var1 > 100 && this.field162.field904 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field162.field902[this.field158]) {
                            break label47;
                        }
                        var1 -= this.field162.field902[this.field158];
                        this.field158++;
                    } while (this.field158 < this.field162.field906.length);
                    this.field158 -= this.field162.field904;
                } while (this.field158 >= 0 && this.field158 < this.field162.field906.length);
                this.field162 = null;
            }
            this.field166 = client.field265 - var1;
        }
        class36 var2 = class36.method93(this.field164);
        if (var2.field873 != null) {
            var2 = var2.method648();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field160 == 1 || this.field160 == 3) {
            var3 = var2.field839;
            var4 = var2.field854;
        } else {
            var3 = var2.field854;
            var4 = var2.field839;
        }
        int var5 = (var3 >> 1) + this.field159;
        int var6 = (var3 + 1 >> 1) + this.field159;
        int var7 = (var4 >> 1) + this.field165;
        int var8 = (var4 + 1 >> 1) + this.field165;
        int[][] var9 = class6.field81[this.field161];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field159 << 7) + (var3 << 6);
        int var12 = (this.field165 << 7) + (var4 << 6);
        return var2.method646(this.field163, this.field160, var9, var11, var10, var12, this.field162, this.field158);
    }
}
