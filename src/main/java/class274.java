import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class274 extends class333 {

    @OriginalMember(owner = "client!re", name = "m", descriptor = "J")
    private long field4268 = 0L;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    private int field4269 = 0;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "[J")
    private long[] field4267 = new long[10];

    @OriginalMember(owner = "client!re", name = "o", descriptor = "J")
    private long field4270 = 0L;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "J")
    private long field4272 = 0L;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    private int field4271 = 1;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)J", line = 8)
    private final long method1910(int arg0) {
        long var2 = 0L;
        long var4 = class105.method789((byte) 55) * 1000000L;
        long var6 = var4 - this.field4268;
        this.field4268 = var4;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field4267[this.field4269] = var6;
            this.field4269 = (this.field4269 + 1) % 10;
            if (this.field4271 < 10) {
                this.field4271++;
            }
        }
        if (arg0 < 126) {
            this.method1910(39);
        }
        for (int var8 = 1; var8 <= this.field4271; var8++) {
            var2 += this.field4267[(this.field4269 + 10 - var8) % 10];
        }
        return var2 / (long) this.field4271;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIB)I", line = 41)
    public final int method190(int arg0, int arg1, byte arg2) {
        long var4 = (long) arg1 * 1000000L;
        class324.method2252(-24861, (long) arg0);
        this.field4272 += this.method1910(127);
        if (arg2 != 91) {
            this.method191(-3);
        }
        if (this.field4270 > this.field4272) {
            class324.method2252(arg2 ^ 0xFFFF9EB8, (this.field4270 - this.field4272) / 1000000L);
            this.field4268 += this.field4270 - this.field4272;
            this.field4272 += this.field4270 - this.field4272;
            this.field4270 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field4270 += var4;
            var6++;
        } while (var6 < 10 && this.field4272 > this.field4270);
        if (this.field4272 > this.field4270) {
            this.field4270 = this.field4272;
        }
        return var6;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 85)
    public final void method191(int arg0) {
        this.field4268 = (long) arg0;
        if (this.field4272 < this.field4270) {
            this.field4272 += this.field4270 - this.field4272;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)J", line = 106)
    public final long method193(byte arg0) {
        if (arg0 != -65) {
            this.field4269 = 113;
        }
        return this.field4272;
    }
}
