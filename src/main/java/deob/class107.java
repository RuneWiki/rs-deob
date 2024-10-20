package deob;

@ObfuscatedName("dg")
public class class107 extends class373 {

    @ObfuscatedName("dg.o")
    public final boolean field1387;

    public class107(boolean arg0) {
        this.field1387 = arg0;
    }

    @ObfuscatedName("dg.o(Lns;Lns;I)I")
    public int method2451(class376 arg0, class376 arg1) {
        if (arg0.field4335 == 0) {
            if (arg1.field4335 != 0) {
                return this.field1387 ? 1 : -1;
            }
        } else if (arg1.field4335 == 0) {
            return this.field1387 ? -1 : 1;
        }
        return this.method6016(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2451((class376) arg0, (class376) arg1);
    }
}
