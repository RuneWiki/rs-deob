package deob;

@ObfuscatedName("dj")
public class class115 extends class392 {

    @ObfuscatedName("dj.a")
    public final boolean field1418;

    public class115(boolean arg0) {
        this.field1418 = arg0;
    }

    @ObfuscatedName("dj.a(Lof;Lof;I)I")
    public int method2650(class395 arg0, class395 arg1) {
        if (arg0.field4495 == arg1.field4495) {
            return this.method6747(arg0, arg1);
        } else if (this.field1418) {
            return arg0.field4495 - arg1.field4495;
        } else {
            return arg1.field4495 - arg0.field4495;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2650((class395) arg0, (class395) arg1);
    }
}
