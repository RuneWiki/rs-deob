package deob;

@ObfuscatedName("el")
public class class120 extends class434 {

    @ObfuscatedName("el.au")
    public final boolean field1477;

    public class120(boolean arg0) {
        this.field1477 = arg0;
    }

    @ObfuscatedName("el.au(Lqb;Lqb;I)I")
    public int method2766(class437 arg0, class437 arg1) {
        if (arg0.field4671 == arg1.field4671) {
            return this.method7262(arg0, arg1);
        } else if (this.field1477) {
            return arg0.field4671 - arg1.field4671;
        } else {
            return arg1.field4671 - arg0.field4671;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2766((class437) arg0, (class437) arg1);
    }
}
