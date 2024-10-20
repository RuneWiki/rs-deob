package deob;

@ObfuscatedName("cb")
public class class104 extends class339 {

    @ObfuscatedName("cb.i")
    public final boolean field1309;

    public class104(boolean arg0) {
        this.field1309 = arg0;
    }

    @ObfuscatedName("cb.i(Lmt;Lmt;I)I")
    public int method2329(class342 arg0, class342 arg1) {
        if (arg0.field3965 == 0 || arg1.field3965 == 0) {
            return this.method5491(arg0, arg1);
        } else if (this.field1309) {
            return arg0.field3966 - arg1.field3966;
        } else {
            return arg1.field3966 - arg0.field3966;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2329((class342) arg0, (class342) arg1);
    }
}
