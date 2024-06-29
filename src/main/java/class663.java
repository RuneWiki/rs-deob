import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class663 extends class543 {

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "J")
    private long field8787 = 0L;

    @OriginalMember(owner = "client!mia", name = "e", descriptor = "J")
    private long field8788 = 0L;

    @OriginalMember(owner = "client!mia", name = "f", descriptor = "[J")
    private long[] field8789 = new long[10];

    @OriginalMember(owner = "client!mia", name = "i", descriptor = "J")
    private long field8792 = 0L;

    @OriginalMember(owner = "client!mia", name = "g", descriptor = "I")
    private int field8790 = 0;

    @OriginalMember(owner = "client!mia", name = "h", descriptor = "I")
    private int field8791 = 1;

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "(I)V", line = 5)
    public final void method2448(int arg0) {
        if (arg0 < 66) {
            this.method3669(false);
        }
        this.field8792 = 0L;
        if (this.field8788 < this.field8787) {
            this.field8788 += this.field8787 - this.field8788;
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IJ)I", line = 18)
    public final int method2446(int arg0, long arg1) {
        if (arg0 != 23122) {
            return -75;
        } else if (this.field8787 > this.field8788) {
            this.field8792 += this.field8787 - this.field8788;
            this.field8788 += this.field8787 - this.field8788;
            this.field8787 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field8787 += arg1;
            } while (var4 < 10 && this.field8787 < this.field8788);
            if (this.field8788 > this.field8787) {
                this.field8787 = this.field8788;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(Z)J", line = 51)
    private final long method3669(boolean arg0) {
        if (arg0) {
            return 116L;
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field8792;
        this.field8792 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field8789[this.field8790] = var4;
            this.field8790 = (this.field8790 + 1) % 10;
            if (this.field8791 < 1) {
                this.field8791++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field8791; var8++) {
            var6 += this.field8789[(this.field8790 + 10 - var8) % 10];
        }
        return var6 / (long) this.field8791;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)J", line = 84)
    public final long method2444(int arg0) {
        return arg0 > -45 ? -73L : this.field8788;
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "()V", line = 115)
    public class663() {
        this.field8788 = System.nanoTime();
        this.field8787 = System.nanoTime();
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(Z)J", line = 101)
    public final long method2445(boolean arg0) {
        if (!arg0) {
            this.method2445(false);
        }
        this.field8788 += this.method3669(false);
        return this.field8787 > this.field8788 ? (this.field8787 - this.field8788) / 1000000L : 0L;
    }
}
