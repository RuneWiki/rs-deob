import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class322 extends class128 {

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "J")
    private long field5041 = 0L;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "J")
    private long field5042 = 0L;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "[J")
    private long[] field5044 = new long[10];

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    private int field5045 = 0;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "J")
    private long field5043 = 0L;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    private int field5046 = 1;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)J", line = 6)
    public final long method881(byte arg0) {
        return arg0 <= 60 ? 43L : this.field5041;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)J", line = 17)
    private final long method2250(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field5043;
        this.field5043 = var2;
        long var6 = 0L;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5044[this.field5045] = var4;
            if (this.field5046 < 1) {
                this.field5046++;
            }
            this.field5045 = (this.field5045 + 1) % 10;
        }
        if (arg0 <= 44) {
            return 122L;
        } else {
            for (int var8 = 1; var8 <= this.field5046; var8++) {
                var6 += this.field5044[(this.field5045 + 10 - var8) % 10];
            }
            return var6 / (long) this.field5046;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I", line = 51)
    public final int method880(int arg0, int arg1, int arg2) {
        class20.method128(0, (long) arg0);
        long var4 = (long) arg1 * 1000000L;
        if (arg2 < 63) {
            return -106;
        }
        this.field5041 += this.method2250((byte) 56);
        if (this.field5041 < this.field5042) {
            class20.method128(0, (this.field5042 - this.field5041) / 1000000L);
            this.field5043 += this.field5042 - this.field5041;
            this.field5041 += this.field5042 - this.field5041;
            this.field5042 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field5042 += var4;
            var6++;
        } while (var6 < 10 && this.field5041 > this.field5042);
        if (this.field5041 > this.field5042) {
            this.field5042 = this.field5041;
        }
        return var6;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 91)
    public class322() {
        this.field5041 = System.nanoTime();
        this.field5042 = System.nanoTime();
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 103)
    public final void method876(int arg0) {
        if (this.field5042 > this.field5041) {
            this.field5041 += this.field5042 - this.field5041;
        }
        this.field5043 = 0L;
        if (arg0 != -20427) {
            this.field5043 = -88L;
        }
    }
}
