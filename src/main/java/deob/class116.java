package deob;

@ObfuscatedName("dy")
public class class116 extends class323 {

    @ObfuscatedName("dy.v")
    public final boolean field1434;

    public class116(boolean arg0) {
        this.field1434 = arg0;
    }

    @ObfuscatedName("dy.v(Llv;Llv;I)I")
    public int method2215(class326 arg0, class326 arg1) {
        if (client.field638 == arg0.field3853) {
            if (client.field638 != arg1.field3853) {
                return this.field1434 ? -1 : 1;
            }
        } else if (client.field638 == arg1.field3853) {
            return this.field1434 ? 1 : -1;
        }
        return this.method5244(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2215((class326) arg0, (class326) arg1);
    }
}
