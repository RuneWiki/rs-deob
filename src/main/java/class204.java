import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class204 extends class389 {

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "J")
    private long field3146 = 0L;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "J")
    private long field3147 = 0L;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    private int field3148 = 0;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "[J")
    private long[] field3150 = new long[10];

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "J")
    private long field3149 = 0L;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    private int field3151 = 1;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)J", line = 3)
    public final long method1430(int arg0) {
        if (arg0 <= 12) {
            this.method1432(27);
        }
        return this.field3146;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)I", line = 13)
    public final int method1431(int arg0, boolean arg1) {
        long var3 = (long) arg0 * 1000000L;
        if (arg1) {
            this.method1430(-17);
        }
        this.field3146 += this.method1432(-22);
        if (this.field3146 < this.field3147) {
            class468.method2848((this.field3147 - this.field3146) / 1000000L, (byte) -117);
            this.field3149 += this.field3147 - this.field3146;
            this.field3146 += this.field3147 - this.field3146;
            this.field3147 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field3147 += var3;
        } while (var5 < 10 && this.field3147 < this.field3146);
        if (this.field3146 > this.field3147) {
            this.field3147 = this.field3146;
        }
        return var5;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 103)
    public class204() {
        this.field3147 = this.field3146 = jagmisc.nanoTime();
        if (this.field3146 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)J", line = 58)
    private final long method1432(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field3149;
        this.field3149 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3150[this.field3148] = var4;
            if (this.field3151 < 1) {
                this.field3151++;
            }
            this.field3148 = (this.field3148 + 1) % 10;
        }
        int var6 = 20 % ((arg0 - 37) / 54);
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field3151; var9++) {
            var7 += this.field3150[(this.field3148 + 10 - var9) % 10];
        }
        return var7 / (long) this.field3151;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 91)
    public final void method1433(int arg0) {
        if (arg0 != 15954) {
            this.method1431(-109, true);
        }
        this.field3149 = 0L;
        if (this.field3147 > this.field3146) {
            this.field3146 += this.field3147 - this.field3146;
        }
    }
}
