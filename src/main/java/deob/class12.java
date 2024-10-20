package deob;

import java.io.IOException;

@ObfuscatedName("i")
public class class12 {

    @ObfuscatedName("i.y")
    public static int field180 = 1;

    @ObfuscatedName("i.m")
    public boolean field183;

    public class12() {
        this.method107(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2037 == null) {
            this.method107(true);
        } else {
            int var2 = arg0.method2534();
            if (var2 < 0 || var2 > field180) {
                this.method107(true);
            } else if (arg0.method2534() == 1) {
                this.field183 = true;
            }
        }
    }

    @ObfuscatedName("i.y(ZI)V")
    public void method107(boolean arg0) {
    }

    @ObfuscatedName("i.m(I)Ldp;")
    public class127 method108() {
        class127 var1 = new class127(100);
        var1.method2444(field180);
        var1.method2444(this.field183 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("u.d(I)Li;")
    public static class12 method161() {
        class29 var0 = null;
        class12 var1 = new class12();
        try {
            var0 = class82.method160("", Statics.field2396.field2074, false);
            byte[] var2 = new byte[(int) var0.method545()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method546(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class12(new class127(var2));
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

    @ObfuscatedName("bh.k(I)V")
    public static void method1286() {
        class29 var0 = null;
        try {
            var0 = class82.method160("", Statics.field2396.field2074, true);
            class127 var1 = Statics.field277.method108();
            var0.method556(var1.field2037, 0, var1.field2036);
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
