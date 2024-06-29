import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class214 extends class38 {

    @OriginalMember(owner = "client!i", name = "k", descriptor = "J")
    private long field3488 = System.nanoTime();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 5)
    public final void method274(byte arg0) {
        this.field3488 = System.nanoTime();
        if (arg0 <= 125) {
            this.field3488 = 66L;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)I", line = 16)
    public final int method273(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field3488 - System.nanoTime();
        int var8 = 0;
        if (var6 < var4) {
            var6 = var4;
        }
        class4.method19(0, var6 / 1000000L);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field3488)) {
            var8++;
            this.field3488 += (long) arg2 * 1000000L;
        }
        if (arg1 != -199) {
            this.field3488 = -25L;
        }
        if (var9 > this.field3488) {
            this.field3488 = var9;
        }
        return var8;
    }
}
