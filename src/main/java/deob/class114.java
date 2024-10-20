package deob;

@ObfuscatedName("dv")
public class class114 extends class402 {

    @ObfuscatedName("dv.f")
    public final boolean field1448;

    public class114(boolean arg0) {
        this.field1448 = arg0;
    }

    @ObfuscatedName("dv.f(Loa;Loa;I)I")
    public int method2792(class405 arg0, class405 arg1) {
        if (arg0.field4577 == 0) {
            if (arg1.field4577 != 0) {
                return this.field1448 ? 1 : -1;
            }
        } else if (arg1.field4577 == 0) {
            return this.field1448 ? -1 : 1;
        }
        return this.method7039(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2792((class405) arg0, (class405) arg1);
    }
}
