package deob;

@ObfuscatedName("eu")
public class class113 extends class409 {

    @ObfuscatedName("eu.af")
    public final boolean field1424;

    public class113(boolean arg0) {
        this.field1424 = arg0;
    }

    @ObfuscatedName("eu.af(Lpb;Lpb;B)I")
    public int method2751(class412 arg0, class412 arg1) {
        if (arg0.field4600 == 0 || arg1.field4600 == 0) {
            return this.method7183(arg0, arg1);
        } else if (this.field1424) {
            return arg0.field4598 - arg1.field4598;
        } else {
            return arg1.field4598 - arg0.field4598;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2751((class412) arg0, (class412) arg1);
    }
}
