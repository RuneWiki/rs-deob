package deob;

@ObfuscatedName("cm")
public class class104 extends class339 {

    @ObfuscatedName("cm.l")
    public final boolean field1328;

    public class104(boolean arg0) {
        this.field1328 = arg0;
    }

    @ObfuscatedName("cm.l(Lmi;Lmi;B)I")
    public int method2312(class342 arg0, class342 arg1) {
        if (arg0.field3976 == 0 || arg1.field3976 == 0) {
            return this.method5534(arg0, arg1);
        } else if (this.field1328) {
            return arg0.field3975 - arg1.field3975;
        } else {
            return arg1.field3975 - arg0.field3975;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2312((class342) arg0, (class342) arg1);
    }
}
