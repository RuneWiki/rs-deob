package deob;

@ObfuscatedName("dh")
public class class119 extends class402 {

    @ObfuscatedName("dh.f")
    public final boolean field1464;

    public class119(boolean arg0) {
        this.field1464 = arg0;
    }

    @ObfuscatedName("dh.f(Loa;Loa;I)I")
    public int method2828(class405 arg0, class405 arg1) {
        if (arg0.field4577 == 0 || arg1.field4577 == 0) {
            return this.method7039(arg0, arg1);
        } else if (this.field1464) {
            return arg0.method7024().method8561(arg1.method7024());
        } else {
            return arg1.method7024().method8561(arg0.method7024());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2828((class405) arg0, (class405) arg1);
    }
}
