package deob;

@ObfuscatedName("dd")
public class class122 extends class324 {

    @ObfuscatedName("dd.f")
    public final boolean field1461;

    public class122(boolean arg0) {
        this.field1461 = arg0;
    }

    @ObfuscatedName("dd.f(Lly;Lly;I)I")
    public int method2287(class327 arg0, class327 arg1) {
        if (client.field804 == arg0.field3848 && client.field804 == arg1.field3848) {
            return this.field1461 ? arg0.field3847 - arg1.field3847 : arg1.field3847 - arg0.field3847;
        } else {
            return this.method5196(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2287((class327) arg0, (class327) arg1);
    }
}
