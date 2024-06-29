import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class259 extends class68 {

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "J")
    private long field4183 = 0L;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "[J")
    private long[] field4182 = new long[10];

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    private int field4181 = 0;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "J")
    private long field4180 = 0L;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    private int field4179 = 1;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "J")
    private long field4184 = 0L;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)J")
    private final long method1694(int arg0) {
        long var2 = class299.method2006(9594) * 1000000L;
        long var4 = var2 - this.field4184;
        long var6 = 0L;
        this.field4184 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4182[this.field4181] = var4;
            if (this.field4179 < 10) {
                this.field4179++;
            }
            this.field4181 = (this.field4181 + 1) % 10;
        }
        if (arg0 > -8) {
            return 41L;
        } else {
            for (int var8 = 1; var8 <= this.field4179; var8++) {
                var6 += this.field4182[(this.field4181 - (var8 - 10)) % 10];
            }
            return var6 / (long) this.field4179;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII)I")
    public final int method384(byte arg0, int arg1, int arg2) {
        int var4 = -68 % ((-arg0 - 44) / 59);
        class17.method116(109, (long) arg1);
        this.field4183 += this.method1694(-59);
        long var5 = (long) arg2 * 1000000L;
        if (this.field4180 > this.field4183) {
            class17.method116(-71, (this.field4180 - this.field4183) / 1000000L);
            this.field4184 += this.field4180 - this.field4183;
            this.field4183 += this.field4180 - this.field4183;
            this.field4180 += var5;
            return 1;
        }
        int var7 = 0;
        do {
            var7++;
            this.field4180 += var5;
        } while (var7 < 10 && this.field4180 < this.field4183);
        if (this.field4180 < this.field4183) {
            this.field4180 = this.field4183;
        }
        return var7;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)J")
    public final long method382(byte arg0) {
        if (arg0 != 97) {
            this.method382((byte) -36);
        }
        return this.field4183;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public final void method381(byte arg0) {
        if (arg0 >= 34) {
            if (this.field4183 < this.field4180) {
                this.field4183 += this.field4180 - this.field4183;
            }
            this.field4184 = 0L;
        }
    }
}
