package deob;

import java.io.IOException;

@ObfuscatedName("z")
public class class12 {

    @ObfuscatedName("z.b")
    public static int field197 = 2;

    @ObfuscatedName("z.e")
    public boolean field193;

    @ObfuscatedName("z.g")
    public boolean field196;

    public class12() {
        this.method101(true);
    }

    public class12(class126 arg0) {
        if (arg0 == null || arg0.field2026 == null) {
            this.method101(true);
        } else {
            int var2 = arg0.method2436();
            if (var2 >= 0 && var2 <= field197) {
                if (arg0.method2436() == 1) {
                    this.field193 = true;
                }
                if (var2 > 1) {
                    this.field196 = arg0.method2436() == 1;
                }
            } else {
                this.method101(true);
            }
        }
    }

    @ObfuscatedName("z.b(ZB)V")
    public void method101(boolean arg0) {
    }

    @ObfuscatedName("z.e(B)Ldv;")
    public class126 method102() {
        class126 var1 = new class126(100);
        var1.method2422(field197);
        var1.method2422(this.field193 ? 1 : 0);
        var1.method2422(this.field196 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("cr.g(B)Lz;")
    public static class12 method1597() {
        class29 var0 = null;
        class12 var1 = new class12();
        try {
            var0 = class82.method1508("", Statics.field470.field2093, false);
            byte[] var2 = new byte[(int) var0.method564()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method550(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class12(new class126(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method548();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ba.o(B)V")
    public static void method1350() {
        class29 var0 = null;
        try {
            var0 = class82.method1508("", Statics.field470.field2093, true);
            class126 var1 = Statics.field60.method102();
            var0.method545(var1.field2026, 0, var1.field2027);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method548();
            }
        } catch (Exception var4) {
        }
    }
}
