package deob;

@ObfuscatedName("dl")
public class class119 extends class324 {

    @ObfuscatedName("dl.f")
    public final boolean field1445;

    public class119(boolean arg0) {
        this.field1445 = arg0;
    }

    @ObfuscatedName("dl.f(Lly;Lly;B)I")
    public int method2269(class327 arg0, class327 arg1) {
        if (arg0.field3848 == 0) {
            if (arg1.field3848 != 0) {
                return this.field1445 ? 1 : -1;
            }
        } else if (arg1.field3848 == 0) {
            return this.field1445 ? -1 : 1;
        }
        return this.method5196(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2269((class327) arg0, (class327) arg1);
    }
}
