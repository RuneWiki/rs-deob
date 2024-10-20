package deob;

@ObfuscatedName("ev")
public class class122 extends class449 {

    @ObfuscatedName("ev.ac")
    public final boolean field1470;

    public class122(boolean arg0) {
        this.field1470 = arg0;
    }

    @ObfuscatedName("ev.ac(Lri;Lri;B)I")
    public int method2770(class452 arg0, class452 arg1) {
        if (arg0.field4712 == arg1.field4712) {
            return this.method7354(arg0, arg1);
        } else if (this.field1470) {
            return arg0.field4712 - arg1.field4712;
        } else {
            return arg1.field4712 - arg0.field4712;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2770((class452) arg0, (class452) arg1);
    }
}
