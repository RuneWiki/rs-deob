import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class34 {

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "J")
    private long field17;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)I")
    public final int method6(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        if (arg2 != 64) {
            this.method6(53, 83, 26);
        }
        int var6 = 0;
        long var7 = this.field17 - System.nanoTime();
        if (var4 > var7) {
            var7 = var4;
        }
        class141.method1122(17525, var7 / 1000000L);
        long var9 = System.nanoTime();
        while (var6 < 10 && (var6 < 1 || this.field17 < var9)) {
            var6++;
            this.field17 += (long) arg1 * 1000000L;
        }
        if (this.field17 < var9) {
            this.field17 = var9;
        }
        return var6;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class2() {
        this.method8(15);
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        this.method8(15);
        if (arg0 != -2982) {
            this.field17 = -38L;
        }
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
    public final void method8(int arg0) {
        this.field17 = System.nanoTime();
        if (arg0 != 15) {
            this.field17 = -26L;
        }
    }
}
