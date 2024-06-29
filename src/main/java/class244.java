import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class244 extends class135 {

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "J")
    private long field3550 = 0L;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "J")
    private long field3551 = 0L;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "J")
    private long field3554 = 0L;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "[J")
    private long[] field3552 = new long[10];

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    private int field3553 = 0;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    private int field3555 = 1;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)J")
    private final long method1583(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field3554;
        this.field3554 = var2;
        if (var4 > 0L && var4 < 5000000000L) {
            this.field3552[this.field3553] = var4;
            this.field3553 = (this.field3553 + 1) % 10;
            if (this.field3555 < 1) {
                this.field3555++;
            }
        }
        long var6 = 0L;
        if (arg0 != 10) {
            this.field3553 = -21;
        }
        for (int var8 = 1; var8 <= this.field3555; var8++) {
            var6 += this.field3552[(this.field3553 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3555;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)I")
    public final int method840(int arg0, int arg1, int arg2) {
        class247.method1595((long) arg0, (byte) -83);
        if (arg2 != 0) {
            return -114;
        }
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.method1583(10);
        this.field3550 += var6;
        if (this.field3550 >= this.field3551) {
            int var8 = 0;
            do {
                var8++;
                this.field3551 += var4;
            } while (var8 < 10 && this.field3550 > this.field3551);
            if (this.field3550 > this.field3551) {
                this.field3551 = this.field3550;
            }
            return var8;
        }
        while (this.field3551 > this.field3550) {
            long var9 = this.field3551 - this.field3550;
            if (var9 > var6) {
                var9 = var6;
            }
            if (var9 < 1000000L) {
                var9 = 1000000L;
            }
            class247.method1595((var9 + 500000L) / 1000000L, (byte) -83);
            var6 = this.method1583(10);
            this.field3550 += var6;
        }
        this.field3551 += var4;
        return 1;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)J")
    public final long method839(boolean arg0) {
        return arg0 ? this.field3550 : 127L;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public final void method838(int arg0) {
        if (arg0 != 65535) {
            this.field3552 = (long[]) null;
        }
        this.field3554 = 0L;
        if (this.field3550 < this.field3551) {
            this.field3550 += this.field3551 - this.field3550;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class244() {
        this.field3550 = System.nanoTime();
        this.field3551 = System.nanoTime();
    }
}
