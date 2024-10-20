package deob;

@ObfuscatedName("cw")
public class class102 extends class143 {

    @ObfuscatedName("cw.e")
    public int field1540;

    @ObfuscatedName("cw.n")
    public int field1536;

    @ObfuscatedName("cw.g")
    public int field1537;

    @ObfuscatedName("cw.y")
    public int field1535;

    @ObfuscatedName("cw.w")
    public int field1546;

    @ObfuscatedName("cw.k")
    public int field1539;

    @ObfuscatedName("cw.v")
    public class262 field1538;

    @ObfuscatedName("cw.z")
    public int field1542;

    @ObfuscatedName("cw.r")
    public int field1543;

    public class102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class143 arg8) {
        this.field1540 = arg0;
        this.field1536 = arg1;
        this.field1537 = arg2;
        this.field1535 = arg3;
        this.field1546 = arg4;
        this.field1539 = arg5;
        if (arg6 != -1) {
            this.field1538 = class262.method1025(arg6);
            this.field1542 = 0;
            this.field1543 = client.field925 - 1;
            if (this.field1538.field3610 == 0 && arg8 != null && arg8 instanceof class102) {
                class102 var10 = (class102) arg8;
                if (this.field1538 == var10.field1538) {
                    this.field1542 = var10.field1542;
                    this.field1543 = var10.field1543;
                    return;
                }
            }
            if (arg7 && this.field1538.field3601 != -1) {
                this.field1542 = (int) (Math.random() * (double) this.field1538.field3596.length);
                this.field1543 -= (int) (Math.random() * (double) this.field1538.field3599[this.field1542]);
            }
        }
    }

    @ObfuscatedName("cw.g(I)Lew;")
    public final class135 method1081() {
        if (this.field1538 != null) {
            int var1 = client.field925 - this.field1543;
            if (var1 > 100 && this.field1538.field3601 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1538.field3599[this.field1542]) {
                            break label47;
                        }
                        var1 -= this.field1538.field3599[this.field1542];
                        this.field1542++;
                    } while (this.field1542 < this.field1538.field3596.length);
                    this.field1542 -= this.field1538.field3601;
                } while (this.field1542 >= 0 && this.field1542 < this.field1538.field3596.length);
                this.field1538 = null;
            }
            this.field1543 = client.field925 - var1;
        }
        class257 var2 = class257.method247(this.field1540);
        if (var2.field3468 != null) {
            var2 = var2.method4229();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1537 == 1 || this.field1537 == 3) {
            var3 = var2.field3443;
            var4 = var2.field3476;
        } else {
            var3 = var2.field3476;
            var4 = var2.field3443;
        }
        int var5 = (var3 >> 1) + this.field1546;
        int var6 = (var3 + 1 >> 1) + this.field1546;
        int var7 = (var4 >> 1) + this.field1539;
        int var8 = (var4 + 1 >> 1) + this.field1539;
        int[][] var9 = class62.field761[this.field1535];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1546 << 7) + (var3 << 6);
        int var12 = (this.field1539 << 7) + (var4 << 6);
        return var2.method4227(this.field1536, this.field1537, var9, var11, var10, var12, this.field1538, this.field1542);
    }
}
