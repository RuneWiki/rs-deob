import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class155 extends class88 {

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "J")
    private long field2324 = 0L;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "J")
    private long field2323 = 0L;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    private int field2325 = 1;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "[J")
    private long[] field2326 = new long[10];

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    private int field2327 = 0;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "J")
    private long field2328 = 0L;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZ)I", line = 6)
    public final int method643(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field2324 = -65L;
        }
        class5.method26(0, (long) arg0);
        this.field2324 += this.method1063((byte) -90);
        long var4 = (long) arg1 * 1000000L;
        if (this.field2324 < this.field2323) {
            class5.method26(0, (this.field2323 - this.field2324) / 1000000L);
            this.field2328 += this.field2323 - this.field2324;
            this.field2324 += this.field2323 - this.field2324;
            this.field2323 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field2323 += var4;
        } while (var6 < 10 && this.field2324 > this.field2323);
        if (this.field2323 < this.field2324) {
            this.field2323 = this.field2324;
        }
        return var6;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)J", line = 45)
    private final long method1063(byte arg0) {
        if (arg0 >= -87) {
            this.method642(false);
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field2328;
        long var6 = 0L;
        this.field2328 = var2;
        if (var4 > 0L && var4 < 5000000000L) {
            this.field2326[this.field2327] = var4;
            this.field2327 = (this.field2327 + 1) % 10;
            if (this.field2325 < 1) {
                this.field2325++;
            }
        }
        for (int var8 = 1; var8 <= this.field2325; var8++) {
            var6 += this.field2326[(this.field2327 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2325;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 83)
    public class155() {
        this.field2324 = System.nanoTime();
        this.field2323 = System.nanoTime();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)J", line = 93)
    public final long method639(int arg0) {
        return arg0 == 40 ? this.field2324 : -61L;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V", line = 104)
    public final void method642(boolean arg0) {
        if (this.field2324 < this.field2323) {
            this.field2324 += this.field2323 - this.field2324;
        }
        if (!arg0) {
            this.field2328 = 0L;
        }
    }
}
