package deob;

@ObfuscatedName("d")
public class class12 {

    @ObfuscatedName("d.p")
    public static int field181 = 1;

    @ObfuscatedName("d.i")
    public boolean field180;

    public class12() {
        this.method127(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2037 == null) {
            this.method127(true);
        } else {
            int var2 = arg0.method2659();
            if (var2 < 0 || var2 > field181) {
                this.method127(true);
            } else if (arg0.method2659() == 1) {
                this.field180 = true;
            }
        }
    }

    @ObfuscatedName("d.p(ZI)V")
    public void method127(boolean arg0) {
    }

    @ObfuscatedName("d.i(I)Ldt;")
    public class127 method129() {
        class127 var1 = new class127(100);
        var1.method2474(field181);
        var1.method2474(this.field180 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("cw.o(B)V")
    public static void method1677() {
        class29 var0 = null;
        try {
            var0 = class82.method228("", Statics.field261.field2080, true);
            class127 var1 = Statics.field380.method129();
            var0.method579(var1.field2037, 0, var1.field2038);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method594();
            }
        } catch (Exception var4) {
        }
    }
}
