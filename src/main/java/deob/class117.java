package deob;

@ObfuscatedName("dh")
public class class117 extends class322 {

    @ObfuscatedName("dh.f")
    public final boolean field1422;

    public class117(boolean arg0) {
        this.field1422 = arg0;
    }

    @ObfuscatedName("dh.f(Llg;Llg;I)I")
    public int method2144(class325 arg0, class325 arg1) {
        if (arg0.field3852 == 0 || arg1.field3852 == 0) {
            return this.method5101(arg0, arg1);
        } else if (this.field1422) {
            return arg0.field3851 - arg1.field3851;
        } else {
            return arg1.field3851 - arg0.field3851;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2144((class325) arg0, (class325) arg1);
    }
}
