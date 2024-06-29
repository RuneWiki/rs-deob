import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class279 extends class176 {

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "J")
    private long field4451 = 0L;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "J")
    private long field4452 = 0L;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "J")
    private long field4454 = 0L;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    private int field4456 = 1;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    private int field4455 = 0;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "[J")
    private long[] field4453 = new long[10];

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)J")
    private final long method1916(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field4454;
        this.field4454 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4453[this.field4455] = var4;
            if (this.field4456 < 1) {
                this.field4456++;
            }
            this.field4455 = (this.field4455 + 1) % 10;
        }
        int var6 = 126 / ((arg0 + 6) / 36);
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field4456; var9++) {
            var7 += this.field4453[(this.field4455 + 10 - var9) % 10];
        }
        return var7 / (long) this.field4456;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)J")
    public final long method912(int arg0) {
        return arg0 == 11604 ? this.field4451 : -52L;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)I")
    public final int method915(int arg0, int arg1, int arg2) {
        class43.method324((long) arg0, arg2 ^ 0xFFFFFF9A);
        if (arg2 != 1) {
            this.method912(-61);
        }
        this.field4451 += this.method1916((byte) -46);
        long var4 = (long) arg1 * 1000000L;
        if (this.field4451 < this.field4452) {
            class43.method324((this.field4452 - this.field4451) / 1000000L, 66);
            this.field4454 += this.field4452 - this.field4451;
            this.field4451 += this.field4452 - this.field4451;
            this.field4452 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field4452 += var4;
        } while (var6 < 10 && this.field4452 < this.field4451);
        if (this.field4452 < this.field4451) {
            this.field4452 = this.field4451;
        }
        return var6;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public final void method914(int arg0) {
        this.field4454 = 0L;
        if (arg0 == 1 && this.field4452 > this.field4451) {
            this.field4451 += this.field4452 - this.field4451;
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
    public class279() {
        this.field4451 = System.nanoTime();
        this.field4452 = System.nanoTime();
    }
}
