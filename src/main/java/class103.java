import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class103 extends class135 {

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
    public static int field1555 = 0;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "[I")
    public static int[] field1556 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1558 = "Loading interfaces - ";

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "[I")
    public static int[] field1557 = new int[32];

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "Lqm;")
    public static class189 field1551;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "Lea;")
    public static class38 field1550;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "Z")
    public static boolean field1552;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static void method668(int arg0) {
        field1556 = null;
        field1550 = null;
        field1551 = null;
        field1557 = null;
        field1558 = null;
        if (arg0 != 32) {
            field1554 = -32;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
    public static final void method669(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1553++;
        if (arg0 != 16) {
            field1554 = 115;
        }
        if (arg4 < arg1) {
            class71.method451(arg2, true, arg1, arg4, class130.field2005[arg3]);
        } else {
            class71.method451(arg2, true, arg4, arg1, class130.field2005[arg3]);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIZI)V")
    public static final void method670(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            method669(123, -27, -54, -108, 51);
        }
        field1549++;
        if ((arg2 - arg4) >= class53.field711 && (arg2 + arg4) <= class87.field1356 && class63.field941 <= arg0 - arg4 && class75.field1180 >= arg0 + arg4) {
            class71.method447(arg1, arg4, arg0, arg2, (byte) -128);
        } else {
            class80.method533((byte) 39, arg4, arg2, arg0, arg1);
        }
    }
}
