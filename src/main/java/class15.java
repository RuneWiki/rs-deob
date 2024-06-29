import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 extends class89 {

    @OriginalMember(owner = "client!c", name = "s", descriptor = "J")
    private long field285 = System.nanoTime();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
    public final int method151(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        if (arg1 != 5000) {
            this.field285 = 100L;
        }
        long var6 = this.field285 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        class18.method164(false, var6 / 1000000L);
        int var8 = 0;
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field285)) {
            this.field285 += (long) arg0 * 1000000L;
            var8++;
        }
        if (var9 > this.field285) {
            this.field285 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public final void method152(boolean arg0) {
        this.field285 = System.nanoTime();
        if (arg0) {
            this.method152(false);
        }
    }
}
