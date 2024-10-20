package deob;

@ObfuscatedName("ed")
public class class122 extends class435 {

    @ObfuscatedName("ed.aw")
    public final boolean field1476;

    public class122(boolean arg0) {
        this.field1476 = arg0;
    }

    @ObfuscatedName("ed.aw(Lqa;Lqa;I)I")
    public int method2768(class438 arg0, class438 arg1) {
        if (client.field517 == arg0.field4669 && client.field517 == arg1.field4669) {
            return this.field1476 ? arg0.field4670 - arg1.field4670 : arg1.field4670 - arg0.field4670;
        } else {
            return this.method7250(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2768((class438) arg0, (class438) arg1);
    }
}
