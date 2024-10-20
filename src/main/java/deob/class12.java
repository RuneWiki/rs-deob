package deob;

import java.io.IOException;

@ObfuscatedName("m")
public class class12 {

    @ObfuscatedName("m.i")
    public static int field185 = 2;

    @ObfuscatedName("m.b")
    public boolean field181;

    @ObfuscatedName("m.r")
    public boolean field182;

    public class12() {
        this.method118(true);
    }

    public class12(class128 arg0) {
        if (arg0 == null || arg0.field2050 == null) {
            this.method118(true);
        } else {
            int var2 = arg0.method2531();
            if (var2 >= 0 && var2 <= field185) {
                if (arg0.method2531() == 1) {
                    this.field181 = true;
                }
                if (var2 > 1) {
                    this.field182 = arg0.method2531() == 1;
                }
            } else {
                this.method118(true);
            }
        }
    }

    @ObfuscatedName("m.i(ZI)V")
    public void method118(boolean arg0) {
    }

    @ObfuscatedName("m.b(I)Lds;")
    public class128 method119() {
        class128 var1 = new class128(100);
        var1.method2449(field185);
        var1.method2449(this.field181 ? 1 : 0);
        var1.method2449(this.field182 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("ax.r(S)Lm;")
    public static class12 method566() {
        class30 var0 = null;
        class12 var1 = new class12();
        try {
            var0 = class83.method1541("", Statics.field631.field2116, false);
            byte[] var2 = new byte[(int) var0.method573()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method574(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class12(new class128(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method572();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("d.l(I)V")
    public static void method38() {
        class30 var0 = null;
        try {
            var0 = class83.method1541("", Statics.field631.field2116, true);
            class128 var1 = Statics.field247.method119();
            var0.method571(var1.field2050, 0, var1.field2048);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method572();
            }
        } catch (Exception var4) {
        }
    }
}
