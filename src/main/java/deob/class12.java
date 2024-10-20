package deob;

@ObfuscatedName("h")
public class class12 {

    @ObfuscatedName("h.t")
    public static int field206 = 1;

    @ObfuscatedName("h.l")
    public boolean field208;

    public class12() {
        this.method132(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2061 == null) {
            this.method132(true);
        } else {
            int var2 = arg0.method2438();
            if (var2 < 0 || var2 > field206) {
                this.method132(true);
            } else if (arg0.method2438() == 1) {
                this.field208 = true;
            }
        }
    }

    @ObfuscatedName("h.t(ZB)V")
    public void method132(boolean arg0) {
    }

    @ObfuscatedName("h.l(B)Ldo;")
    public class127 method131() {
        class127 var1 = new class127(100);
        var1.method2424(field206);
        var1.method2424(this.field208 ? 1 : 0);
        return var1;
    }
}
