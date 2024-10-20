package deob;

@ObfuscatedName("em")
public class class122 extends class472 {

    @ObfuscatedName("em.aq")
    public final boolean field1497;

    public class122(boolean arg0) {
        this.field1497 = arg0;
    }

    @ObfuscatedName("em.aq(Lsh;Lsh;I)I")
    public int method2850(class475 arg0, class475 arg1) {
        if (arg0.field4957 == 0 || arg1.field4957 == 0) {
            return this.method7857(arg0, arg1);
        } else if (this.field1497) {
            return arg0.field4956 - arg1.field4956;
        } else {
            return arg1.field4956 - arg0.field4956;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2850((class475) arg0, (class475) arg1);
    }
}
