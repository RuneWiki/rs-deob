import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class42 extends class135 {

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "[J")
    private long[] field556 = new long[10];

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    private int field558 = 1;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "J")
    private long field555 = 0L;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    private int field557 = 0;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "J")
    private long field559 = 0L;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "J")
    private long field560 = 0L;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)J")
    private final long method263(int arg0) {
        long var2 = 0L;
        long var4 = class3.method14(29853) * 1000000L;
        long var6 = var4 - this.field560;
        this.field560 = var4;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field556[this.field557] = var6;
            this.field557 = (this.field557 + 1) % 10;
            if (this.field558 < 10) {
                this.field558++;
            }
        }
        int var8 = 1;
        if (arg0 != -24217) {
            this.method124(4);
        }
        while (var8 <= this.field558) {
            var2 += this.field556[(this.field557 + 10 - var8) % 10];
            var8++;
        }
        return var2 / (long) this.field558;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)J")
    public final long method125(boolean arg0) {
        if (arg0) {
            this.method263(43);
        }
        return this.field559;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (arg0 == 13640) {
            this.field560 = 0L;
            if (this.field559 < this.field555) {
                this.field559 += this.field555 - this.field559;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBI)I")
    public final int method127(int arg0, byte arg1, int arg2) {
        if (arg1 <= 109) {
            this.method263(-127);
        }
        long var4 = (long) arg0 * 1000000L;
        class155.method1130(1, (long) arg2);
        this.field559 += this.method263(-24217);
        if (this.field559 < this.field555) {
            class155.method1130(1, (this.field555 - this.field559) / 1000000L);
            this.field560 += this.field555 - this.field559;
            this.field559 += this.field555 - this.field559;
            this.field555 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field555 += var4;
            var6++;
        } while (var6 < 10 && this.field555 < this.field559);
        if (this.field559 > this.field555) {
            this.field555 = this.field559;
        }
        return var6;
    }
}
