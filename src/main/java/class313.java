import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class313 extends class126 {

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "J")
    private long field4450 = 0L;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "J")
    private long field4451 = 0L;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    private int field4452 = 1;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "[J")
    private long[] field4453 = new long[10];

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    private int field4454 = 0;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "J")
    private long field4455 = 0L;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)J", line = 5)
    private final long method1946(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field4455;
        this.field4455 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4453[this.field4454] = var4;
            this.field4454 = (this.field4454 + 1) % 10;
            if (this.field4452 < 1) {
                this.field4452++;
            }
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field4452; var8++) {
            var6 += this.field4453[(this.field4454 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4452;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)J", line = 34)
    public final long method921(byte arg0) {
        return arg0 == -53 ? this.field4450 : -102L;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZI)I", line = 44)
    public final int method923(boolean arg0, int arg1) {
        if (!arg0) {
            return 114;
        }
        long var3 = (long) arg1 * 1000000L;
        this.field4450 += this.method1946(0);
        if (this.field4451 > this.field4450) {
            class213.method1462((this.field4451 - this.field4450) / 1000000L, -5184);
            this.field4455 += this.field4451 - this.field4450;
            this.field4450 += this.field4451 - this.field4450;
            this.field4451 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field4451 += var3;
        } while (var5 < 10 && this.field4450 > this.field4451);
        if (this.field4451 < this.field4450) {
            this.field4451 = this.field4450;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 83)
    public final void method924(byte arg0) {
        this.field4455 = 0L;
        if (arg0 > 25 && this.field4450 < this.field4451) {
            this.field4450 += this.field4451 - this.field4450;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 101)
    public class313() {
        this.field4450 = System.nanoTime();
        this.field4451 = System.nanoTime();
    }
}
