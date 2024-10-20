package deob;

@ObfuscatedName("ec")
public class class124 extends class434 {

    @ObfuscatedName("ec.au")
    public final boolean field1491;

    public class124(boolean arg0) {
        this.field1491 = arg0;
    }

    @ObfuscatedName("ec.au(Lqb;Lqb;I)I")
    public int method2794(class437 arg0, class437 arg1) {
        if (arg0.field4671 == 0 || arg1.field4671 == 0) {
            return this.method7262(arg0, arg1);
        } else if (this.field1491) {
            return arg0.method7250().method8912(arg1.method7250());
        } else {
            return arg1.method7250().method8912(arg0.method7250());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2794((class437) arg0, (class437) arg1);
    }
}
