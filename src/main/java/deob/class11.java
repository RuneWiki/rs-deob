package deob;

@ObfuscatedName("p")
public class class11 extends class79 {

    @ObfuscatedName("p.f")
    public int field155;

    @ObfuscatedName("p.k")
    public int field150;

    @ObfuscatedName("p.y")
    public int field159;

    @ObfuscatedName("p.e")
    public int field151;

    @ObfuscatedName("p.r")
    public int field153;

    @ObfuscatedName("p.a")
    public int field154;

    @ObfuscatedName("p.n")
    public class39 field152;

    @ObfuscatedName("p.x")
    public int field163;

    @ObfuscatedName("p.g")
    public int field157;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class79 arg8) {
        this.field155 = arg0;
        this.field150 = arg1;
        this.field159 = arg2;
        this.field151 = arg3;
        this.field153 = arg4;
        this.field154 = arg5;
        if (arg6 != -1) {
            this.field152 = class39.method547(arg6);
            this.field163 = 0;
            this.field157 = client.field372 - 1;
            if (this.field152.field929 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field152 == var10.field152) {
                    this.field163 = var10.field163;
                    this.field157 = var10.field157;
                    return;
                }
            }
            if (arg7 && this.field152.field924 != -1) {
                this.field163 = (int) (Math.random() * (double) this.field152.field913.length);
                this.field157 -= (int) (Math.random() * (double) this.field152.field918[this.field163]);
            }
        }
    }

    @ObfuscatedName("p.k(I)Lci;")
    public final class99 method16() {
        if (this.field152 != null) {
            int var1 = client.field372 - this.field157;
            if (var1 > 100 && this.field152.field924 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field152.field918[this.field163]) {
                            break label47;
                        }
                        var1 -= this.field152.field918[this.field163];
                        this.field163++;
                    } while (this.field163 < this.field152.field913.length);
                    this.field163 -= this.field152.field924;
                } while (this.field163 >= 0 && this.field163 < this.field152.field913.length);
                this.field152 = null;
            }
            this.field157 = client.field372 - var1;
        }
        class37 var2 = Statics.method644(this.field155);
        if (var2.field889 != null) {
            var2 = var2.method689();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field159 == 1 || this.field159 == 3) {
            var3 = var2.field864;
            var4 = var2.field849;
        } else {
            var3 = var2.field849;
            var4 = var2.field864;
        }
        int var5 = (var3 >> 1) + this.field153;
        int var6 = (var3 + 1 >> 1) + this.field153;
        int var7 = (var4 >> 1) + this.field154;
        int var8 = (var4 + 1 >> 1) + this.field154;
        int[][] var9 = class6.field76[this.field151];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field153 << 7) + (var3 << 6);
        int var12 = (this.field154 << 7) + (var4 << 6);
        return var2.method699(this.field150, this.field159, var9, var11, var10, var12, this.field152, this.field163);
    }
}
