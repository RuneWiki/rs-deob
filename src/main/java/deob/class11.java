package deob;

@ObfuscatedName("i")
public class class11 extends class79 {

    @ObfuscatedName("i.c")
    public int field169;

    @ObfuscatedName("i.j")
    public int field167;

    @ObfuscatedName("i.y")
    public int field160;

    @ObfuscatedName("i.r")
    public int field162;

    @ObfuscatedName("i.f")
    public int field163;

    @ObfuscatedName("i.l")
    public int field164;

    @ObfuscatedName("i.b")
    public class39 field165;

    @ObfuscatedName("i.k")
    public int field166;

    @ObfuscatedName("i.g")
    public int field170;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class79 arg8) {
        this.field169 = arg0;
        this.field167 = arg1;
        this.field160 = arg2;
        this.field162 = arg3;
        this.field163 = arg4;
        this.field164 = arg5;
        if (arg6 != -1) {
            this.field165 = class39.method109(arg6);
            this.field166 = 0;
            this.field170 = client.field493 - 1;
            if (this.field165.field917 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field165 == var10.field165) {
                    this.field166 = var10.field166;
                    this.field170 = var10.field170;
                    return;
                }
            }
            if (arg7 && this.field165.field905 != -1) {
                this.field166 = (int) (Math.random() * (double) this.field165.field913.length);
                this.field170 -= (int) (Math.random() * (double) this.field165.field906[this.field166]);
            }
        }
    }

    @ObfuscatedName("i.j(B)Lcl;")
    public final class99 method20() {
        if (this.field165 != null) {
            int var1 = client.field493 - this.field170;
            if (var1 > 100 && this.field165.field905 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field165.field906[this.field166]) {
                            break label47;
                        }
                        var1 -= this.field165.field906[this.field166];
                        this.field166++;
                    } while (this.field166 < this.field165.field913.length);
                    this.field166 -= this.field165.field905;
                } while (this.field166 >= 0 && this.field166 < this.field165.field913.length);
                this.field165 = null;
            }
            this.field170 = client.field493 - var1;
        }
        class37 var2 = class37.method1041(this.field169);
        if (var2.field868 != null) {
            var2 = var2.method673();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field160 == 1 || this.field160 == 3) {
            var3 = var2.field885;
            var4 = var2.field855;
        } else {
            var3 = var2.field855;
            var4 = var2.field885;
        }
        int var5 = (var3 >> 1) + this.field163;
        int var6 = (var3 + 1 >> 1) + this.field163;
        int var7 = (var4 >> 1) + this.field164;
        int var8 = (var4 + 1 >> 1) + this.field164;
        int[][] var9 = class6.field84[this.field162];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field163 << 7) + (var3 << 6);
        int var12 = (this.field164 << 7) + (var4 << 6);
        return var2.method639(this.field167, this.field160, var9, var11, var10, var12, this.field165, this.field166);
    }
}
