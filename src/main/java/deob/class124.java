package deob;

@ObfuscatedName("eq")
public class class124 extends class476 {

    @ObfuscatedName("eq.ap")
    public final boolean field1507;

    public class124(boolean arg0) {
        this.field1507 = arg0;
    }

    @ObfuscatedName("eq.ap(Lsv;Lsv;I)I")
    public int method3145(class479 arg0, class479 arg1) {
        if (arg0.field5022 == 0 || arg1.field5022 == 0) {
            return this.method8348(arg0, arg1);
        } else if (this.field1507) {
            return arg0.field5025 - arg1.field5025;
        } else {
            return arg1.field5025 - arg0.field5025;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3145((class479) arg0, (class479) arg1);
    }
}
