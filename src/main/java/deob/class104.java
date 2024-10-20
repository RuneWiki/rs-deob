package deob;

@ObfuscatedName("cv")
public class class104 extends class356 {

    @ObfuscatedName("cv.c")
    public final boolean field1356;

    public class104(boolean arg0) {
        this.field1356 = arg0;
    }

    @ObfuscatedName("cv.c(Lmd;Lmd;I)I")
    public int method2335(class359 arg0, class359 arg1) {
        if (arg0.field4172 == 0 || arg1.field4172 == 0) {
            return this.method5777(arg0, arg1);
        } else if (this.field1356) {
            return arg0.field4173 - arg1.field4173;
        } else {
            return arg1.field4173 - arg0.field4173;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2335((class359) arg0, (class359) arg1);
    }
}
