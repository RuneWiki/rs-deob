package deob;

@ObfuscatedName("ea")
public class class129 extends class476 {

    @ObfuscatedName("ea.ap")
    public final boolean field1524;

    public class129(boolean arg0) {
        this.field1524 = arg0;
    }

    @ObfuscatedName("ea.ap(Lsv;Lsv;I)I")
    public int method3194(class479 arg0, class479 arg1) {
        if (arg0.field5024 == arg1.field5024) {
            return this.method8348(arg0, arg1);
        } else if (this.field1524) {
            return arg0.field5024 - arg1.field5024;
        } else {
            return arg1.field5024 - arg0.field5024;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3194((class479) arg0, (class479) arg1);
    }
}
