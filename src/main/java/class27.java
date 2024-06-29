import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class27 extends class464 {

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "J")
    private long field292 = 0L;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "J")
    private long field293 = 0L;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    private int field294 = 1;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "[J")
    private long[] field296 = new long[10];

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "J")
    private long field295 = 0L;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    private int field297 = 0;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)J")
    private final long method167(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field295;
        this.field295 = var2;
        if (arg0 != 32) {
            this.field294 = -16;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field296[this.field297] = var4;
            this.field297 = (this.field297 + 1) % 10;
            if (this.field294 < 1) {
                this.field294++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field294; var8++) {
            var6 += this.field296[(this.field297 + 10 - var8) % 10];
        }
        return var6 / (long) this.field294;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
    public final void method168(int arg0) {
        this.field295 = 0L;
        if (this.field293 > this.field292) {
            this.field292 += this.field293 - this.field292;
        }
        if (arg0 != 112) {
            this.field296 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)J")
    public final long method169(boolean arg0) {
        return arg0 ? -7L : this.field292;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
    public final int method170(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        if (arg0 <= 88) {
            return -39;
        }
        this.field292 += this.method167((byte) 32);
        if (this.field293 > this.field292) {
            class208.method1464((byte) -123, (this.field293 - this.field292) / 1000000L);
            this.field295 += this.field293 - this.field292;
            this.field292 += this.field293 - this.field292;
            this.field293 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field293 += var3;
            var5++;
        } while (var5 < 10 && this.field293 < this.field292);
        if (this.field292 > this.field293) {
            this.field293 = this.field292;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
    public class27() {
        this.field293 = this.field292 = jagmisc.nanoTime();
        if (this.field292 == 0L) {
            throw new RuntimeException();
        }
    }
}
