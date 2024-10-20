package deob;

@ObfuscatedName("n")
public class class12 extends class80 {

    @ObfuscatedName("n.b")
    public int field161;

    @ObfuscatedName("n.e")
    public int field159;

    @ObfuscatedName("n.a")
    public int field160;

    @ObfuscatedName("n.k")
    public int field170;

    @ObfuscatedName("n.p")
    public int field167;

    @ObfuscatedName("n.l")
    public int field162;

    @ObfuscatedName("n.u")
    public class40 field164;

    @ObfuscatedName("n.o")
    public int field165;

    @ObfuscatedName("n.m")
    public int field166;

    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class80 arg8) {
        this.field161 = arg0;
        this.field159 = arg1;
        this.field160 = arg2;
        this.field170 = arg3;
        this.field167 = arg4;
        this.field162 = arg5;
        if (arg6 != -1) {
            this.field164 = class40.method512(arg6);
            this.field165 = 0;
            this.field166 = client.field259 - 1;
            if (this.field164.field931 == 0 && arg8 != null && arg8 instanceof class12) {
                class12 var10 = (class12) arg8;
                if (this.field164 == var10.field164) {
                    this.field165 = var10.field165;
                    this.field166 = var10.field166;
                    return;
                }
            }
            if (arg7 && this.field164.field922 != -1) {
                this.field165 = (int) (Math.random() * (double) this.field164.field928.length);
                this.field166 -= (int) (Math.random() * (double) this.field164.field925[this.field165]);
            }
        }
    }

    @ObfuscatedName("n.e(I)Lcx;")
    public final class100 method16() {
        if (this.field164 != null) {
            int var1 = client.field259 - this.field166;
            if (var1 > 100 && this.field164.field922 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field164.field925[this.field165]) {
                            break label47;
                        }
                        var1 -= this.field164.field925[this.field165];
                        this.field165++;
                    } while (this.field165 < this.field164.field928.length);
                    this.field165 -= this.field164.field922;
                } while (this.field165 >= 0 && this.field165 < this.field164.field928.length);
                this.field164 = null;
            }
            this.field166 = client.field259 - var1;
        }
        class38 var2 = class38.method1770(this.field161);
        if (var2.field890 != null) {
            var2 = var2.method679();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field160 == 1 || this.field160 == 3) {
            var3 = var2.field852;
            var4 = var2.field864;
        } else {
            var3 = var2.field864;
            var4 = var2.field852;
        }
        int var5 = (var3 >> 1) + this.field167;
        int var6 = (var3 + 1 >> 1) + this.field167;
        int var7 = (var4 >> 1) + this.field162;
        int var8 = (var4 + 1 >> 1) + this.field162;
        int[][] var9 = class6.field73[this.field170];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field167 << 7) + (var3 << 6);
        int var12 = (this.field162 << 7) + (var4 << 6);
        return var2.method677(this.field159, this.field160, var9, var11, var10, var12, this.field164, this.field165);
    }
}
