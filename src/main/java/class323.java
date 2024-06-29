import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class323 extends class178 {

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "J")
    private long field5305 = 0L;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    private int field5303 = 0;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "[J")
    private long[] field5304 = new long[10];

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    private int field5306 = 1;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "J")
    private long field5307 = 0L;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "J")
    private long field5308 = 0L;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)J", line = 10)
    private final long method2315(int arg0) {
        if (arg0 != -7271) {
            return -54L;
        }
        long var2 = 0L;
        long var4 = class19.method122(arg0 - 4898) * 1000000L;
        long var6 = var4 - this.field5307;
        this.field5307 = var4;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field5304[this.field5303] = var6;
            if (this.field5306 < 10) {
                this.field5306++;
            }
            this.field5303 = (this.field5303 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field5306; var8++) {
            var2 += this.field5304[(this.field5303 + 10 - var8) % 10];
        }
        return var2 / (long) this.field5306;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 44)
    public final void method452(byte arg0) {
        this.field5307 = 0L;
        if (arg0 != 105) {
            this.method451(-20);
        }
        if (this.field5305 > this.field5308) {
            this.field5308 += this.field5305 - this.field5308;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I", line = 59)
    public final int method453(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        class177.method1246((long) arg1, -32644);
        this.field5308 += this.method2315(-7271);
        if (arg0 > -19) {
            this.method452((byte) 113);
        }
        if (this.field5305 > this.field5308) {
            class177.method1246((this.field5305 - this.field5308) / 1000000L, -32644);
            this.field5307 += this.field5305 - this.field5308;
            this.field5308 += this.field5305 - this.field5308;
            this.field5305 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field5305 += var4;
        } while (var6 < 10 && this.field5305 < this.field5308);
        if (this.field5308 > this.field5305) {
            this.field5305 = this.field5308;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)J", line = 99)
    public final long method451(int arg0) {
        if (arg0 < 51) {
            this.field5308 = 43L;
        }
        return this.field5308;
    }
}
