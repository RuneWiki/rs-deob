import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class192 extends class601 {

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "[J")
    private long[] field2311 = new long[10];

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "J")
    private long field2314 = 0L;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "J")
    private long field2313 = 0L;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "J")
    private long field2312 = 0L;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    private int field2315 = 1;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    private int field2310 = 0;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)J")
    public final long method1000(byte arg0) {
        if (arg0 != -19) {
            this.method1001((byte) -25, 83L);
        }
        return this.field2313;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
    public final void method999(boolean arg0) {
        this.field2312 = 0L;
        if (arg0) {
            this.method1000((byte) -103);
        }
        if (this.field2313 < this.field2314) {
            this.field2313 += this.field2314 - this.field2313;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)J")
    private final long method1106(byte arg0) {
        long var2 = class641.method3604(false) * 1000000L;
        long var4 = var2 - this.field2312;
        this.field2312 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2311[this.field2310] = var4;
            this.field2310 = (this.field2310 + 1) % 10;
            if (this.field2315 < 10) {
                this.field2315++;
            }
        }
        long var6 = 0L;
        if (arg0 >= -81) {
            this.method999(true);
        }
        for (int var8 = 1; var8 <= this.field2315; var8++) {
            var6 += this.field2311[(this.field2310 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2315;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)J")
    public final long method1002(boolean arg0) {
        this.field2313 += this.method1106((byte) -106);
        if (arg0) {
            return 123L;
        } else if (this.field2314 > this.field2313) {
            return (this.field2314 - this.field2313) / 1000000L;
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BJ)I")
    public final int method1001(byte arg0, long arg1) {
        int var4 = 62 % ((arg0 + 38) / 43);
        if (this.field2313 < this.field2314) {
            this.field2312 += this.field2314 - this.field2313;
            this.field2313 += this.field2314 - this.field2313;
            this.field2314 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            this.field2314 += arg1;
            var5++;
        } while (var5 < 10 && this.field2314 < this.field2313);
        if (this.field2314 < this.field2313) {
            this.field2314 = this.field2313;
        }
        return var5;
    }
}
