package deob;

@ObfuscatedName("du")
public class class105 extends class373 {

    @ObfuscatedName("du.s")
    public final boolean field1368;

    public class105(boolean arg0) {
        this.field1368 = arg0;
    }

    @ObfuscatedName("du.s(Lnt;Lnt;I)I")
    public int method2409(class376 arg0, class376 arg1) {
        if (client.field476 == arg0.field4328) {
            if (client.field476 != arg1.field4328) {
                return this.field1368 ? -1 : 1;
            }
        } else if (client.field476 == arg1.field4328) {
            return this.field1368 ? 1 : -1;
        }
        return this.method6015(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2409((class376) arg0, (class376) arg1);
    }
}
