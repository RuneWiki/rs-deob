package deob;

@ObfuscatedName("em")
public class class121 extends class434 {

    @ObfuscatedName("em.au")
    public final boolean field1479;

    public class121(boolean arg0) {
        this.field1479 = arg0;
    }

    @ObfuscatedName("em.au(Lqb;Lqb;I)I")
    public int method2772(class437 arg0, class437 arg1) {
        if (client.field527 == arg0.field4671 && client.field527 == arg1.field4671) {
            return this.field1479 ? arg0.method7250().method8912(arg1.method7250()) : arg1.method7250().method8912(arg0.method7250());
        } else {
            return this.method7262(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2772((class437) arg0, (class437) arg1);
    }
}
