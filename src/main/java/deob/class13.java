package deob;

@ObfuscatedName("i")
public class class13 extends class85 {

    @ObfuscatedName("i.a")
    public int field183;

    @ObfuscatedName("i.r")
    public int field174;

    @ObfuscatedName("i.f")
    public int field175;

    @ObfuscatedName("i.s")
    public int field184;

    @ObfuscatedName("i.y")
    public int field177;

    @ObfuscatedName("i.e")
    public int field178;

    @ObfuscatedName("i.g")
    public class43 field179;

    @ObfuscatedName("i.m")
    public int field180;

    @ObfuscatedName("i.j")
    public int field176;

    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class85 arg8) {
        this.field183 = arg0;
        this.field174 = arg1;
        this.field175 = arg2;
        this.field184 = arg3;
        this.field177 = arg4;
        this.field178 = arg5;
        if (arg6 != -1) {
            this.field179 = class43.method2701(arg6);
            this.field180 = 0;
            this.field176 = client.field304 - 1;
            if (this.field179.field1002 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field179 == var10.field179) {
                    this.field180 = var10.field180;
                    this.field176 = var10.field176;
                    return;
                }
            }
            if (arg7 && this.field179.field1001 != -1) {
                this.field180 = (int) (Math.random() * (double) this.field179.field989.length);
                this.field176 -= (int) (Math.random() * (double) this.field179.field991[this.field180]);
            }
        }
    }

    @ObfuscatedName("i.f(I)Ldn;")
    public final class105 method27() {
        if (this.field179 != null) {
            int var1 = client.field304 - this.field176;
            if (var1 > 100 && this.field179.field1001 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field179.field991[this.field180]) {
                            break label47;
                        }
                        var1 -= this.field179.field991[this.field180];
                        this.field180++;
                    } while (this.field180 < this.field179.field989.length);
                    this.field180 -= this.field179.field1001;
                } while (this.field180 >= 0 && this.field180 < this.field179.field989.length);
                this.field179 = null;
            }
            this.field176 = client.field304 - var1;
        }
        class41 var2 = class41.method2944(this.field183);
        if (var2.field956 != null) {
            var2 = var2.method823();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field175 == 1 || this.field175 == 3) {
            var3 = var2.field940;
            var4 = var2.field939;
        } else {
            var3 = var2.field939;
            var4 = var2.field940;
        }
        int var5 = (var3 >> 1) + this.field177;
        int var6 = (var3 + 1 >> 1) + this.field177;
        int var7 = (var4 >> 1) + this.field178;
        int var8 = (var4 + 1 >> 1) + this.field178;
        int[][] var9 = class6.field87[this.field184];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field177 << 7) + (var3 << 6);
        int var12 = (this.field178 << 7) + (var4 << 6);
        return var2.method788(this.field174, this.field175, var9, var11, var10, var12, this.field179, this.field180);
    }
}
