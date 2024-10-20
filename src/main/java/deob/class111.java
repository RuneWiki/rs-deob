package deob;

@ObfuscatedName("ds")
public class class111 extends class372 {

    @ObfuscatedName("ds.c")
    public final boolean field1413;

    public class111(boolean arg0) {
        this.field1413 = arg0;
    }

    @ObfuscatedName("ds.c(Lnm;Lnm;B)I")
    public int method2488(class375 arg0, class375 arg1) {
        if (arg0.field4324 == arg1.field4324) {
            return this.method6090(arg0, arg1);
        } else if (this.field1413) {
            return arg0.field4324 - arg1.field4324;
        } else {
            return arg1.field4324 - arg0.field4324;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2488((class375) arg0, (class375) arg1);
    }
}
