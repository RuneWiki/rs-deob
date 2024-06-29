import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class175 extends class201 {

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "J")
    private long field2637 = 0L;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "J")
    private long field2638 = 0L;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
    private int field2640 = 0;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "J")
    private long field2639 = 0L;

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "[J")
    private long[] field2641 = new long[10];

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "I")
    private int field2642 = 1;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)J", line = 3)
    public final long method1285(byte arg0) {
        if (arg0 != -9) {
            this.field2642 = -17;
        }
        return this.field2637;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Z)V", line = 13)
    public final void method1286(boolean arg0) {
        if (this.field2637 < this.field2638) {
            this.field2637 += this.field2638 - this.field2637;
        }
        this.field2639 = 0L;
        if (!arg0) {
            this.field2641 = null;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "(B)J", line = 27)
    private final long method1287(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field2639;
        this.field2639 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2641[this.field2640] = var4;
            this.field2640 = (this.field2640 + 1) % 10;
            if (this.field2642 < 1) {
                this.field2642++;
            }
        }
        long var6 = 0L;
        if (arg0 != 101) {
            this.field2642 = 66;
        }
        for (int var8 = 1; var8 <= this.field2642; var8++) {
            var6 += this.field2641[(this.field2640 - (var8 - 10)) % 10];
        }
        return var6 / (long) this.field2642;
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)J", line = 63)
    public final long method1288(byte arg0) {
        this.field2637 += this.method1287((byte) 101);
        if (this.field2638 > this.field2637) {
            return (this.field2638 - this.field2637) / 1000000L;
        } else {
            if (arg0 != 81) {
                this.field2637 = 42L;
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "()V", line = 118)
    public class175() {
        this.field2638 = this.field2637 = jagmisc.nanoTime();
        if (this.field2637 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BJ)I", line = 87)
    public final int method1289(byte arg0, long arg1) {
        if (arg0 != -48) {
            this.method1288((byte) 92);
        }
        if (this.field2638 > this.field2637) {
            this.field2639 += this.field2638 - this.field2637;
            this.field2637 += this.field2638 - this.field2637;
            this.field2638 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field2638 += arg1;
        } while (var4 < 10 && this.field2638 < this.field2637);
        if (this.field2637 > this.field2638) {
            this.field2638 = this.field2637;
        }
        return var4;
    }
}
