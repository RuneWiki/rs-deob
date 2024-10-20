package deob;

@ObfuscatedName("eq")
public class class118 extends class435 {

    @ObfuscatedName("eq.aw")
    public final boolean field1455;

    public class118(boolean arg0) {
        this.field1455 = arg0;
    }

    @ObfuscatedName("eq.aw(Lqa;Lqa;B)I")
    public int method2737(class438 arg0, class438 arg1) {
        if (arg0.field4669 == 0 || arg1.field4669 == 0) {
            return this.method7250(arg0, arg1);
        } else if (this.field1455) {
            return arg0.field4670 - arg1.field4670;
        } else {
            return arg1.field4670 - arg0.field4670;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2737((class438) arg0, (class438) arg1);
    }
}
