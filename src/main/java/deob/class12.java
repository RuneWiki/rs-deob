package deob;

import java.io.IOException;

@ObfuscatedName("z")
public class class12 {

    @ObfuscatedName("z.i")
    public static int field186 = 2;

    @ObfuscatedName("z.w")
    public boolean field187;

    @ObfuscatedName("z.f")
    public boolean field190;

    public class12() {
        this.method133(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2049 == null) {
            this.method133(true);
        } else {
            int var2 = arg0.method2472();
            if (var2 >= 0 && var2 <= field186) {
                if (arg0.method2472() == 1) {
                    this.field187 = true;
                }
                if (var2 > 1) {
                    this.field190 = arg0.method2472() == 1;
                }
            } else {
                this.method133(true);
            }
        }
    }

    @ObfuscatedName("z.i(ZB)V")
    public void method133(boolean arg0) {
    }

    @ObfuscatedName("z.w(B)Ldz;")
    public class127 method136() {
        class127 var1 = new class127(100);
        var1.method2438(field186);
        var1.method2438(this.field187 ? 1 : 0);
        var1.method2438(this.field190 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("eb.f(B)Lz;")
    public static class12 method2659() {
        class29 var0 = null;
        class12 var1 = new class12();
        try {
            var0 = class82.method111("", Statics.field485.field2084, false);
            byte[] var2 = new byte[(int) var0.method555()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method561(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class12(new class127(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method563();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("v.e(I)V")
    public static void method174() {
        class29 var0 = null;
        try {
            var0 = class82.method111("", Statics.field485.field2084, true);
            class127 var1 = Statics.field156.method136();
            var0.method551(var1.field2049, 0, var1.field2045);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method563();
            }
        } catch (Exception var4) {
        }
    }
}
