package deob;

@ObfuscatedName("eq")
public class class124 extends class450 {

    @ObfuscatedName("eq.am")
    public final boolean field1470;

    public class124(boolean arg0) {
        this.field1470 = arg0;
    }

    @ObfuscatedName("eq.am(Lrj;Lrj;B)I")
    public int method2881(class453 arg0, class453 arg1) {
        if (arg0.field4743 == 0 || arg1.field4743 == 0) {
            return this.method7558(arg0, arg1);
        } else if (this.field1470) {
            return arg0.method7544().method9159(arg1.method7544());
        } else {
            return arg1.method7544().method9159(arg0.method7544());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2881((class453) arg0, (class453) arg1);
    }
}
