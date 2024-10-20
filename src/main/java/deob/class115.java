package deob;

@ObfuscatedName("dk")
public class class115 extends class395 {

    @ObfuscatedName("dk.h")
    public final boolean field1470;

    public class115(boolean arg0) {
        this.field1470 = arg0;
    }

    @ObfuscatedName("dk.h(Loa;Loa;I)I")
    public int method2688(class398 arg0, class398 arg1) {
        if (arg0.field4543 == 0) {
            if (arg1.field4543 != 0) {
                return this.field1470 ? 1 : -1;
            }
        } else if (arg1.field4543 == 0) {
            return this.field1470 ? -1 : 1;
        }
        return this.method6863(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2688((class398) arg0, (class398) arg1);
    }
}
