package deob;

@ObfuscatedName("eu")
public class class123 extends class476 {

    @ObfuscatedName("eu.ap")
    public final boolean field1505;

    public class123(boolean arg0) {
        this.field1505 = arg0;
    }

    @ObfuscatedName("eu.ap(Lsv;Lsv;I)I")
    public int method3133(class479 arg0, class479 arg1) {
        if (client.field502 == arg0.field5022) {
            if (client.field502 != arg1.field5022) {
                return this.field1505 ? -1 : 1;
            }
        } else if (client.field502 == arg1.field5022) {
            return this.field1505 ? 1 : -1;
        }
        return this.method8348(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3133((class479) arg0, (class479) arg1);
    }
}
