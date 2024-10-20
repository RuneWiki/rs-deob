package deob;

@ObfuscatedName("ce")
public class class101 extends class142 {

    @ObfuscatedName("ce.c")
    public int field1519;

    @ObfuscatedName("ce.o")
    public int field1515;

    @ObfuscatedName("ce.i")
    public int field1510;

    @ObfuscatedName("ce.u")
    public int field1513;

    @ObfuscatedName("ce.g")
    public int field1514;

    @ObfuscatedName("ce.m")
    public int field1512;

    @ObfuscatedName("ce.s")
    public class261 field1516;

    @ObfuscatedName("ce.x")
    public int field1511;

    @ObfuscatedName("ce.p")
    public int field1518;

    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class142 arg8) {
        this.field1519 = arg0;
        this.field1515 = arg1;
        this.field1510 = arg2;
        this.field1513 = arg3;
        this.field1514 = arg4;
        this.field1512 = arg5;
        if (arg6 != -1) {
            this.field1516 = Statics.method240(arg6);
            this.field1511 = 0;
            this.field1518 = client.field929 - 1;
            if (this.field1516.field3597 == 0 && arg8 != null && arg8 instanceof class101) {
                class101 var10 = (class101) arg8;
                if (this.field1516 == var10.field1516) {
                    this.field1511 = var10.field1511;
                    this.field1518 = var10.field1518;
                    return;
                }
            }
            if (arg7 && this.field1516.field3588 != -1) {
                this.field1511 = (int) (Math.random() * (double) this.field1516.field3584.length);
                this.field1518 -= (int) (Math.random() * (double) this.field1516.field3586[this.field1511]);
            }
        }
    }

    @ObfuscatedName("ce.i(B)Leo;")
    public final class134 method983() {
        if (this.field1516 != null) {
            int var1 = client.field929 - this.field1518;
            if (var1 > 100 && this.field1516.field3588 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1516.field3586[this.field1511]) {
                            break label47;
                        }
                        var1 -= this.field1516.field3586[this.field1511];
                        this.field1511++;
                    } while (this.field1511 < this.field1516.field3584.length);
                    this.field1511 -= this.field1516.field3588;
                } while (this.field1511 >= 0 && this.field1511 < this.field1516.field3584.length);
                this.field1516 = null;
            }
            this.field1518 = client.field929 - var1;
        }
        class256 var2 = class256.method2825(this.field1519);
        if (var2.field3452 != null) {
            var2 = var2.method4115();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1510 == 1 || this.field1510 == 3) {
            var3 = var2.field3425;
            var4 = var2.field3426;
        } else {
            var3 = var2.field3426;
            var4 = var2.field3425;
        }
        int var5 = (var3 >> 1) + this.field1514;
        int var6 = (var3 + 1 >> 1) + this.field1514;
        int var7 = (var4 >> 1) + this.field1512;
        int var8 = (var4 + 1 >> 1) + this.field1512;
        int[][] var9 = class62.field763[this.field1513];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1514 << 7) + (var3 << 6);
        int var12 = (this.field1512 << 7) + (var4 << 6);
        return var2.method4099(this.field1515, this.field1510, var9, var11, var10, var12, this.field1516, this.field1511);
    }
}
