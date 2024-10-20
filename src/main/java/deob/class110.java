package deob;

@ObfuscatedName("dn")
public class class110 extends class338 {

    @ObfuscatedName("dn.n")
    public final boolean field1351;

    public class110(boolean arg0) {
        this.field1351 = arg0;
    }

    @ObfuscatedName("dn.n(Lmm;Lmm;I)I")
    public int method2336(class341 arg0, class341 arg1) {
        if (arg0.field3965 == 0 || arg1.field3965 == 0) {
            return this.method5476(arg0, arg1);
        } else if (this.field1351) {
            return arg0.method5455().method6784(arg1.method5455());
        } else {
            return arg1.method5455().method6784(arg0.method5455());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2336((class341) arg0, (class341) arg1);
    }
}
