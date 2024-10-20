package deob;

@ObfuscatedName("a")
public class class12 {

    @ObfuscatedName("a.i")
    public static int field198 = 2;

    @ObfuscatedName("a.v")
    public boolean field203;

    @ObfuscatedName("a.m")
    public boolean field197;

    public class12() {
        this.method105(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2041 == null) {
            this.method105(true);
        } else {
            int var2 = arg0.method2491();
            if (var2 >= 0 && var2 <= field198) {
                if (arg0.method2491() == 1) {
                    this.field203 = true;
                }
                if (var2 > 1) {
                    this.field197 = arg0.method2491() == 1;
                }
            } else {
                this.method105(true);
            }
        }
    }

    @ObfuscatedName("a.i(ZI)V")
    public void method105(boolean arg0) {
    }

    @ObfuscatedName("a.v(B)Lda;")
    public class127 method111() {
        class127 var1 = new class127(100);
        var1.method2477(field198);
        var1.method2477(this.field203 ? 1 : 0);
        var1.method2477(this.field197 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("v.m(I)V")
    public static void method6() {
        class29 var0 = null;
        try {
            var0 = class82.method1261("", Statics.field483.field2079, true);
            class127 var1 = Statics.field193.method111();
            var0.method579(var1.field2041, 0, var1.field2039);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method572();
            }
        } catch (Exception var4) {
        }
    }
}
