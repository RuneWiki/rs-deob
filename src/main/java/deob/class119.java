package deob;

@ObfuscatedName("di")
public class class119 extends class322 {

    @ObfuscatedName("di.f")
    public final boolean field1430;

    public class119(boolean arg0) {
        this.field1430 = arg0;
    }

    @ObfuscatedName("di.f(Llg;Llg;I)I")
    public int method2164(class325 arg0, class325 arg1) {
        if (arg0.field3852 == arg1.field3852) {
            return this.method5101(arg0, arg1);
        } else if (this.field1430) {
            return arg0.field3852 - arg1.field3852;
        } else {
            return arg1.field3852 - arg0.field3852;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2164((class325) arg0, (class325) arg1);
    }
}
