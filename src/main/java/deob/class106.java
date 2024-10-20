package deob;

@ObfuscatedName("di")
public class class106 extends class373 {

    @ObfuscatedName("di.s")
    public final boolean field1376;

    public class106(boolean arg0) {
        this.field1376 = arg0;
    }

    @ObfuscatedName("di.s(Lnt;Lnt;I)I")
    public int method2422(class376 arg0, class376 arg1) {
        if (arg0.field4328 == 0 || arg1.field4328 == 0) {
            return this.method6015(arg0, arg1);
        } else if (this.field1376) {
            return arg0.field4325 - arg1.field4325;
        } else {
            return arg1.field4325 - arg0.field4325;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2422((class376) arg0, (class376) arg1);
    }
}
