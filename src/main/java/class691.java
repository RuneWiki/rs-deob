import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class691 {

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public int field9643 = 0;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public int field9642 = 0;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Z")
    private boolean field9652 = false;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field9649 = 1401;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "J")
    public static long field9651 = -1L;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public int field9635;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    private int field9636;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public int field9638;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public int field9640;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public int field9641;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field9644;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public int field9645;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field9646;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public int field9647;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public int field9648;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field9650;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public int field9653;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public int field9654;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "J")
    public long field9637;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lgga;II)V", line = 6)
    private final void method3917(class511 arg0, int arg1, int arg2) {
        field9646++;
        if (arg1 != -3645) {
            this.method3919(true);
        }
        if (arg2 == 1) {
            this.field9636 = arg0.method3002(-1);
        } else if (arg2 == 2) {
            arg0.method3013(48);
        } else if (arg2 == 3) {
            this.field9647 = arg0.method3008(arg1 ^ 0xFFFFF183);
            this.field9653 = arg0.method3008(arg1 + 3709);
            this.field9635 = arg0.method3008(64);
        } else if (arg2 == 4) {
            this.field9641 = arg0.method3013(-121);
            this.field9648 = arg0.method3008(64);
        } else if (arg2 == 6) {
            this.field9645 = arg0.method3013(-109);
        } else if (arg2 == 8) {
            this.field9643 = 1;
        } else if (arg2 == 9) {
            this.field9642 = 1;
        } else if (arg2 == 10) {
            this.field9652 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILgga;)V", line = 63)
    public final void method3918(int arg0, class511 arg1) {
        while (true) {
            int var3 = arg1.method3013(-126);
            if (var3 == 0) {
                if (arg0 != -94557789) {
                    field9651 = -55L;
                }
                field9644++;
                return;
            }
            this.method3917(arg1, -3645, var3);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 85)
    public final void method3919(boolean arg0) {
        this.field9638 = class448.field6270[this.field9636 << 3];
        field9639++;
        long var2 = (long) this.field9647;
        if (!arg0) {
            this.field9642 = 65;
        }
        long var4 = (long) this.field9653;
        long var6 = (long) this.field9635;
        this.field9654 = (int) Math.sqrt((double) (var2 * var2 + var4 * var4 + var6 * var6));
        if (this.field9648 == 0) {
            this.field9648 = 1;
        }
        if (this.field9641 == 0) {
            this.field9637 = 2147483647L;
        } else if (this.field9641 == 1) {
            this.field9637 = (this.field9654 * 8 / this.field9648);
            this.field9637 *= this.field9637;
        } else if (this.field9641 == 2) {
            this.field9637 = (this.field9654 * 8 / this.field9648);
        }
        if (this.field9652) {
            this.field9654 *= -1;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZZI)V", line = 134)
    public static final void method3920(boolean arg0, boolean arg1, int arg2) {
        if (arg2 != -94557789) {
            field9649 = -44;
        }
        if (arg1) {
            class647.field9057++;
            class436.method2614(0);
        }
        field9650++;
        if (arg0) {
            class753.field10383++;
            class546.method3232(-118);
        }
    }
}
