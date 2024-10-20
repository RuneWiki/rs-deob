package deob;

@ObfuscatedName("cy")
public class class103 extends class339 {

    @ObfuscatedName("cy.i")
    public final boolean field1308;

    public class103(boolean arg0) {
        this.field1308 = arg0;
    }

    @ObfuscatedName("cy.i(Lmt;Lmt;I)I")
    public int method2320(class342 arg0, class342 arg1) {
        if (client.field463 == arg0.field3965) {
            if (client.field463 != arg1.field3965) {
                return this.field1308 ? -1 : 1;
            }
        } else if (client.field463 == arg1.field3965) {
            return this.field1308 ? 1 : -1;
        }
        return this.method5491(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2320((class342) arg0, (class342) arg1);
    }
}
