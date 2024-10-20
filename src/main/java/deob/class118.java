package deob;

@ObfuscatedName("do")
public class class118 extends class324 {

    @ObfuscatedName("do.f")
    public final boolean field1437;

    public class118(boolean arg0) {
        this.field1437 = arg0;
    }

    @ObfuscatedName("do.f(Lly;Lly;B)I")
    public int method2263(class327 arg0, class327 arg1) {
        if (arg0.field3848 == 0 || arg1.field3848 == 0) {
            return this.method5196(arg0, arg1);
        } else if (this.field1437) {
            return arg0.field3847 - arg1.field3847;
        } else {
            return arg1.field3847 - arg0.field3847;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2263((class327) arg0, (class327) arg1);
    }
}
