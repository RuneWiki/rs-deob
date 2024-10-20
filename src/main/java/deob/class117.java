package deob;

@ObfuscatedName("dg")
public class class117 extends class392 {

    @ObfuscatedName("dg.a")
    public final boolean field1429;

    public class117(boolean arg0) {
        this.field1429 = arg0;
    }

    @ObfuscatedName("dg.a(Lof;Lof;I)I")
    public int method2665(class395 arg0, class395 arg1) {
        if (client.field726 == arg0.field4495 && client.field726 == arg1.field4495) {
            return this.field1429 ? arg0.field4494 - arg1.field4494 : arg1.field4494 - arg0.field4494;
        } else {
            return this.method6747(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2665((class395) arg0, (class395) arg1);
    }
}
