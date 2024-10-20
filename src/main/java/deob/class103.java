package deob;

@ObfuscatedName("cb")
public class class103 extends class339 {

    @ObfuscatedName("cb.l")
    public final boolean field1327;

    public class103(boolean arg0) {
        this.field1327 = arg0;
    }

    @ObfuscatedName("cb.l(Lmi;Lmi;B)I")
    public int method2300(class342 arg0, class342 arg1) {
        if (client.field483 == arg0.field3976) {
            if (client.field483 != arg1.field3976) {
                return this.field1327 ? -1 : 1;
            }
        } else if (client.field483 == arg1.field3976) {
            return this.field1327 ? 1 : -1;
        }
        return this.method5534(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2300((class342) arg0, (class342) arg1);
    }
}
