import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class152 extends class110 {

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "J")
    private long field3560;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)I")
    public final int method752(int arg0, int arg1, int arg2) {
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.field3560 - System.nanoTime();
        if (var4 > var6) {
            var6 = var4;
        }
        if (arg0 != -1) {
            this.method753(true);
        }
        class146.method1168(-19127, var6 / 1000000L);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || this.field3560 < var8)) {
            var10++;
            this.field3560 += (long) arg2 * 1000000L;
        }
        if (this.field3560 < var8) {
            this.field3560 = var8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public final void method753(boolean arg0) {
        if (!arg0) {
            this.field3560 = -32L;
        }
        this.method750(126);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public final void method750(int arg0) {
        this.field3560 = System.nanoTime();
        if (arg0 <= 118) {
            this.method750(-27);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class152() {
        this.method750(122);
    }
}
