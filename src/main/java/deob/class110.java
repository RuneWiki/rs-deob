package deob;

@ObfuscatedName("dt")
public class class110 extends class351 {

    @ObfuscatedName("dt.c")
    public final boolean field1346;

    public class110(boolean arg0) {
        this.field1346 = arg0;
    }

    @ObfuscatedName("dt.c(Lmp;Lmp;I)I")
    public int method2425(class354 arg0, class354 arg1) {
        if (arg0.field4121 == 0 || arg1.field4121 == 0) {
            return this.method5785(arg0, arg1);
        } else if (this.field1346) {
            return arg0.method5770().method7190(arg1.method5770());
        } else {
            return arg1.method5770().method7190(arg0.method5770());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2425((class354) arg0, (class354) arg1);
    }
}
