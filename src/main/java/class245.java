import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class245 extends class32 {

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "[I")
    public static int[] field4313 = new int[32];

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Loh;")
    private static class263 field4314 = class253.method1681(-124, "scroll:");

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Loh;")
    public static class263 field4317 = field4314;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Loh;")
    public static class263 field4320 = field4314;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "[I")
    public static int[] field4316 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Loh;")
    public static class263 field4315 = class253.method1681(-127, ")1");

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Z")
    public static boolean field4319 = false;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "[S")
    public static short[] field4318;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method1661(byte arg0) {
        field4315 = null;
        field4317 = null;
        field4313 = null;
        field4314 = null;
        field4318 = null;
        field4320 = null;
        field4316 = null;
        if (arg0 != -43) {
            method1662(8, 114, 83, -15, 120, 75, (class139) null, 75, -98L);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIILnj;IJ)Z")
    public static final boolean method1662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class139 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class190.method1248(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
