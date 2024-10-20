package deob;

@ObfuscatedName("do")
public class class116 extends class402 {

    @ObfuscatedName("do.f")
    public final boolean field1457;

    public class116(boolean arg0) {
        this.field1457 = arg0;
    }

    @ObfuscatedName("do.f(Loa;Loa;B)I")
    public int method2804(class405 arg0, class405 arg1) {
        if (client.field601 == arg0.field4577 && client.field601 == arg1.field4577) {
            return this.field1457 ? arg0.method7024().method8561(arg1.method7024()) : arg1.method7024().method8561(arg0.method7024());
        } else {
            return this.method7039(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2804((class405) arg0, (class405) arg1);
    }
}
