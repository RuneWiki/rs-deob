package deob;

@ObfuscatedName("p")
public class class12 {

    @ObfuscatedName("p.a")
    public static int field180 = 2;

    @ObfuscatedName("p.r")
    public boolean field173;

    @ObfuscatedName("p.u")
    public boolean field174;

    public class12() {
        this.method96(true);
    }

    public class12(class126 arg0) {
        if (arg0 == null || arg0.field2015 == null) {
            this.method96(true);
        } else {
            int var2 = arg0.method2481();
            if (var2 >= 0 && var2 <= field180) {
                if (arg0.method2481() == 1) {
                    this.field173 = true;
                }
                if (var2 > 1) {
                    this.field174 = arg0.method2481() == 1;
                }
            } else {
                this.method96(true);
            }
        }
    }

    @ObfuscatedName("p.a(ZS)V")
    public void method96(boolean arg0) {
    }

    @ObfuscatedName("p.r(I)Ldf;")
    public class126 method106() {
        class126 var1 = new class126(100);
        var1.method2364(field180);
        var1.method2364(this.field173 ? 1 : 0);
        var1.method2364(this.field174 ? 1 : 0);
        return var1;
    }
}
