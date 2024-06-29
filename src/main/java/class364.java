import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class364 extends class13 {

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    private int field5355 = 1;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "J")
    private long field5357 = 0L;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "J")
    private long field5356 = 0L;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "J")
    private long field5358 = 0L;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[J")
    private long[] field5360 = new long[10];

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    private int field5359 = 0;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)I", line = 3)
    public final int method65(int arg0, byte arg1) {
        this.field5357 += this.method2204(1);
        long var3 = (long) arg0 * 1000000L;
        if (arg1 > -101) {
            this.method65(-22, (byte) -7);
        }
        if (this.field5358 > this.field5357) {
            class414.method2437((this.field5358 - this.field5357) / 1000000L, (byte) -122);
            this.field5356 += this.field5358 - this.field5357;
            this.field5357 += this.field5358 - this.field5357;
            this.field5358 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field5358 += var3;
            var5++;
        } while (var5 < 10 && this.field5357 > this.field5358);
        if (this.field5357 > this.field5358) {
            this.field5358 = this.field5357;
        }
        return var5;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 39)
    public final void method66(int arg0) {
        if (this.field5357 < this.field5358) {
            this.field5357 += this.field5358 - this.field5357;
        }
        this.field5356 = 0L;
        if (arg0 != 23913) {
            this.method65(17, (byte) -41);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)J", line = 61)
    public final long method69(byte arg0) {
        if (arg0 != 89) {
            this.field5359 = -61;
        }
        return this.field5357;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)J", line = 78)
    private final long method2204(int arg0) {
        long var2 = class344.method2111((byte) -113) * 1000000L;
        long var4 = var2 - this.field5356;
        this.field5356 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5360[this.field5359] = var4;
            if (this.field5355 < 10) {
                this.field5355++;
            }
            this.field5359 = (this.field5359 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field5355; var8++) {
            var6 += this.field5360[(this.field5359 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5355;
    }
}
