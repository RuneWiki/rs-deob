package deob;

@ObfuscatedName("de")
public class class100 extends class485 {

    @ObfuscatedName("de.ar")
    public class181 field1304;

    @ObfuscatedName("de.ao")
    public class392 field1301 = new class392();

    public class100(class181 arg0) {
        this.field1304 = arg0;
    }

    @ObfuscatedName("de.at(IIIIB)V")
    public void method2519(int arg0, int arg1, int arg2, int arg3) {
        class97 var5 = null;
        int var6 = 0;
        for (class97 var7 = (class97) this.field1301.method6604(); var7 != null; var7 = (class97) this.field1301.method6606()) {
            var6++;
            if (var7.field1250 == arg0) {
                var7.method2372(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1250 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class392.method6661(new class97(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1301.method6604().method7828();
            }
        } else if (var6 < 4) {
            this.field1301.method6602(new class97(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("de.ah(II)Ldv;")
    public class97 method2520(int arg0) {
        class97 var2 = (class97) this.field1301.method6604();
        if (var2 == null || var2.field1250 > arg0) {
            return null;
        }
        for (class97 var3 = (class97) this.field1301.method6606(); var3 != null && var3.field1250 <= arg0; var3 = (class97) this.field1301.method6606()) {
            var2.method7828();
            var2 = var3;
        }
        if (this.field1304.field1876 + var2.field1253 + var2.field1250 > arg0) {
            return var2;
        } else {
            var2.method7828();
            return null;
        }
    }

    @ObfuscatedName("de.ar(I)Z")
    public boolean method2524() {
        return this.field1301.method6666();
    }
}
