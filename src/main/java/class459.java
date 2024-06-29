import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class459 extends class72 {

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "J")
    private long field6313 = 0L;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "[J")
    private long[] field6315 = new long[10];

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    private int field6314 = 1;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    private int field6316 = 0;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "J")
    private long field6317 = 0L;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "J")
    private long field6318 = 0L;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)I", line = 3)
    public final int method472(int arg0, int arg1) {
        if (arg1 != 14965) {
            this.field6314 = -14;
        }
        long var3 = (long) arg0 * 1000000L;
        this.field6317 += this.method2612((byte) -110);
        if (this.field6317 < this.field6313) {
            class94.method674((this.field6313 - this.field6317) / 1000000L, 1);
            this.field6318 += this.field6313 - this.field6317;
            this.field6317 += this.field6313 - this.field6317;
            this.field6313 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field6313 += var3;
            var5++;
        } while (var5 < 10 && this.field6317 > this.field6313);
        if (this.field6317 > this.field6313) {
            this.field6313 = this.field6317;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V", line = 45)
    public final void method473(int arg0) {
        if (this.field6317 < this.field6313) {
            this.field6317 += this.field6313 - this.field6317;
        }
        this.field6318 = 0L;
        if (arg0 != -3512) {
            this.method474((byte) 74);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)J", line = 59)
    public final long method474(byte arg0) {
        return arg0 == 90 ? this.field6317 : 112L;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)J", line = 87)
    private final long method2612(byte arg0) {
        long var2 = class498.method2854(-114) * 1000000L;
        long var4 = var2 - this.field6318;
        this.field6318 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6315[this.field6316] = var4;
            if (this.field6314 < 10) {
                this.field6314++;
            }
            this.field6316 = (this.field6316 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = 1;
        if (arg0 >= -24) {
            this.field6316 = -117;
        }
        while (var8 <= this.field6314) {
            var6 += this.field6315[(this.field6316 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field6314;
    }
}
