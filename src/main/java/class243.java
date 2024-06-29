import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class243 extends class144 {

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "J")
    private long field3640 = 0L;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "J")
    private long field3639 = 0L;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "[J")
    private long[] field3643 = new long[10];

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "J")
    private long field3641 = 0L;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    private int field3644 = 1;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    private int field3642 = 0;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)J", line = 5)
    public final long method537(int arg0) {
        return arg0 == 16711935 ? this.field3639 : -71L;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)I", line = 17)
    public final int method536(int arg0, int arg1) {
        if (arg0 != 16711935) {
            this.method1601(-10);
        }
        this.field3639 += this.method1601(10);
        long var3 = (long) arg1 * 1000000L;
        if (this.field3640 > this.field3639) {
            class477.method2826((this.field3640 - this.field3639) / 1000000L, 0);
            this.field3641 += this.field3640 - this.field3639;
            this.field3639 += this.field3640 - this.field3639;
            this.field3640 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field3640 += var3;
        } while (var5 < 10 && this.field3640 < this.field3639);
        if (this.field3639 > this.field3640) {
            this.field3640 = this.field3639;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)J", line = 54)
    private final long method1601(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field3641;
        this.field3641 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3643[this.field3642] = var4;
            this.field3642 = (this.field3642 + 1) % 10;
            if (this.field3644 < 1) {
                this.field3644++;
            }
        }
        long var6 = 0L;
        int var8 = 1;
        if (arg0 != 10) {
            this.method536(-107, 23);
        }
        while (this.field3644 >= var8) {
            var6 += this.field3643[(this.field3642 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field3644;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 86)
    public final void method535(byte arg0) {
        if (this.field3640 > this.field3639) {
            this.field3639 += this.field3640 - this.field3639;
        }
        this.field3641 = 0L;
        int var2 = -39 % ((-arg0 - 65) / 52);
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V", line = 102)
    public class243() {
        this.field3639 = System.nanoTime();
        this.field3640 = System.nanoTime();
    }
}
