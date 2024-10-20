package deob;

@ObfuscatedName("dr")
public class class115 extends class402 {

    @ObfuscatedName("dr.f")
    public final boolean field1452;

    public class115(boolean arg0) {
        this.field1452 = arg0;
    }

    @ObfuscatedName("dr.f(Loa;Loa;B)I")
    public int method2795(class405 arg0, class405 arg1) {
        if (arg0.field4577 == arg1.field4577) {
            return this.method7039(arg0, arg1);
        } else if (this.field1452) {
            return arg0.field4577 - arg1.field4577;
        } else {
            return arg1.field4577 - arg0.field4577;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2795((class405) arg0, (class405) arg1);
    }
}
