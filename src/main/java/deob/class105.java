package deob;

@ObfuscatedName("eg")
public class class105 extends class508 {

    @ObfuscatedName("eg.ag")
    public class187 field1375;

    @ObfuscatedName("eg.am")
    public class412 field1373 = new class412();

    public class105(class187 arg0) {
        this.field1375 = arg0;
    }

    @ObfuscatedName("eg.ac(IIIII)V")
    public void method2725(int arg0, int arg1, int arg2, int arg3) {
        class101 var5 = null;
        int var6 = 0;
        for (class101 var7 = (class101) this.field1373.method7126(); var7 != null; var7 = (class101) this.field1373.method7084()) {
            var6++;
            if (var7.field1306 == arg0) {
                var7.method2553(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1306 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class412.method7088(new class101(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1373.method7126().method8362();
            }
        } else if (var6 < 4) {
            this.field1373.method7070(new class101(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("eg.ae(IB)Lds;")
    public class101 method2728(int arg0) {
        class101 var2 = (class101) this.field1373.method7126();
        if (var2 == null || var2.field1306 > arg0) {
            return null;
        }
        for (class101 var3 = (class101) this.field1373.method7084(); var3 != null && var3.field1306 <= arg0; var3 = (class101) this.field1373.method7084()) {
            var2.method8362();
            var2 = var3;
        }
        if (this.field1375.field1952 + var2.field1306 + var2.field1303 > arg0) {
            return var2;
        } else {
            var2.method8362();
            return null;
        }
    }

    @ObfuscatedName("eg.ag(B)Z")
    public boolean method2734() {
        return this.field1373.method7075();
    }
}
