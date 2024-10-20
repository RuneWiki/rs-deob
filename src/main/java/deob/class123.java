package deob;

@ObfuscatedName("dk")
public class class123 extends class324 {

    @ObfuscatedName("dk.f")
    public final boolean field1464;

    public class123(boolean arg0) {
        this.field1464 = arg0;
    }

    @ObfuscatedName("dk.f(Lly;Lly;I)I")
    public int method2296(class327 arg0, class327 arg1) {
        if (arg0.field3849 == arg1.field3849) {
            return this.method5196(arg0, arg1);
        } else if (this.field1464) {
            return arg0.field3849 - arg1.field3849;
        } else {
            return arg1.field3849 - arg0.field3849;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2296((class327) arg0, (class327) arg1);
    }
}
