package deob;

import java.io.IOException;

@ObfuscatedName("z")
public class class101 {

    @ObfuscatedName("z.o")
    public boolean field1380;

    @ObfuscatedName("z.j")
    public static int field1383 = 2;

    @ObfuscatedName("z.p")
    public boolean field1381;

    public class101(class31 arg0) {
        if (arg0 == null || arg0.field168 == null) {
            this.method1479(true);
        } else {
            int var2 = arg0.method512();
            if (var2 >= 0 && var2 <= field1383) {
                if (arg0.method512() == 1) {
                    this.field1381 = true;
                }
                if (var2 > 1) {
                    this.field1380 = arg0.method512() == 1;
                }
            } else {
                this.method1479(true);
            }
        }
    }

    @ObfuscatedName("z.j(ZI)V")
    public void method1479(boolean arg0) {
    }

    public class101() {
        this.method1479(true);
    }

    @ObfuscatedName("z.p(I)Ldy;")
    public class31 method1483() {
        class31 var1 = new class31(100);
        var1.method357(field1383);
        var1.method357(this.field1381 ? 1 : 0);
        var1.method357(this.field1380 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("dp.t(B)V")
    public static void method748() {
        class170 var0 = null;
        try {
            var0 = class150.method3374("", Statics.field2657.field991, true);
            class31 var1 = Statics.field1855.method1483();
            var0.method3262(var1.field168, 0, var1.field172);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3278();
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("at.o(I)Lz;")
    public static class101 method3102() {
        class170 var0 = null;
        class101 var1 = new class101();
        try {
            var0 = class150.method3374("", Statics.field2657.field991, false);
            byte[] var2 = new byte[(int) var0.method3260()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3265(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class101(new class31(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3278();
            }
        } catch (Exception var7) {
        }
        return var1;
    }
}
