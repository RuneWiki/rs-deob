package deob;

@ObfuscatedName("df")
public class class106 extends class339 {

    @ObfuscatedName("df.i")
    public final boolean field1319;

    public class106(boolean arg0) {
        this.field1319 = arg0;
    }

    @ObfuscatedName("df.i(Lmt;Lmt;I)I")
    public int method2349(class342 arg0, class342 arg1) {
        if (arg0.field3965 == arg1.field3965) {
            return this.method5491(arg0, arg1);
        } else if (this.field1319) {
            return arg0.field3965 - arg1.field3965;
        } else {
            return arg1.field3965 - arg0.field3965;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2349((class342) arg0, (class342) arg1);
    }
}
