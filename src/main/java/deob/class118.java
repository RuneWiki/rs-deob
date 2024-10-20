package deob;

@ObfuscatedName("dx")
public class class118 extends class395 {

    @ObfuscatedName("dx.h")
    public final boolean field1485;

    public class118(boolean arg0) {
        this.field1485 = arg0;
    }

    @ObfuscatedName("dx.h(Loa;Loa;I)I")
    public int method2717(class398 arg0, class398 arg1) {
        if (client.field683 == arg0.field4543 && client.field683 == arg1.field4543) {
            return this.field1485 ? arg0.field4545 - arg1.field4545 : arg1.field4545 - arg0.field4545;
        } else {
            return this.method6863(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2717((class398) arg0, (class398) arg1);
    }
}
