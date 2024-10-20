package deob;

@ObfuscatedName("dy")
public class class117 extends class395 {

    @ObfuscatedName("dy.h")
    public final boolean field1483;

    public class117(boolean arg0) {
        this.field1483 = arg0;
    }

    @ObfuscatedName("dy.h(Loa;Loa;I)I")
    public int method2707(class398 arg0, class398 arg1) {
        if (client.field683 == arg0.field4543 && client.field683 == arg1.field4543) {
            return this.field1483 ? arg0.method6844().method8391(arg1.method6844()) : arg1.method6844().method8391(arg0.method6844());
        } else {
            return this.method6863(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2707((class398) arg0, (class398) arg1);
    }
}
