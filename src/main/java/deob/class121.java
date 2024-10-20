package deob;

@ObfuscatedName("eb")
public class class121 extends class449 {

    @ObfuscatedName("eb.ac")
    public final boolean field1468;

    public class121(boolean arg0) {
        this.field1468 = arg0;
    }

    @ObfuscatedName("eb.ac(Lri;Lri;B)I")
    public int method2762(class452 arg0, class452 arg1) {
        if (arg0.field4712 == 0) {
            if (arg1.field4712 != 0) {
                return this.field1468 ? 1 : -1;
            }
        } else if (arg1.field4712 == 0) {
            return this.field1468 ? -1 : 1;
        }
        return this.method7354(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2762((class452) arg0, (class452) arg1);
    }
}
