package deob;

@ObfuscatedName("dx")
public class class119 extends class323 {

    @ObfuscatedName("dx.v")
    public final boolean field1449;

    public class119(boolean arg0) {
        this.field1449 = arg0;
    }

    @ObfuscatedName("dx.v(Llv;Llv;I)I")
    public int method2236(class326 arg0, class326 arg1) {
        if (arg0.field3853 == arg1.field3853) {
            return this.method5244(arg0, arg1);
        } else if (this.field1449) {
            return arg0.field3853 - arg1.field3853;
        } else {
            return arg1.field3853 - arg0.field3853;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2236((class326) arg0, (class326) arg1);
    }
}
