package deob;

@ObfuscatedName("ej")
public class class121 extends class473 {

    @ObfuscatedName("ej.ab")
    public final boolean field1480;

    public class121(boolean arg0) {
        this.field1480 = arg0;
    }

    @ObfuscatedName("ej.ab(Lsc;Lsc;I)I")
    public int method2918(class476 arg0, class476 arg1) {
        if (client.field798 == arg0.field4938) {
            if (client.field798 != arg1.field4938) {
                return this.field1480 ? -1 : 1;
            }
        } else if (client.field798 == arg1.field4938) {
            return this.field1480 ? 1 : -1;
        }
        return this.method7948(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2918((class476) arg0, (class476) arg1);
    }
}
