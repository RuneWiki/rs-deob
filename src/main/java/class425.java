import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class425 extends class35 {

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "J")
    private long field6395 = 0L;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "J")
    private long field6396 = 0L;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "J")
    private long field6399 = 0L;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    private int field6397 = 1;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "[J")
    private long[] field6400 = new long[10];

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    private int field6398 = 0;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)J", line = 3)
    public final long method263(int arg0) {
        if (arg0 != 11854) {
            this.method263(-105);
        }
        return this.field6396;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)I", line = 13)
    public final int method262(int arg0, boolean arg1) {
        if (!arg1) {
            this.method263(80);
        }
        long var3 = (long) arg0 * 1000000L;
        this.field6396 += this.method2600((byte) 125);
        if (this.field6396 < this.field6395) {
            class444.method2667(-28210, (this.field6395 - this.field6396) / 1000000L);
            this.field6399 += this.field6395 - this.field6396;
            this.field6396 += this.field6395 - this.field6396;
            this.field6395 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field6395 += var3;
            var5++;
        } while (var5 < 10 && this.field6396 > this.field6395);
        if (this.field6395 < this.field6396) {
            this.field6395 = this.field6396;
        }
        return var5;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)J", line = 51)
    private final long method2600(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field6399;
        this.field6399 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6400[this.field6398] = var4;
            this.field6398 = (this.field6398 + 1) % 10;
            if (this.field6397 < 1) {
                this.field6397++;
            }
        }
        long var6 = 0L;
        int var8 = -95 % ((arg0 - 58) / 46);
        for (int var9 = 1; var9 <= this.field6397; var9++) {
            var6 += this.field6400[(this.field6398 + 10 - var9) % 10];
        }
        return var6 / (long) this.field6397;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 104)
    public class425() {
        this.field6395 = this.field6396 = jagmisc.nanoTime();
        if (this.field6396 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V", line = 91)
    public final void method264(int arg0) {
        if (this.field6395 > this.field6396) {
            this.field6396 += this.field6395 - this.field6396;
        }
        this.field6399 = 0L;
        if (arg0 != 19499) {
            this.method264(21);
        }
    }
}
