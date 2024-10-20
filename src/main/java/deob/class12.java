package deob;

@ObfuscatedName("b")
public class class12 {

    @ObfuscatedName("b.d")
    public static int field184 = 1;

    @ObfuscatedName("b.g")
    public boolean field185;

    public class12() {
        this.method124(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2035 == null) {
            this.method124(true);
        } else {
            int var2 = arg0.method2509();
            if (var2 < 0 || var2 > field184) {
                this.method124(true);
            } else if (arg0.method2509() == 1) {
                this.field185 = true;
            }
        }
    }

    @ObfuscatedName("b.d(ZB)V")
    public void method124(boolean arg0) {
    }

    @ObfuscatedName("b.g(I)Ldo;")
    public class127 method116() {
        class127 var1 = new class127(100);
        var1.method2386(field184);
        var1.method2386(this.field185 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("ai.a(B)V")
    public static void method652() {
        class29 var0 = null;
        try {
            var0 = class82.method1499("", Statics.field463.field2073, true);
            class127 var1 = Statics.field97.method116();
            var0.method549(var1.field2035, 0, var1.field2042);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method532();
            }
        } catch (Exception var4) {
        }
    }
}
