package deob;

import java.io.IOException;

@ObfuscatedName("s")
public class class12 {

    @ObfuscatedName("s.f")
    public static int field176 = 2;

    @ObfuscatedName("s.t")
    public boolean field177;

    @ObfuscatedName("s.n")
    public boolean field178;

    public class12() {
        this.method120(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2030 == null) {
            this.method120(true);
        } else {
            int var2 = arg0.method2458();
            if (var2 >= 0 && var2 <= field176) {
                if (arg0.method2458() == 1) {
                    this.field177 = true;
                }
                if (var2 > 1) {
                    this.field178 = arg0.method2458() == 1;
                }
            } else {
                this.method120(true);
            }
        }
    }

    @ObfuscatedName("s.f(ZI)V")
    public void method120(boolean arg0) {
    }

    @ObfuscatedName("s.t(I)Ldq;")
    public class127 method121() {
        class127 var1 = new class127(100);
        var1.method2536(field176);
        var1.method2536(this.field177 ? 1 : 0);
        var1.method2536(this.field178 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("bl.n(I)Ls;")
    public static class12 method1430() {
        class29 var0 = null;
        class12 var1 = new class12();
        try {
            var0 = class82.method693("", Statics.field461.field2084, false);
            byte[] var2 = new byte[(int) var0.method556()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method557(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class12(new class127(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method555();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ak.e(I)V")
    public static void method1181() {
        class29 var0 = null;
        try {
            var0 = class82.method693("", Statics.field461.field2084, true);
            class127 var1 = Statics.field65.method121();
            var0.method554(var1.field2030, 0, var1.field2033);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method555();
            }
        } catch (Exception var4) {
        }
    }
}
