package deob;

import java.io.IOException;

@ObfuscatedName("m")
public class class12 {

    @ObfuscatedName("m.c")
    public static int field200 = 2;

    @ObfuscatedName("m.q")
    public boolean field191;

    @ObfuscatedName("m.y")
    public boolean field192;

    public class12() {
        this.method108(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2057 == null) {
            this.method108(true);
        } else {
            int var2 = arg0.method2383();
            if (var2 >= 0 && var2 <= field200) {
                if (arg0.method2383() == 1) {
                    this.field191 = true;
                }
                if (var2 > 1) {
                    this.field192 = arg0.method2383() == 1;
                }
            } else {
                this.method108(true);
            }
        }
    }

    @ObfuscatedName("m.c(ZI)V")
    public void method108(boolean arg0) {
    }

    @ObfuscatedName("m.q(S)Ldg;")
    public class127 method113() {
        class127 var1 = new class127(100);
        var1.method2333(field200);
        var1.method2333(this.field191 ? 1 : 0);
        var1.method2333(this.field192 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("cb.y(B)Lm;")
    public static class12 method1959() {
        class29 var0 = null;
        class12 var1 = new class12();
        try {
            var0 = class82.method1326("", Statics.field714.field2109, false);
            byte[] var2 = new byte[(int) var0.method529()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method551(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class12(new class127(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method528();
            }
        } catch (Exception var7) {
        }
        return var1;
    }
}
