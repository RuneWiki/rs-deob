package deob;

@ObfuscatedName("eb")
public class class117 extends class434 {

    @ObfuscatedName("eb.au")
    public final boolean field1469;

    public class117(boolean arg0) {
        this.field1469 = arg0;
    }

    @ObfuscatedName("eb.au(Lqb;Lqb;I)I")
    public int method2740(class437 arg0, class437 arg1) {
        if (client.field527 == arg0.field4671) {
            if (client.field527 != arg1.field4671) {
                return this.field1469 ? -1 : 1;
            }
        } else if (client.field527 == arg1.field4671) {
            return this.field1469 ? 1 : -1;
        }
        return this.method7262(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2740((class437) arg0, (class437) arg1);
    }
}
