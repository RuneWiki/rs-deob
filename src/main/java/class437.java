import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class437 extends class403 {

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "Luh;")
    public class103 field5928;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "Z")
    public static boolean field5931 = false;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "Lbc;")
    public static class225 field5929 = new class225("", 16);

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field5933 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "Lgd;")
    public static class206 field5932 = new class206("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public static int field5934 = -1;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public static int field5935 = 0;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIILwm;[[[BIBIIIIII)V")
    public static final void method2575(int arg0, int arg1, int arg2, class364 arg3, byte[][][] arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field5930++;
        if (arg5 == 0 || arg8 == 0) {
            return;
        }
        if (arg5 == 9) {
            arg10 = arg10 + 1 & 0x3;
            arg5 = 1;
        }
        if (arg5 == 10) {
            arg10 = arg10 + 3 & 0x3;
            arg5 = 1;
        }
        if (arg6 != -86) {
            method2576(113);
        }
        if (arg5 == 11) {
            arg10 = arg10 + 3 & 0x3;
            arg5 = 8;
        }
        arg3.method2048(arg1, arg2, arg9, arg12, arg7, arg11, arg4[arg5 - 1][arg10], arg8, arg0);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Luh;)V")
    public class437(class103 arg0) {
        this.field5928 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static void method2576(int arg0) {
        field5932 = null;
        field5933 = null;
        field5929 = null;
        if (arg0 != 0) {
            method2575(22, -111, 89, (class364) null, (byte[][][]) null, 125, (byte) -2, -6, -13, 13, -70, -33, 67);
        }
    }
}
