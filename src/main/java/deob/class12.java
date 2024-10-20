package deob;

import java.io.IOException;

@ObfuscatedName("b")
public class class12 {

    @ObfuscatedName("b.j")
    public static int field190 = 2;

    @ObfuscatedName("b.f")
    public boolean field191;

    @ObfuscatedName("b.o")
    public boolean field192;

    public class12() {
        this.method120(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2037 == null) {
            this.method120(true);
        } else {
            int var2 = arg0.method2464();
            if (var2 >= 0 && var2 <= field190) {
                if (arg0.method2464() == 1) {
                    this.field191 = true;
                }
                if (var2 > 1) {
                    this.field192 = arg0.method2464() == 1;
                }
            } else {
                this.method120(true);
            }
        }
    }

    @ObfuscatedName("b.j(ZI)V")
    public void method120(boolean arg0) {
    }

    @ObfuscatedName("b.f(B)Ldq;")
    public class127 method128() {
        class127 var1 = new class127(100);
        var1.method2450(field190);
        var1.method2450(this.field191 ? 1 : 0);
        var1.method2450(this.field192 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("fj.o(I)Lb;")
    public static class12 method3195() {
        class29 var0 = null;
        class12 var1 = new class12();
        try {
            var0 = class82.method1388("", Statics.field475.field2088, false);
            byte[] var2 = new byte[(int) var0.method588()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method573(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class12(new class127(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method589();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("aw.h(I)V")
    public static void method238() {
        class29 var0 = null;
        try {
            var0 = class82.method1388("", Statics.field475.field2088, true);
            class127 var1 = Statics.field219.method128();
            var0.method570(var1.field2037, 0, var1.field2035);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method589();
            }
        } catch (Exception var4) {
        }
    }
}
