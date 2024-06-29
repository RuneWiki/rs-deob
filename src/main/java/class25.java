import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class25 extends class71 {

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "J")
    private long field335 = 0L;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "J")
    private long field336 = 0L;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "J")
    private long field337 = 0L;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    private int field339 = 1;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    private int field338 = 0;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "[J")
    private long[] field340 = new long[10];

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)I", line = 3)
    public final int method151(byte arg0, int arg1) {
        if (arg0 > -78) {
            this.field337 = -89L;
        }
        this.field335 += this.method154(-87);
        long var3 = (long) arg1 * 1000000L;
        if (this.field336 > this.field335) {
            class334.method2047((this.field336 - this.field335) / 1000000L, 0);
            this.field337 += this.field336 - this.field335;
            this.field335 += this.field336 - this.field335;
            this.field336 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field336 += var3;
        } while (var5 < 10 && this.field335 > this.field336);
        if (this.field335 > this.field336) {
            this.field336 = this.field335;
        }
        return var5;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V", line = 102)
    public class25() {
        this.field336 = this.field335 = jagmisc.nanoTime();
        if (this.field335 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 43)
    public final void method152(int arg0) {
        if (arg0 != -1) {
            this.method151((byte) 0, -87);
        }
        if (this.field335 < this.field336) {
            this.field335 += this.field336 - this.field335;
        }
        this.field337 = 0L;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)J", line = 57)
    public final long method153(int arg0) {
        if (arg0 != 10) {
            this.method152(-65);
        }
        return this.field335;
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)J", line = 67)
    private final long method154(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field337;
        this.field337 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field340[this.field338] = var4;
            this.field338 = (this.field338 + 1) % 10;
            if (this.field339 < 1) {
                this.field339++;
            }
        }
        long var6 = 0L;
        int var8 = 62 / ((arg0 + 13) / 60);
        for (int var9 = 1; var9 <= this.field339; var9++) {
            var6 += this.field340[(this.field338 + 10 - var9) % 10];
        }
        return var6 / (long) this.field339;
    }
}
