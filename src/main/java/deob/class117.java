package deob;

@ObfuscatedName("ec")
public class class117 extends class405 {

    @ObfuscatedName("ec.aj")
    public final boolean field1426;

    public class117(boolean arg0) {
        this.field1426 = arg0;
    }

    @ObfuscatedName("ec.aj(Lpt;Lpt;B)I")
    public int method2732(class408 arg0, class408 arg1) {
        if (arg0.field4533 == arg1.field4533) {
            return this.method6939(arg0, arg1);
        } else if (this.field1426) {
            return arg0.field4533 - arg1.field4533;
        } else {
            return arg1.field4533 - arg0.field4533;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2732((class408) arg0, (class408) arg1);
    }
}
