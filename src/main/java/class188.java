import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class188 extends class470 {

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "[J")
    private long[] field2785 = new long[10];

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "J")
    private long field2786 = 0L;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    private int field2787 = 0;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "J")
    private long field2788 = 0L;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    private int field2789 = 1;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "J")
    private long field2790 = 0L;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI)I", line = 10)
    public final int method842(byte arg0, int arg1) {
        this.field2786 += this.method1289(6559);
        if (arg0 != 101) {
            this.field2785 = null;
        }
        long var3 = (long) arg1 * 1000000L;
        if (this.field2786 < this.field2790) {
            class246.method1659((byte) 117, (this.field2790 - this.field2786) / 1000000L);
            this.field2788 += this.field2790 - this.field2786;
            this.field2786 += this.field2790 - this.field2786;
            this.field2790 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field2790 += var3;
            var5++;
        } while (var5 < 10 && this.field2790 < this.field2786);
        if (this.field2790 < this.field2786) {
            this.field2790 = this.field2786;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)J", line = 49)
    private final long method1289(int arg0) {
        long var2 = class256.method1708((byte) 118) * 1000000L;
        long var4 = var2 - this.field2788;
        this.field2788 = var2;
        if (arg0 != 6559) {
            return 8L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2785[this.field2787] = var4;
            if (this.field2789 < 10) {
                this.field2789++;
            }
            this.field2787 = (this.field2787 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2789; var8++) {
            var6 += this.field2785[(this.field2787 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2789;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)J", line = 98)
    public final long method843(byte arg0) {
        int var2 = -17 / ((arg0 + 39) / 51);
        return this.field2786;
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)V", line = 109)
    public final void method841(byte arg0) {
        this.field2788 = 0L;
        int var2 = 35 / ((arg0 + 65) / 47);
        if (this.field2786 < this.field2790) {
            this.field2786 += this.field2790 - this.field2786;
        }
    }
}
