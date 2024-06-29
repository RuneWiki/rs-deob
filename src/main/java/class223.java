import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class223 extends class280 {

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "J")
    private long field3428 = 0L;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "J")
    private long field3427 = 0L;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    private int field3431 = 1;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "J")
    private long field3432 = 0L;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "[J")
    private long[] field3429 = new long[10];

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    private int field3430 = 0;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(B)J")
    private final long method1518(byte arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0 != 56) {
            this.field3427 = -53L;
        }
        long var4 = var2 - this.field3432;
        this.field3432 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3429[this.field3430] = var4;
            if (this.field3431 < 1) {
                this.field3431++;
            }
            this.field3430 = (this.field3430 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3431; var8++) {
            var6 += this.field3429[(this.field3430 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3431;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public final void method1519(int arg0) {
        if (this.field3428 > this.field3427) {
            this.field3427 += this.field3428 - this.field3427;
        }
        this.field3432 = 0L;
        if (arg0 < 55) {
            this.field3427 = 91L;
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)J")
    public final long method1520(int arg0) {
        return arg0 == 0 ? this.field3427 : -31L;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)J")
    public final long method1521(byte arg0) {
        if (arg0 <= 110) {
            return -87L;
        } else {
            this.field3427 += this.method1518((byte) 56);
            return this.field3427 < this.field3428 ? (this.field3428 - this.field3427) / 1000000L : 0L;
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(IJ)I")
    public final int method1522(int arg0, long arg1) {
        int var4 = -37 % ((67 - arg0) / 58);
        if (this.field3428 > this.field3427) {
            this.field3432 += this.field3428 - this.field3427;
            this.field3427 += this.field3428 - this.field3427;
            this.field3428 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            this.field3428 += arg1;
            var5++;
        } while (var5 < 10 && this.field3427 > this.field3428);
        if (this.field3428 < this.field3427) {
            this.field3428 = this.field3427;
        }
        return var5;
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
    public class223() {
        this.field3428 = this.field3427 = jagmisc.nanoTime();
        if (this.field3427 == 0L) {
            throw new RuntimeException();
        }
    }
}
