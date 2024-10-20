package deob;

@ObfuscatedName("dp")
public class class117 extends class324 {

    @ObfuscatedName("dp.f")
    public final boolean field1436;

    public class117(boolean arg0) {
        this.field1436 = arg0;
    }

    @ObfuscatedName("dp.f(Lly;Lly;B)I")
    public int method2252(class327 arg0, class327 arg1) {
        if (client.field804 == arg0.field3848) {
            if (client.field804 != arg1.field3848) {
                return this.field1436 ? -1 : 1;
            }
        } else if (client.field804 == arg1.field3848) {
            return this.field1436 ? 1 : -1;
        }
        return this.method5196(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2252((class327) arg0, (class327) arg1);
    }
}
