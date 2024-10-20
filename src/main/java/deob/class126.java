package deob;

@ObfuscatedName("es")
public class class126 extends class476 {

    @ObfuscatedName("es.ap")
    public final boolean field1515;

    public class126(boolean arg0) {
        this.field1515 = arg0;
    }

    @ObfuscatedName("es.ap(Lsv;Lsv;I)I")
    public int method3173(class479 arg0, class479 arg1) {
        if (arg0.field5022 == arg1.field5022) {
            return this.method8348(arg0, arg1);
        } else if (this.field1515) {
            return arg0.field5022 - arg1.field5022;
        } else {
            return arg1.field5022 - arg0.field5022;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3173((class479) arg0, (class479) arg1);
    }
}
