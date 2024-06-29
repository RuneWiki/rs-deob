import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class281 extends class183 {

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    private int field4653 = 1;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "[J")
    private long[] field4654 = new long[10];

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "J")
    private long field4655 = 0L;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "J")
    private long field4657 = 0L;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    private int field4656 = 0;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "J")
    private long field4658 = 0L;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V")
    public final void method419(boolean arg0) {
        if (!arg0) {
            this.field4655 = -95L;
        }
        this.field4657 = 0L;
        if (this.field4655 < this.field4658) {
            this.field4655 += this.field4658 - this.field4655;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)J")
    private final long method1961(int arg0) {
        long var2 = class188.method1355(80) * 1000000L;
        if (arg0 != 3276) {
            this.method1961(-91);
        }
        long var4 = var2 - this.field4657;
        this.field4657 = var2;
        long var6 = 0L;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4654[this.field4656] = var4;
            this.field4656 = (this.field4656 + 1) % 10;
            if (this.field4653 < 10) {
                this.field4653++;
            }
        }
        for (int var8 = 1; var8 <= this.field4653; var8++) {
            var6 += this.field4654[(this.field4656 - (var8 - 10)) % 10];
        }
        return var6 / (long) this.field4653;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)I")
    public final int method420(int arg0, int arg1, int arg2) {
        class28.method182((long) arg0, true);
        this.field4655 += this.method1961(arg1 ^ 0xCCC);
        long var4 = (long) arg2 * 1000000L;
        if (arg1 != 0) {
            return 96;
        } else if (this.field4658 > this.field4655) {
            class28.method182((this.field4658 - this.field4655) / 1000000L, true);
            this.field4657 += this.field4658 - this.field4655;
            this.field4655 += this.field4658 - this.field4655;
            this.field4658 += var4;
            return 1;
        } else {
            int var6 = 0;
            do {
                this.field4658 += var4;
                var6++;
            } while (var6 < 10 && this.field4658 < this.field4655);
            if (this.field4655 > this.field4658) {
                this.field4658 = this.field4655;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)J")
    public final long method417(int arg0) {
        return arg0 == 0 ? this.field4655 : 22L;
    }
}
