import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class225 extends class212 {

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "J")
    private long field3529 = 0L;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "J")
    private long field3528 = 0L;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    private int field3532 = 1;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "J")
    private long field3531 = 0L;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "[J")
    private long[] field3530 = new long[10];

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    private int field3533 = 0;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
    public final void method808(boolean arg0) {
        if (this.field3529 < this.field3531) {
            this.field3529 += this.field3531 - this.field3529;
        }
        this.field3528 = 0L;
        if (!arg0) {
            this.field3532 = -101;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)I")
    public final int method807(int arg0, int arg1, int arg2) {
        if (arg2 != 24874) {
            return -100;
        }
        class42.method354((long) arg1, false);
        long var4 = (long) arg0 * 1000000L;
        this.field3529 += this.method1504((byte) -112);
        if (this.field3531 > this.field3529) {
            class42.method354((this.field3531 - this.field3529) / 1000000L, false);
            this.field3528 += this.field3531 - this.field3529;
            this.field3529 += this.field3531 - this.field3529;
            this.field3531 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field3531 += var4;
            var6++;
        } while (var6 < 10 && this.field3531 < this.field3529);
        if (this.field3529 > this.field3531) {
            this.field3531 = this.field3529;
        }
        return var6;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)J")
    public final long method805(byte arg0) {
        int var2 = 18 / ((arg0 - 70) / 54);
        return this.field3529;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)J")
    private final long method1504(byte arg0) {
        long var2 = class269.method1823(-125) * 1000000L;
        long var4 = 0L;
        long var6 = var2 - this.field3528;
        this.field3528 = var2;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field3530[this.field3533] = var6;
            if (this.field3532 < 10) {
                this.field3532++;
            }
            this.field3533 = (this.field3533 + 1) % 10;
        }
        int var8 = 1;
        int var9 = -86 % ((arg0 - 4) / 45);
        while (this.field3532 >= var8) {
            var4 += this.field3530[(this.field3533 - (var8 - 10)) % 10];
            var8++;
        }
        return var4 / (long) this.field3532;
    }
}
