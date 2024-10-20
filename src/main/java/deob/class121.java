package deob;

@ObfuscatedName("ey")
public class class121 extends class435 {

    @ObfuscatedName("ey.aw")
    public final boolean field1472;

    public class121(boolean arg0) {
        this.field1472 = arg0;
    }

    @ObfuscatedName("ey.aw(Lqa;Lqa;I)I")
    public int method2760(class438 arg0, class438 arg1) {
        if (client.field517 == arg0.field4669 && client.field517 == arg1.field4669) {
            return this.field1472 ? arg0.method7233().method8880(arg1.method7233()) : arg1.method7233().method8880(arg0.method7233());
        } else {
            return this.method7250(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2760((class438) arg0, (class438) arg1);
    }
}
