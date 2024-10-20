package deob;

@ObfuscatedName("db")
public class class102 extends class488 {

    @ObfuscatedName("db.ak")
    public class198 field1310;

    @ObfuscatedName("db.ax")
    public class395 field1312 = new class395();

    public class102(class198 arg0) {
        this.field1310 = arg0;
    }

    @ObfuscatedName("db.ac(IIIII)V")
    public void method2490(int arg0, int arg1, int arg2, int arg3) {
        class99 var5 = null;
        int var6 = 0;
        for (class99 var7 = (class99) this.field1312.method6577(); var7 != null; var7 = (class99) this.field1312.method6623()) {
            var6++;
            if (var7.field1269 == arg0) {
                var7.method2342(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1269 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class395.method6576(new class99(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1312.method6577().method7776();
            }
        } else if (var6 < 4) {
            this.field1312.method6591(new class99(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("db.al(IB)Ldt;")
    public class99 method2497(int arg0) {
        class99 var2 = (class99) this.field1312.method6577();
        if (var2 == null || var2.field1269 > arg0) {
            return null;
        }
        for (class99 var3 = (class99) this.field1312.method6623(); var3 != null && var3.field1269 <= arg0; var3 = (class99) this.field1312.method6623()) {
            var2.method7776();
            var2 = var3;
        }
        if (this.field1310.field1985 + var2.field1270 + var2.field1269 > arg0) {
            return var2;
        } else {
            var2.method7776();
            return null;
        }
    }

    @ObfuscatedName("db.ak(I)Z")
    public boolean method2492() {
        return this.field1312.method6581();
    }
}
