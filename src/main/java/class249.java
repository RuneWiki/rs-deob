import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class249 extends class401 {

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
    private int field3600 = 1;

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "J")
    private long field3599 = 0L;

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "[J")
    private long[] field3601 = new long[10];

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "J")
    private long field3598 = 0L;

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
    private int field3603 = 0;

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "J")
    private long field3602 = 0L;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)J", line = 5)
    public final long method1696(int arg0) {
        if (arg0 != -18931) {
            this.field3603 = 65;
        }
        return this.field3602;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IJ)I", line = 16)
    public final int method1697(int arg0, long arg1) {
        if (arg0 != 71) {
            return 127;
        } else if (this.field3602 < this.field3598) {
            this.field3599 += this.field3598 - this.field3602;
            this.field3602 += this.field3598 - this.field3602;
            this.field3598 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field3598 += arg1;
            } while (var4 < 10 && this.field3602 > this.field3598);
            if (this.field3598 < this.field3602) {
                this.field3598 = this.field3602;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)J", line = 52)
    public final long method1698(int arg0) {
        if (arg0 >= -60) {
            this.field3600 = 64;
        }
        this.field3602 += this.method1700(56);
        return this.field3598 > this.field3602 ? (this.field3598 - this.field3602) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V", line = 68)
    public final void method1699(byte arg0) {
        this.field3599 = 0L;
        if (this.field3598 > this.field3602) {
            this.field3602 += this.field3598 - this.field3602;
        }
        if (arg0 < 88) {
            this.field3602 = -33L;
        }
    }

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "(I)J", line = 82)
    private final long method1700(int arg0) {
        long var2 = class554.method3190(-56) * 1000000L;
        long var4 = var2 - this.field3599;
        this.field3599 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3601[this.field3603] = var4;
            if (this.field3600 < 10) {
                this.field3600++;
            }
            this.field3603 = (this.field3603 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = 1;
        if (arg0 <= 0) {
            this.method1697(91, -39L);
        }
        while (this.field3600 >= var8) {
            var6 += this.field3601[(this.field3603 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field3600;
    }
}
