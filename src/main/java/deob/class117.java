package deob;

@ObfuscatedName("dt")
public class class117 extends class402 {

    @ObfuscatedName("dt.f")
    public final boolean field1459;

    public class117(boolean arg0) {
        this.field1459 = arg0;
    }

    @ObfuscatedName("dt.f(Loa;Loa;I)I")
    public int method2811(class405 arg0, class405 arg1) {
        if (client.field601 == arg0.field4577 && client.field601 == arg1.field4577) {
            return this.field1459 ? arg0.field4575 - arg1.field4575 : arg1.field4575 - arg0.field4575;
        } else {
            return this.method7039(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2811((class405) arg0, (class405) arg1);
    }
}
