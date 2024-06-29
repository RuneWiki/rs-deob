import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class246 extends class396 {

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field3337 = 1;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public int field3339;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public int field3340;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public int field3346;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "Ljava/lang/String;")
    public String field3348;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "[I")
    public static int[] field3338;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "[I")
    public int[] field3344;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "[I")
    public int[] field3350;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "[Lcs;")
    public class189[] field3341;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field3345;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V", line = 5)
    public static void method1552(int arg0) {
        field3338 = null;
        if (arg0 != 2) {
            field3338 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)V", line = 19)
    public static final void method1553(int arg0, boolean arg1) {
        class219.field3012 = arg1;
        field3342++;
        class181.field2484 = !class257.method1613(-121);
        int var2 = 119 % ((arg0 - 79) / 46);
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(B)V", line = 37)
    public static final void method1554(byte arg0) {
        if (arg0 >= -117) {
            method1552(52);
        }
        if (class406.field5900 && class256.field3447[81] && class433.field6324 > 2) {
            class105.method566(1, (class159) class32.field301.field2358.field5247.field5247);
        } else {
            class105.method566(1, (class159) class32.field301.field2358.field5247);
        }
        field3335++;
    }
}
