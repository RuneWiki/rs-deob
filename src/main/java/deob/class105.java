package deob;

@ObfuscatedName("dr")
public class class105 extends class372 {

    @ObfuscatedName("dr.v")
    public final boolean field1348;

    public class105(boolean arg0) {
        this.field1348 = arg0;
    }

    @ObfuscatedName("dr.v(Lnf;Lnf;I)I")
    public int method2453(class375 arg0, class375 arg1) {
        if (client.field723 == arg0.field4269) {
            if (client.field723 != arg1.field4269) {
                return this.field1348 ? -1 : 1;
            }
        } else if (client.field723 == arg1.field4269) {
            return this.field1348 ? 1 : -1;
        }
        return this.method6118(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2453((class375) arg0, (class375) arg1);
    }
}
