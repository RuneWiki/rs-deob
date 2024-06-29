import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class68 extends class466 {

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "[J")
    private long[] field947 = new long[10];

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "J")
    private long field946 = 0L;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    private int field949 = 0;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "J")
    private long field950 = 0L;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "J")
    private long field951 = 0L;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    private int field948 = 1;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I", line = 3)
    public final int method337(int arg0, int arg1) {
        if (arg1 != 8) {
            return -104;
        }
        this.field951 += this.method472(false);
        long var3 = (long) arg0 * 1000000L;
        if (this.field951 < this.field946) {
            class106.method710((this.field946 - this.field951) / 1000000L, (byte) 6);
            this.field950 += this.field946 - this.field951;
            this.field951 += this.field946 - this.field951;
            this.field946 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field946 += var3;
            var5++;
        } while (var5 < 10 && this.field951 > this.field946);
        if (this.field951 > this.field946) {
            this.field946 = this.field951;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)J", line = 40)
    private final long method472(boolean arg0) {
        long var2 = class264.method1698(true) * 1000000L;
        long var4 = var2 - this.field950;
        this.field950 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field947[this.field949] = var4;
            this.field949 = (this.field949 + 1) % 10;
            if (this.field948 < 10) {
                this.field948++;
            }
        }
        long var6 = 0L;
        if (arg0) {
            return 33L;
        } else {
            for (int var8 = 1; var8 <= this.field948; var8++) {
                var6 += this.field947[(this.field949 + 10 - var8) % 10];
            }
            return var6 / (long) this.field948;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)J", line = 75)
    public final long method334(byte arg0) {
        if (arg0 < 47) {
            this.field949 = -10;
        }
        return this.field951;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 88)
    public final void method336(int arg0) {
        if (this.field951 < this.field946) {
            this.field951 += this.field946 - this.field951;
        }
        this.field950 = arg0;
    }
}
