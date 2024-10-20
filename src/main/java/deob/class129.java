package deob;

@ObfuscatedName("dk")
public class class129 implements class149 {

    @ObfuscatedName("dk.h")
    public class134[] field1547;

    @ObfuscatedName("dk.v")
    public class273 field1550 = new class273();

    @ObfuscatedName("dk.x")
    public int field1543;

    @ObfuscatedName("dk.w")
    public int field1545 = 0;

    @ObfuscatedName("dk.t")
    public double field1546 = 1.0D;

    @ObfuscatedName("dk.j")
    public int field1544 = 128;

    @ObfuscatedName("dk.n")
    public class245 field1548;

    public class129(class245 arg0, class245 arg1, int arg2, double arg3, int arg4) {
        this.field1548 = arg1;
        this.field1543 = arg2;
        this.field1545 = this.field1543;
        this.field1546 = arg3;
        this.field1544 = arg4;
        int[] var7 = arg0.method3845(0);
        int var8 = var7.length;
        this.field1547 = new class134[arg0.method3846(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class311 var10 = new class311(arg0.method3834(0, var7[var9]));
            this.field1547[var7[var9]] = new class134(var10);
        }
    }

    @ObfuscatedName("dk.h(I)I")
    public int method2586() {
        int var1 = 0;
        int var2 = 0;
        class134[] var3 = this.field1547;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class134 var5 = var3[var4];
            if (var5 != null && var5.field1642 != null) {
                var1 += var5.field1642.length;
                int[] var6 = var5.field1642;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field1548.method3837(var8)) {
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

    @ObfuscatedName("dk.v(D)V")
    public void method2587(double arg0) {
        this.field1546 = arg0;
        this.method2591();
    }

    @ObfuscatedName("dk.x(II)[I")
    public int[] method2588(int arg0) {
        class134 var2 = this.field1547[arg0];
        if (var2 != null) {
            if (var2.field1648 != null) {
                this.field1550.method4539(var2);
                var2.field1636 = true;
                return var2.field1648;
            }
            boolean var3 = var2.method2706(this.field1546, this.field1544, this.field1548);
            if (var3) {
                if (this.field1545 == 0) {
                    class134 var4 = (class134) this.field1550.method4542();
                    var4.method2707();
                } else {
                    this.field1545--;
                }
                this.field1550.method4539(var2);
                var2.field1636 = true;
                return var2.field1648;
            }
        }
        return null;
    }

    @ObfuscatedName("dk.w(II)I")
    public int method2589(int arg0) {
        return this.field1547[arg0] == null ? 0 : this.field1547[arg0].field1639;
    }

    @ObfuscatedName("dk.t(II)Z")
    public boolean method2590(int arg0) {
        return this.field1547[arg0].field1641;
    }

    @ObfuscatedName("dk.j(II)Z")
    public boolean method2619(int arg0) {
        return this.field1544 == 64;
    }

    @ObfuscatedName("dk.n(B)V")
    public void method2591() {
        for (int var1 = 0; var1 < this.field1547.length; var1++) {
            if (this.field1547[var1] != null) {
                this.field1547[var1].method2707();
            }
        }
        this.field1550 = new class273();
        this.field1545 = this.field1543;
    }

    @ObfuscatedName("dk.p(II)V")
    public void method2592(int arg0) {
        for (int var2 = 0; var2 < this.field1547.length; var2++) {
            class134 var3 = this.field1547[var2];
            if (var3 != null && var3.field1646 != 0 && var3.field1636) {
                var3.method2708(arg0);
                var3.field1636 = false;
            }
        }
    }
}
