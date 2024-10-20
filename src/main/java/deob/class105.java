package deob;

@ObfuscatedName("dm")
public class class105 extends class351 {

    @ObfuscatedName("dm.c")
    public final boolean field1329;

    public class105(boolean arg0) {
        this.field1329 = arg0;
    }

    @ObfuscatedName("dm.c(Lmp;Lmp;I)I")
    public int method2403(class354 arg0, class354 arg1) {
        if (arg0.field4121 == 0) {
            if (arg1.field4121 != 0) {
                return this.field1329 ? 1 : -1;
            }
        } else if (arg1.field4121 == 0) {
            return this.field1329 ? -1 : 1;
        }
        return this.method5785(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2403((class354) arg0, (class354) arg1);
    }
}
