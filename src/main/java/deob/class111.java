package deob;

@ObfuscatedName("dx")
public class class111 extends class373 {

    @ObfuscatedName("dx.o")
    public final boolean field1407;

    public class111(boolean arg0) {
        this.field1407 = arg0;
    }

    @ObfuscatedName("dx.o(Lns;Lns;I)I")
    public int method2472(class376 arg0, class376 arg1) {
        if (arg0.field4334 == arg1.field4334) {
            return this.method6016(arg0, arg1);
        } else if (this.field1407) {
            return arg0.field4334 - arg1.field4334;
        } else {
            return arg1.field4334 - arg0.field4334;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2472((class376) arg0, (class376) arg1);
    }
}
