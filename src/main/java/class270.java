import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class270 extends class673 {

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "I")
    private int field3686;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "I")
    private int field3685;

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
    private int field3687;

    @OriginalMember(owner = "client!gaa", name = "p", descriptor = "I")
    private int field3690;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "Z")
    public static boolean field3688 = false;

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!gaa", name = "q", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!gaa", name = "r", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!gaa", name = "t", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILjava/lang/Object;II)[B", line = 3)
    public static final byte[] method1626(int arg0, Object arg1, int arg2, int arg3) {
        ++field3689;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return class341.method1963(arg0, arg3, (byte) -99, var4);
        } else if (arg1 instanceof class312) {
            class312 var5 = (class312) arg1;
            return var5.method1810(4520, arg0, arg3);
        } else {
            if (arg2 != -1) {
                field3688 = true;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILn;I)I", line = 36)
    public static final int method1627(int arg0, class17 arg1, int arg2) {
        ++field3691;
        if (!client.method1659(arg1).method994(true, arg0) && arg1.field338 == null) {
            return -1;
        } else {
            int var3 = 32 / ((arg2 - 15) / 32);
            return arg1.field428 != null && ~arg1.field428.length < ~arg0 ? arg1.field428[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(III)V", line = 50)
    public final void method694(int arg0, int arg1, int arg2) {
        ++field3693;
        int var4 = this.field3685 * arg1 >> 12;
        int var5 = this.field3686 * arg1 >> 12;
        int var6 = this.field3690 * arg0 >> 12;
        if (arg2 != -3) {
            this.field3685 = -41;
        }
        int var7 = this.field3687 * arg0 >> 12;
        class419.method2514(super.field9670, super.field9668, var5, super.field9672, var6, var7, -20165, var4);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIZ)V", line = 72)
    public final void method693(int arg0, int arg1, boolean arg2) {
        ++field3692;
        if (!arg2) {
            this.method694(124, 66, -101);
        }
        int var4 = this.field3685 * arg0 >> 12;
        int var5 = this.field3686 * arg0 >> 12;
        int var6 = this.field3690 * arg1 >> 12;
        int var7 = this.field3687 * arg1 >> 12;
        class62.method604(super.field9672, var7, var4, super.field9668, var5, 122, var6);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIB)V", line = 93)
    public final void method695(int arg0, int arg1, byte arg2) {
        ++field3694;
        int var4 = this.field3685 * arg0 >> 12;
        int var5 = this.field3686 * arg0 >> 12;
        int var6 = this.field3690 * arg1 >> 12;
        if (arg2 != 48) {
            method1626(37, (Object) null, -46, -12);
        }
        int var7 = this.field3687 * arg1 >> 12;
        class171.method1079(var4, -95, super.field9670, var7, var6, var5);
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(IIIIIII)V", line = 121)
    public class270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3686 = arg2;
        this.field3685 = arg0;
        this.field3687 = arg3;
        this.field3690 = arg1;
    }
}
