package deob;

@ObfuscatedName("m")
public class class12 {

    @ObfuscatedName("m.l")
    public static int field181 = 2;

    @ObfuscatedName("m.b")
    public boolean field173;

    @ObfuscatedName("m.o")
    public boolean field182;

    public class12() {
        this.method121(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2024 == null) {
            this.method121(true);
        } else {
            int var2 = arg0.method2440();
            if (var2 >= 0 && var2 <= field181) {
                if (arg0.method2440() == 1) {
                    this.field173 = true;
                }
                if (var2 > 1) {
                    this.field182 = arg0.method2440() == 1;
                }
            } else {
                this.method121(true);
            }
        }
    }

    @ObfuscatedName("m.l(ZI)V")
    public void method121(boolean arg0) {
    }

    @ObfuscatedName("m.b(I)Ldm;")
    public class127 method120() {
        class127 var1 = new class127(100);
        var1.method2493(field181);
        var1.method2493(this.field173 ? 1 : 0);
        var1.method2493(this.field182 ? 1 : 0);
        return var1;
    }
}
