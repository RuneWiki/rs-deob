import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class196 extends class296 {

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "J")
    private long field2867 = 0L;

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "J")
    private long field2868 = 0L;

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "I")
    private int field2869 = 0;

    @OriginalMember(owner = "client!uga", name = "i", descriptor = "[J")
    private long[] field2870 = new long[10];

    @OriginalMember(owner = "client!uga", name = "j", descriptor = "J")
    private long field2871 = 0L;

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "I")
    private int field2872 = 1;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V")
    public final void method1269(int arg0) {
        this.field2871 = 0L;
        if (this.field2867 < this.field2868) {
            this.field2867 += this.field2868 - this.field2867;
        }
        int var2 = -67 % ((arg0 - 79) / 39);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)J")
    private final long method1270(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field2871;
        this.field2871 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2870[this.field2869] = var4;
            if (this.field2872 < 1) {
                this.field2872++;
            }
            this.field2869 = (this.field2869 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = 1;
        int var9 = 6 % ((arg0 - 50) / 53);
        while (this.field2872 >= var8) {
            var6 += this.field2870[(this.field2869 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field2872;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(ZJ)I")
    public final int method1271(boolean arg0, long arg1) {
        if (arg0) {
            return 48;
        } else if (this.field2868 > this.field2867) {
            this.field2871 += this.field2868 - this.field2867;
            this.field2867 += this.field2868 - this.field2867;
            this.field2868 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field2868 += arg1;
            } while (var4 < 10 && this.field2868 < this.field2867);
            if (this.field2868 < this.field2867) {
                this.field2868 = this.field2867;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(I)J")
    public final long method1272(int arg0) {
        if (arg0 != -1) {
            this.method1271(true, 33L);
        }
        return this.field2867;
    }

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "(I)J")
    public final long method1273(int arg0) {
        this.field2867 += this.method1270((byte) -118);
        if (arg0 <= 7) {
            return -73L;
        } else if (this.field2867 < this.field2868) {
            return (this.field2868 - this.field2867) / 1000000L;
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "()V")
    public class196() {
        this.field2868 = this.field2867 = jagmisc.nanoTime();
        if (this.field2867 == 0L) {
            throw new RuntimeException();
        }
    }
}
