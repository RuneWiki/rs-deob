package deob;

@ObfuscatedName("dc")
public class class105 extends class373 {

    @ObfuscatedName("dc.o")
    public final boolean field1380;

    public class105(boolean arg0) {
        this.field1380 = arg0;
    }

    @ObfuscatedName("dc.o(Lns;Lns;I)I")
    public int method2441(class376 arg0, class376 arg1) {
        if (client.field539 == arg0.field4335) {
            if (client.field539 != arg1.field4335) {
                return this.field1380 ? -1 : 1;
            }
        } else if (client.field539 == arg1.field4335) {
            return this.field1380 ? 1 : -1;
        }
        return this.method6016(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2441((class376) arg0, (class376) arg1);
    }
}
