package deob;

@ObfuscatedName("o")
public class class12 {

    @ObfuscatedName("o.j")
    public static int field184 = 1;

    @ObfuscatedName("o.r")
    public boolean field179;

    public class12() {
        this.method142(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2025 == null) {
            this.method142(true);
        } else {
            int var2 = arg0.method2441();
            if (var2 < 0 || var2 > field184) {
                this.method142(true);
            } else if (arg0.method2441() == 1) {
                this.field179 = true;
            }
        }
    }

    @ObfuscatedName("o.j(ZB)V")
    public void method142(boolean arg0) {
    }

    @ObfuscatedName("o.r(I)Ldn;")
    public class127 method136() {
        class127 var1 = new class127(100);
        var1.method2482(field184);
        var1.method2482(this.field179 ? 1 : 0);
        return var1;
    }
}
