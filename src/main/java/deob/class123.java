package deob;

@ObfuscatedName("dv")
public class class123 extends class322 {

    @ObfuscatedName("dv.f")
    public final boolean field1450;

    public class123(boolean arg0) {
        this.field1450 = arg0;
    }

    @ObfuscatedName("dv.f(Llg;Llg;I)I")
    public int method2195(class325 arg0, class325 arg1) {
        if (arg0.field3852 == 0 || arg1.field3852 == 0) {
            return this.method5101(arg0, arg1);
        } else if (this.field1450) {
            return arg0.method5088().method5203(arg1.method5088());
        } else {
            return arg1.method5088().method5203(arg0.method5088());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2195((class325) arg0, (class325) arg1);
    }
}
