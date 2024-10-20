package deob;

@ObfuscatedName("dg")
public class class108 extends class372 {

    @ObfuscatedName("dg.v")
    public final boolean field1356;

    public class108(boolean arg0) {
        this.field1356 = arg0;
    }

    @ObfuscatedName("dg.v(Lnf;Lnf;B)I")
    public int method2479(class375 arg0, class375 arg1) {
        if (arg0.field4269 == arg1.field4269) {
            return this.method6118(arg0, arg1);
        } else if (this.field1356) {
            return arg0.field4269 - arg1.field4269;
        } else {
            return arg1.field4269 - arg0.field4269;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2479((class375) arg0, (class375) arg1);
    }
}
