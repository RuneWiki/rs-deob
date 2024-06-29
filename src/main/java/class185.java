import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class185 extends class148 {

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "J")
    private long field3029 = System.nanoTime();

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public final void method1033(int arg0) {
        if (arg0 == 0) {
            this.field3029 = System.nanoTime();
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)I")
    public final int method1032(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field3029 - System.nanoTime();
        if (arg2 != -17244) {
            this.field3029 = -61L;
        }
        if (var4 > var6) {
            var6 = var4;
        }
        class162.method1137(115, var6 / 1000000L);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || var8 > this.field3029)) {
            var10++;
            this.field3029 += (long) arg1 * 1000000L;
        }
        if (this.field3029 < var8) {
            this.field3029 = var8;
        }
        return var10;
    }
}
