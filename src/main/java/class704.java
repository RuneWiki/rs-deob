import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class704 extends class576 {

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "J")
    private long field9945 = 0L;

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "J")
    private long field9942 = 0L;

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "J")
    private long field9947 = 0L;

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "I")
    private int field9946 = 1;

    @OriginalMember(owner = "client!jfa", name = "k", descriptor = "I")
    private int field9944 = 0;

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "[J")
    private long[] field9943 = new long[10];

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V", line = 3)
    public final void method42(int arg0) {
        if (arg0 < -67) {
            this.field9947 = 0L;
            if (this.field9945 < this.field9942) {
                this.field9945 += this.field9942 - this.field9945;
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(JB)I", line = 21)
    public final int method39(long arg0, byte arg1) {
        if (arg1 <= 104) {
            this.method41((byte) -6);
        }
        if (this.field9945 < this.field9942) {
            this.field9947 += this.field9942 - this.field9945;
            this.field9945 += this.field9942 - this.field9945;
            this.field9942 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field9942 += arg0;
            var4++;
        } while (var4 < 10 && this.field9945 > this.field9942);
        if (this.field9945 > this.field9942) {
            this.field9942 = this.field9945;
        }
        return var4;
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)J", line = 56)
    private final long method3911(byte arg0) {
        long var2 = class18.method109(-11121) * 1000000L;
        long var4 = var2 - this.field9947;
        this.field9947 = var2;
        if (arg0 != -41) {
            this.method41((byte) 84);
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field9943[this.field9944] = var4;
            if (this.field9946 < 10) {
                this.field9946++;
            }
            this.field9944 = (this.field9944 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field9946; var8++) {
            var6 += this.field9943[(this.field9944 + 10 - var8) % 10];
        }
        return var6 / (long) this.field9946;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)J", line = 91)
    public final long method41(byte arg0) {
        int var2 = -124 / ((arg0 + 75) / 37);
        return this.field9945;
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)J", line = 118)
    public final long method40(int arg0) {
        this.field9945 += this.method3911((byte) -41);
        if (this.field9942 > this.field9945) {
            return (this.field9942 - this.field9945) / 1000000L;
        } else {
            if (arg0 != 0) {
                this.field9942 = 43L;
            }
            return 0L;
        }
    }
}
