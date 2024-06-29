import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class218 extends class36 {

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "J")
    private long field3531 = 0L;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "J")
    private long field3530 = 0L;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    private int field3532 = 1;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "J")
    private long field3533 = 0L;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    private int field3535 = 0;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "[J")
    private long[] field3534 = new long[10];

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 6)
    public final void method164(int arg0) {
        this.field3533 = (long) arg0;
        if (this.field3530 < this.field3531) {
            this.field3530 += this.field3531 - this.field3530;
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 65)
    public class218() {
        this.field3530 = System.nanoTime();
        this.field3531 = System.nanoTime();
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)J", line = 20)
    public final long method162(int arg0) {
        return arg0 == 64 ? this.field3530 : 54L;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)J", line = 33)
    private final long method1555(int arg0) {
        if (arg0 != 10) {
            return 126L;
        }
        long var2 = System.nanoTime();
        long var4 = 0L;
        long var6 = var2 - this.field3533;
        this.field3533 = var2;
        if (var6 > 0L && var6 < 5000000000L) {
            this.field3534[this.field3535] = var6;
            if (this.field3532 < 1) {
                this.field3532++;
            }
            this.field3535 = (this.field3535 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field3532; var8++) {
            var4 += this.field3534[(this.field3535 + 10 - var8) % 10];
        }
        return var4 / (long) this.field3532;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I", line = 80)
    public final int method163(int arg0, int arg1, int arg2) {
        class121.method867((byte) 69, (long) arg1);
        this.field3530 += this.method1555(10);
        if (arg0 != 0) {
            this.field3535 = 124;
        }
        long var4 = (long) arg2 * 1000000L;
        if (this.field3530 < this.field3531) {
            class121.method867((byte) 82, (this.field3531 - this.field3530) / 1000000L);
            this.field3533 += this.field3531 - this.field3530;
            this.field3530 += this.field3531 - this.field3530;
            this.field3531 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field3531 += var4;
            var6++;
        } while (var6 < 10 && this.field3531 < this.field3530);
        if (this.field3531 < this.field3530) {
            this.field3531 = this.field3530;
        }
        return var6;
    }
}
