import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class135 extends class128 {

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    private int field2043 = 1;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "J")
    private long field2045 = 0L;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    private int field2046 = 0;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "[J")
    private long[] field2047 = new long[10];

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "J")
    private long field2044 = 0L;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "J")
    private long field2048 = 0L;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)I", line = 5)
    public final int method880(int arg0, int arg1, int arg2) {
        class20.method128(0, (long) arg0);
        this.field2044 += this.method920(1);
        long var4 = (long) arg1 * 1000000L;
        if (arg2 < 63) {
            return 106;
        } else if (this.field2044 < this.field2048) {
            class20.method128(0, (this.field2048 - this.field2044) / 1000000L);
            this.field2045 += this.field2048 - this.field2044;
            this.field2044 += this.field2048 - this.field2044;
            this.field2048 += var4;
            return 1;
        } else {
            int var6 = 0;
            do {
                this.field2048 += var4;
                var6++;
            } while (var6 < 10 && this.field2044 > this.field2048);
            if (this.field2048 < this.field2044) {
                this.field2048 = this.field2044;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V", line = 43)
    public final void method876(int arg0) {
        this.field2045 = 0L;
        if (arg0 != -20427) {
            this.method920(32);
        }
        if (this.field2048 > this.field2044) {
            this.field2044 += this.field2048 - this.field2044;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)J", line = 58)
    public final long method881(byte arg0) {
        if (arg0 < 60) {
            this.method880(-75, 82, 38);
        }
        return this.field2044;
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)J", line = 73)
    private final long method920(int arg0) {
        long var2 = class304.method2128((byte) -120) * 1000000L;
        long var4 = var2 - this.field2045;
        this.field2045 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2047[this.field2046] = var4;
            if (this.field2043 < 10) {
                this.field2043++;
            }
            this.field2046 = (this.field2046 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field2043; var8++) {
            var6 += this.field2047[(this.field2046 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2043;
    }
}
