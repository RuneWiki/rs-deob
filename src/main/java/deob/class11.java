package deob;

@ObfuscatedName("h")
public class class11 extends class78 {

    @ObfuscatedName("h.e")
    public int field158;

    @ObfuscatedName("h.o")
    public int field168;

    @ObfuscatedName("h.y")
    public int field160;

    @ObfuscatedName("h.b")
    public int field161;

    @ObfuscatedName("h.w")
    public int field162;

    @ObfuscatedName("h.r")
    public int field163;

    @ObfuscatedName("h.l")
    public class38 field165;

    @ObfuscatedName("h.s")
    public int field172;

    @ObfuscatedName("h.f")
    public int field166;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class78 arg8) {
        this.field158 = arg0;
        this.field168 = arg1;
        this.field160 = arg2;
        this.field161 = arg3;
        this.field162 = arg4;
        this.field163 = arg5;
        if (arg6 != -1) {
            this.field165 = class38.method131(arg6);
            this.field172 = 0;
            this.field166 = client.field318 - 1;
            if (this.field165.field921 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field165 == var10.field165) {
                    this.field172 = var10.field172;
                    this.field166 = var10.field166;
                    return;
                }
            }
            if (arg7 && this.field165.field919 != -1) {
                this.field172 = (int) (Math.random() * (double) this.field165.field923.length);
                this.field166 -= (int) (Math.random() * (double) this.field165.field917[this.field172]);
            }
        }
    }

    @ObfuscatedName("h.o(B)Lcd;")
    public final class98 method21() {
        if (this.field165 != null) {
            int var1 = client.field318 - this.field166;
            if (var1 > 100 && this.field165.field919 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field165.field917[this.field172]) {
                            break label47;
                        }
                        var1 -= this.field165.field917[this.field172];
                        this.field172++;
                    } while (this.field172 < this.field165.field923.length);
                    this.field172 -= this.field165.field919;
                } while (this.field172 >= 0 && this.field172 < this.field165.field923.length);
                this.field165 = null;
            }
            this.field166 = client.field318 - var1;
        }
        class36 var2 = class36.method809(this.field158);
        if (var2.field886 != null) {
            var2 = var2.method637();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field160 == 1 || this.field160 == 3) {
            var3 = var2.field861;
            var4 = var2.field896;
        } else {
            var3 = var2.field896;
            var4 = var2.field861;
        }
        int var5 = (var3 >> 1) + this.field162;
        int var6 = (var3 + 1 >> 1) + this.field162;
        int var7 = (var4 >> 1) + this.field163;
        int var8 = (var4 + 1 >> 1) + this.field163;
        int[][] var9 = class6.field93[this.field161];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field162 << 7) + (var3 << 6);
        int var12 = (this.field163 << 7) + (var4 << 6);
        return var2.method667(this.field168, this.field160, var9, var11, var10, var12, this.field165, this.field172);
    }
}
