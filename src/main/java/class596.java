import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class596 extends class670 {

    @OriginalMember(owner = "client!th", name = "p", descriptor = "[Z")
    public static boolean[] field8384 = new boolean[200];

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field8376 = 0;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public int field8375;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public int field8377;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public int field8378;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public int field8379;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public int field8380;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public int field8382;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Ljava/lang/String;")
    public String field8381;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([BFIBIILts;FFIIFF)V")
    public static final void method3357(byte[] arg0, float arg1, int arg2, byte arg3, int arg4, int arg5, class535 arg6, float arg7, float arg8, int arg9, int arg10, float arg11, float arg12) {
        for (int var13 = 0; var13 < arg5; var13++) {
            class200.method1224(arg1, arg9, arg8, arg10, var13, arg12, arg7, arg0, arg2, arg4, arg5, arg11, (byte) -119, arg6);
            arg9 += arg2 * arg4;
        }
        field8374++;
        if (arg3 != -52) {
            method3357(null, -0.43736634F, 60, (byte) -10, -11, -40, null, 0.25178352F, 0.8199201F, 22, -32, -1.4088161F, 0.45945552F);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method3358(int arg0) {
        if (arg0 <= -24) {
            field8384 = null;
        }
    }
}
