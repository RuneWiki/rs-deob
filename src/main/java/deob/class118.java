package deob;

@ObfuscatedName("dl")
public class class118 extends class402 {

    @ObfuscatedName("dl.f")
    public final boolean field1463;

    public class118(boolean arg0) {
        this.field1463 = arg0;
    }

    @ObfuscatedName("dl.f(Loa;Loa;I)I")
    public int method2819(class405 arg0, class405 arg1) {
        if (arg0.field4576 == arg1.field4576) {
            return this.method7039(arg0, arg1);
        } else if (this.field1463) {
            return arg0.field4576 - arg1.field4576;
        } else {
            return arg1.field4576 - arg0.field4576;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2819((class405) arg0, (class405) arg1);
    }
}
