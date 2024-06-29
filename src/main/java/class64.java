import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class64 extends class499 {

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    public int field873 = -1;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
    public int field880 = 0;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
    public int field874;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIIIIILqa;II[[[BI)V")
    public static final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162 arg8, int arg9, int arg10, byte[][][] arg11, int arg12) {
        field878++;
        if (arg2 == arg12 || arg9 == 0) {
            return;
        }
        if (arg2 == 9) {
            arg2 = 1;
            arg7 = arg7 + 1 & 0x3;
        }
        if (arg2 == 10) {
            arg7 = arg7 + 3 & 0x3;
            arg2 = 1;
        }
        if (arg2 == 11) {
            arg2 = 8;
            arg7 = arg7 + 3 & 0x3;
        }
        arg8.method479(arg10, arg1, arg3, arg6, arg4, arg0, arg11[arg2 - 1][arg7], arg9, arg5);
    }
}
