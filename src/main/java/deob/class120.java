package deob;

@ObfuscatedName("ep")
public class class120 extends class450 {

    @ObfuscatedName("ep.am")
    public final boolean field1457;

    public class120(boolean arg0) {
        this.field1457 = arg0;
    }

    @ObfuscatedName("ep.am(Lrj;Lrj;I)I")
    public int method2844(class453 arg0, class453 arg1) {
        if (arg0.field4743 == arg1.field4743) {
            return this.method7558(arg0, arg1);
        } else if (this.field1457) {
            return arg0.field4743 - arg1.field4743;
        } else {
            return arg1.field4743 - arg0.field4743;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2844((class453) arg0, (class453) arg1);
    }
}
