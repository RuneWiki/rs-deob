import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class529 extends class269 {

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    private int field7745;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    private int field7756;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    private int field7759;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
    private int field7760;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    private int field7746;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    private int field7748;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    private int field7750;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    private int field7757;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "Ltr;")
    public static class195 field7752;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "Lrb;")
    public static class240 field7758;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "[B")
    private byte[] field7754;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
    public final void method1733(int arg0) {
        this.field7750 >>= 0x4;
        field7749++;
        this.field7760 = this.field7759;
        if (this.field7750 < 0) {
            this.field7750 = 0;
        } else if (this.field7750 > 255) {
            this.field7750 = 255;
        }
        this.method1611((byte) -105, this.field7757++, (byte) this.field7750);
        if (arg0 > 17) {
            this.field7750 = 0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
    public final void method1732(int arg0) {
        field7755++;
        this.field7757 = 0;
        if (arg0 != 30) {
            this.method1733(-41);
        }
        this.field7750 = 0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
    public static void method3128(boolean arg0) {
        if (arg0) {
            field7752 = null;
        }
        field7758 = null;
        field7752 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBI)V")
    public final void method1734(int arg0, byte arg1, int arg2) {
        field7751++;
        if (arg1 != 86) {
            this.method1734(0, (byte) 44, 68);
        }
        if (arg0 == 0) {
            this.field7746 = this.field7745 - (arg2 >= 0 ? arg2 : -arg2);
            this.field7748 = 4096;
            this.field7746 = this.field7746 * this.field7746 >> 12;
            this.field7750 = this.field7746;
            return;
        }
        this.field7748 = this.field7756 * this.field7746 >> 12;
        this.field7746 = this.field7745 - (arg2 >= 0 ? arg2 : -arg2);
        if (this.field7748 < 0) {
            this.field7748 = 0;
        } else if (this.field7748 > 4096) {
            this.field7748 = 4096;
        }
        this.field7746 = this.field7746 * this.field7746 >> 12;
        this.field7746 = this.field7748 * this.field7746 >> 12;
        this.field7750 += this.field7760 * this.field7746 >> 12;
        this.field7760 = this.field7760 * this.field7759 >> 12;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BIB)V")
    public void method1611(byte arg0, int arg1, byte arg2) {
        this.field7754[arg1] = arg2;
        if (arg0 > -46) {
            this.method1733(127);
        }
        field7753++;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class529(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field7745 = (int) (arg6 * 4096.0F);
        this.field7756 = (int) (arg7 * 4096.0F);
        this.field7760 = this.field7759 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
