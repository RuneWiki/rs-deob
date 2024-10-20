package deob;

@ObfuscatedName("el")
public class class116 extends class409 {

    @ObfuscatedName("el.af")
    public final boolean field1435;

    public class116(boolean arg0) {
        this.field1435 = arg0;
    }

    @ObfuscatedName("el.af(Lpb;Lpb;I)I")
    public int method2786(class412 arg0, class412 arg1) {
        if (client.field579 == arg0.field4600 && client.field579 == arg1.field4600) {
            return this.field1435 ? arg0.method7167().method8845(arg1.method7167()) : arg1.method7167().method8845(arg0.method7167());
        } else {
            return this.method7183(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2786((class412) arg0, (class412) arg1);
    }
}
