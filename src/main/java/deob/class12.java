package deob;

@ObfuscatedName("b")
public class class12 {

    @ObfuscatedName("b.g")
    public static int field180 = 2;

    @ObfuscatedName("b.m")
    public boolean field178;

    @ObfuscatedName("b.v")
    public boolean field177;

    public class12() {
        this.method117(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2028 == null) {
            this.method117(true);
        } else {
            int var2 = arg0.method2414();
            if (var2 >= 0 && var2 <= field180) {
                if (arg0.method2414() == 1) {
                    this.field178 = true;
                }
                if (var2 > 1) {
                    this.field177 = arg0.method2414() == 1;
                }
            } else {
                this.method117(true);
            }
        }
    }

    @ObfuscatedName("b.g(ZI)V")
    public void method117(boolean arg0) {
    }

    @ObfuscatedName("b.m(I)Ldr;")
    public class127 method109() {
        class127 var1 = new class127(100);
        var1.method2498(field180);
        var1.method2498(this.field178 ? 1 : 0);
        var1.method2498(this.field177 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("em.v(I)V")
    public static void method2818() {
        class29 var0 = null;
        try {
            var0 = class82.method11("", Statics.field167.field2061, true);
            class127 var1 = Statics.field2014.method109();
            var0.method543(var1.field2028, 0, var1.field2023);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method544();
            }
        } catch (Exception var4) {
        }
    }
}
