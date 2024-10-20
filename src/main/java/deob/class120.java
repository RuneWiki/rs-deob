package deob;

@ObfuscatedName("ex")
public class class120 extends class454 {

    @ObfuscatedName("ex.az")
    public final boolean field1486;

    public class120(boolean arg0) {
        this.field1486 = arg0;
    }

    @ObfuscatedName("ex.az(Lrw;Lrw;I)I")
    public int method2755(class457 arg0, class457 arg1) {
        if (arg0.field4807 == 0) {
            if (arg1.field4807 != 0) {
                return this.field1486 ? 1 : -1;
            }
        } else if (arg1.field4807 == 0) {
            return this.field1486 ? -1 : 1;
        }
        return this.method7450(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2755((class457) arg0, (class457) arg1);
    }
}
