package deob;

@ObfuscatedName("et")
public class class119 extends class446 {

    @ObfuscatedName("et.at")
    public final boolean field1446;

    public class119(boolean arg0) {
        this.field1446 = arg0;
    }

    @ObfuscatedName("et.at(Lrh;Lrh;I)I")
    public int method2816(class449 arg0, class449 arg1) {
        if (arg0.field4703 == 0) {
            if (arg1.field4703 != 0) {
                return this.field1446 ? 1 : -1;
            }
        } else if (arg1.field4703 == 0) {
            return this.field1446 ? -1 : 1;
        }
        return this.method7430(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2816((class449) arg0, (class449) arg1);
    }
}
