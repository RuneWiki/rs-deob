package deob;

@ObfuscatedName("z")
public class class12 {

    @ObfuscatedName("z.a")
    public static int field182 = 1;

    @ObfuscatedName("z.x")
    public boolean field181;

    public class12() {
        this.method148(true);
    }

    public class12(class127 arg0) {
        if (arg0 == null || arg0.field2036 == null) {
            this.method148(true);
        } else {
            int var2 = arg0.method2411();
            if (var2 < 0 || var2 > field182) {
                this.method148(true);
            } else if (arg0.method2411() == 1) {
                this.field181 = true;
            }
        }
    }

    @ObfuscatedName("z.a(ZB)V")
    public void method148(boolean arg0) {
    }

    @ObfuscatedName("z.x(I)Ldy;")
    public class127 method150() {
        class127 var1 = new class127(100);
        var1.method2455(field182);
        var1.method2455(this.field181 ? 1 : 0);
        return var1;
    }
}
