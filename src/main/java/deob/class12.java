package deob;

import java.io.IOException;

@ObfuscatedName("s")
public class class12 {

    @ObfuscatedName("s.b")
    public static int field217 = 2;

    @ObfuscatedName("s.c")
    public boolean field206;

    @ObfuscatedName("s.j")
    public boolean field216;

    public class12() {
        this.method129(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2056 == null) {
            this.method129(true);
        } else {
            int var2 = arg0.method2416();
            if (var2 >= 0 && var2 <= field217) {
                if (arg0.method2416() == 1) {
                    this.field206 = true;
                }
                if (var2 > 1) {
                    this.field216 = arg0.method2416() == 1;
                }
            } else {
                this.method129(true);
            }
        }
    }

    @ObfuscatedName("s.b(ZI)V")
    public void method129(boolean arg0) {
    }

    @ObfuscatedName("s.c(I)Ldv;")
    public class127 method133() {
        class127 var1 = new class127(100);
        var1.method2590(field217);
        var1.method2590(this.field206 ? 1 : 0);
        var1.method2590(this.field216 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("ai.j(B)Ls;")
    public static class12 method746() {
        class29 var0 = null;
        class12 var1 = new class12();
        try {
            var0 = class82.method2167("", Statics.field1217.field2117, false);
            byte[] var2 = new byte[(int) var0.method543()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method544(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class12(new class127(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method541();
            }
        } catch (Exception var7) {
        }
        return var1;
    }
}
