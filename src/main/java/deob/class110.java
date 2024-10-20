package deob;

@ObfuscatedName("dc")
public class class110 extends class339 {

    @ObfuscatedName("dc.i")
    public final boolean field1337;

    public class110(boolean arg0) {
        this.field1337 = arg0;
    }

    @ObfuscatedName("dc.i(Lmt;Lmt;B)I")
    public int method2369(class342 arg0, class342 arg1) {
        if (arg0.field3965 == 0 || arg1.field3965 == 0) {
            return this.method5491(arg0, arg1);
        } else if (this.field1337) {
            return arg0.method5471().method6815(arg1.method5471());
        } else {
            return arg1.method5471().method6815(arg0.method5471());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2369((class342) arg0, (class342) arg1);
    }
}
