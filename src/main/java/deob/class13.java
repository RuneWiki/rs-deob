package deob;

@ObfuscatedName("o")
public class class13 extends class85 {

    @ObfuscatedName("o.f")
    public int field189;

    @ObfuscatedName("o.s")
    public int field203;

    @ObfuscatedName("o.q")
    public int field190;

    @ObfuscatedName("o.g")
    public int field191;

    @ObfuscatedName("o.m")
    public int field192;

    @ObfuscatedName("o.t")
    public int field193;

    @ObfuscatedName("o.j")
    public class43 field194;

    @ObfuscatedName("o.n")
    public int field195;

    @ObfuscatedName("o.l")
    public int field196;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field189 = arg0;
        this.field203 = arg1;
        this.field190 = arg2;
        this.field191 = arg3;
        this.field192 = arg4;
        this.field193 = arg5;
        if (arg6 != -1) {
            this.field194 = Statics.method653(arg6);
            this.field195 = 0;
            this.field196 = client.field577 - 1;
            if (this.field194.field1005 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field194 == var10.field194) {
                    this.field195 = var10.field195;
                    this.field196 = var10.field196;
                    return;
                }
            }
            if (arg7 && this.field194.field996 != -1) {
                this.field195 = (int) (Math.random() * (double) this.field194.field992.length);
                this.field196 -= (int) (Math.random() * (double) this.field194.field995[this.field195]);
            }
        }
    }

    @ObfuscatedName("o.q(I)Ldu;")
    public final class105 method16() {
        if (this.field194 != null) {
            int var1 = client.field577 - this.field196;
            if (var1 > 100 && this.field194.field996 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field194.field995[this.field195]) {
                            break label47;
                        }
                        var1 -= this.field194.field995[this.field195];
                        this.field195++;
                    } while (this.field195 < this.field194.field992.length);
                    this.field195 -= this.field194.field996;
                } while (this.field195 >= 0 && this.field195 < this.field194.field992.length);
                this.field194 = null;
            }
            this.field196 = client.field577 - var1;
        }
        class41 var2 = class41.method1009(this.field189);
        if (var2.field966 != null) {
            var2 = var2.method798();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field190 == 1 || this.field190 == 3) {
            var3 = var2.field926;
            var4 = var2.field968;
        } else {
            var3 = var2.field968;
            var4 = var2.field926;
        }
        int var5 = (var3 >> 1) + this.field192;
        int var6 = (var3 + 1 >> 1) + this.field192;
        int var7 = (var4 >> 1) + this.field193;
        int var8 = (var4 + 1 >> 1) + this.field193;
        int[][] var9 = class6.field81[this.field191];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field192 << 7) + (var3 << 6);
        int var12 = (this.field193 << 7) + (var4 << 6);
        return var2.method778(this.field203, this.field190, var9, var11, var10, var12, this.field194, this.field195);
    }
}
