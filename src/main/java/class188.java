import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class188 extends class244 {

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "J")
    private long field2714 = 0L;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "J")
    private long field2715 = 0L;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "[J")
    private long[] field2717 = new long[10];

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "J")
    private long field2716 = 0L;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
    private int field2718 = 1;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
    private int field2719 = 0;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)J", line = 3)
    public final long method775(byte arg0) {
        int var2 = -70 / ((arg0 - 41) / 62);
        return this.field2715;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)I", line = 12)
    public final int method777(int arg0, byte arg1) {
        if (arg1 != -79) {
            return 18;
        }
        this.field2715 += this.method1358((byte) 117);
        long var3 = (long) arg0 * 1000000L;
        if (this.field2715 < this.field2714) {
            class229.method1541(109, (this.field2714 - this.field2715) / 1000000L);
            this.field2716 += this.field2714 - this.field2715;
            this.field2715 += this.field2714 - this.field2715;
            this.field2714 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field2714 += var3;
        } while (var5 < 10 && this.field2714 < this.field2715);
        if (this.field2715 > this.field2714) {
            this.field2714 = this.field2715;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(B)V", line = 49)
    public final void method776(byte arg0) {
        if (arg0 != 100) {
            this.method775((byte) -17);
        }
        if (this.field2714 > this.field2715) {
            this.field2715 += this.field2714 - this.field2715;
        }
        this.field2716 = 0L;
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(B)J", line = 62)
    private final long method1358(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field2716;
        this.field2716 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2717[this.field2719] = var4;
            this.field2719 = (this.field2719 + 1) % 10;
            if (this.field2718 < 1) {
                this.field2718++;
            }
        }
        long var6 = 0L;
        if (arg0 <= 106) {
            this.method777(-45, (byte) -22);
        }
        for (int var8 = 1; var8 <= this.field2718; var8++) {
            var6 += this.field2717[(this.field2719 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2718;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V", line = 103)
    public class188() {
        this.field2714 = this.field2715 = jagmisc.nanoTime();
        if (this.field2715 == 0L) {
            throw new RuntimeException();
        }
    }
}
