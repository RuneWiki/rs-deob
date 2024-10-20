package deob;

@ObfuscatedName("eg")
public class class120 extends class435 {

    @ObfuscatedName("eg.aw")
    public final boolean field1468;

    public class120(boolean arg0) {
        this.field1468 = arg0;
    }

    @ObfuscatedName("eg.aw(Lqa;Lqa;B)I")
    public int method2758(class438 arg0, class438 arg1) {
        if (arg0.field4669 == arg1.field4669) {
            return this.method7250(arg0, arg1);
        } else if (this.field1468) {
            return arg0.field4669 - arg1.field4669;
        } else {
            return arg1.field4669 - arg0.field4669;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2758((class438) arg0, (class438) arg1);
    }
}
