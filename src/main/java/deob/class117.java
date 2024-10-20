package deob;

@ObfuscatedName("dd")
public class class117 extends class323 {

    @ObfuscatedName("dd.v")
    public final boolean field1436;

    public class117(boolean arg0) {
        this.field1436 = arg0;
    }

    @ObfuscatedName("dd.v(Llv;Llv;I)I")
    public int method2222(class326 arg0, class326 arg1) {
        if (arg0.field3853 == 0 || arg1.field3853 == 0) {
            return this.method5244(arg0, arg1);
        } else if (this.field1436) {
            return arg0.field3850 - arg1.field3850;
        } else {
            return arg1.field3850 - arg0.field3850;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2222((class326) arg0, (class326) arg1);
    }
}
