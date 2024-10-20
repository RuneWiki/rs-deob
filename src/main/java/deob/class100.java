package deob;

@ObfuscatedName("dv")
public class class100 extends class474 {

    @ObfuscatedName("dv.ar")
    public class191 field1304;

    @ObfuscatedName("dv.am")
    public class381 field1306 = new class381();

    public class100(class191 arg0) {
        this.field1304 = arg0;
    }

    @ObfuscatedName("dv.aw(IIIIB)V")
    public void method2475(int arg0, int arg1, int arg2, int arg3) {
        class97 var5 = null;
        int var6 = 0;
        for (class97 var7 = (class97) this.field1306.method6419(); var7 != null; var7 = (class97) this.field1306.method6421()) {
            var6++;
            if (var7.field1265 == arg0) {
                var7.method2315(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1265 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class381.method6418(new class97(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1306.method6419().method7662();
            }
        } else if (var6 < 4) {
            this.field1306.method6417(new class97(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("dv.ay(II)Ldp;")
    public class97 method2469(int arg0) {
        class97 var2 = (class97) this.field1306.method6419();
        if (var2 == null || var2.field1265 > arg0) {
            return null;
        }
        for (class97 var3 = (class97) this.field1306.method6421(); var3 != null && var3.field1265 <= arg0; var3 = (class97) this.field1306.method6421()) {
            var2.method7662();
            var2 = var3;
        }
        if (this.field1304.field1962 + var2.field1265 + var2.field1262 > arg0) {
            return var2;
        } else {
            var2.method7662();
            return null;
        }
    }

    @ObfuscatedName("dv.ar(I)Z")
    public boolean method2470() {
        return this.field1306.method6423();
    }
}
