package deob;

@ObfuscatedName("dv")
public class class108 extends class351 {

    @ObfuscatedName("dv.c")
    public final boolean field1341;

    public class108(boolean arg0) {
        this.field1341 = arg0;
    }

    @ObfuscatedName("dv.c(Lmp;Lmp;B)I")
    public int method2416(class354 arg0, class354 arg1) {
        if (client.field469 == arg0.field4121 && client.field469 == arg1.field4121) {
            return this.field1341 ? arg0.field4120 - arg1.field4120 : arg1.field4120 - arg0.field4120;
        } else {
            return this.method5785(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2416((class354) arg0, (class354) arg1);
    }
}
