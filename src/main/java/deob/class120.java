package deob;

@ObfuscatedName("eh")
public class class120 extends class449 {

    @ObfuscatedName("eh.ac")
    public final boolean field1464;

    public class120(boolean arg0) {
        this.field1464 = arg0;
    }

    @ObfuscatedName("eh.ac(Lri;Lri;I)I")
    public int method2756(class452 arg0, class452 arg1) {
        if (arg0.field4712 == 0 || arg1.field4712 == 0) {
            return this.method7354(arg0, arg1);
        } else if (this.field1464) {
            return arg0.field4711 - arg1.field4711;
        } else {
            return arg1.field4711 - arg0.field4711;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2756((class452) arg0, (class452) arg1);
    }
}
