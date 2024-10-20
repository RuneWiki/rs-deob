package deob;

@ObfuscatedName("ec")
public class class124 extends class472 {

    @ObfuscatedName("ec.aq")
    public final boolean field1503;

    public class124(boolean arg0) {
        this.field1503 = arg0;
    }

    @ObfuscatedName("ec.aq(Lsh;Lsh;I)I")
    public int method2864(class475 arg0, class475 arg1) {
        if (arg0.field4957 == arg1.field4957) {
            return this.method7857(arg0, arg1);
        } else if (this.field1503) {
            return arg0.field4957 - arg1.field4957;
        } else {
            return arg1.field4957 - arg0.field4957;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2864((class475) arg0, (class475) arg1);
    }
}
