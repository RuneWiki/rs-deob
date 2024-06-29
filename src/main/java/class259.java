import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class259 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "[I")
    public static int[] field4075 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field4079 = new String[8];

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "[I")
    public static int[] field4080 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[I")
    public static int[] field4078 = new int[2];

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Ltn;")
    public static class38 field4077;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIB)V", line = 6)
    public static final void method1864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (class291.field4490 <= arg2 - arg4 && (arg2 + arg4) <= class210.field3309 && arg0 - arg4 >= class42.field579 && class334.field5205 >= (arg0 + arg4)) {
            class199.method1471(arg4, arg2, arg5, arg0, (byte) -17, arg3, arg1);
        } else {
            class215.method1571(arg0, arg2, arg4, arg1, arg5, (byte) 118, arg3);
        }
        field4076++;
        if (arg6 <= 122) {
            field4078 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 27)
    public static void method1865(byte arg0) {
        field4080 = null;
        field4077 = null;
        field4075 = null;
        field4078 = null;
        if (arg0 < -36) {
            field4079 = null;
        }
    }
}
