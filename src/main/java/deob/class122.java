package deob;

@ObfuscatedName("ef")
public class class122 extends class434 {

    @ObfuscatedName("ef.au")
    public final boolean field1482;

    public class122(boolean arg0) {
        this.field1482 = arg0;
    }

    @ObfuscatedName("ef.au(Lqb;Lqb;I)I")
    public int method2779(class437 arg0, class437 arg1) {
        if (client.field527 == arg0.field4671 && client.field527 == arg1.field4671) {
            return this.field1482 ? arg0.field4670 - arg1.field4670 : arg1.field4670 - arg0.field4670;
        } else {
            return this.method7262(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2779((class437) arg0, (class437) arg1);
    }
}
