import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class168 extends class83 {

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "J")
    private long field2418 = 0L;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "J")
    private long field2419 = 0L;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    private int field2421 = 1;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    private int field2420 = 0;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "J")
    private long field2423 = 0L;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "[J")
    private long[] field2422 = new long[10];

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 5)
    public final void method42(boolean arg0) {
        if (!arg0) {
            this.field2419 = -17L;
        }
        if (this.field2419 > this.field2418) {
            this.field2418 += this.field2419 - this.field2418;
        }
        this.field2423 = 0L;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)J", line = 19)
    public final long method41(byte arg0) {
        if (arg0 != 6) {
            this.method42(true);
        }
        return this.field2418;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)J", line = 30)
    private final long method1190(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = 0L;
        long var6 = var2 - this.field2423;
        this.field2423 = var2;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field2422[this.field2420] = var6;
            if (this.field2421 < 1) {
                this.field2421++;
            }
            this.field2420 = (this.field2420 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field2421; var8++) {
            var4 += this.field2422[(this.field2420 + 10 - var8) % 10];
        }
        int var9 = -54 / ((-arg0 - 41) / 50);
        return var4 / (long) this.field2421;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V", line = 104)
    public class168() {
        this.field2419 = this.field2418 = jagmisc.nanoTime();
        if (this.field2418 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)I", line = 68)
    public final int method43(int arg0, int arg1, int arg2) {
        class184.method1283((long) arg1, 10);
        if (arg0 >= -29) {
            return 30;
        }
        long var4 = (long) arg2 * 1000000L;
        this.field2418 += this.method1190((byte) 45);
        if (this.field2418 < this.field2419) {
            class184.method1283((this.field2419 - this.field2418) / 1000000L, 10);
            this.field2423 += this.field2419 - this.field2418;
            this.field2418 += this.field2419 - this.field2418;
            this.field2419 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field2419 += var4;
            var6++;
        } while (var6 < 10 && this.field2419 < this.field2418);
        if (this.field2419 < this.field2418) {
            this.field2419 = this.field2418;
        }
        return var6;
    }
}
