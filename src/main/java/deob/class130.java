package deob;

@ObfuscatedName("et")
public class class130 extends class476 {

    @ObfuscatedName("et.ap")
    public final boolean field1528;

    public class130(boolean arg0) {
        this.field1528 = arg0;
    }

    @ObfuscatedName("et.ap(Lsv;Lsv;I)I")
    public int method3205(class479 arg0, class479 arg1) {
        if (arg0.field5022 == 0 || arg1.field5022 == 0) {
            return this.method8348(arg0, arg1);
        } else if (this.field1528) {
            return arg0.method8345().method9978(arg1.method8345());
        } else {
            return arg1.method8345().method9978(arg0.method8345());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3205((class479) arg0, (class479) arg1);
    }
}
