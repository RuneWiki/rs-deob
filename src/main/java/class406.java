import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class406 extends class16 {

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "J")
    private long field6094 = 0L;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "J")
    private long field6093 = 0L;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    private int field6095 = 0;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "[J")
    private long[] field6097 = new long[10];

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "J")
    private long field6098 = 0L;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    private int field6096 = 1;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I", line = 3)
    public final int method40(int arg0, int arg1) {
        int var3 = 66 % ((arg1 + 11) / 35);
        long var4 = (long) arg0 * 1000000L;
        this.field6094 += this.method2643(1);
        if (this.field6093 > this.field6094) {
            class404.method2628(-23, (this.field6093 - this.field6094) / 1000000L);
            this.field6098 += this.field6093 - this.field6094;
            this.field6094 += this.field6093 - this.field6094;
            this.field6093 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field6093 += var4;
            var6++;
        } while (var6 < 10 && this.field6093 < this.field6094);
        if (this.field6094 > this.field6093) {
            this.field6093 = this.field6094;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)J", line = 41)
    private final long method2643(int arg0) {
        long var2 = class55.method375(-3913) * 1000000L;
        long var4 = var2 - this.field6098;
        this.field6098 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6097[this.field6095] = var4;
            this.field6095 = (this.field6095 + 1) % 10;
            if (this.field6096 < 10) {
                this.field6096++;
            }
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field6096; var8++) {
            var6 += this.field6097[(this.field6095 + 10 - var8) % 10];
        }
        return var6 / (long) this.field6096;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)J", line = 72)
    public final long method42(int arg0) {
        return arg0 == 30786 ? this.field6094 : -18L;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 98)
    public final void method41(int arg0) {
        this.field6098 = 0L;
        int var2 = -119 / ((arg0 - 9) / 63);
        if (this.field6093 > this.field6094) {
            this.field6094 += this.field6093 - this.field6094;
        }
    }
}
