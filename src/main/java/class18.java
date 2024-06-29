import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class18 extends class135 {

    @OriginalMember(owner = "client!be", name = "m", descriptor = "J")
    private long field188 = 0L;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "J")
    private long field189 = 0L;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "[J")
    private long[] field190 = new long[10];

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    private int field192 = 0;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    private int field193 = 1;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "J")
    private long field191 = 0L;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (arg0 != 13640) {
            this.field193 = -110;
        }
        if (this.field189 > this.field188) {
            this.field188 += this.field189 - this.field188;
        }
        this.field191 = 0L;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)J")
    public final long method125(boolean arg0) {
        return arg0 ? -54L : this.field188;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(Z)J")
    private final long method126(boolean arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field191;
        long var6 = 0L;
        this.field191 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field190[this.field192] = var4;
            this.field192 = (this.field192 + 1) % 10;
            if (this.field193 < 1) {
                this.field193++;
            }
        }
        for (int var8 = 1; var8 <= this.field193; var8++) {
            var6 += this.field190[(this.field192 + 10 - var8) % 10];
        }
        if (!arg0) {
            this.field192 = -98;
        }
        return var6 / (long) this.field193;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class18() {
        this.field189 = this.field188 = jagmisc.nanoTime();
        if (this.field188 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)I")
    public final int method127(int arg0, byte arg1, int arg2) {
        class155.method1130(1, (long) arg2);
        this.field188 += this.method126(true);
        if (arg1 <= 109) {
            this.method126(false);
        }
        long var4 = (long) arg0 * 1000000L;
        if (this.field188 < this.field189) {
            class155.method1130(1, (this.field189 - this.field188) / 1000000L);
            this.field191 += this.field189 - this.field188;
            this.field188 += this.field189 - this.field188;
            this.field189 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field189 += var4;
            var6++;
        } while (var6 < 10 && this.field189 < this.field188);
        if (this.field189 < this.field188) {
            this.field189 = this.field188;
        }
        return var6;
    }
}
