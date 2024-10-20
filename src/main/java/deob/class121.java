package deob;

@ObfuscatedName("du")
public class class121 extends class323 {

    @ObfuscatedName("du.v")
    public final boolean field1456;

    public class121(boolean arg0) {
        this.field1456 = arg0;
    }

    @ObfuscatedName("du.v(Llv;Llv;I)I")
    public int method2251(class326 arg0, class326 arg1) {
        if (client.field638 == arg0.field3853 && client.field638 == arg1.field3853) {
            return this.field1456 ? arg0.field3850 - arg1.field3850 : arg1.field3850 - arg0.field3850;
        } else {
            return this.method5244(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2251((class326) arg0, (class326) arg1);
    }
}
