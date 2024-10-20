package deob;

@ObfuscatedName("db")
public class class121 extends class322 {

    @ObfuscatedName("db.f")
    public final boolean field1444;

    public class121(boolean arg0) {
        this.field1444 = arg0;
    }

    @ObfuscatedName("db.f(Llg;Llg;I)I")
    public int method2180(class325 arg0, class325 arg1) {
        if (client.field600 == arg0.field3852 && client.field600 == arg1.field3852) {
            return this.field1444 ? arg0.field3851 - arg1.field3851 : arg1.field3851 - arg0.field3851;
        } else {
            return this.method5101(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2180((class325) arg0, (class325) arg1);
    }
}
