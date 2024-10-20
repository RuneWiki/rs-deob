package deob;

@ObfuscatedName("ea")
public class class112 extends class409 {

    @ObfuscatedName("ea.af")
    public final boolean field1421;

    public class112(boolean arg0) {
        this.field1421 = arg0;
    }

    @ObfuscatedName("ea.af(Lpb;Lpb;I)I")
    public int method2739(class412 arg0, class412 arg1) {
        if (client.field579 == arg0.field4600) {
            if (client.field579 != arg1.field4600) {
                return this.field1421 ? -1 : 1;
            }
        } else if (client.field579 == arg1.field4600) {
            return this.field1421 ? 1 : -1;
        }
        return this.method7183(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2739((class412) arg0, (class412) arg1);
    }
}
