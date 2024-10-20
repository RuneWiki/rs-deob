package deob;

@ObfuscatedName("eu")
public class class125 extends class449 {

    @ObfuscatedName("eu.ac")
    public final boolean field1484;

    public class125(boolean arg0) {
        this.field1484 = arg0;
    }

    @ObfuscatedName("eu.ac(Lri;Lri;I)I")
    public int method2793(class452 arg0, class452 arg1) {
        if (arg0.field4713 == arg1.field4713) {
            return this.method7354(arg0, arg1);
        } else if (this.field1484) {
            return arg0.field4713 - arg1.field4713;
        } else {
            return arg1.field4713 - arg0.field4713;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2793((class452) arg0, (class452) arg1);
    }
}
