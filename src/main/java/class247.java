import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class247 extends class280 {

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "J")
    private long field3657 = 0L;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "J")
    private long field3656 = 0L;

    @OriginalMember(owner = "client!ida", name = "j", descriptor = "J")
    private long field3659 = 0L;

    @OriginalMember(owner = "client!ida", name = "i", descriptor = "I")
    private int field3658 = 1;

    @OriginalMember(owner = "client!ida", name = "k", descriptor = "I")
    private int field3660 = 0;

    @OriginalMember(owner = "client!ida", name = "l", descriptor = "[J")
    private long[] field3661 = new long[10];

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(B)J", line = 4)
    public final long method1521(byte arg0) {
        this.field3657 += this.method1632((byte) -95);
        if (arg0 < 110) {
            this.method1521((byte) 78);
        }
        return this.field3657 < this.field3656 ? (this.field3656 - this.field3657) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(IJ)I", line = 21)
    public final int method1522(int arg0, long arg1) {
        int var4 = -97 % ((67 - arg0) / 58);
        if (this.field3656 > this.field3657) {
            this.field3659 += this.field3656 - this.field3657;
            this.field3657 += this.field3656 - this.field3657;
            this.field3656 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            this.field3656 += arg1;
            var5++;
        } while (var5 < 10 && this.field3657 > this.field3656);
        if (this.field3656 < this.field3657) {
            this.field3656 = this.field3657;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V", line = 52)
    public final void method1519(int arg0) {
        this.field3659 = 0L;
        if (arg0 <= 55) {
            this.field3659 = -45L;
        }
        if (this.field3657 < this.field3656) {
            this.field3657 += this.field3656 - this.field3657;
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)J", line = 67)
    public final long method1520(int arg0) {
        return arg0 == 0 ? this.field3657 : -64L;
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "()V", line = 116)
    public class247() {
        this.field3657 = System.nanoTime();
        this.field3656 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "(B)J", line = 84)
    private final long method1632(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field3659;
        this.field3659 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3661[this.field3660] = var4;
            this.field3660 = (this.field3660 + 1) % 10;
            if (this.field3658 < 1) {
                this.field3658++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3658; var8++) {
            var6 += this.field3661[(this.field3660 + 10 - var8) % 10];
        }
        if (arg0 >= -19) {
            this.method1520(1);
        }
        return var6 / (long) this.field3658;
    }
}
