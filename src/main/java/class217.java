import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class217 extends class335 {

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "J")
    private long field2838 = 0L;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "J")
    private long field2837 = 0L;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    private int field2840 = 1;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "[J")
    private long[] field2839 = new long[10];

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    private int field2842 = 0;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "J")
    private long field2841 = 0L;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)J")
    public final long method160(byte arg0) {
        return arg0 <= 2 ? 23L : this.field2837;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
    public final void method161(int arg0) {
        int var2 = 74 % ((-arg0 - 65) / 48);
        if (this.field2838 > this.field2837) {
            this.field2837 += this.field2838 - this.field2837;
        }
        this.field2841 = 0L;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IJ)I")
    public final int method163(int arg0, long arg1) {
        if (arg0 != 70) {
            return -1;
        } else if (this.field2837 < this.field2838) {
            this.field2841 += this.field2838 - this.field2837;
            this.field2837 += this.field2838 - this.field2837;
            this.field2838 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field2838 += arg1;
            } while (var4 < 10 && this.field2838 < this.field2837);
            if (this.field2837 > this.field2838) {
                this.field2838 = this.field2837;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)J")
    public final long method164(int arg0) {
        if (arg0 == -9876) {
            this.field2837 += this.method1335(false);
            return this.field2838 > this.field2837 ? (this.field2838 - this.field2837) / 1000000L : 0L;
        } else {
            return 74L;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)J")
    private final long method1335(boolean arg0) {
        if (arg0) {
            this.field2842 = -31;
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field2841;
        this.field2841 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2839[this.field2842] = var4;
            if (this.field2840 < 1) {
                this.field2840++;
            }
            this.field2842 = (this.field2842 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2840; var8++) {
            var6 += this.field2839[(this.field2842 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2840;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "()V")
    public class217() {
        this.field2838 = this.field2837 = jagmisc.nanoTime();
        if (this.field2837 == 0L) {
            throw new RuntimeException();
        }
    }
}
