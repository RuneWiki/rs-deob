import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class263 extends class14 {

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "J")
    private long field3889 = 0L;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    private int field3890 = 1;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "[J")
    private long[] field3891 = new long[10];

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    private int field3892 = 0;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "J")
    private long field3893 = 0L;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "J")
    private long field3894 = 0L;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)J", line = 4)
    public final long method186(byte arg0) {
        if (arg0 >= -107) {
            this.method184(false, 87, -37);
        }
        return this.field3894;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 15)
    public final void method181(byte arg0) {
        if (this.field3894 < this.field3889) {
            this.field3894 += this.field3889 - this.field3894;
        }
        this.field3893 = 0L;
        if (arg0 > -35) {
            this.method181((byte) 34);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZII)I", line = 28)
    public final int method184(boolean arg0, int arg1, int arg2) {
        class245.method1729(127, (long) arg2);
        if (arg0) {
            this.method184(false, 0, 34);
        }
        this.field3894 += this.method1820(-18618);
        long var4 = (long) arg1 * 1000000L;
        if (this.field3889 > this.field3894) {
            class245.method1729(126, (this.field3889 - this.field3894) / 1000000L);
            this.field3893 += this.field3889 - this.field3894;
            this.field3894 += this.field3889 - this.field3894;
            this.field3889 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field3889 += var4;
        } while (var6 < 10 && this.field3894 > this.field3889);
        if (this.field3889 < this.field3894) {
            this.field3889 = this.field3894;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)J", line = 75)
    private final long method1820(int arg0) {
        long var2 = class212.method1543(22326) * 1000000L;
        long var4 = var2 - this.field3893;
        long var6 = 0L;
        this.field3893 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3891[this.field3892] = var4;
            if (this.field3890 < 10) {
                this.field3890++;
            }
            this.field3892 = (this.field3892 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field3890; var8++) {
            var6 += this.field3891[(this.field3892 + 10 - var8) % 10];
        }
        if (arg0 != -18618) {
            this.field3891 = (long[]) null;
        }
        return var6 / (long) this.field3890;
    }
}
