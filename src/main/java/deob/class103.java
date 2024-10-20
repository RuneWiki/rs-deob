package deob;

@ObfuscatedName("dp")
public class class103 extends class504 {

    @ObfuscatedName("dp.aj")
    public class202 field1356;

    @ObfuscatedName("dp.az")
    public class408 field1357 = new class408();

    public class103(class202 arg0) {
        this.field1356 = arg0;
    }

    @ObfuscatedName("dp.ak(IIIIB)V")
    public void method2529(int arg0, int arg1, int arg2, int arg3) {
        class99 var5 = null;
        int var6 = 0;
        for (class99 var7 = (class99) this.field1357.method6889(); var7 != null; var7 = (class99) this.field1357.method6926()) {
            var6++;
            if (var7.field1289 == arg0) {
                var7.method2348(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1289 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class408.method6888(new class99(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1357.method6889().method8189();
            }
        } else if (var6 < 4) {
            this.field1357.method6898(new class99(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("dp.al(IB)Ldy;")
    public class99 method2530(int arg0) {
        class99 var2 = (class99) this.field1357.method6889();
        if (var2 == null || var2.field1289 > arg0) {
            return null;
        }
        for (class99 var3 = (class99) this.field1357.method6926(); var3 != null && var3.field1289 <= arg0; var3 = (class99) this.field1357.method6926()) {
            var2.method8189();
            var2 = var3;
        }
        if (this.field1356.field2058 + var2.field1291 + var2.field1289 > arg0) {
            return var2;
        } else {
            var2.method8189();
            return null;
        }
    }

    @ObfuscatedName("dp.aj(I)Z")
    public boolean method2528() {
        return this.field1357.method6914();
    }
}
