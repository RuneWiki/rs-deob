package deob;

@ObfuscatedName("dk")
public class class114 implements class134 {

    @ObfuscatedName("dk.f")
    public class119[] field1486;

    @ObfuscatedName("dk.h")
    public class208 field1483 = new class208();

    @ObfuscatedName("dk.e")
    public int field1485;

    @ObfuscatedName("dk.b")
    public int field1482 = 0;

    @ObfuscatedName("dk.l")
    public double field1484 = 1.0D;

    @ObfuscatedName("dk.w")
    public int field1487 = 128;

    @ObfuscatedName("dk.d")
    public class250 field1488;

    public class114(class250 arg0, class250 arg1, int arg2, double arg3, int arg4) {
        this.field1488 = arg1;
        this.field1485 = arg2;
        this.field1482 = this.field1485;
        this.field1484 = arg3;
        this.field1487 = arg4;
        int[] var7 = arg0.method4278(0);
        int var8 = var7.length;
        this.field1486 = new class119[arg0.method4279(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class185 var10 = new class185(arg0.method4267(0, var7[var9]));
            this.field1486[var7[var9]] = new class119(var10);
        }
    }

    @ObfuscatedName("dk.f(B)I")
    public int method2353() {
        int var1 = 0;
        int var2 = 0;
        class119[] var3 = this.field1486;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class119 var5 = var3[var4];
            if (var5 != null && var5.field1579 != null) {
                var1 += var5.field1579.length;
                int[] var6 = var5.field1579;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1488.method4275(var8)) {
                        var2++;
                    }
                }
            }
        }
        if (var1 == 0) {
            return 0;
        } else {
            return var2 * 100 / var1;
        }
    }

    @ObfuscatedName("dk.h(D)V")
    public void method2372(double arg0) {
        this.field1484 = arg0;
        this.method2360();
    }

    @ObfuscatedName("dk.e(II)[I")
    public int[] method2366(int arg0) {
        class119 var2 = this.field1486[arg0];
        if (var2 != null) {
            if (var2.field1574 != null) {
                this.field1483.method3816(var2);
                var2.field1586 = true;
                return var2.field1574;
            }
            boolean var3 = var2.method2477(this.field1484, this.field1487, this.field1488);
            if (var3) {
                if (this.field1482 == 0) {
                    class119 var4 = (class119) this.field1483.method3819();
                    var4.method2475();
                } else {
                    this.field1482--;
                }
                this.field1483.method3816(var2);
                var2.field1586 = true;
                return var2.field1574;
            }
        }
        return null;
    }

    @ObfuscatedName("dk.b(IB)I")
    public int method2357(int arg0) {
        return this.field1486[arg0] == null ? 0 : this.field1486[arg0].field1577;
    }

    @ObfuscatedName("dk.l(II)Z")
    public boolean method2376(int arg0) {
        return this.field1486[arg0].field1578;
    }

    @ObfuscatedName("dk.w(IB)Z")
    public boolean method2359(int arg0) {
        return this.field1487 == 64;
    }

    @ObfuscatedName("dk.d(B)V")
    public void method2360() {
        for (int var1 = 0; var1 < this.field1486.length; var1++) {
            if (this.field1486[var1] != null) {
                this.field1486[var1].method2475();
            }
        }
        this.field1483 = new class208();
        this.field1482 = this.field1485;
    }

    @ObfuscatedName("dk.n(IB)V")
    public void method2361(int arg0) {
        for (int var2 = 0; var2 < this.field1486.length; var2++) {
            class119 var3 = this.field1486[var2];
            if (var3 != null && var3.field1583 != 0 && var3.field1586) {
                var3.method2476(arg0);
                var3.field1586 = false;
            }
        }
    }
}
