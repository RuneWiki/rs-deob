package deob;

@ObfuscatedName("da")
public class class118 extends class323 {

    @ObfuscatedName("da.v")
    public final boolean field1438;

    public class118(boolean arg0) {
        this.field1438 = arg0;
    }

    @ObfuscatedName("da.v(Llv;Llv;I)I")
    public int method2228(class326 arg0, class326 arg1) {
        if (arg0.field3853 == 0) {
            if (arg1.field3853 != 0) {
                return this.field1438 ? 1 : -1;
            }
        } else if (arg1.field3853 == 0) {
            return this.field1438 ? -1 : 1;
        }
        return this.method5244(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2228((class326) arg0, (class326) arg1);
    }
}
