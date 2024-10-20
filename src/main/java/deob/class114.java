package deob;

@ObfuscatedName("dc")
public class class114 extends class395 {

    @ObfuscatedName("dc.h")
    public final boolean field1466;

    public class114(boolean arg0) {
        this.field1466 = arg0;
    }

    @ObfuscatedName("dc.h(Loa;Loa;I)I")
    public int method2679(class398 arg0, class398 arg1) {
        if (arg0.field4543 == 0 || arg1.field4543 == 0) {
            return this.method6863(arg0, arg1);
        } else if (this.field1466) {
            return arg0.field4545 - arg1.field4545;
        } else {
            return arg1.field4545 - arg0.field4545;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2679((class398) arg0, (class398) arg1);
    }
}
