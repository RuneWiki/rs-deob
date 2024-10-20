package deob;

@ObfuscatedName("dk")
public class class106 extends class338 {

    @ObfuscatedName("dk.n")
    public final boolean field1329;

    public class106(boolean arg0) {
        this.field1329 = arg0;
    }

    @ObfuscatedName("dk.n(Lmm;Lmm;B)I")
    public int method2296(class341 arg0, class341 arg1) {
        if (arg0.field3965 == arg1.field3965) {
            return this.method5476(arg0, arg1);
        } else if (this.field1329) {
            return arg0.field3965 - arg1.field3965;
        } else {
            return arg1.field3965 - arg0.field3965;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2296((class341) arg0, (class341) arg1);
    }
}
