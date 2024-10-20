package deob;

@ObfuscatedName("dr")
public class class109 extends class356 {

    @ObfuscatedName("dr.c")
    public final boolean field1373;

    public class109(boolean arg0) {
        this.field1373 = arg0;
    }

    @ObfuscatedName("dr.c(Lmd;Lmd;I)I")
    public int method2380(class359 arg0, class359 arg1) {
        if (arg0.field4174 == arg1.field4174) {
            return this.method5777(arg0, arg1);
        } else if (this.field1373) {
            return arg0.field4174 - arg1.field4174;
        } else {
            return arg1.field4174 - arg0.field4174;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2380((class359) arg0, (class359) arg1);
    }
}
