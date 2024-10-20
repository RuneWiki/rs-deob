package deob;

@ObfuscatedName("dg")
public class class120 extends class323 {

    @ObfuscatedName("dg.v")
    public final boolean field1455;

    public class120(boolean arg0) {
        this.field1455 = arg0;
    }

    @ObfuscatedName("dg.v(Llv;Llv;B)I")
    public int method2242(class326 arg0, class326 arg1) {
        if (client.field638 == arg0.field3853 && client.field638 == arg1.field3853) {
            return this.field1455 ? arg0.method5229().method5341(arg1.method5229()) : arg1.method5229().method5341(arg0.method5229());
        } else {
            return this.method5244(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2242((class326) arg0, (class326) arg1);
    }
}
