package deob;

@ObfuscatedName("eh")
public class class117 extends class446 {

    @ObfuscatedName("eh.at")
    public final boolean field1439;

    public class117(boolean arg0) {
        this.field1439 = arg0;
    }

    @ObfuscatedName("eh.at(Lrh;Lrh;B)I")
    public int method2795(class449 arg0, class449 arg1) {
        if (client.field591 == arg0.field4703) {
            if (client.field591 != arg1.field4703) {
                return this.field1439 ? -1 : 1;
            }
        } else if (client.field591 == arg1.field4703) {
            return this.field1439 ? 1 : -1;
        }
        return this.method7430(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2795((class449) arg0, (class449) arg1);
    }
}
