package deob;

@ObfuscatedName("ei")
public class class118 extends class434 {

    @ObfuscatedName("ei.au")
    public final boolean field1472;

    public class118(boolean arg0) {
        this.field1472 = arg0;
    }

    @ObfuscatedName("ei.au(Lqb;Lqb;I)I")
    public int method2754(class437 arg0, class437 arg1) {
        if (arg0.field4671 == 0 || arg1.field4671 == 0) {
            return this.method7262(arg0, arg1);
        } else if (this.field1472) {
            return arg0.field4670 - arg1.field4670;
        } else {
            return arg1.field4670 - arg0.field4670;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2754((class437) arg0, (class437) arg1);
    }
}
