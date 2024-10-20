package deob;

@ObfuscatedName("es")
public class class123 extends class473 {

    @ObfuscatedName("es.ab")
    public final boolean field1487;

    public class123(boolean arg0) {
        this.field1487 = arg0;
    }

    @ObfuscatedName("es.ab(Lsc;Lsc;I)I")
    public int method2925(class476 arg0, class476 arg1) {
        if (arg0.field4938 == 0) {
            if (arg1.field4938 != 0) {
                return this.field1487 ? 1 : -1;
            }
        } else if (arg1.field4938 == 0) {
            return this.field1487 ? -1 : 1;
        }
        return this.method7948(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2925((class476) arg0, (class476) arg1);
    }
}
