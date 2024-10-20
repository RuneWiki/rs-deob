package deob;

@ObfuscatedName("df")
public class class116 extends class395 {

    @ObfuscatedName("df.h")
    public final boolean field1480;

    public class116(boolean arg0) {
        this.field1480 = arg0;
    }

    @ObfuscatedName("df.h(Loa;Loa;I)I")
    public int method2699(class398 arg0, class398 arg1) {
        if (arg0.field4543 == arg1.field4543) {
            return this.method6863(arg0, arg1);
        } else if (this.field1480) {
            return arg0.field4543 - arg1.field4543;
        } else {
            return arg1.field4543 - arg0.field4543;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2699((class398) arg0, (class398) arg1);
    }
}
