package deob;

@ObfuscatedName("er")
public class class121 extends class472 {

    @ObfuscatedName("er.aq")
    public final boolean field1495;

    public class121(boolean arg0) {
        this.field1495 = arg0;
    }

    @ObfuscatedName("er.aq(Lsh;Lsh;I)I")
    public int method2844(class475 arg0, class475 arg1) {
        if (client.field500 == arg0.field4957) {
            if (client.field500 != arg1.field4957) {
                return this.field1495 ? -1 : 1;
            }
        } else if (client.field500 == arg1.field4957) {
            return this.field1495 ? 1 : -1;
        }
        return this.method7857(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2844((class475) arg0, (class475) arg1);
    }
}
