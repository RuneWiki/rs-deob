package deob;

@ObfuscatedName("eo")
public class class127 extends class476 {

    @ObfuscatedName("eo.ap")
    public final boolean field1518;

    public class127(boolean arg0) {
        this.field1518 = arg0;
    }

    @ObfuscatedName("eo.ap(Lsv;Lsv;B)I")
    public int method3177(class479 arg0, class479 arg1) {
        if (client.field502 == arg0.field5022 && client.field502 == arg1.field5022) {
            return this.field1518 ? arg0.method8345().method9978(arg1.method8345()) : arg1.method8345().method9978(arg0.method8345());
        } else {
            return this.method8348(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3177((class479) arg0, (class479) arg1);
    }
}
