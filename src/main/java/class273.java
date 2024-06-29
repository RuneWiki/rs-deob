import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class273 extends class349 {

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "J")
    private long field3849 = 0L;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "[J")
    private long[] field3851 = new long[10];

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    private int field3853 = 0;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    private int field3854 = 1;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "J")
    private long field3850 = 0L;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "J")
    private long field3852 = 0L;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZJ)I", line = 3)
    public final int method1714(boolean arg0, long arg1) {
        if (arg0) {
            this.method1716(-92);
        }
        if (this.field3852 < this.field3850) {
            this.field3849 += this.field3850 - this.field3852;
            this.field3852 += this.field3850 - this.field3852;
            this.field3850 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field3850 += arg1;
            var4++;
        } while (var4 < 10 && this.field3852 > this.field3850);
        if (this.field3852 > this.field3850) {
            this.field3850 = this.field3852;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)J", line = 38)
    public final long method1715(boolean arg0) {
        return arg0 ? this.field3852 : 22L;
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)J", line = 51)
    private final long method1716(int arg0) {
        long var2 = class598.method3538(true) * 1000000L;
        long var4 = var2 - this.field3849;
        this.field3849 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3851[this.field3853] = var4;
            if (this.field3854 < 10) {
                this.field3854++;
            }
            this.field3853 = (this.field3853 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = 1;
        if (arg0 != 10) {
            return -105L;
        }
        while (this.field3854 >= var8) {
            var6 += this.field3851[(this.field3853 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field3854;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V", line = 94)
    public final void method1717(int arg0) {
        if (arg0 == 31913) {
            this.field3849 = 0L;
            if (this.field3850 > this.field3852) {
                this.field3852 += this.field3850 - this.field3852;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)J", line = 117)
    public final long method1718(int arg0) {
        if (arg0 != -16722) {
            this.method1718(51);
        }
        this.field3852 += this.method1716(10);
        return this.field3852 < this.field3850 ? (this.field3850 - this.field3852) / 1000000L : 0L;
    }
}
