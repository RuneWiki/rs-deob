import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class284 extends class137 {

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    private int field4234 = 1;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "J")
    private long field4233 = 0L;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "J")
    private long field4236 = 0L;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[J")
    private long[] field4237 = new long[10];

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "J")
    private long field4238 = 0L;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    private int field4235 = 0;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)I", line = 4)
    public final int method651(int arg0, int arg1, int arg2) {
        class186.method1304(10, (long) arg0);
        if (arg2 != 26) {
            this.method651(47, -76, -116);
        }
        long var4 = (long) arg1 * 1000000L;
        long var6 = this.method1960(1);
        this.field4238 += var6;
        if (this.field4238 >= this.field4233) {
            int var8 = 0;
            do {
                this.field4233 += var4;
                var8++;
            } while (var8 < 10 && this.field4238 > this.field4233);
            if (this.field4238 > this.field4233) {
                this.field4233 = this.field4238;
            }
            return var8;
        }
        while (this.field4233 > this.field4238) {
            long var9 = this.field4233 - this.field4238;
            if (var6 < var9) {
                var9 = var6;
            }
            if (var9 < 1000000L) {
                var9 = 1000000L;
            }
            class186.method1304(arg2 - 16, (var9 + 500000L) / 1000000L);
            var6 = this.method1960(1);
            this.field4238 += var6;
        }
        this.field4233 += var4;
        return 1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 70)
    public final void method652(byte arg0) {
        this.field4236 = 0L;
        if (this.field4238 < this.field4233) {
            this.field4238 += this.field4233 - this.field4238;
        }
        if (arg0 > -101) {
            this.field4238 = -126L;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)J", line = 88)
    public final long method654(int arg0) {
        if (arg0 != 26) {
            this.method654(95);
        }
        return this.field4238;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)J", line = 106)
    private final long method1960(int arg0) {
        long var2 = class29.method174(27763) * 1000000L;
        long var4 = var2 - this.field4236;
        this.field4236 = var2;
        long var6 = 0L;
        if (var4 > 0L && var4 < 5000000000L) {
            this.field4237[this.field4235] = var4;
            this.field4235 = (this.field4235 + 1) % 10;
            if (this.field4234 < 10) {
                this.field4234++;
            }
        }
        for (int var8 = arg0; var8 <= this.field4234; var8++) {
            var6 += this.field4237[(this.field4235 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4234;
    }
}
