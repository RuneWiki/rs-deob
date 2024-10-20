package deob;

@ObfuscatedName("f")
public class class12 {

    @ObfuscatedName("f.i")
    public static int field199 = 2;

    @ObfuscatedName("f.p")
    public boolean field203;

    @ObfuscatedName("f.a")
    public boolean field201;

    public class12() {
        this.method123(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2039 == null) {
            this.method123(true);
        } else {
            int var2 = arg0.method2411();
            if (var2 >= 0 && var2 <= field199) {
                if (arg0.method2411() == 1) {
                    this.field203 = true;
                }
                if (var2 > 1) {
                    this.field201 = arg0.method2411() == 1;
                }
            } else {
                this.method123(true);
            }
        }
    }

    @ObfuscatedName("f.i(ZB)V")
    public void method123(boolean arg0) {
    }

    @ObfuscatedName("f.p(I)Ldn;")
    public class127 method124() {
        class127 var1 = new class127(100);
        var1.method2397(field199);
        var1.method2397(this.field203 ? 1 : 0);
        var1.method2397(this.field201 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("eq.a(I)V")
    public static void method2917() {
        class29 var0 = null;
        try {
            var0 = Statics.method1323("", Statics.field484.field2081, true);
            class127 var1 = Statics.field1048.method124();
            var0.method550(var1.field2039, 0, var1.field2037);
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
