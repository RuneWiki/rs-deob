package deob;

@ObfuscatedName("co")
public class class101 extends class142 {

    @ObfuscatedName("co.i")
    public int field1562;

    @ObfuscatedName("co.w")
    public int field1563;

    @ObfuscatedName("co.a")
    public int field1571;

    @ObfuscatedName("co.t")
    public int field1565;

    @ObfuscatedName("co.s")
    public int field1566;

    @ObfuscatedName("co.r")
    public int field1568;

    @ObfuscatedName("co.v")
    public class261 field1564;

    @ObfuscatedName("co.y")
    public int field1569;

    @ObfuscatedName("co.j")
    public int field1570;

    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class142 arg8) {
        this.field1562 = arg0;
        this.field1563 = arg1;
        this.field1571 = arg2;
        this.field1565 = arg3;
        this.field1566 = arg4;
        this.field1568 = arg5;
        if (arg6 != -1) {
            this.field1564 = class261.method3746(arg6);
            this.field1569 = 0;
            this.field1570 = client.field936 - 1;
            if (this.field1564.field3622 == 0 && arg8 != null && arg8 instanceof class101) {
                class101 var10 = (class101) arg8;
                if (this.field1564 == var10.field1564) {
                    this.field1569 = var10.field1569;
                    this.field1570 = var10.field1570;
                    return;
                }
            }
            if (arg7 && this.field1564.field3611 != -1) {
                this.field1569 = (int) (Math.random() * (double) this.field1564.field3610.length);
                this.field1570 -= (int) (Math.random() * (double) this.field1564.field3613[this.field1569]);
            }
        }
    }

    @ObfuscatedName("co.a(I)Let;")
    public final class134 method1044() {
        if (this.field1564 != null) {
            int var1 = client.field936 - this.field1570;
            if (var1 > 100 && this.field1564.field3611 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1564.field3613[this.field1569]) {
                            break label47;
                        }
                        var1 -= this.field1564.field3613[this.field1569];
                        this.field1569++;
                    } while (this.field1569 < this.field1564.field3610.length);
                    this.field1569 -= this.field1564.field3611;
                } while (this.field1569 >= 0 && this.field1569 < this.field1564.field3610.length);
                this.field1564 = null;
            }
            this.field1570 = client.field936 - var1;
        }
        class256 var2 = class256.method4092(this.field1562);
        if (var2.field3473 != null) {
            var2 = var2.method4199();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1571 == 1 || this.field1571 == 3) {
            var3 = var2.field3450;
            var4 = var2.field3462;
        } else {
            var3 = var2.field3462;
            var4 = var2.field3450;
        }
        int var5 = (var3 >> 1) + this.field1566;
        int var6 = (var3 + 1 >> 1) + this.field1566;
        int var7 = (var4 >> 1) + this.field1568;
        int var8 = (var4 + 1 >> 1) + this.field1568;
        int[][] var9 = class62.field782[this.field1565];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1566 << 7) + (var3 << 6);
        int var12 = (this.field1568 << 7) + (var4 << 6);
        return var2.method4160(this.field1563, this.field1571, var9, var11, var10, var12, this.field1564, this.field1569);
    }
}
