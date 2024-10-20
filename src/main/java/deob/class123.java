package deob;

@ObfuscatedName("ek")
public class class123 extends class434 {

    @ObfuscatedName("ek.au")
    public final boolean field1487;

    public class123(boolean arg0) {
        this.field1487 = arg0;
    }

    @ObfuscatedName("ek.au(Lqb;Lqb;I)I")
    public int method2786(class437 arg0, class437 arg1) {
        if (arg0.field4672 == arg1.field4672) {
            return this.method7262(arg0, arg1);
        } else if (this.field1487) {
            return arg0.field4672 - arg1.field4672;
        } else {
            return arg1.field4672 - arg0.field4672;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2786((class437) arg0, (class437) arg1);
    }
}
