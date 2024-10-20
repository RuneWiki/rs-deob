package deob;

@ObfuscatedName("k")
public class class11 extends class79 {

    @ObfuscatedName("k.x")
    public int field161;

    @ObfuscatedName("k.v")
    public int field151;

    @ObfuscatedName("k.m")
    public int field152;

    @ObfuscatedName("k.e")
    public int field153;

    @ObfuscatedName("k.h")
    public int field158;

    @ObfuscatedName("k.p")
    public int field155;

    @ObfuscatedName("k.j")
    public class39 field156;

    @ObfuscatedName("k.i")
    public int field157;

    @ObfuscatedName("k.u")
    public int field150;

    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class79 arg8) {
        this.field161 = arg0;
        this.field151 = arg1;
        this.field152 = arg2;
        this.field153 = arg3;
        this.field158 = arg4;
        this.field155 = arg5;
        if (arg6 != -1) {
            this.field156 = class39.method633(arg6);
            this.field157 = 0;
            this.field150 = client.field348 - 1;
            if (this.field156.field928 == 0 && arg8 != null && arg8 instanceof class11) {
                class11 var10 = (class11) arg8;
                if (this.field156 == var10.field156) {
                    this.field157 = var10.field157;
                    this.field150 = var10.field150;
                    return;
                }
            }
            if (arg7 && this.field156.field921 != -1) {
                this.field157 = (int) (Math.random() * (double) this.field156.field913.length);
                this.field150 -= (int) (Math.random() * (double) this.field156.field919[this.field157]);
            }
        }
    }

    @ObfuscatedName("k.v(B)Lck;")
    public final class99 method18() {
        if (this.field156 != null) {
            int var1 = client.field348 - this.field150;
            if (var1 > 100 && this.field156.field921 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field156.field919[this.field157]) {
                            break label47;
                        }
                        var1 -= this.field156.field919[this.field157];
                        this.field157++;
                    } while (this.field157 < this.field156.field913.length);
                    this.field157 -= this.field156.field921;
                } while (this.field157 >= 0 && this.field157 < this.field156.field913.length);
                this.field156 = null;
            }
            this.field150 = client.field348 - var1;
        }
        class37 var2 = class37.method96(this.field161);
        if (var2.field891 != null) {
            var2 = var2.method675();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field152 == 1 || this.field152 == 3) {
            var3 = var2.field866;
            var4 = var2.field860;
        } else {
            var3 = var2.field860;
            var4 = var2.field866;
        }
        int var5 = (var3 >> 1) + this.field158;
        int var6 = (var3 + 1 >> 1) + this.field158;
        int var7 = (var4 >> 1) + this.field155;
        int var8 = (var4 + 1 >> 1) + this.field155;
        int[][] var9 = class6.field87[this.field153];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field158 << 7) + (var3 << 6);
        int var12 = (this.field155 << 7) + (var4 << 6);
        return var2.method683(this.field151, this.field152, var9, var11, var10, var12, this.field156, this.field157);
    }
}
