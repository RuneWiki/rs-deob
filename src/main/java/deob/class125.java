package deob;

@ObfuscatedName("eb")
public class class125 extends class476 {

    @ObfuscatedName("eb.ap")
    public final boolean field1510;

    public class125(boolean arg0) {
        this.field1510 = arg0;
    }

    @ObfuscatedName("eb.ap(Lsv;Lsv;B)I")
    public int method3158(class479 arg0, class479 arg1) {
        if (arg0.field5022 == 0) {
            if (arg1.field5022 != 0) {
                return this.field1510 ? 1 : -1;
            }
        } else if (arg1.field5022 == 0) {
            return this.field1510 ? -1 : 1;
        }
        return this.method8348(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3158((class479) arg0, (class479) arg1);
    }
}
