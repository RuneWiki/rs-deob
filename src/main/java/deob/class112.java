package deob;

@ObfuscatedName("da")
public class class112 extends class392 {

    @ObfuscatedName("da.a")
    public final boolean field1406;

    public class112(boolean arg0) {
        this.field1406 = arg0;
    }

    @ObfuscatedName("da.a(Lof;Lof;I)I")
    public int method2623(class395 arg0, class395 arg1) {
        if (client.field726 == arg0.field4495) {
            if (client.field726 != arg1.field4495) {
                return this.field1406 ? -1 : 1;
            }
        } else if (client.field726 == arg1.field4495) {
            return this.field1406 ? 1 : -1;
        }
        return this.method6747(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2623((class395) arg0, (class395) arg1);
    }
}
