import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class150 extends class35 {

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field2456 = 0;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2455 = "Loading wordpack - ";

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field2457 = 0;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "B")
    public byte field2460;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public int field2453;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "Ljava/lang/String;")
    public String field2452;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "Ljava/lang/String;")
    public String field2454;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 22)
    public static void method977(int arg0) {
        field2455 = null;
        if (arg0 != -1) {
            field2455 = (String) null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIBII[[I)I", line = 33)
    public static final int method978(int arg0, int arg1, byte arg2, int arg3, int arg4, int[][] arg5) {
        int var6 = (128 - arg1) * arg5[arg0][arg3] + arg5[arg0 + 1][arg3] * arg1 >> 7;
        int var7 = (128 - arg1) * arg5[arg0][arg3 + 1] + (arg5[arg0 + 1][arg3 + 1] * arg1) >> 7;
        if (arg2 <= 86) {
            return 98;
        } else {
            field2458++;
            return (128 - arg4) * var6 + (arg4 * var7) >> 7;
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)Ljava/lang/String;", line = 61)
    public static final String method979(int arg0) {
        if (arg0 != -392039001) {
            return (String) null;
        }
        field2459++;
        String var1;
        if (class21.field447 == 1 && class48.field999 < 2) {
            var1 = class94.field1693 + class52.field1045 + class170.field2749 + " ->";
        } else if (class86.field1617 && class48.field999 < 2) {
            var1 = class281.field4323 + class52.field1045 + class223.field3523 + " ->";
        } else if (class185.field3015 && class342.field5317[81] && class48.field999 > 2) {
            var1 = class50.method377(-17414, class48.field999 - 2);
        } else {
            var1 = class50.method377(-17414, class48.field999 - 1);
        }
        if (class48.field999 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class48.field999 - 2) + class216.field3457;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)V", line = 90)
    public static final void method980(boolean arg0) {
        class342.field5311.method1884(-22054);
        field2461++;
        if (!arg0) {
            method979(94);
        }
        class128.field2198.method1884(-22054);
        class24.field478.method1884(-22054);
    }
}
