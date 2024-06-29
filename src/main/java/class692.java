import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class692 extends class469 implements class60 {

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    private int field9738;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Z")
    public static boolean field9737 = false;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Z")
    public static boolean field9739 = false;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "[I")
    public static int[] field9742 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field9745 = 0;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field9734;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field9736;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field9743;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "Lbv;")
    public static class283 field9746;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Lck;")
    public static class600 field9735;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZIB)V")
    public static final void method3840(boolean arg0, int arg1, byte arg2) {
        if (arg2 > -114) {
            method3843(59, -92, -82, -87, (byte) 127, (byte[]) null, (byte[]) null, 75, 9);
        }
        ++field9736;
        class126.field2096 = arg1;
        class173.field2675 = 3;
        class649.method3558(class367.field4972.field2957, class367.field4972.field2955, (byte) 113);
        if (!arg0) {
            class408.method2344(26133);
            class512.method2848(class225.field3174, (byte) -115, false, class373.field5045);
        } else {
            class512.method2848("", (byte) -115, false, "");
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method3841(int arg0, int arg1, int arg2, Class arg3) {
        class24 var4 = class703.field9899[arg0][arg1][arg2];
        if (var4 != null) {
            for (class684 var5 = var4.field409; var5 != null; var5 = var5.field9618) {
                class641 var6 = var5.field9619;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field8611 == arg1 && var6.field8618 == arg2) {
                    class56.method367(var6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)I")
    public final int method491(byte arg0) {
        ++field9744;
        if (arg0 != -121) {
            field9745 = 63;
        }
        return 0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIZ[B)V")
    public final void method490(int arg0, int arg1, boolean arg2, byte[] arg3) {
        ++field9740;
        this.method2644(arg3, arg1);
        if (arg2) {
            this.field9738 = arg0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lno;I[BI)V")
    public class692(class658 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field9738 = arg1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)I")
    public final int method493(boolean arg0) {
        ++field9734;
        return arg0 ? 36 : this.field9738;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    public static void method3842(int arg0) {
        field9742 = null;
        field9735 = null;
        if (arg0 != 22) {
            field9737 = true;
        }
        field9746 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)J")
    public final long method492(int arg0) {
        ++field9741;
        return arg0 >= -80 ? -109L : super.field6284.getAddress();
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIB[B[BII)V")
    public static final void method3843(int arg0, int arg1, int arg2, int arg3, byte arg4, byte[] arg5, byte[] arg6, int arg7, int arg8) {
        ++field9743;
        int var9 = -(arg1 >> 2);
        int var10 = -(3 & arg1);
        for (int var11 = -arg0; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; ~var12 > -1; ++var12) {
                var10001 = arg3++;
                arg5[var10001] += arg6[arg8++];
                int var14 = arg3++;
                arg5[var14] += arg6[arg8++];
                int var15 = arg3++;
                arg5[var15] += arg6[arg8++];
                int var16 = arg3++;
                arg5[var16] += arg6[arg8++];
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg3++;
                arg5[var10001] += arg6[arg8++];
            }
            arg3 += arg7;
            arg8 += arg2;
        }
        if (arg4 != -24) {
            field9739 = false;
        }
    }
}
