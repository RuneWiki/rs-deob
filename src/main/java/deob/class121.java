package deob;

@ObfuscatedName("dr")
public class class121 extends class324 {

    @ObfuscatedName("dr.f")
    public final boolean field1456;

    public class121(boolean arg0) {
        this.field1456 = arg0;
    }

    @ObfuscatedName("dr.f(Lly;Lly;B)I")
    public int method2279(class327 arg0, class327 arg1) {
        if (client.field804 == arg0.field3848 && client.field804 == arg1.field3848) {
            return this.field1456 ? arg0.method5177().method5266(arg1.method5177()) : arg1.method5177().method5266(arg0.method5177());
        } else {
            return this.method5196(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2279((class327) arg0, (class327) arg1);
    }
}
