import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 extends class70 {

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public int field292;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field294 = -1;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field299 = 0;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "Lqf;")
    private static class117 field305 = class72.method514(118, "Continue");

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "Lqf;")
    private static class117 field293 = class72.method514(118, "Loaded fonts");

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "Lqf;")
    public static class117 field309 = class72.method514(114, "::gc");

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "Lqf;")
    public static class117 field302 = field293;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field300 = 0;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field307 = 0;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "Lqf;")
    public static class117 field297 = field305;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "Lqb;")
    public static class113 field311;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "Ldf;")
    public static class28 field304;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "Lkd;")
    public static class73 field306;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "[I")
    public static int[] field295;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
    public static void method152(int arg0) {
        field309 = null;
        field304 = null;
        if (arg0 != -1) {
            return;
        }
        field306 = null;
        field302 = null;
        field305 = null;
        field311 = null;
        field295 = null;
        field293 = null;
        field297 = null;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class19() {
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field314++;
        if (!class26.method201(arg2, 314356016)) {
            return false;
        }
        class40.field801 = null;
        boolean var7 = class103.method791(arg3, arg5, true, -1, arg6, class141.field3426[arg2], 0, 0, arg0, arg4);
        if (arg1 != -19850) {
            field300 = -22;
        }
        if (class40.field801 != null) {
            class103.method791(arg3, arg5, true, -1412584499, arg6, class40.field801, class56.field1157, class104.field2518, arg0, arg4);
        }
        return var7;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BILha;)V")
    public static final void method154(byte arg0, int arg1, class50 arg2) {
        int var3 = -70 % ((53 - arg0) / 61);
        field301++;
        if (class77.field1716 == null) {
            class81.method632(255, true, 0, (byte) 0, 18058, null, 255);
            class77.field1689[arg1] = arg2;
        } else {
            class77.field1716.field1691 = arg1 * 8 + 5;
            int var4 = class77.field1716.method554((byte) 26);
            int var5 = class77.field1716.method554((byte) -109);
            arg2.method378(-116, var5, var4);
        }
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)V")
    public static final void method155(int arg0) {
        field303++;
        if (arg0 == 0) {
            class64.field1274 = new class5();
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I)V")
    public class19(int arg0) {
        this.field292 = arg0;
    }
}
