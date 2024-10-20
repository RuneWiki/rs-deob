package deob;

@ObfuscatedName("dn")
public class class112 extends class402 {

    @ObfuscatedName("dn.f")
    public final boolean field1438;

    public class112(boolean arg0) {
        this.field1438 = arg0;
    }

    @ObfuscatedName("dn.f(Loa;Loa;I)I")
    public int method2772(class405 arg0, class405 arg1) {
        if (client.field601 == arg0.field4577) {
            if (client.field601 != arg1.field4577) {
                return this.field1438 ? -1 : 1;
            }
        } else if (client.field601 == arg1.field4577) {
            return this.field1438 ? 1 : -1;
        }
        return this.method7039(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2772((class405) arg0, (class405) arg1);
    }
}
