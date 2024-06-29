import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class600 extends class391 {

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "[J")
    private long[] field8041 = new long[10];

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "J")
    private long field8042 = 0L;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    private int field8044 = 0;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "J")
    private long field8045 = 0L;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    private int field8043 = 1;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "J")
    private long field8046 = 0L;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)J", line = 3)
    public final long method798(int arg0) {
        return arg0 == 2 ? this.field8042 : -15L;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)J", line = 14)
    private final long method3299(int arg0) {
        long var2 = class321.method1854(-108) * 1000000L;
        long var4 = var2 - this.field8046;
        this.field8046 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field8041[this.field8044] = var4;
            if (this.field8043 < 10) {
                this.field8043++;
            }
            this.field8044 = (this.field8044 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field8043; var8++) {
            var6 += this.field8041[(this.field8044 + 10 - var8) % 10];
        }
        return var6 / (long) this.field8043;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(JI)I", line = 51)
    public final int method802(long arg0, int arg1) {
        if (arg1 > -62) {
            this.field8042 = 28L;
        }
        if (this.field8042 < this.field8045) {
            this.field8046 += this.field8045 - this.field8042;
            this.field8042 += this.field8045 - this.field8042;
            this.field8045 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field8045 += arg0;
        } while (var4 < 10 && this.field8042 > this.field8045);
        if (this.field8045 < this.field8042) {
            this.field8045 = this.field8042;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)J", line = 84)
    public final long method800(boolean arg0) {
        this.field8042 += this.method3299(1);
        if (arg0) {
            return -55L;
        } else if (this.field8045 > this.field8042) {
            return (this.field8045 - this.field8042) / 1000000L;
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 108)
    public final void method799(byte arg0) {
        this.field8046 = 0L;
        int var2 = 3 / ((arg0 + 51) / 47);
        if (this.field8045 > this.field8042) {
            this.field8042 += this.field8045 - this.field8042;
        }
    }
}
