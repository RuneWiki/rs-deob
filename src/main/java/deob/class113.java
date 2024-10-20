package deob;

@ObfuscatedName("dx")
public class class113 extends class392 {

    @ObfuscatedName("dx.a")
    public final boolean field1414;

    public class113(boolean arg0) {
        this.field1414 = arg0;
    }

    @ObfuscatedName("dx.a(Lof;Lof;I)I")
    public int method2635(class395 arg0, class395 arg1) {
        if (arg0.field4495 == 0 || arg1.field4495 == 0) {
            return this.method6747(arg0, arg1);
        } else if (this.field1414) {
            return arg0.field4494 - arg1.field4494;
        } else {
            return arg1.field4494 - arg0.field4494;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2635((class395) arg0, (class395) arg1);
    }
}
