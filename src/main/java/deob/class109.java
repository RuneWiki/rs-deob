package deob;

@ObfuscatedName("do")
public class class109 extends class351 {

    @ObfuscatedName("do.c")
    public final boolean field1345;

    public class109(boolean arg0) {
        this.field1345 = arg0;
    }

    @ObfuscatedName("do.c(Lmp;Lmp;I)I")
    public int method2421(class354 arg0, class354 arg1) {
        if (arg0.field4119 == arg1.field4119) {
            return this.method5785(arg0, arg1);
        } else if (this.field1345) {
            return arg0.field4119 - arg1.field4119;
        } else {
            return arg1.field4119 - arg0.field4119;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2421((class354) arg0, (class354) arg1);
    }
}
