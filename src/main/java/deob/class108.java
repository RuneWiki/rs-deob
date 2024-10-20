package deob;

@ObfuscatedName("dr")
public class class108 extends class372 {

    @ObfuscatedName("dr.c")
    public final boolean field1395;

    public class108(boolean arg0) {
        this.field1395 = arg0;
    }

    @ObfuscatedName("dr.c(Lnm;Lnm;B)I")
    public int method2464(class375 arg0, class375 arg1) {
        if (arg0.field4325 == arg1.field4325) {
            return this.method6090(arg0, arg1);
        } else if (this.field1395) {
            return arg0.field4325 - arg1.field4325;
        } else {
            return arg1.field4325 - arg0.field4325;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2464((class375) arg0, (class375) arg1);
    }
}
