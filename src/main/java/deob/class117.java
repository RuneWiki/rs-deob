package deob;

@ObfuscatedName("en")
public class class117 extends class409 {

    @ObfuscatedName("en.af")
    public final boolean field1436;

    public class117(boolean arg0) {
        this.field1436 = arg0;
    }

    @ObfuscatedName("en.af(Lpb;Lpb;I)I")
    public int method2795(class412 arg0, class412 arg1) {
        if (client.field579 == arg0.field4600 && client.field579 == arg1.field4600) {
            return this.field1436 ? arg0.field4598 - arg1.field4598 : arg1.field4598 - arg0.field4598;
        } else {
            return this.method7183(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2795((class412) arg0, (class412) arg1);
    }
}
