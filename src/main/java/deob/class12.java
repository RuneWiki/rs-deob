package deob;

import java.io.IOException;

@ObfuscatedName("w")
public class class12 {

    @ObfuscatedName("w.p")
    public static int field188 = 2;

    @ObfuscatedName("w.e")
    public boolean field187;

    @ObfuscatedName("w.a")
    public boolean field183;

    public class12() {
        this.method127(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2033 == null) {
            this.method127(true);
        } else {
            int var2 = arg0.method2494();
            if (var2 >= 0 && var2 <= field188) {
                if (arg0.method2494() == 1) {
                    this.field187 = true;
                }
                if (var2 > 1) {
                    this.field183 = arg0.method2494() == 1;
                }
            } else {
                this.method127(true);
            }
        }
    }

    @ObfuscatedName("w.p(ZI)V")
    public void method127(boolean arg0) {
    }

    @ObfuscatedName("w.e(I)Ldj;")
    public class127 method128() {
        class127 var1 = new class127(100);
        var1.method2657(field188);
        var1.method2657(this.field187 ? 1 : 0);
        var1.method2657(this.field183 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("o.a(I)Lw;")
    public static class12 method223() {
        class29 var0 = null;
        class12 var1 = new class12();
        try {
            var0 = class82.method1392("", Statics.field660.field2091, false);
            byte[] var2 = new byte[(int) var0.method583()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method578(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class12(new class127(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method559();
            }
        } catch (Exception var7) {
        }
        return var1;
    }
}
