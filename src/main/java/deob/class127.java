package deob;

@ObfuscatedName("ef")
public class class127 extends class473 {

    @ObfuscatedName("ef.ab")
    public final boolean field1497;

    public class127(boolean arg0) {
        this.field1497 = arg0;
    }

    @ObfuscatedName("ef.ab(Lsc;Lsc;I)I")
    public int method2956(class476 arg0, class476 arg1) {
        if (arg0.field4936 == arg1.field4936) {
            return this.method7948(arg0, arg1);
        } else if (this.field1497) {
            return arg0.field4936 - arg1.field4936;
        } else {
            return arg1.field4936 - arg0.field4936;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2956((class476) arg0, (class476) arg1);
    }
}
