package deob;

@ObfuscatedName("ey")
public class class128 extends class472 {

    @ObfuscatedName("ey.aq")
    public final boolean field1517;

    public class128(boolean arg0) {
        this.field1517 = arg0;
    }

    @ObfuscatedName("ey.aq(Lsh;Lsh;I)I")
    public int method2887(class475 arg0, class475 arg1) {
        if (arg0.field4957 == 0 || arg1.field4957 == 0) {
            return this.method7857(arg0, arg1);
        } else if (this.field1517) {
            return arg0.method7842().method9357(arg1.method7842());
        } else {
            return arg1.method7842().method9357(arg0.method7842());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2887((class475) arg0, (class475) arg1);
    }
}
