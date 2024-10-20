package deob;

@ObfuscatedName("ec")
public class class116 extends class422 {

    @ObfuscatedName("ec.at")
    public final boolean field1419;

    public class116(boolean arg0) {
        this.field1419 = arg0;
    }

    @ObfuscatedName("ec.at(Lqg;Lqg;I)I")
    public int method2706(class425 arg0, class425 arg1) {
        if (client.field504 == arg0.field4612) {
            if (client.field504 != arg1.field4612) {
                return this.field1419 ? -1 : 1;
            }
        } else if (client.field504 == arg1.field4612) {
            return this.field1419 ? 1 : -1;
        }
        return this.method7169(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2706((class425) arg0, (class425) arg1);
    }
}
