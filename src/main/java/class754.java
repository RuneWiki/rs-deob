import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class754 extends class654 {

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "J")
    private long field11090 = 0L;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "J")
    private long field11091 = 0L;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "[J")
    private long[] field11092 = new long[10];

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    private int field11093 = 0;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    private int field11089 = 1;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "J")
    private long field11094 = 0L;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IJ)I", line = 13)
    public final int method3812(int arg0, long arg1) {
        if (arg0 != 0) {
            return -69;
        } else if (this.field11091 < this.field11094) {
            this.field11090 += this.field11094 - this.field11091;
            this.field11091 += this.field11094 - this.field11091;
            this.field11094 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field11094 += arg1;
            } while (var4 < 10 && this.field11091 > this.field11094);
            if (this.field11091 > this.field11094) {
                this.field11094 = this.field11091;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)J", line = 45)
    private final long method5462(int arg0) {
        long var2 = class712.method5167(-2334) * 1000000L;
        long var4 = var2 - this.field11090;
        this.field11090 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field11092[this.field11093] = var4;
            if (this.field11089 < 10) {
                this.field11089++;
            }
            this.field11093 = (this.field11093 + 1) % 10;
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field11089; var8++) {
            var6 += this.field11092[(this.field11093 + 10 - var8) % 10];
        }
        return var6 / (long) this.field11089;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 77)
    public final void method3815(byte arg0) {
        this.field11090 = 0L;
        if (this.field11094 > this.field11091) {
            this.field11091 += this.field11094 - this.field11091;
        }
        int var2 = 39 / ((arg0 - 39) / 63);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)J", line = 103)
    public final long method3814(boolean arg0) {
        this.field11091 += this.method5462(0);
        if (!arg0) {
            this.method5462(-68);
        }
        return this.field11094 > this.field11091 ? (this.field11094 - this.field11091) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)J", line = 120)
    public final long method3813(byte arg0) {
        if (arg0 != -88) {
            this.method3812(95, -54L);
        }
        return this.field11091;
    }
}
