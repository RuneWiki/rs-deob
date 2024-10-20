package deob;

@ObfuscatedName("ey")
public class class124 extends class446 {

    @ObfuscatedName("ey.at")
    public final boolean field1468;

    public class124(boolean arg0) {
        this.field1468 = arg0;
    }

    @ObfuscatedName("ey.at(Lrh;Lrh;I)I")
    public int method2861(class449 arg0, class449 arg1) {
        if (arg0.field4703 == 0 || arg1.field4703 == 0) {
            return this.method7430(arg0, arg1);
        } else if (this.field1468) {
            return arg0.method7428().method9089(arg1.method7428());
        } else {
            return arg1.method7428().method9089(arg0.method7428());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2861((class449) arg0, (class449) arg1);
    }
}
