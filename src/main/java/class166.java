import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class166 extends class164 {

    @OriginalMember(owner = "client!e", name = "i", descriptor = "J")
    private long field2743 = 0L;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    private int field2742 = 0;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "[J")
    private long[] field2744 = new long[10];

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    private int field2745 = 1;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "J")
    private long field2746 = 0L;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "J")
    private long field2747 = 0L;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)I")
    public final int method921(int arg0, int arg1, int arg2) {
        class234.method1550(-28773, (long) arg2);
        this.field2747 += this.method1200((byte) 123);
        if (arg1 != 6) {
            this.method1200((byte) -114);
        }
        long var4 = (long) arg0 * 1000000L;
        if (this.field2746 > this.field2747) {
            class234.method1550(-28773, (this.field2746 - this.field2747) / 1000000L);
            this.field2743 += this.field2746 - this.field2747;
            this.field2747 += this.field2746 - this.field2747;
            this.field2746 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field2746 += var4;
            var6++;
        } while (var6 < 10 && this.field2746 < this.field2747);
        if (this.field2747 > this.field2746) {
            this.field2746 = this.field2747;
        }
        return var6;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)J")
    public final long method920(int arg0) {
        return arg0 == -2657 ? this.field2747 : 40L;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public final void method919(int arg0) {
        this.field2743 = 0L;
        if (this.field2747 < this.field2746) {
            this.field2747 += this.field2746 - this.field2747;
        }
        if (arg0 != -8) {
            this.field2742 = 119;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)J")
    private final long method1200(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field2743;
        long var6 = 0L;
        this.field2743 = var2;
        if (arg0 <= 91) {
            this.method921(-7, -2, 114);
        }
        if (var4 > 0L && var4 < 5000000000L) {
            this.field2744[this.field2742] = var4;
            if (this.field2745 < 1) {
                this.field2745++;
            }
            this.field2742 = (this.field2742 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field2745; var8++) {
            var6 += this.field2744[(this.field2742 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2745;
    }
}
