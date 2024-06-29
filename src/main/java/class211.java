import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class211 extends class228 {

    @OriginalMember(owner = "client!k", name = "m", descriptor = "J")
    private long field3441 = 0L;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "J")
    private long field3442 = 0L;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "J")
    private long field3443 = 0L;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    private int field3444 = 0;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    private int field3445 = 1;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "[J")
    private long[] field3446 = new long[10];

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)J")
    public final long method14(int arg0) {
        if (arg0 != 22651) {
            this.method13(-55, -118, false);
        }
        return this.field3441;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
    public final void method12(int arg0) {
        if (arg0 != 6) {
            this.method1425(true);
        }
        this.field3442 = 0L;
        if (this.field3443 > this.field3441) {
            this.field3441 += this.field3443 - this.field3441;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)J")
    private final long method1425(boolean arg0) {
        long var2 = 0L;
        long var4 = class182.method1253(20215) * 1000000L;
        long var6 = var4 - this.field3442;
        this.field3442 = var4;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field3446[this.field3444] = var6;
            if (this.field3445 < 10) {
                this.field3445++;
            }
            this.field3444 = (this.field3444 + 1) % 10;
        }
        int var8 = 1;
        if (!arg0) {
            return -47L;
        }
        while (var8 <= this.field3445) {
            var2 += this.field3446[(this.field3444 + 10 - var8) % 10];
            var8++;
        }
        return var2 / (long) this.field3445;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZ)I")
    public final int method13(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field3442 = -19L;
        }
        long var4 = (long) arg0 * 1000000L;
        class208.method1408(42, (long) arg1);
        this.field3441 += this.method1425(arg2);
        if (this.field3443 > this.field3441) {
            class208.method1408(-128, (this.field3443 - this.field3441) / 1000000L);
            this.field3442 += this.field3443 - this.field3441;
            this.field3441 += this.field3443 - this.field3441;
            this.field3443 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field3443 += var4;
            var6++;
        } while (var6 < 10 && this.field3441 > this.field3443);
        if (this.field3441 > this.field3443) {
            this.field3443 = this.field3441;
        }
        return var6;
    }
}
