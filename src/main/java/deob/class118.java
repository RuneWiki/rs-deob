package deob;

@ObfuscatedName("ef")
public class class118 extends class453 {

    @ObfuscatedName("ef.aq")
    public final boolean field1459;

    public class118(boolean arg0) {
        this.field1459 = arg0;
    }

    @ObfuscatedName("ef.aq(Lry;Lry;I)I")
    public int method2798(class456 arg0, class456 arg1) {
        if (client.field522 == arg0.field4770) {
            if (client.field522 != arg1.field4770) {
                return this.field1459 ? -1 : 1;
            }
        } else if (client.field522 == arg1.field4770) {
            return this.field1459 ? 1 : -1;
        }
        return this.method7579(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2798((class456) arg0, (class456) arg1);
    }
}
