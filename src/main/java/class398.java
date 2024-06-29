import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class398 extends class148 {

    @OriginalMember(owner = "client!aha", name = "g", descriptor = "I")
    private int field5655 = 0;

    @OriginalMember(owner = "client!aha", name = "f", descriptor = "I")
    private int field5654 = 1;

    @OriginalMember(owner = "client!aha", name = "j", descriptor = "J")
    private long field5658 = 0L;

    @OriginalMember(owner = "client!aha", name = "k", descriptor = "J")
    private long field5659 = 0L;

    @OriginalMember(owner = "client!aha", name = "i", descriptor = "J")
    private long field5657 = 0L;

    @OriginalMember(owner = "client!aha", name = "h", descriptor = "[J")
    private long[] field5656 = new long[10];

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(I)J", line = 5)
    public final long method1026(int arg0) {
        if (arg0 != 0) {
            this.method1020((byte) 115);
        }
        return this.field5658;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(JB)I", line = 15)
    public final int method1021(long arg0, byte arg1) {
        if (arg1 != -14) {
            this.field5658 = -118L;
        }
        if (this.field5658 < this.field5659) {
            this.field5657 += this.field5659 - this.field5658;
            this.field5658 += this.field5659 - this.field5658;
            this.field5659 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field5659 += arg0;
        } while (var4 < 10 && this.field5659 < this.field5658);
        if (this.field5659 < this.field5658) {
            this.field5659 = this.field5658;
        }
        return var4;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(B)V", line = 48)
    public final void method1020(byte arg0) {
        this.field5657 = 0L;
        if (this.field5658 < this.field5659) {
            this.field5658 += this.field5659 - this.field5658;
        }
        int var2 = -64 % ((arg0 - 13) / 45);
    }

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "(B)J", line = 60)
    private final long method2421(byte arg0) {
        long var2 = class109.method731(50) * 1000000L;
        long var4 = var2 - this.field5657;
        this.field5657 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5656[this.field5655] = var4;
            if (this.field5654 < 10) {
                this.field5654++;
            }
            this.field5655 = (this.field5655 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = 1;
        if (arg0 >= -91) {
            this.field5655 = -52;
        }
        while (var8 <= this.field5654) {
            var6 += this.field5656[(this.field5655 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field5654;
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(B)J", line = 114)
    public final long method1025(byte arg0) {
        this.field5658 += this.method2421((byte) -101);
        int var2 = -36 % ((arg0 + 33) / 49);
        return this.field5659 > this.field5658 ? (this.field5659 - this.field5658) / 1000000L : 0L;
    }
}
