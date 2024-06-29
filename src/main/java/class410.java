import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class410 extends class216 {

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    private int field6105 = 0;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "[J")
    private long[] field6106 = new long[10];

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "J")
    private long field6108 = 0L;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    private int field6110 = 1;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "J")
    private long field6107 = 0L;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "J")
    private long field6109 = 0L;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 7)
    public final void method1494(int arg0) {
        int var2 = 38 % ((-arg0 - 28) / 58);
        if (this.field6108 > this.field6107) {
            this.field6107 += this.field6108 - this.field6107;
        }
        this.field6109 = 0L;
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)J", line = 20)
    private final long method2574(int arg0) {
        long var2 = class493.method2937(-110) * 1000000L;
        long var4 = var2 - this.field6109;
        this.field6109 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6106[this.field6105] = var4;
            this.field6105 = (this.field6105 + 1) % 10;
            if (this.field6110 < 10) {
                this.field6110++;
            }
        }
        if (arg0 != -11) {
            this.field6109 = -9L;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field6110; var8++) {
            var6 += this.field6106[(this.field6105 + 10 - var8) % 10];
        }
        return var6 / (long) this.field6110;
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)J", line = 56)
    public final long method1501(int arg0) {
        return arg0 == -26653 ? this.field6107 : -6L;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)I", line = 70)
    public final int method1496(int arg0, int arg1) {
        if (arg0 != 2007665840) {
            this.method1494(-68);
        }
        this.field6107 += this.method2574(-11);
        long var3 = (long) arg1 * 1000000L;
        if (this.field6107 < this.field6108) {
            class434.method2690(10, (this.field6108 - this.field6107) / 1000000L);
            this.field6109 += this.field6108 - this.field6107;
            this.field6107 += this.field6108 - this.field6107;
            this.field6108 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field6108 += var3;
        } while (var5 < 10 && this.field6108 < this.field6107);
        if (this.field6107 > this.field6108) {
            this.field6108 = this.field6107;
        }
        return var5;
    }
}
