import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class175 extends class123 {

    @OriginalMember(owner = "client!o", name = "s", descriptor = "J")
    private long field3136 = System.nanoTime();

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
    public final void method402(boolean arg0) {
        this.field3136 = System.nanoTime();
        if (arg0) {
            this.method400(-56, -30, 76);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)I")
    public final int method400(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field3136 - System.nanoTime();
        int var8 = -57 / ((25 - arg2) / 60);
        if (var4 > var6) {
            var6 = var4;
        }
        class19.method136(1, var6 / 1000000L);
        long var9 = System.nanoTime();
        int var11 = 0;
        while (var11 < 10 && (var11 < 1 || this.field3136 < var9)) {
            var11++;
            this.field3136 += (long) arg1 * 1000000L;
        }
        if (var9 > this.field3136) {
            this.field3136 = var9;
        }
        return var11;
    }
}
