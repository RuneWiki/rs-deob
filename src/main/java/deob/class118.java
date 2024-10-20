package deob;

@ObfuscatedName("dr")
public class class118 extends class392 {

    @ObfuscatedName("dr.a")
    public final boolean field1434;

    public class118(boolean arg0) {
        this.field1434 = arg0;
    }

    @ObfuscatedName("dr.a(Lof;Lof;I)I")
    public int method2673(class395 arg0, class395 arg1) {
        if (arg0.field4496 == arg1.field4496) {
            return this.method6747(arg0, arg1);
        } else if (this.field1434) {
            return arg0.field4496 - arg1.field4496;
        } else {
            return arg1.field4496 - arg0.field4496;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2673((class395) arg0, (class395) arg1);
    }
}
