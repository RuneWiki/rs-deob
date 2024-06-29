import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class27 extends class276 {

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "J")
    private long field334 = 0L;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "J")
    private long field333 = 0L;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    private int field335 = 0;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "J")
    private long field338 = 0L;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    private int field337 = 1;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "[J")
    private long[] field336 = new long[10];

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public final void method151(int arg0) {
        if (arg0 != 29051) {
            this.field337 = 87;
        }
        this.field338 = 0L;
        if (this.field333 > this.field334) {
            this.field334 += this.field333 - this.field334;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)I")
    public final int method152(int arg0, int arg1, int arg2) {
        int var4 = -17 / ((arg1 + 35) / 48);
        class262.method1758((long) arg2, 29552);
        this.field334 += this.method153((byte) 3);
        long var5 = (long) arg0 * 1000000L;
        if (this.field333 > this.field334) {
            class262.method1758((this.field333 - this.field334) / 1000000L, 29552);
            this.field338 += this.field333 - this.field334;
            this.field334 += this.field333 - this.field334;
            this.field333 += var5;
            return 1;
        }
        int var7 = 0;
        do {
            var7++;
            this.field333 += var5;
        } while (var7 < 10 && this.field333 < this.field334);
        if (this.field334 > this.field333) {
            this.field333 = this.field334;
        }
        return var7;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)J")
    private final long method153(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field338;
        this.field338 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field336[this.field335] = var4;
            this.field335 = (this.field335 + 1) % 10;
            if (this.field337 < 1) {
                this.field337++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field337; var8++) {
            var6 += this.field336[(this.field335 - (var8 - 10)) % 10];
        }
        if (arg0 != 3) {
            this.method154((byte) -23);
        }
        return var6 / (long) this.field337;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)J")
    public final long method154(byte arg0) {
        return arg0 == 7 ? this.field334 : 30L;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class27() {
        this.field333 = this.field334 = jagmisc.nanoTime();
        if (this.field334 == 0L) {
            throw new RuntimeException();
        }
    }
}
