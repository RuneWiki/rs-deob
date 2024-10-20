package deob;

@ObfuscatedName("dn")
public class class123 extends class323 {

    @ObfuscatedName("dn.v")
    public final boolean field1466;

    public class123(boolean arg0) {
        this.field1466 = arg0;
    }

    @ObfuscatedName("dn.v(Llv;Llv;I)I")
    public int method2275(class326 arg0, class326 arg1) {
        if (arg0.field3853 == 0 || arg1.field3853 == 0) {
            return this.method5244(arg0, arg1);
        } else if (this.field1466) {
            return arg0.method5229().method5341(arg1.method5229());
        } else {
            return arg1.method5229().method5341(arg0.method5229());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2275((class326) arg0, (class326) arg1);
    }
}
