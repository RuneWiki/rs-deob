import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class228 extends class135 {

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "[J")
    private long[] field3746 = new long[10];

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "J")
    private long field3750 = 0L;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    private int field3748 = 0;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    private int field3749 = 1;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "J")
    private long field3747 = 0L;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "J")
    private long field3751 = 0L;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)J", line = 9)
    private final long method1588(byte arg0) {
        long var2 = class218.method1520((byte) 74) * 1000000L;
        long var4 = 0L;
        long var6 = var2 - this.field3750;
        this.field3750 = var2;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field3746[this.field3748] = var6;
            if (this.field3749 < 10) {
                this.field3749++;
            }
            this.field3748 = (this.field3748 + 1) % 10;
        }
        if (arg0 != -128) {
            this.field3749 = -72;
        }
        for (int var8 = 1; var8 <= this.field3749; var8++) {
            var4 += this.field3746[(this.field3748 + 10 - var8) % 10];
        }
        return var4 / (long) this.field3749;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V", line = 39)
    public final void method39(boolean arg0) {
        if (arg0) {
            if (this.field3747 > this.field3751) {
                this.field3751 += this.field3747 - this.field3751;
            }
            this.field3750 = 0L;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)J", line = 63)
    public final long method37(boolean arg0) {
        if (arg0) {
            this.method39(false);
        }
        return this.field3751;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)I", line = 83)
    public final int method38(int arg0, int arg1, int arg2) {
        class122.method881(39, (long) arg2);
        this.field3751 += this.method1588((byte) -128);
        long var4 = (long) arg1 * 1000000L;
        if (arg0 != -128) {
            this.method1588((byte) 83);
        }
        if (this.field3747 > this.field3751) {
            class122.method881(-99, (this.field3747 - this.field3751) / 1000000L);
            this.field3750 += this.field3747 - this.field3751;
            this.field3751 += this.field3747 - this.field3751;
            this.field3747 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field3747 += var4;
        } while (var6 < 10 && this.field3751 > this.field3747);
        if (this.field3751 > this.field3747) {
            this.field3747 = this.field3751;
        }
        return var6;
    }
}
