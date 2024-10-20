package deob;

@ObfuscatedName("dr")
public class class116 extends class322 {

    @ObfuscatedName("dr.f")
    public final boolean field1415;

    public class116(boolean arg0) {
        this.field1415 = arg0;
    }

    @ObfuscatedName("dr.f(Llg;Llg;I)I")
    public int method2135(class325 arg0, class325 arg1) {
        if (client.field600 == arg0.field3852) {
            if (client.field600 != arg1.field3852) {
                return this.field1415 ? -1 : 1;
            }
        } else if (client.field600 == arg1.field3852) {
            return this.field1415 ? 1 : -1;
        }
        return this.method5101(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2135((class325) arg0, (class325) arg1);
    }
}
