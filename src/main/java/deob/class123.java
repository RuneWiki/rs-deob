package deob;

@ObfuscatedName("et")
public class class123 extends class472 {

    @ObfuscatedName("et.aq")
    public final boolean field1500;

    public class123(boolean arg0) {
        this.field1500 = arg0;
    }

    @ObfuscatedName("et.aq(Lsh;Lsh;I)I")
    public int method2856(class475 arg0, class475 arg1) {
        if (arg0.field4957 == 0) {
            if (arg1.field4957 != 0) {
                return this.field1500 ? 1 : -1;
            }
        } else if (arg1.field4957 == 0) {
            return this.field1500 ? -1 : 1;
        }
        return this.method7857(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2856((class475) arg0, (class475) arg1);
    }
}
