import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class251 extends class204 {

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "J")
    private long field3642 = 0L;

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "J")
    private long field3643 = 0L;

    @OriginalMember(owner = "client!iaa", name = "g", descriptor = "I")
    private int field3641 = 0;

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "[J")
    private long[] field3644 = new long[10];

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "I")
    private int field3646 = 1;

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "J")
    private long field3645 = 0L;

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)J")
    public final long method1459(int arg0) {
        return arg0 == -1045 ? this.field3643 : -65L;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)J")
    public final long method1457(int arg0) {
        if (arg0 != -6) {
            this.method1694(48);
        }
        this.field3643 += this.method1694(-116);
        return this.field3642 > this.field3643 ? (this.field3642 - this.field3643) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "(I)J")
    private final long method1694(int arg0) {
        long var2 = class465.method2818(255) * 1000000L;
        long var4 = var2 - this.field3645;
        this.field3645 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3644[this.field3641] = var4;
            if (this.field3646 < 10) {
                this.field3646++;
            }
            this.field3641 = (this.field3641 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = -123 % ((arg0 + 60) / 45);
        for (int var9 = 1; var9 <= this.field3646; var9++) {
            var6 += this.field3644[(this.field3641 + 10 - var9) % 10];
        }
        return var6 / (long) this.field3646;
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(I)V")
    public final void method1460(int arg0) {
        this.field3645 = 0L;
        if (this.field3642 > this.field3643) {
            this.field3643 += this.field3642 - this.field3643;
        }
        if (arg0 > -10) {
            this.method1456(-119L, 51);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(JI)I")
    public final int method1456(long arg0, int arg1) {
        if (arg1 != 0) {
            this.method1457(27);
        }
        if (this.field3642 > this.field3643) {
            this.field3645 += this.field3642 - this.field3643;
            this.field3643 += this.field3642 - this.field3643;
            this.field3642 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field3642 += arg0;
        } while (var4 < 10 && this.field3642 < this.field3643);
        if (this.field3643 > this.field3642) {
            this.field3642 = this.field3643;
        }
        return var4;
    }
}
