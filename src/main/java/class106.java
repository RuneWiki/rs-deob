import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class106 extends class212 {

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "J")
    private long field1697 = 0L;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "J")
    private long field1698 = 0L;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    private int field1699 = 0;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "[J")
    private long[] field1700 = new long[10];

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "J")
    private long field1701 = 0L;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    private int field1702 = 1;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)J")
    public final long method805(byte arg0) {
        int var2 = 44 / ((70 - arg0) / 54);
        return this.field1698;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)J")
    private final long method806(int arg0) {
        long var2 = System.nanoTime();
        long var4 = 0L;
        long var6 = var2 - this.field1701;
        this.field1701 = var2;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field1700[this.field1699] = var6;
            this.field1699 = (this.field1699 + 1) % 10;
            if (this.field1702 < 1) {
                this.field1702++;
            }
        }
        int var8 = -91 / ((arg0 + 59) / 52);
        for (int var9 = 1; var9 <= this.field1702; var9++) {
            var4 += this.field1700[(this.field1699 + 10 - var9) % 10];
        }
        return var4 / (long) this.field1702;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)I")
    public final int method807(int arg0, int arg1, int arg2) {
        class42.method354((long) arg1, false);
        if (arg2 != 24874) {
            this.method805((byte) -95);
        }
        this.field1698 += this.method806(-125);
        long var4 = (long) arg0 * 1000000L;
        if (this.field1697 > this.field1698) {
            class42.method354((this.field1697 - this.field1698) / 1000000L, false);
            this.field1701 += this.field1697 - this.field1698;
            this.field1698 += this.field1697 - this.field1698;
            this.field1697 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field1697 += var4;
            var6++;
        } while (var6 < 10 && this.field1698 > this.field1697);
        if (this.field1697 < this.field1698) {
            this.field1697 = this.field1698;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
    public final void method808(boolean arg0) {
        this.field1701 = 0L;
        if (!arg0) {
            this.method807(23, 87, 64);
        }
        if (this.field1698 < this.field1697) {
            this.field1698 += this.field1697 - this.field1698;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class106() {
        this.field1698 = System.nanoTime();
        this.field1697 = System.nanoTime();
    }
}
