package deob;

@ObfuscatedName("ep")
public class class124 extends class454 {

    @ObfuscatedName("ep.az")
    public final boolean field1505;

    public class124(boolean arg0) {
        this.field1505 = arg0;
    }

    @ObfuscatedName("ep.az(Lrw;Lrw;I)I")
    public int method2802(class457 arg0, class457 arg1) {
        if (arg0.field4805 == arg1.field4805) {
            return this.method7450(arg0, arg1);
        } else if (this.field1505) {
            return arg0.field4805 - arg1.field4805;
        } else {
            return arg1.field4805 - arg0.field4805;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2802((class457) arg0, (class457) arg1);
    }
}
