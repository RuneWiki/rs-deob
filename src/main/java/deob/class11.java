package deob;

@ObfuscatedName("t")
public class class11 extends class79 {

    @ObfuscatedName("t.b")
    public int field160;

    @ObfuscatedName("t.e")
    public int field153;

    @ObfuscatedName("t.i")
    public int field150;

    @ObfuscatedName("t.k")
    public int field151;

    @ObfuscatedName("t.h")
    public int field152;

    @ObfuscatedName("t.p")
    public int field164;

    @ObfuscatedName("t.n")
    public class39 field154;

    @ObfuscatedName("t.o")
    public int field155;

    @ObfuscatedName("t.g")
    public int field156;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class79 arg8) {
        this.field160 = arg0;
        this.field153 = arg1;
        this.field150 = arg2;
        this.field151 = arg3;
        this.field152 = arg4;
        this.field164 = arg5;
        if (arg6 != -1) {
            this.field154 = class39.method1863(arg6);
            this.field155 = 0;
            this.field156 = client.field249 - 1;
            if (this.field154.field917 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field154 == var10.field154) {
                    this.field155 = var10.field155;
                    this.field156 = var10.field156;
                    return;
                }
            }
            if (arg7 && this.field154.field908 != -1) {
                this.field155 = (int) (Math.random() * (double) this.field154.field904.length);
                this.field156 -= (int) (Math.random() * (double) this.field154.field906[this.field155]);
            }
        }
    }

    @ObfuscatedName("t.e(B)Lcr;")
    public final class99 method15() {
        if (this.field154 != null) {
            int var1 = client.field249 - this.field156;
            if (var1 > 100 && this.field154.field908 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field154.field906[this.field155]) {
                            break label47;
                        }
                        var1 -= this.field154.field906[this.field155];
                        this.field155++;
                    } while (this.field155 < this.field154.field904.length);
                    this.field155 -= this.field154.field908;
                } while (this.field155 >= 0 && this.field155 < this.field154.field904.length);
                this.field154 = null;
            }
            this.field156 = client.field249 - var1;
        }
        class37 var2 = class37.method2940(this.field160);
        if (var2.field881 != null) {
            var2 = var2.method656();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field150 == 1 || this.field150 == 3) {
            var3 = var2.field856;
            var4 = var2.field855;
        } else {
            var3 = var2.field855;
            var4 = var2.field856;
        }
        int var5 = (var3 >> 1) + this.field152;
        int var6 = (var3 + 1 >> 1) + this.field152;
        int var7 = (var4 >> 1) + this.field164;
        int var8 = (var4 + 1 >> 1) + this.field164;
        int[][] var9 = class6.field84[this.field151];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field152 << 7) + (var3 << 6);
        int var12 = (this.field164 << 7) + (var4 << 6);
        return var2.method661(this.field153, this.field150, var9, var11, var10, var12, this.field154, this.field155);
    }
}
