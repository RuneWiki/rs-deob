import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class577 {

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "J")
    public static long field7565 = 1L;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "Lvfa;")
    public static class672 field7570 = null;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Lcga;")
    public static class485 field7568 = new class485();

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public int field7569;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
    public int field7571;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public int field7572;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public int field7573;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public int field7576;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public int field7578;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public int field7579;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "Lft;")
    public static class3 field7577;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "[B")
    public byte[] field7566;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "[B")
    public byte[] field7574;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "[I")
    public static int[] field7567;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILha;IIIIIILfa;II)V", line = 9)
    public static final void method3166(int arg0, int arg1, class59 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class236 arg9, int arg10, int arg11) {
        if (arg7 > arg11 && (arg1 + arg11) > arg7 && arg8 > (arg6 - 13) && (arg6 + 3) > arg8) {
            arg5 = arg0;
        }
        if (arg10 != 13) {
            field7568 = null;
        }
        field7575++;
        String var12 = class417.method2421(arg9, true);
        class64.field785.method532(class264.field3681, arg5, false, var12, 0, arg11 + 3, arg6, class657.field8682);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 31)
    public static void method3167(int arg0) {
        field7577 = null;
        if (arg0 != 27727) {
            field7577 = null;
        }
        field7570 = null;
        field7568 = null;
        field7567 = null;
    }
}
