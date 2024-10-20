package deob;

@ObfuscatedName("es")
public class class117 extends class435 {

    @ObfuscatedName("es.aw")
    public final boolean field1450;

    public class117(boolean arg0) {
        this.field1450 = arg0;
    }

    @ObfuscatedName("es.aw(Lqa;Lqa;I)I")
    public int method2731(class438 arg0, class438 arg1) {
        if (client.field517 == arg0.field4669) {
            if (client.field517 != arg1.field4669) {
                return this.field1450 ? -1 : 1;
            }
        } else if (client.field517 == arg1.field4669) {
            return this.field1450 ? 1 : -1;
        }
        return this.method7250(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2731((class438) arg0, (class438) arg1);
    }
}
