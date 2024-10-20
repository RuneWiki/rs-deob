package deob;

@ObfuscatedName("dx")
public class class106 extends class339 {

    @ObfuscatedName("dx.l")
    public final boolean field1337;

    public class106(boolean arg0) {
        this.field1337 = arg0;
    }

    @ObfuscatedName("dx.l(Lmi;Lmi;I)I")
    public int method2324(class342 arg0, class342 arg1) {
        if (arg0.field3976 == arg1.field3976) {
            return this.method5534(arg0, arg1);
        } else if (this.field1337) {
            return arg0.field3976 - arg1.field3976;
        } else {
            return arg1.field3976 - arg0.field3976;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2324((class342) arg0, (class342) arg1);
    }
}
