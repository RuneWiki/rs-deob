import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class123 extends class17 {

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "J")
    private long field1705 = 0L;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "J")
    private long field1706 = 0L;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    private int field1708 = 0;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "[J")
    private long[] field1707 = new long[10];

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    private int field1709 = 1;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "J")
    private long field1710 = 0L;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 4)
    public final void method113(byte arg0) {
        this.field1710 = 0L;
        if (this.field1706 < this.field1705) {
            this.field1706 += this.field1705 - this.field1706;
        }
        int var2 = -20 / ((arg0 - 43) / 33);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)J", line = 18)
    public final long method116(int arg0) {
        int var2 = 36 % ((61 - arg0) / 34);
        return this.field1706;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 102)
    public class123() {
        this.field1706 = System.nanoTime();
        this.field1705 = System.nanoTime();
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)J", line = 31)
    private final long method827(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field1710;
        this.field1710 = var2;
        long var6 = 0L;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1707[this.field1708] = var4;
            this.field1708 = (this.field1708 + 1) % 10;
            if (this.field1709 < 1) {
                this.field1709++;
            }
        }
        if (arg0 != 10) {
            this.method827(-66);
        }
        for (int var8 = 1; var8 <= this.field1709; var8++) {
            var6 += this.field1707[(this.field1708 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1709;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)I", line = 67)
    public final int method114(int arg0, int arg1, int arg2) {
        class81.method485((long) arg0, arg1 ^ 0x65);
        if (arg1 != 100) {
            this.method116(-48);
        }
        this.field1706 += this.method827(arg1 ^ 0x6E);
        long var4 = (long) arg2 * 1000000L;
        if (this.field1706 < this.field1705) {
            class81.method485((this.field1705 - this.field1706) / 1000000L, 1);
            this.field1710 += this.field1705 - this.field1706;
            this.field1706 += this.field1705 - this.field1706;
            this.field1705 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field1705 += var4;
        } while (var6 < 10 && this.field1705 < this.field1706);
        if (this.field1706 > this.field1705) {
            this.field1705 = this.field1706;
        }
        return var6;
    }
}
