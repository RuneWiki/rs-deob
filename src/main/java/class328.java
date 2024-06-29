import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class328 extends class69 {

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    private int field5078 = 1;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "J")
    private long field5077 = 0L;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "J")
    private long field5080 = 0L;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    private int field5079 = 0;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "[J")
    private long[] field5081 = new long[10];

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "J")
    private long field5082 = 0L;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZII)I", line = 8)
    public final int method495(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.method495(false, -96, 18);
        }
        long var4 = (long) arg1 * 1000000L;
        class96.method657((long) arg2, (byte) -115);
        this.field5080 += this.method2223((byte) -105);
        if (this.field5080 < this.field5082) {
            class96.method657((this.field5082 - this.field5080) / 1000000L, (byte) -115);
            this.field5077 += this.field5082 - this.field5080;
            this.field5080 += this.field5082 - this.field5080;
            this.field5082 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field5082 += var4;
        } while (var6 < 10 && this.field5082 < this.field5080);
        if (this.field5082 < this.field5080) {
            this.field5082 = this.field5080;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)J", line = 55)
    private final long method2223(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field5077;
        this.field5077 = var2;
        if (var4 > 0L && var4 < 5000000000L) {
            this.field5081[this.field5079] = var4;
            if (this.field5078 < 1) {
                this.field5078++;
            }
            this.field5079 = (this.field5079 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 >= -35) {
            this.field5080 = 35L;
        }
        for (int var8 = 1; var8 <= this.field5078; var8++) {
            var6 += this.field5081[(this.field5079 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5078;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)J", line = 94)
    public final long method496(int arg0) {
        return arg0 == 4398 ? this.field5080 : 29L;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 107)
    public final void method491(int arg0) {
        this.field5077 = (long) arg0;
        if (this.field5080 < this.field5082) {
            this.field5080 += this.field5082 - this.field5080;
        }
    }
}
