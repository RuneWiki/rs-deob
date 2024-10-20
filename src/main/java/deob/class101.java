package deob;

@ObfuscatedName("cn")
public class class101 extends class142 {

    @ObfuscatedName("cn.s")
    public int field1535;

    @ObfuscatedName("cn.c")
    public int field1541;

    @ObfuscatedName("cn.f")
    public int field1534;

    @ObfuscatedName("cn.m")
    public int field1533;

    @ObfuscatedName("cn.h")
    public int field1537;

    @ObfuscatedName("cn.t")
    public int field1538;

    @ObfuscatedName("cn.p")
    public class264 field1539;

    @ObfuscatedName("cn.d")
    public int field1540;

    @ObfuscatedName("cn.n")
    public int field1536;

    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class142 arg8) {
        this.field1535 = arg0;
        this.field1541 = arg1;
        this.field1534 = arg2;
        this.field1533 = arg3;
        this.field1537 = arg4;
        this.field1538 = arg5;
        if (arg6 != -1) {
            this.field1539 = class264.method341(arg6);
            this.field1540 = 0;
            this.field1536 = client.field948 - 1;
            if (this.field1539.field3633 == 0 && arg8 != null && arg8 instanceof class101) {
                class101 var10 = (class101) arg8;
                if (this.field1539 == var10.field1539) {
                    this.field1540 = var10.field1540;
                    this.field1536 = var10.field1536;
                    return;
                }
            }
            if (arg7 && this.field1539.field3624 != -1) {
                this.field1540 = (int) (Math.random() * (double) this.field1539.field3620.length);
                this.field1536 -= (int) (Math.random() * (double) this.field1539.field3631[this.field1540]);
            }
        }
    }

    @ObfuscatedName("cn.f(B)Leb;")
    public final class134 method1016() {
        if (this.field1539 != null) {
            int var1 = client.field948 - this.field1536;
            if (var1 > 100 && this.field1539.field3624 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1539.field3631[this.field1540]) {
                            break label47;
                        }
                        var1 -= this.field1539.field3631[this.field1540];
                        this.field1540++;
                    } while (this.field1540 < this.field1539.field3620.length);
                    this.field1540 -= this.field1539.field3624;
                } while (this.field1540 >= 0 && this.field1540 < this.field1539.field3620.length);
                this.field1539 = null;
            }
            this.field1536 = client.field948 - var1;
        }
        class259 var2 = class259.method653(this.field1535);
        if (var2.field3488 != null) {
            var2 = var2.method4246();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1534 == 1 || this.field1534 == 3) {
            var3 = var2.field3463;
            var4 = var2.field3484;
        } else {
            var3 = var2.field3484;
            var4 = var2.field3463;
        }
        int var5 = (var3 >> 1) + this.field1537;
        int var6 = (var3 + 1 >> 1) + this.field1537;
        int var7 = (var4 >> 1) + this.field1538;
        int var8 = (var4 + 1 >> 1) + this.field1538;
        int[][] var9 = class62.field756[this.field1533];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1537 << 7) + (var3 << 6);
        int var12 = (this.field1538 << 7) + (var4 << 6);
        return var2.method4244(this.field1541, this.field1534, var9, var11, var10, var12, this.field1539, this.field1540);
    }
}
