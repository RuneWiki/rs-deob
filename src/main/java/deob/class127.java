package deob;

@ObfuscatedName("eq")
public class class127 extends class471 {

    @ObfuscatedName("eq.ak")
    public final boolean field1531;

    public class127(boolean arg0) {
        this.field1531 = arg0;
    }

    @ObfuscatedName("eq.ak(Lso;Lso;I)I")
    public int method2876(class474 arg0, class474 arg1) {
        if (arg0.field4932 == 0 || arg1.field4932 == 0) {
            return this.method7897(arg0, arg1);
        } else if (this.field1531) {
            return arg0.method7890().method9400(arg1.method7890());
        } else {
            return arg1.method7890().method9400(arg0.method7890());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2876((class474) arg0, (class474) arg1);
    }
}
