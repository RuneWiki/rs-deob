package deob;

@ObfuscatedName("b")
public class class12 {

    @ObfuscatedName("b.q")
    public static int field184 = 2;

    @ObfuscatedName("b.c")
    public boolean field183;

    @ObfuscatedName("b.p")
    public boolean field188;

    public class12() {
        this.method107(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2042 == null) {
            this.method107(true);
        } else {
            int var2 = arg0.method2534();
            if (var2 >= 0 && var2 <= field184) {
                if (arg0.method2534() == 1) {
                    this.field183 = true;
                }
                if (var2 > 1) {
                    this.field188 = arg0.method2534() == 1;
                }
            } else {
                this.method107(true);
            }
        }
    }

    @ObfuscatedName("b.q(ZI)V")
    public void method107(boolean arg0) {
    }

    @ObfuscatedName("b.c(I)Ldo;")
    public class127 method105() {
        class127 var1 = new class127(100);
        var1.method2411(field184);
        var1.method2411(this.field183 ? 1 : 0);
        var1.method2411(this.field188 ? 1 : 0);
        return var1;
    }
}
