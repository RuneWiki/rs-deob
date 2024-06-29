import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class209 extends class249 {

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "[I")
    private int[] field3149 = new int[this.field3629];

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Lcga;")
    public static class141 field3154 = new class141();

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    private int field3150;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    private int field3152;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "[B")
    private byte[] field3148;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 7)
    public final void method1487(int arg0) {
        this.field3150 = Math.abs(this.field3150);
        ++field3153;
        if (this.field3150 >= 4096) {
            this.field3150 = 4095;
        }
        this.method1489(this.field3152++, (byte) (this.field3150 >> 4), 125);
        if (arg0 != 1983798060) {
            this.method1488(-102, 16, -52);
        }
        this.field3150 = 0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V", line = 26)
    public final void method1488(int arg0, int arg1, int arg2) {
        ++field3156;
        if (arg1 != 776104748) {
            field3154 = null;
        }
        this.field3150 += this.field3149[arg2] * arg0 >> 12;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBI)V", line = 37)
    public void method1489(int arg0, byte arg1, int arg2) {
        if (arg2 >= 59) {
            ++field3155;
            this.field3148[this.field3152++] = (byte) ((class368.method2314(255, arg1) >> 1) + 127);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(IBI)Z", line = 48)
    public static final boolean method1490(int arg0, byte arg1, int arg2) {
        if (arg1 < 19) {
            field3154 = null;
        }
        ++field3147;
        return (arg0 & 65536) != 0;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V", line = 60)
    public static void method1491(int arg0) {
        field3154 = null;
        if (arg0 >= -57) {
            method1491(127);
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIIF)V", line = 71)
    public class209(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field3629 < ~var7; ++var7) {
            this.field3149[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 94)
    public final void method1492(int arg0) {
        this.field3152 = 0;
        if (arg0 != 17168) {
            this.method1487(105);
        }
        this.field3150 = 0;
        ++field3151;
    }
}
