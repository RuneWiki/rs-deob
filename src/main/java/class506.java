import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class506 extends class654 {

    @OriginalMember(owner = "client!iea", name = "j", descriptor = "J")
    private long field7563 = 0L;

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "J")
    private long field7564 = 0L;

    @OriginalMember(owner = "client!iea", name = "l", descriptor = "[J")
    private long[] field7565 = new long[10];

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
    private int field7567 = 1;

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "I")
    private int field7568 = 0;

    @OriginalMember(owner = "client!iea", name = "m", descriptor = "J")
    private long field7566 = 0L;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)J")
    private final long method3811(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field7566;
        this.field7566 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7565[this.field7568] = var4;
            if (this.field7567 < 1) {
                this.field7567++;
            }
            this.field7568 = (this.field7568 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7567; var8++) {
            var6 += this.field7565[(this.field7568 + 10 - var8) % 10];
        }
        if (arg0 != 27357) {
            this.method3813((byte) -18);
        }
        return var6 / (long) this.field7567;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IJ)I")
    public final int method3812(int arg0, long arg1) {
        if (arg0 != 0) {
            this.method3814(false);
        }
        if (this.field7563 < this.field7564) {
            this.field7566 += this.field7564 - this.field7563;
            this.field7563 += this.field7564 - this.field7563;
            this.field7564 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field7564 += arg1;
            var4++;
        } while (var4 < 10 && this.field7564 < this.field7563);
        if (this.field7563 > this.field7564) {
            this.field7564 = this.field7563;
        }
        return var4;
    }

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "(B)J")
    public final long method3813(byte arg0) {
        return arg0 == -88 ? this.field7563 : -27L;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z)J")
    public final long method3814(boolean arg0) {
        this.field7563 += this.method3811(27357);
        if (this.field7563 >= this.field7564) {
            if (!arg0) {
                this.method3811(-121);
            }
            return 0L;
        } else {
            return (this.field7564 - this.field7563) / 1000000L;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)V")
    public final void method3815(byte arg0) {
        this.field7566 = 0L;
        if (this.field7564 > this.field7563) {
            this.field7563 += this.field7564 - this.field7563;
        }
        int var2 = 7 % ((39 - arg0) / 63);
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "()V")
    public class506() {
        this.field7563 = System.nanoTime();
        this.field7564 = System.nanoTime();
    }
}
