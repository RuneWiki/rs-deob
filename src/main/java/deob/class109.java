package deob;

@ObfuscatedName("dv")
public class class109 extends class373 {

    @ObfuscatedName("dv.s")
    public final boolean field1390;

    public class109(boolean arg0) {
        this.field1390 = arg0;
    }

    @ObfuscatedName("dv.s(Lnt;Lnt;I)I")
    public int method2456(class376 arg0, class376 arg1) {
        if (client.field476 == arg0.field4328 && client.field476 == arg1.field4328) {
            return this.field1390 ? arg0.method5996().method7490(arg1.method5996()) : arg1.method5996().method7490(arg0.method5996());
        } else {
            return this.method6015(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2456((class376) arg0, (class376) arg1);
    }
}
