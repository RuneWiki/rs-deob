package deob;

@ObfuscatedName("dd")
public class class110 extends class373 {

    @ObfuscatedName("dd.s")
    public final boolean field1391;

    public class110(boolean arg0) {
        this.field1391 = arg0;
    }

    @ObfuscatedName("dd.s(Lnt;Lnt;I)I")
    public int method2459(class376 arg0, class376 arg1) {
        if (client.field476 == arg0.field4328 && client.field476 == arg1.field4328) {
            return this.field1391 ? arg0.field4325 - arg1.field4325 : arg1.field4325 - arg0.field4325;
        } else {
            return this.method6015(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2459((class376) arg0, (class376) arg1);
    }
}
