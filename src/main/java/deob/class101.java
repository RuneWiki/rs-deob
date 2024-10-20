package deob;

@ObfuscatedName("cc")
public class class101 extends class142 {

    @ObfuscatedName("cc.p")
    public int field1542;

    @ObfuscatedName("cc.m")
    public int field1540;

    @ObfuscatedName("cc.e")
    public int field1543;

    @ObfuscatedName("cc.t")
    public int field1548;

    @ObfuscatedName("cc.w")
    public int field1539;

    @ObfuscatedName("cc.z")
    public int field1544;

    @ObfuscatedName("cc.j")
    public class261 field1545;

    @ObfuscatedName("cc.i")
    public int field1546;

    @ObfuscatedName("cc.f")
    public int field1547;

    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class142 arg8) {
        this.field1542 = arg0;
        this.field1540 = arg1;
        this.field1543 = arg2;
        this.field1548 = arg3;
        this.field1539 = arg4;
        this.field1544 = arg5;
        if (arg6 != -1) {
            this.field1545 = class261.method790(arg6);
            this.field1546 = 0;
            this.field1547 = client.field960 - 1;
            if (this.field1545.field3621 == 0 && arg8 != null && arg8 instanceof class101) {
                class101 var10 = (class101) arg8;
                if (this.field1545 == var10.field1545) {
                    this.field1546 = var10.field1546;
                    this.field1547 = var10.field1547;
                    return;
                }
            }
            if (arg7 && this.field1545.field3613 != -1) {
                this.field1546 = (int) (Math.random() * (double) this.field1545.field3608.length);
                this.field1547 -= (int) (Math.random() * (double) this.field1545.field3606[this.field1546]);
            }
        }
    }

    @ObfuscatedName("cc.e(I)Les;")
    public final class134 method1001() {
        if (this.field1545 != null) {
            int var1 = client.field960 - this.field1547;
            if (var1 > 100 && this.field1545.field3613 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1545.field3606[this.field1546]) {
                            break label47;
                        }
                        var1 -= this.field1545.field3606[this.field1546];
                        this.field1546++;
                    } while (this.field1546 < this.field1545.field3608.length);
                    this.field1546 -= this.field1545.field3613;
                } while (this.field1546 >= 0 && this.field1546 < this.field1545.field3608.length);
                this.field1545 = null;
            }
            this.field1547 = client.field960 - var1;
        }
        class256 var2 = class256.method239(this.field1542);
        if (var2.field3484 != null) {
            var2 = var2.method4121();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1543 == 1 || this.field1543 == 3) {
            var3 = var2.field3459;
            var4 = var2.field3458;
        } else {
            var3 = var2.field3458;
            var4 = var2.field3459;
        }
        int var5 = (var3 >> 1) + this.field1539;
        int var6 = (var3 + 1 >> 1) + this.field1539;
        int var7 = (var4 >> 1) + this.field1544;
        int var8 = (var4 + 1 >> 1) + this.field1544;
        int[][] var9 = class62.field764[this.field1548];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1539 << 7) + (var3 << 6);
        int var12 = (this.field1544 << 7) + (var4 << 6);
        return var2.method4092(this.field1540, this.field1543, var9, var11, var10, var12, this.field1545, this.field1546);
    }
}
