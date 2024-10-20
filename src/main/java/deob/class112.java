package deob;

@ObfuscatedName("dg")
public class class112 extends class372 {

    @ObfuscatedName("dg.c")
    public final boolean field1418;

    public class112(boolean arg0) {
        this.field1418 = arg0;
    }

    @ObfuscatedName("dg.c(Lnm;Lnm;I)I")
    public int method2497(class375 arg0, class375 arg1) {
        if (arg0.field4325 == 0 || arg1.field4325 == 0) {
            return this.method6090(arg0, arg1);
        } else if (this.field1418) {
            return arg0.method6075().method7621(arg1.method6075());
        } else {
            return arg1.method6075().method7621(arg0.method6075());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2497((class375) arg0, (class375) arg1);
    }
}
