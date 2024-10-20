package deob;

@ObfuscatedName("ce")
public class class104 extends class338 {

    @ObfuscatedName("ce.n")
    public final boolean field1318;

    public class104(boolean arg0) {
        this.field1318 = arg0;
    }

    @ObfuscatedName("ce.n(Lmm;Lmm;B)I")
    public int method2278(class341 arg0, class341 arg1) {
        if (arg0.field3965 == 0 || arg1.field3965 == 0) {
            return this.method5476(arg0, arg1);
        } else if (this.field1318) {
            return arg0.field3963 - arg1.field3963;
        } else {
            return arg1.field3963 - arg0.field3963;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2278((class341) arg0, (class341) arg1);
    }
}
