import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class466 extends class216 {

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "J")
    private long field6737 = 0L;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "J")
    private long field6736 = 0L;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "[J")
    private long[] field6738 = new long[10];

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    private int field6739 = 1;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "J")
    private long field6740 = 0L;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    private int field6741 = 0;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)I", line = 5)
    public final int method1496(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        if (arg0 != 2007665840) {
            return -79;
        }
        this.field6737 += this.method2816((byte) -24);
        if (this.field6737 < this.field6736) {
            class434.method2690(10, (this.field6736 - this.field6737) / 1000000L);
            this.field6740 += this.field6736 - this.field6737;
            this.field6737 += this.field6736 - this.field6737;
            this.field6736 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field6736 += var3;
        } while (var5 < 10 && this.field6736 < this.field6737);
        if (this.field6737 > this.field6736) {
            this.field6736 = this.field6737;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)J", line = 43)
    private final long method2816(byte arg0) {
        if (arg0 != -24) {
            this.field6736 = 14L;
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field6740;
        this.field6740 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6738[this.field6741] = var4;
            this.field6741 = (this.field6741 + 1) % 10;
            if (this.field6739 < 1) {
                this.field6739++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field6739; var8++) {
            var6 += this.field6738[(this.field6741 + 10 - var8) % 10];
        }
        return var6 / (long) this.field6739;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 104)
    public class466() {
        this.field6737 = System.nanoTime();
        this.field6736 = System.nanoTime();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 80)
    public final void method1494(int arg0) {
        this.field6740 = 0L;
        int var2 = 85 / ((-arg0 - 28) / 58);
        if (this.field6736 > this.field6737) {
            this.field6737 += this.field6736 - this.field6737;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)J", line = 93)
    public final long method1501(int arg0) {
        if (arg0 != -26653) {
            this.method2816((byte) -40);
        }
        return this.field6737;
    }
}
