package deob;

import java.io.IOException;

@ObfuscatedName("c")
public class class12 {

    @ObfuscatedName("c.x")
    public static int field181 = 1;

    @ObfuscatedName("c.p")
    public boolean field177;

    public class12() {
        this.method123(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2015 == null) {
            this.method123(true);
        } else {
            int var2 = arg0.method2484();
            if (var2 < 0 || var2 > field181) {
                this.method123(true);
            } else if (arg0.method2484() == 1) {
                this.field177 = true;
            }
        }
    }

    @ObfuscatedName("c.x(ZI)V")
    public void method123(boolean arg0) {
    }

    @ObfuscatedName("c.p(B)Ldg;")
    public class127 method113() {
        class127 var1 = new class127(100);
        var1.method2396(field181);
        var1.method2396(this.field177 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("aj.k(B)Lc;")
    public static class12 method610() {
        class29 var0 = null;
        class12 var1 = new class12();
        try {
            var0 = class82.method2299("", Statics.field1158.field2050, false);
            byte[] var2 = new byte[(int) var0.method527()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method524(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class12(new class127(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method526();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("v.a(I)V")
    public static void method49() {
        class29 var0 = null;
        try {
            var0 = class82.method2299("", Statics.field1158.field2050, true);
            class127 var1 = Statics.field1825.method113();
            var0.method525(var1.field2015, 0, var1.field2008);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method526();
            }
        } catch (Exception var4) {
        }
    }
}
