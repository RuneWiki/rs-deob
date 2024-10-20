package deob;

@ObfuscatedName("dp")
public class class120 extends class322 {

    @ObfuscatedName("dp.f")
    public final boolean field1435;

    public class120(boolean arg0) {
        this.field1435 = arg0;
    }

    @ObfuscatedName("dp.f(Llg;Llg;B)I")
    public int method2174(class325 arg0, class325 arg1) {
        if (client.field600 == arg0.field3852 && client.field600 == arg1.field3852) {
            return this.field1435 ? arg0.method5088().method5203(arg1.method5088()) : arg1.method5088().method5203(arg0.method5088());
        } else {
            return this.method5101(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2174((class325) arg0, (class325) arg1);
    }
}
