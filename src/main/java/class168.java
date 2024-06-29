import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public abstract class class168 {

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "Z")
    public static boolean field2262 = false;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "D")
    public static double field2260;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I[B)V")
    public abstract void method764(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILha;IIIIIILgea;IZ)V")
    public static final void method1206(int arg0, int arg1, class65 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class81 arg9, int arg10, boolean arg11) {
        field2263++;
        if (arg11) {
            field2262 = false;
        }
        if (arg3 < arg8 && arg8 < (arg3 + arg6) && (arg10 - 13) < arg0 && (arg10 + 3) > arg0) {
            arg5 = arg4;
        }
        String var12 = class717.method4008(arg9, 115);
        class251.field3716.method580(0, arg5, arg10, class630.field8819, class688.field9677, arg3 + 3, var12, 0);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)[B")
    public abstract byte[] method766(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)[B")
    public abstract byte[] method765(int arg0);

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)I")
    public static final int method1207(int arg0, boolean arg1) {
        if (arg1) {
            method1207(84, false);
        }
        field2264++;
        return arg0 >>> 7;
    }
}
