import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class512 extends class287 {

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "J")
    private long field7551 = 0L;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "J")
    private long field7552 = 0L;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    private int field7555 = 0;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "J")
    private long field7553 = 0L;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "[J")
    private long[] field7554 = new long[10];

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    private int field7556 = 1;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public final void method1031(int arg0) {
        if (arg0 < 114) {
            this.method1029(55, 27);
        }
        this.field7553 = 0L;
        if (this.field7551 < this.field7552) {
            this.field7551 += this.field7552 - this.field7551;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)I")
    public final int method1029(int arg0, int arg1) {
        this.field7551 += this.method3037(-10);
        if (arg1 > -16) {
            this.field7556 = 66;
        }
        long var3 = (long) arg0 * 1000000L;
        if (this.field7551 < this.field7552) {
            class185.method1285(107, (this.field7552 - this.field7551) / 1000000L);
            this.field7553 += this.field7552 - this.field7551;
            this.field7551 += this.field7552 - this.field7551;
            this.field7552 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field7552 += var3;
        } while (var5 < 10 && this.field7552 < this.field7551);
        if (this.field7551 > this.field7552) {
            this.field7552 = this.field7551;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)J")
    private final long method3037(int arg0) {
        if (arg0 != -10) {
            this.field7554 = null;
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field7553;
        this.field7553 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7554[this.field7555] = var4;
            if (this.field7556 < 1) {
                this.field7556++;
            }
            this.field7555 = (this.field7555 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7556; var8++) {
            var6 += this.field7554[(this.field7555 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7556;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)J")
    public final long method1028(int arg0) {
        if (arg0 != 0) {
            this.field7553 = -48L;
        }
        return this.field7551;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class512() {
        this.field7551 = System.nanoTime();
        this.field7552 = System.nanoTime();
    }
}
