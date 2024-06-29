import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class321 extends class237 {

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "J")
    private long field4937 = 0L;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    private int field4938 = 1;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    private int field4940 = 0;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "J")
    private long field4941 = 0L;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "[J")
    private long[] field4939 = new long[10];

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "J")
    private long field4942 = 0L;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)J", line = 3)
    private final long method2006(int arg0) {
        long var2 = class381.method2281((byte) 37) * 1000000L;
        long var4 = var2 - this.field4937;
        this.field4937 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4939[this.field4940] = var4;
            this.field4940 = (this.field4940 + 1) % 10;
            if (this.field4938 < 10) {
                this.field4938++;
            }
        }
        long var6 = 0L;
        if (arg0 < 21) {
            return 102L;
        } else {
            for (int var8 = 1; var8 <= this.field4938; var8++) {
                var6 += this.field4939[(this.field4940 + 10 - var8) % 10];
            }
            return var6 / (long) this.field4938;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 37)
    public final void method4(int arg0) {
        this.field4937 = arg0;
        if (this.field4942 > this.field4941) {
            this.field4941 += this.field4942 - this.field4941;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I", line = 47)
    public final int method1(int arg0, int arg1) {
        this.field4941 += this.method2006(arg0 ^ 0x149A);
        long var3 = (long) arg1 * 1000000L;
        if (arg0 != 5309) {
            this.field4939 = null;
        }
        if (this.field4941 < this.field4942) {
            class389.method2332(arg0 ^ 0x14B9, (this.field4942 - this.field4941) / 1000000L);
            this.field4937 += this.field4942 - this.field4941;
            this.field4941 += this.field4942 - this.field4941;
            this.field4942 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field4942 += var3;
        } while (var5 < 10 && this.field4941 > this.field4942);
        if (this.field4941 > this.field4942) {
            this.field4942 = this.field4941;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)J", line = 84)
    public final long method2(boolean arg0) {
        return arg0 ? this.field4941 : 79L;
    }
}
