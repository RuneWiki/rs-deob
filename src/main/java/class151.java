import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class151 extends class427 {

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "J")
    private long field2262 = 0L;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "J")
    private long field2263 = 0L;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "J")
    private long field2264 = 0L;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    private int field2265 = 1;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    private int field2266 = 0;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[J")
    private long[] field2267 = new long[10];

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)J", line = 5)
    private final long method1058(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field2264;
        this.field2264 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2267[this.field2266] = var4;
            this.field2266 = (this.field2266 + 1) % 10;
            if (this.field2265 < 1) {
                this.field2265++;
            }
        }
        long var6 = 0L;
        int var8 = 1;
        if (arg0 < 87) {
            this.field2263 = 40L;
        }
        while (this.field2265 >= var8) {
            var6 += this.field2267[(this.field2266 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field2265;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(JI)I", line = 40)
    public final int method1059(long arg0, int arg1) {
        int var4 = 63 / ((-arg1 - 56) / 57);
        if (this.field2263 < this.field2262) {
            this.field2264 += this.field2262 - this.field2263;
            this.field2263 += this.field2262 - this.field2263;
            this.field2262 += arg0;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field2262 += arg0;
        } while (var5 < 10 && this.field2262 < this.field2263);
        if (this.field2262 < this.field2263) {
            this.field2262 = this.field2263;
        }
        return var5;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)J", line = 71)
    public final long method1060(int arg0) {
        if (arg0 != 73) {
            this.method1058((byte) 86);
        }
        return this.field2263;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)J", line = 81)
    public final long method1061(byte arg0) {
        this.field2263 += this.method1058((byte) 126);
        if (arg0 != 73) {
            this.field2267 = null;
        }
        return this.field2262 > this.field2263 ? (this.field2262 - this.field2263) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 116)
    public class151() {
        this.field2263 = System.nanoTime();
        this.field2262 = System.nanoTime();
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 102)
    public final void method1062(int arg0) {
        if (this.field2262 > this.field2263) {
            this.field2263 += this.field2262 - this.field2263;
        }
        this.field2264 = 0L;
        if (arg0 != 20054) {
            this.method1061((byte) 59);
        }
    }
}
