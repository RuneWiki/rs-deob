package deob;

@ObfuscatedName("dq")
public class class105 extends class339 {

    @ObfuscatedName("dq.i")
    public final boolean field1314;

    public class105(boolean arg0) {
        this.field1314 = arg0;
    }

    @ObfuscatedName("dq.i(Lmt;Lmt;I)I")
    public int method2337(class342 arg0, class342 arg1) {
        if (arg0.field3965 == 0) {
            if (arg1.field3965 != 0) {
                return this.field1314 ? 1 : -1;
            }
        } else if (arg1.field3965 == 0) {
            return this.field1314 ? -1 : 1;
        }
        return this.method5491(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2337((class342) arg0, (class342) arg1);
    }
}
