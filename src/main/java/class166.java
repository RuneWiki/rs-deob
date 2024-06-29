import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class166 extends class320 {

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "J")
    private long field2127 = 0L;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "J")
    private long field2126 = 0L;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "[J")
    private long[] field2129 = new long[10];

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "J")
    private long field2128 = 0L;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    private int field2130 = 1;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    private int field2131 = 0;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)J", line = 7)
    private final long method1400(byte arg0) {
        if (arg0 >= -118) {
            this.field2131 = 72;
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field2128;
        this.field2128 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2129[this.field2131] = var4;
            if (this.field2130 < 1) {
                this.field2130++;
            }
            this.field2131 = (this.field2131 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2130; var8++) {
            var6 += this.field2129[(this.field2131 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2130;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IJ)I", line = 38)
    public final int method1401(int arg0, long arg1) {
        if (arg0 != 0) {
            return 22;
        } else if (this.field2127 < this.field2126) {
            this.field2128 += this.field2126 - this.field2127;
            this.field2127 += this.field2126 - this.field2127;
            this.field2126 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field2126 += arg1;
                var4++;
            } while (var4 < 10 && this.field2127 > this.field2126);
            if (this.field2127 > this.field2126) {
                this.field2126 = this.field2127;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 70)
    public final void method1402(int arg0) {
        this.field2128 = 0L;
        if (this.field2126 > this.field2127) {
            this.field2127 += this.field2126 - this.field2127;
        }
        if (arg0 != 7521) {
            this.field2130 = 101;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)J", line = 83)
    public final long method1403(byte arg0) {
        this.field2127 += this.method1400((byte) -119);
        if (arg0 != 11) {
            this.field2127 = 98L;
        }
        return this.field2127 < this.field2126 ? (this.field2126 - this.field2127) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 114)
    public class166() {
        this.field2127 = System.nanoTime();
        this.field2126 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(Z)J", line = 103)
    public final long method1404(boolean arg0) {
        if (!arg0) {
            this.method1404(true);
        }
        return this.field2127;
    }
}
