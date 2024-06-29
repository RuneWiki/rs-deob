import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class68 extends class583 {

    @OriginalMember(owner = "client!mia", name = "g", descriptor = "J")
    private long field957 = 0L;

    @OriginalMember(owner = "client!mia", name = "h", descriptor = "J")
    private long field958 = 0L;

    @OriginalMember(owner = "client!mia", name = "i", descriptor = "I")
    private int field959 = 1;

    @OriginalMember(owner = "client!mia", name = "k", descriptor = "I")
    private int field961 = 0;

    @OriginalMember(owner = "client!mia", name = "j", descriptor = "[J")
    private long[] field960 = new long[10];

    @OriginalMember(owner = "client!mia", name = "l", descriptor = "J")
    private long field962 = 0L;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)V", line = 3)
    public final void method600(byte arg0) {
        this.field958 = 0L;
        if (this.field962 < this.field957) {
            this.field962 += this.field957 - this.field962;
        }
        int var2 = -84 % ((arg0 - 17) / 54);
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(B)J", line = 17)
    public final long method601(byte arg0) {
        if (arg0 != -96) {
            this.field960 = null;
        }
        this.field962 += this.method602(true);
        return this.field962 < this.field957 ? (this.field957 - this.field962) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(Z)J", line = 38)
    private final long method602(boolean arg0) {
        long var2 = class302.method1910(0) * 1000000L;
        long var4 = var2 - this.field958;
        this.field958 = var2;
        if (!arg0) {
            this.method602(false);
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field960[this.field961] = var4;
            this.field961 = (this.field961 + 1) % 10;
            if (this.field959 < 10) {
                this.field959++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field959; var8++) {
            var6 += this.field960[(this.field961 + 10 - var8) % 10];
        }
        return var6 / (long) this.field959;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(JI)I", line = 75)
    public final int method603(long arg0, int arg1) {
        if (arg1 != -21626) {
            return 6;
        } else if (this.field962 < this.field957) {
            this.field958 += this.field957 - this.field962;
            this.field962 += this.field957 - this.field962;
            this.field957 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field957 += arg0;
                var4++;
            } while (var4 < 10 && this.field957 < this.field962);
            if (this.field962 > this.field957) {
                this.field957 = this.field962;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "(B)J", line = 114)
    public final long method604(byte arg0) {
        if (arg0 < 63) {
            this.field959 = 118;
        }
        return this.field962;
    }
}
