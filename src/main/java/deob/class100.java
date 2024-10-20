package deob;

@ObfuscatedName("cn")
public class class100 extends class141 {

    @ObfuscatedName("cn.i")
    public int field1553;

    @ObfuscatedName("cn.j")
    public int field1552;

    @ObfuscatedName("cn.a")
    public int field1561;

    @ObfuscatedName("cn.r")
    public int field1554;

    @ObfuscatedName("cn.o")
    public int field1555;

    @ObfuscatedName("cn.n")
    public int field1556;

    @ObfuscatedName("cn.q")
    public class262 field1557;

    @ObfuscatedName("cn.b")
    public int field1558;

    @ObfuscatedName("cn.k")
    public int field1559;

    public class100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class141 arg8) {
        this.field1553 = arg0;
        this.field1552 = arg1;
        this.field1561 = arg2;
        this.field1554 = arg3;
        this.field1555 = arg4;
        this.field1556 = arg5;
        if (arg6 != -1) {
            this.field1557 = class262.method3737(arg6);
            this.field1558 = 0;
            this.field1559 = client.field973 - 1;
            if (this.field1557.field3615 == 0 && arg8 != null && arg8 instanceof class100) {
                class100 var10 = (class100) arg8;
                if (this.field1557 == var10.field1557) {
                    this.field1558 = var10.field1558;
                    this.field1559 = var10.field1559;
                    return;
                }
            }
            if (arg7 && this.field1557.field3605 != -1) {
                this.field1558 = (int) (Math.random() * (double) this.field1557.field3614.length);
                this.field1559 -= (int) (Math.random() * (double) this.field1557.field3604[this.field1558]);
            }
        }
    }

    @ObfuscatedName("cn.a(I)Lem;")
    public final class133 method1038() {
        if (this.field1557 != null) {
            int var1 = client.field973 - this.field1559;
            if (var1 > 100 && this.field1557.field3605 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1557.field3604[this.field1558]) {
                            break label47;
                        }
                        var1 -= this.field1557.field3604[this.field1558];
                        this.field1558++;
                    } while (this.field1558 < this.field1557.field3614.length);
                    this.field1558 -= this.field1557.field3605;
                } while (this.field1558 >= 0 && this.field1558 < this.field1557.field3614.length);
                this.field1557 = null;
            }
            this.field1559 = client.field973 - var1;
        }
        class257 var2 = class257.method2716(this.field1553);
        if (var2.field3476 != null) {
            var2 = var2.method4204();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1561 == 1 || this.field1561 == 3) {
            var3 = var2.field3451;
            var4 = var2.field3450;
        } else {
            var3 = var2.field3450;
            var4 = var2.field3451;
        }
        int var5 = (var3 >> 1) + this.field1555;
        int var6 = (var3 + 1 >> 1) + this.field1555;
        int var7 = (var4 >> 1) + this.field1556;
        int var8 = (var4 + 1 >> 1) + this.field1556;
        int[][] var9 = class62.field768[this.field1554];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1555 << 7) + (var3 << 6);
        int var12 = (this.field1556 << 7) + (var4 << 6);
        return var2.method4217(this.field1552, this.field1561, var9, var11, var10, var12, this.field1557, this.field1558);
    }
}
