package deob;

@ObfuscatedName("ez")
public class class121 extends class446 {

    @ObfuscatedName("ez.at")
    public final boolean field1451;

    public class121(boolean arg0) {
        this.field1451 = arg0;
    }

    @ObfuscatedName("ez.at(Lrh;Lrh;I)I")
    public int method2843(class449 arg0, class449 arg1) {
        if (client.field591 == arg0.field4703 && client.field591 == arg1.field4703) {
            return this.field1451 ? arg0.method7428().method9089(arg1.method7428()) : arg1.method7428().method9089(arg0.method7428());
        } else {
            return this.method7430(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2843((class449) arg0, (class449) arg1);
    }
}
