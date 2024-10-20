package deob;

@ObfuscatedName("du")
public class class118 extends class322 {

    @ObfuscatedName("du.f")
    public final boolean field1426;

    public class118(boolean arg0) {
        this.field1426 = arg0;
    }

    @ObfuscatedName("du.f(Llg;Llg;I)I")
    public int method2152(class325 arg0, class325 arg1) {
        if (arg0.field3852 == 0) {
            if (arg1.field3852 != 0) {
                return this.field1426 ? 1 : -1;
            }
        } else if (arg1.field3852 == 0) {
            return this.field1426 ? -1 : 1;
        }
        return this.method5101(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2152((class325) arg0, (class325) arg1);
    }
}
