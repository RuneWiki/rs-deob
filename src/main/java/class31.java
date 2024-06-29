import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class31 extends class265 {

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "[J")
    private long[] field360 = new long[10];

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    private int field363 = 1;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "J")
    private long field362 = 0L;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    private int field361 = 0;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "J")
    private long field364 = 0L;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "J")
    private long field359 = 0L;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)J", line = 10)
    public final long method195(int arg0) {
        if (arg0 != 0) {
            this.method198(86, 66, 59);
        }
        return this.field364;
    }

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)J", line = 22)
    private final long method196(int arg0) {
        long var2 = class6.method37(arg0 ^ 0x2A4C) * 1000000L;
        long var4 = var2 - this.field362;
        long var6 = (long) arg0;
        this.field362 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field360[this.field361] = var4;
            if (this.field363 < 10) {
                this.field363++;
            }
            this.field361 = (this.field361 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field363; var8++) {
            var6 += this.field360[(this.field361 + 10 - var8) % 10];
        }
        return var6 / (long) this.field363;
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V", line = 52)
    public final void method197(int arg0) {
        if (this.field359 > this.field364) {
            this.field364 += this.field359 - this.field364;
        }
        int var2 = -108 % ((arg0 - 2) / 59);
        this.field362 = 0L;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)I", line = 72)
    public final int method198(int arg0, int arg1, int arg2) {
        class177.method1299((byte) 64, (long) arg0);
        if (arg1 <= 91) {
            this.method197(-114);
        }
        this.field364 += this.method196(0);
        long var4 = (long) arg2 * 1000000L;
        if (this.field359 > this.field364) {
            class177.method1299((byte) 64, (this.field359 - this.field364) / 1000000L);
            this.field362 += this.field359 - this.field364;
            this.field364 += this.field359 - this.field364;
            this.field359 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field359 += var4;
        } while (var6 < 10 && this.field359 < this.field364);
        if (this.field359 < this.field364) {
            this.field359 = this.field364;
        }
        return var6;
    }
}
