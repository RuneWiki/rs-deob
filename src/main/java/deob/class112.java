package deob;

@ObfuscatedName("ds")
public class class112 extends class372 {

    @ObfuscatedName("ds.v")
    public final boolean field1368;

    public class112(boolean arg0) {
        this.field1368 = arg0;
    }

    @ObfuscatedName("ds.v(Lnf;Lnf;B)I")
    public int method2517(class375 arg0, class375 arg1) {
        if (arg0.field4269 == 0 || arg1.field4269 == 0) {
            return this.method6118(arg0, arg1);
        } else if (this.field1368) {
            return arg0.method6104().method7527(arg1.method6104());
        } else {
            return arg1.method6104().method7527(arg0.method6104());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2517((class375) arg0, (class375) arg1);
    }
}
