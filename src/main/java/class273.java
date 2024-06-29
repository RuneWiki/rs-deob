import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class273 extends class193 {

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "J")
    private long field3790 = 0L;

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "J")
    private long field3791 = 0L;

    @OriginalMember(owner = "client!saa", name = "k", descriptor = "J")
    private long field3793 = 0L;

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "I")
    private int field3792 = 1;

    @OriginalMember(owner = "client!saa", name = "m", descriptor = "[J")
    private long[] field3795 = new long[10];

    @OriginalMember(owner = "client!saa", name = "l", descriptor = "I")
    private int field3794 = 0;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)J")
    public final long method571(int arg0) {
        if (arg0 < 105) {
            this.method570(true);
        }
        return this.field3790;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)J")
    public final long method573(byte arg0) {
        if (arg0 <= 38) {
            this.field3791 = 34L;
        }
        this.field3790 += this.method1768(0);
        return this.field3790 < this.field3791 ? (this.field3791 - this.field3790) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(IJ)I")
    public final int method574(int arg0, long arg1) {
        if (arg0 != 2) {
            return -70;
        } else if (this.field3791 > this.field3790) {
            this.field3793 += this.field3791 - this.field3790;
            this.field3790 += this.field3791 - this.field3790;
            this.field3791 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field3791 += arg1;
                var4++;
            } while (var4 < 10 && this.field3790 > this.field3791);
            if (this.field3791 < this.field3790) {
                this.field3791 = this.field3790;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(I)J")
    private final long method1768(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field3793;
        this.field3793 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3795[this.field3794] = var4;
            if (this.field3792 < 1) {
                this.field3792++;
            }
            this.field3794 = (this.field3794 + 1) % 10;
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field3792; var8++) {
            var6 += this.field3795[(this.field3794 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3792;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)V")
    public final void method570(boolean arg0) {
        if (this.field3790 < this.field3791) {
            this.field3790 += this.field3791 - this.field3790;
        }
        this.field3793 = 0L;
        if (arg0) {
            this.field3794 = 7;
        }
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "()V")
    public class273() {
        this.field3791 = this.field3790 = jagmisc.nanoTime();
        if (this.field3790 == 0L) {
            throw new RuntimeException();
        }
    }
}
