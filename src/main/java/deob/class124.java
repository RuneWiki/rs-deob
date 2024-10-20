package deob;

@ObfuscatedName("et")
public class class124 extends class471 {

    @ObfuscatedName("et.ak")
    public final boolean field1517;

    public class124(boolean arg0) {
        this.field1517 = arg0;
    }

    @ObfuscatedName("et.ak(Lso;Lso;I)I")
    public int method2857(class474 arg0, class474 arg1) {
        if (client.field600 == arg0.field4932 && client.field600 == arg1.field4932) {
            return this.field1517 ? arg0.method7890().method9400(arg1.method7890()) : arg1.method7890().method9400(arg0.method7890());
        } else {
            return this.method7897(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2857((class474) arg0, (class474) arg1);
    }
}
