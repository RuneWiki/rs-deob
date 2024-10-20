package deob;

@ObfuscatedName("dr")
public class class119 extends class395 {

    @ObfuscatedName("dr.h")
    public final boolean field1492;

    public class119(boolean arg0) {
        this.field1492 = arg0;
    }

    @ObfuscatedName("dr.h(Loa;Loa;B)I")
    public int method2725(class398 arg0, class398 arg1) {
        if (arg0.field4544 == arg1.field4544) {
            return this.method6863(arg0, arg1);
        } else if (this.field1492) {
            return arg0.field4544 - arg1.field4544;
        } else {
            return arg1.field4544 - arg0.field4544;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2725((class398) arg0, (class398) arg1);
    }
}
