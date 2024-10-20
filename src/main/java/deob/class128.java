package deob;

@ObfuscatedName("ee")
public class class128 extends class476 {

    @ObfuscatedName("ee.ap")
    public final boolean field1521;

    public class128(boolean arg0) {
        this.field1521 = arg0;
    }

    @ObfuscatedName("ee.ap(Lsv;Lsv;I)I")
    public int method3186(class479 arg0, class479 arg1) {
        if (client.field502 == arg0.field5022 && client.field502 == arg1.field5022) {
            return this.field1521 ? arg0.field5025 - arg1.field5025 : arg1.field5025 - arg0.field5025;
        } else {
            return this.method8348(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3186((class479) arg0, (class479) arg1);
    }
}
