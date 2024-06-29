import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 extends class228 {

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "J")
    private long field19 = 0L;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "J")
    private long field20 = 0L;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "[J")
    private long[] field21 = new long[10];

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    private int field23 = 0;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    private int field24 = 1;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "J")
    private long field22 = 0L;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public final void method12(int arg0) {
        if (this.field19 < this.field20) {
            this.field19 += this.field20 - this.field19;
        }
        this.field22 = 0L;
        if (arg0 != 6) {
            this.field21 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIZ)I")
    public final int method13(int arg0, int arg1, boolean arg2) {
        class208.method1408(-7, (long) arg1);
        long var4 = (long) arg0 * 1000000L;
        if (!arg2) {
            this.field24 = -58;
        }
        this.field19 += this.method15(24407);
        if (this.field20 > this.field19) {
            class208.method1408(12, (this.field20 - this.field19) / 1000000L);
            this.field22 += this.field20 - this.field19;
            this.field19 += this.field20 - this.field19;
            this.field20 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field20 += var4;
            var6++;
        } while (var6 < 10 && this.field19 > this.field20);
        if (this.field19 > this.field20) {
            this.field20 = this.field19;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)J")
    public final long method14(int arg0) {
        if (arg0 != 22651) {
            this.method15(86);
        }
        return this.field19;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)J")
    private final long method15(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field22;
        this.field22 = var2;
        if (arg0 != 24407) {
            this.method12(-101);
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field21[this.field23] = var4;
            if (this.field24 < 1) {
                this.field24++;
            }
            this.field23 = (this.field23 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field24; var8++) {
            var6 += this.field21[(this.field23 + 10 - var8) % 10];
        }
        return var6 / (long) this.field24;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class2() {
        this.field19 = System.nanoTime();
        this.field20 = System.nanoTime();
    }
}
