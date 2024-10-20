package deob;

@ObfuscatedName("cm")
public class class104 extends class351 {

    @ObfuscatedName("cm.c")
    public final boolean field1319;

    public class104(boolean arg0) {
        this.field1319 = arg0;
    }

    @ObfuscatedName("cm.c(Lmp;Lmp;I)I")
    public int method2389(class354 arg0, class354 arg1) {
        if (arg0.field4121 == 0 || arg1.field4121 == 0) {
            return this.method5785(arg0, arg1);
        } else if (this.field1319) {
            return arg0.field4120 - arg1.field4120;
        } else {
            return arg1.field4120 - arg0.field4120;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2389((class354) arg0, (class354) arg1);
    }
}
