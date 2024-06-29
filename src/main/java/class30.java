import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class30 extends class604 {

    @OriginalMember(owner = "client!mca", name = "s", descriptor = "[I")
    private int[] field478 = new int[this.field7937];

    @OriginalMember(owner = "client!mca", name = "t", descriptor = "I")
    public static int field479 = 0;

    @OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!mca", name = "u", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!mca", name = "w", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!mca", name = "x", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client!mca", name = "y", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!mca", name = "z", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!mca", name = "A", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client!mca", name = "v", descriptor = "[B")
    private byte[] field481;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method265(boolean arg0) {
        ++field480;
        if (class21.field392 != null) {
            if (!arg0) {
                class21.field392 = null;
                class310.method1908(class274.field3814, class267.field3716, -50, class214.field3121, class366.field5133);
            }
        }
    }

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "(I)V", line = 21)
    public final void method266(int arg0) {
        this.field483 = Math.abs(this.field483);
        ++field477;
        if (this.field483 >= 4096) {
            this.field483 = 4095;
        }
        this.method269(this.field486++, false, (byte) (this.field483 >> 4));
        if (arg0 != 28926) {
            this.method268(-100, 121, -7);
        }
        this.field483 = 0;
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)V", line = 37)
    public final void method267(int arg0) {
        ++field482;
        int var2 = 110 / ((22 - arg0) / 45);
        this.field486 = 0;
        this.field483 = 0;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)V", line = 50)
    public final void method268(int arg0, int arg1, int arg2) {
        this.field483 += this.field478[arg2] * arg1 >> 12;
        ++field485;
        if (arg0 != -256) {
            this.field481 = null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IZB)V", line = 65)
    public void method269(int arg0, boolean arg1, byte arg2) {
        this.field481[this.field486++] = (byte) (class48.method346(arg2 >> 1, 127) + 127);
        if (arg1) {
            this.method267(-84);
        }
        ++field484;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(IIIIIF)V", line = 82)
    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field7937 < ~var7; ++var7) {
            this.field478[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }
}
