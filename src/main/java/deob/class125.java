package deob;

@ObfuscatedName("ew")
public class class125 extends class473 {

    @ObfuscatedName("ew.ab")
    public final boolean field1493;

    public class125(boolean arg0) {
        this.field1493 = arg0;
    }

    @ObfuscatedName("ew.ab(Lsc;Lsc;I)I")
    public int method2938(class476 arg0, class476 arg1) {
        if (client.field798 == arg0.field4938 && client.field798 == arg1.field4938) {
            return this.field1493 ? arg0.method7944().method9478(arg1.method7944()) : arg1.method7944().method9478(arg0.method7944());
        } else {
            return this.method7948(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2938((class476) arg0, (class476) arg1);
    }
}
