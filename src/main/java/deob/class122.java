package deob;

@ObfuscatedName("ds")
public class class122 extends class322 {

    @ObfuscatedName("ds.f")
    public final boolean field1446;

    public class122(boolean arg0) {
        this.field1446 = arg0;
    }

    @ObfuscatedName("ds.f(Llg;Llg;B)I")
    public int method2187(class325 arg0, class325 arg1) {
        if (arg0.field3853 == arg1.field3853) {
            return this.method5101(arg0, arg1);
        } else if (this.field1446) {
            return arg0.field3853 - arg1.field3853;
        } else {
            return arg1.field3853 - arg0.field3853;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2187((class325) arg0, (class325) arg1);
    }
}
