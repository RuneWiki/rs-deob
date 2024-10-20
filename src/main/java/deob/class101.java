package deob;

@ObfuscatedName("ck")
public class class101 extends class142 {

    @ObfuscatedName("ck.e")
    public int field1552;

    @ObfuscatedName("ck.o")
    public int field1542;

    @ObfuscatedName("ck.m")
    public int field1544;

    @ObfuscatedName("ck.g")
    public int field1545;

    @ObfuscatedName("ck.d")
    public int field1543;

    @ObfuscatedName("ck.b")
    public int field1547;

    @ObfuscatedName("ck.k")
    public class261 field1548;

    @ObfuscatedName("ck.f")
    public int field1549;

    @ObfuscatedName("ck.j")
    public int field1550;

    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class142 arg8) {
        this.field1552 = arg0;
        this.field1542 = arg1;
        this.field1544 = arg2;
        this.field1545 = arg3;
        this.field1543 = arg4;
        this.field1547 = arg5;
        if (arg6 != -1) {
            this.field1548 = class261.method2746(arg6);
            this.field1549 = 0;
            this.field1550 = client.field929 - 1;
            if (this.field1548.field3582 == 0 && arg8 != null && arg8 instanceof class101) {
                class101 var10 = (class101) arg8;
                if (this.field1548 == var10.field1548) {
                    this.field1549 = var10.field1549;
                    this.field1550 = var10.field1550;
                    return;
                }
            }
            if (arg7 && this.field1548.field3591 != -1) {
                this.field1549 = (int) (Math.random() * (double) this.field1548.field3587.length);
                this.field1550 -= (int) (Math.random() * (double) this.field1548.field3588[this.field1549]);
            }
        }
    }

    @ObfuscatedName("ck.m(B)Leo;")
    public final class134 method1018() {
        if (this.field1548 != null) {
            int var1 = client.field929 - this.field1550;
            if (var1 > 100 && this.field1548.field3591 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1548.field3588[this.field1549]) {
                            break label47;
                        }
                        var1 -= this.field1548.field3588[this.field1549];
                        this.field1549++;
                    } while (this.field1549 < this.field1548.field3587.length);
                    this.field1549 -= this.field1548.field3591;
                } while (this.field1549 >= 0 && this.field1549 < this.field1548.field3587.length);
                this.field1548 = null;
            }
            this.field1550 = client.field929 - var1;
        }
        class256 var2 = class256.method4379(this.field1552);
        if (var2.field3437 != null) {
            var2 = var2.method4154();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1544 == 1 || this.field1544 == 3) {
            var3 = var2.field3431;
            var4 = var2.field3436;
        } else {
            var3 = var2.field3436;
            var4 = var2.field3431;
        }
        int var5 = (var3 >> 1) + this.field1543;
        int var6 = (var3 + 1 >> 1) + this.field1543;
        int var7 = (var4 >> 1) + this.field1547;
        int var8 = (var4 + 1 >> 1) + this.field1547;
        int[][] var9 = class62.field749[this.field1545];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1543 << 7) + (var3 << 6);
        int var12 = (this.field1547 << 7) + (var4 << 6);
        return var2.method4152(this.field1542, this.field1544, var9, var11, var10, var12, this.field1548, this.field1549);
    }
}
