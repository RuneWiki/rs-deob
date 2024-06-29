import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class233 extends class290 {

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field4037 = 0;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Lmb;")
    public static class172 field4036 = new class172(64);

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Lmb;")
    public static class172 field4038 = new class172(500);

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "Loh;")
    private static class258 field4039 = class153.method1046("Loading title screen )2 ", 122);

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field4040 = 0;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "[I")
    public static int[] field4041 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "Loh;")
    public static class258 field4043 = field4039;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "Lgb;")
    public static class213 field4042;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V", line = 9)
    public static final void method1556(int arg0, int arg1) {
        field4035++;
        class284.field4895 = 0;
        class169.field2886 = false;
        class93.field1644 = -1;
        class272.field4706 = null;
        class292.field5027 = 1;
        class59.field984 = arg0;
        class70.field1208 = arg1;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V", line = 25)
    public static final void method1557(int arg0) {
        field4034++;
        if (!class30.field353) {
            return;
        }
        class30.field353 = false;
        class134.field2316 = null;
        class56.field879 = null;
        if (arg0 != -25523) {
            field4043 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 42)
    public static void method1558(byte arg0) {
        field4042 = null;
        field4043 = null;
        field4039 = null;
        field4038 = null;
        field4041 = null;
        field4036 = null;
        int var1 = 92 / ((arg0 - 25) / 59);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZII)V", line = 65)
    public static final void method1559(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class159.field2710.field4051 = 0;
        field4033++;
        class159.field2710.method1598(156, 27052);
        class159.field2710.method1598(arg1, 27052);
        class159.field2710.method1598(arg3, 27052);
        class159.field2710.method1605(arg0, (byte) 45);
        class159.field2710.method1605(arg4, (byte) 87);
        class165.field2810 = 1;
        class74.field1293 = 0;
        class246.field4275 = -3;
        if (arg2) {
            class260.field4521 = 0;
        }
    }
}
