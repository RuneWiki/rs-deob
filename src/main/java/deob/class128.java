package deob;

@ObfuscatedName("ea")
public class class128 extends class473 {

    @ObfuscatedName("ea.ab")
    public final boolean field1499;

    public class128(boolean arg0) {
        this.field1499 = arg0;
    }

    @ObfuscatedName("ea.ab(Lsc;Lsc;B)I")
    public int method2963(class476 arg0, class476 arg1) {
        if (arg0.field4938 == 0 || arg1.field4938 == 0) {
            return this.method7948(arg0, arg1);
        } else if (this.field1499) {
            return arg0.method7944().method9478(arg1.method7944());
        } else {
            return arg1.method7944().method9478(arg0.method7944());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2963((class476) arg0, (class476) arg1);
    }
}
