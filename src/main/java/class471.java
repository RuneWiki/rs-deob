import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class471 extends class669 {

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    private int field5976 = 0;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[J")
    private long[] field5977 = new long[10];

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "J")
    private long field5980 = 0L;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "J")
    private long field5979 = 0L;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    private int field5978 = 1;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "J")
    private long field5981 = 0L;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)J", line = 3)
    public final long method639(int arg0) {
        if (arg0 > -96) {
            this.field5979 = 110L;
        }
        this.field5979 += this.method2492(true);
        return this.field5980 > this.field5979 ? (this.field5980 - this.field5979) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V", line = 21)
    public final void method641(int arg0) {
        if (this.field5979 < this.field5980) {
            this.field5979 += this.field5980 - this.field5979;
        }
        this.field5981 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(JB)I", line = 32)
    public final int method640(long arg0, byte arg1) {
        int var4 = -90 / ((arg1 - 50) / 63);
        if (this.field5979 < this.field5980) {
            this.field5981 += this.field5980 - this.field5979;
            this.field5979 += this.field5980 - this.field5979;
            this.field5980 += arg0;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field5980 += arg0;
        } while (var5 < 10 && this.field5980 < this.field5979);
        if (this.field5980 < this.field5979) {
            this.field5980 = this.field5979;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)J", line = 64)
    public final long method643(int arg0) {
        if (arg0 != 26262) {
            this.method641(67);
        }
        return this.field5979;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)J", line = 77)
    private final long method2492(boolean arg0) {
        long var2 = class571.method3150(120) * 1000000L;
        long var4 = var2 - this.field5981;
        this.field5981 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5977[this.field5976] = var4;
            this.field5976 = (this.field5976 + 1) % 10;
            if (this.field5978 < 10) {
                this.field5978++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5978; var8++) {
            var6 += this.field5977[(this.field5976 + 10 - var8) % 10];
        }
        if (!arg0) {
            this.field5979 = -13L;
        }
        return var6 / (long) this.field5978;
    }
}
