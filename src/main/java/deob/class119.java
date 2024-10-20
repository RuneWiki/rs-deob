package deob;

@ObfuscatedName("es")
public class class119 extends class405 {

    @ObfuscatedName("es.aj")
    public final boolean field1438;

    public class119(boolean arg0) {
        this.field1438 = arg0;
    }

    @ObfuscatedName("es.aj(Lpt;Lpt;I)I")
    public int method2745(class408 arg0, class408 arg1) {
        if (client.field482 == arg0.field4533 && client.field482 == arg1.field4533) {
            return this.field1438 ? arg0.field4534 - arg1.field4534 : arg1.field4534 - arg0.field4534;
        } else {
            return this.method6939(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2745((class408) arg0, (class408) arg1);
    }
}
