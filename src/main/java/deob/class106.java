package deob;

@ObfuscatedName("dr")
public class class106 extends class351 {

    @ObfuscatedName("dr.c")
    public final boolean field1335;

    public class106(boolean arg0) {
        this.field1335 = arg0;
    }

    @ObfuscatedName("dr.c(Lmp;Lmp;I)I")
    public int method2405(class354 arg0, class354 arg1) {
        if (arg0.field4121 == arg1.field4121) {
            return this.method5785(arg0, arg1);
        } else if (this.field1335) {
            return arg0.field4121 - arg1.field4121;
        } else {
            return arg1.field4121 - arg0.field4121;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2405((class354) arg0, (class354) arg1);
    }
}
