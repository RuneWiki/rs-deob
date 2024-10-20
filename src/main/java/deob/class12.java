package deob;

@ObfuscatedName("s")
public class class12 {

    @ObfuscatedName("s.p")
    public static int field181 = 2;

    @ObfuscatedName("s.l")
    public boolean field173;

    @ObfuscatedName("s.d")
    public boolean field174;

    public class12() {
        this.method105(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2036 == null) {
            this.method105(true);
        } else {
            int var2 = arg0.method2498();
            if (var2 >= 0 && var2 <= field181) {
                if (arg0.method2498() == 1) {
                    this.field173 = true;
                }
                if (var2 > 1) {
                    this.field174 = arg0.method2498() == 1;
                }
            } else {
                this.method105(true);
            }
        }
    }

    @ObfuscatedName("s.p(ZB)V")
    public void method105(boolean arg0) {
    }

    @ObfuscatedName("s.l(B)Lds;")
    public class127 method106() {
        class127 var1 = new class127(100);
        var1.method2484(field181);
        var1.method2484(this.field173 ? 1 : 0);
        var1.method2484(this.field174 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("h.x(I)V")
    public static void method198() {
        class29 var0 = null;
        try {
            var0 = class82.method893("", Statics.field2019.field2082, true);
            class127 var1 = Statics.field948.method106();
            var0.method551(var1.field2036, 0, var1.field2030);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method556();
            }
        } catch (Exception var4) {
        }
    }
}
