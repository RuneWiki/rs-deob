import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class299 extends class16 {

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "J")
    private long field4286 = 0L;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "J")
    private long field4287 = 0L;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    private int field4290 = 1;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "J")
    private long field4288 = 0L;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "[J")
    private long[] field4289 = new long[10];

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    private int field4291 = 0;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "(I)J")
    private final long method1893(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field4288;
        this.field4288 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4289[this.field4291] = var4;
            this.field4291 = (this.field4291 + 1) % 10;
            if (this.field4290 < 1) {
                this.field4290++;
            }
        }
        long var6 = 0L;
        if (arg0 >= -98) {
            this.method41(9);
        }
        for (int var8 = 1; var8 <= this.field4290; var8++) {
            var6 += this.field4289[(this.field4291 - (var8 - 10)) % 10];
        }
        return var6 / (long) this.field4290;
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)J")
    public final long method42(int arg0) {
        return arg0 == 30786 ? this.field4287 : 79L;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I")
    public final int method40(int arg0, int arg1) {
        long var3 = (long) arg0 * 1000000L;
        int var5 = 36 % ((arg1 + 11) / 35);
        this.field4287 += this.method1893(-117);
        if (this.field4286 > this.field4287) {
            class404.method2628(-108, (this.field4286 - this.field4287) / 1000000L);
            this.field4288 += this.field4286 - this.field4287;
            this.field4287 += this.field4286 - this.field4287;
            this.field4286 += var3;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field4286 += var3;
        } while (var6 < 10 && this.field4287 > this.field4286);
        if (this.field4287 > this.field4286) {
            this.field4286 = this.field4287;
        }
        return var6;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public final void method41(int arg0) {
        this.field4288 = 0L;
        if (this.field4286 > this.field4287) {
            this.field4287 += this.field4286 - this.field4287;
        }
        int var2 = 58 / ((arg0 - 9) / 63);
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
    public class299() {
        this.field4286 = this.field4287 = jagmisc.nanoTime();
        if (this.field4287 == 0L) {
            throw new RuntimeException();
        }
    }
}
