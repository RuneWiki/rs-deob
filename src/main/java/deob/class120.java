package deob;

@ObfuscatedName("de")
public class class120 extends class324 {

    @ObfuscatedName("de.f")
    public final boolean field1447;

    public class120(boolean arg0) {
        this.field1447 = arg0;
    }

    @ObfuscatedName("de.f(Lly;Lly;I)I")
    public int method2272(class327 arg0, class327 arg1) {
        if (arg0.field3848 == arg1.field3848) {
            return this.method5196(arg0, arg1);
        } else if (this.field1447) {
            return arg0.field3848 - arg1.field3848;
        } else {
            return arg1.field3848 - arg0.field3848;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2272((class327) arg0, (class327) arg1);
    }
}
