import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class413 extends class342 {

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "J")
    private long field5855 = 0L;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "[J")
    private long[] field5856 = new long[10];

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "J")
    private long field5858 = 0L;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    private int field5857 = 1;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "J")
    private long field5859 = 0L;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    private int field5860 = 0;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)J")
    public final long method1965(int arg0) {
        return arg0 == 1 ? this.field5859 : 68L;
    }

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "(I)J")
    private final long method2486(int arg0) {
        long var2 = class301.method1787((byte) -35) * 1000000L;
        long var4 = var2 - this.field5855;
        this.field5855 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5856[this.field5860] = var4;
            if (this.field5857 < 10) {
                this.field5857++;
            }
            this.field5860 = (this.field5860 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 <= 69) {
            return -45L;
        } else {
            for (int var8 = 1; var8 <= this.field5857; var8++) {
                var6 += this.field5856[(this.field5860 + 10 - var8) % 10];
            }
            return var6 / (long) this.field5857;
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
    public final void method1966(int arg0) {
        if (arg0 != 12104) {
            this.method1969((byte) -117);
        }
        if (this.field5859 < this.field5858) {
            this.field5859 += this.field5858 - this.field5859;
        }
        this.field5855 = 0L;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)J")
    public final long method1969(byte arg0) {
        this.field5859 += this.method2486(76);
        if (this.field5858 > this.field5859) {
            return (this.field5858 - this.field5859) / 1000000L;
        } else {
            if (arg0 <= 34) {
                this.method1965(80);
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(JI)I")
    public final int method1967(long arg0, int arg1) {
        if (arg1 != 1) {
            return -126;
        } else if (this.field5859 < this.field5858) {
            this.field5855 += this.field5858 - this.field5859;
            this.field5859 += this.field5858 - this.field5859;
            this.field5858 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field5858 += arg0;
                var4++;
            } while (var4 < 10 && this.field5859 > this.field5858);
            if (this.field5858 < this.field5859) {
                this.field5858 = this.field5859;
            }
            return var4;
        }
    }
}
