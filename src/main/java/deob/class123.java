package deob;

@ObfuscatedName("ea")
public class class123 extends class435 {

    @ObfuscatedName("ea.aw")
    public final boolean field1477;

    public class123(boolean arg0) {
        this.field1477 = arg0;
    }

    @ObfuscatedName("ea.aw(Lqa;Lqa;I)I")
    public int method2776(class438 arg0, class438 arg1) {
        if (arg0.field4671 == arg1.field4671) {
            return this.method7250(arg0, arg1);
        } else if (this.field1477) {
            return arg0.field4671 - arg1.field4671;
        } else {
            return arg1.field4671 - arg0.field4671;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2776((class438) arg0, (class438) arg1);
    }
}
