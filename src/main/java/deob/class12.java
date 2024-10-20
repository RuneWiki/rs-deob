package deob;

@ObfuscatedName("p")
public class class12 {

    @ObfuscatedName("p.e")
    public static int field199 = 2;

    @ObfuscatedName("p.i")
    public boolean field195;

    @ObfuscatedName("p.k")
    public boolean field196;

    public class12() {
        this.method133(true);
    }

    public class12(class128 arg0) {
        if (arg0 == null || arg0.field2043 == null) {
            this.method133(true);
        } else {
            int var2 = arg0.method2548();
            if (var2 >= 0 && var2 <= field199) {
                if (arg0.method2548() == 1) {
                    this.field195 = true;
                }
                if (var2 > 1) {
                    this.field196 = arg0.method2548() == 1;
                }
            } else {
                this.method133(true);
            }
        }
    }

    @ObfuscatedName("p.e(ZS)V")
    public void method133(boolean arg0) {
    }

    @ObfuscatedName("p.i(B)Ldl;")
    public class128 method134() {
        class128 var1 = new class128(100);
        var1.method2634(field199);
        var1.method2634(this.field195 ? 1 : 0);
        var1.method2634(this.field196 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("bc.k(I)V")
    public static void method1540() {
        class30 var0 = null;
        try {
            var0 = class83.method1635("", Statics.field87.field2102, true);
            class128 var1 = Statics.field197.method134();
            var0.method597(var1.field2043, 0, var1.field2045);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method598();
            }
        } catch (Exception var4) {
        }
    }
}
