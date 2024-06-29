import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class45 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Loc;")
    private static class99 field1063 = class48.method402((byte) -104, "Dec");

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Loc;")
    private static class99 field1064 = class48.method402((byte) -104, "Connecting to friendserver");

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Loc;")
    private static class99 field1062 = class48.method402((byte) -104, "Apr");

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Loc;")
    private static class99 field1065 = class48.method402((byte) -104, "Jul");

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static volatile int field1071 = 0;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Loc;")
    public static class99 field1074 = class48.method402((byte) -104, "Name des Gegenstands eingeben:");

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field1078 = 0;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Loc;")
    private static class99 field1075 = class48.method402((byte) -104, "Mar");

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Loc;")
    private static class99 field1080 = class48.method402((byte) -104, "Oct");

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Loc;")
    private static class99 field1076 = class48.method402((byte) -104, "Jan");

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Loc;")
    private static class99 field1067 = class48.method402((byte) -104, "Aug");

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Loc;")
    private static class99 field1073 = class48.method402((byte) -104, "Feb");

    @OriginalMember(owner = "client!g", name = "t", descriptor = "Loc;")
    private static class99 field1081 = class48.method402((byte) -104, "Sep");

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Loc;")
    private static class99 field1079 = class48.method402((byte) -104, "May");

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Loc;")
    private static class99 field1069 = class48.method402((byte) -104, "Jun");

    @OriginalMember(owner = "client!g", name = "w", descriptor = "Loc;")
    public static class99 field1084 = field1064;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Loc;")
    private static class99 field1077 = class48.method402((byte) -104, "Nov");

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public static int field1083 = 0;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "[Loc;")
    public static class99[] field1068 = new class99[] { field1076, field1073, field1075, field1062, field1079, field1069, field1065, field1067, field1081, field1080, field1077, field1063 };

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Lbd;")
    public static class12 field1070 = new class12();

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method378(byte arg0) {
        field1079 = null;
        field1063 = null;
        field1081 = null;
        field1075 = null;
        field1080 = null;
        field1077 = null;
        field1076 = null;
        field1084 = null;
        field1064 = null;
        field1070 = null;
        field1068 = null;
        field1062 = null;
        field1065 = null;
        field1073 = null;
        field1067 = null;
        field1069 = null;
        field1074 = null;
        int var1 = -30 % ((arg0 - 8) / 34);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZLhe;IILhe;)Lhe;")
    public static final class54 method379(boolean arg0, class54 arg1, int arg2, int arg3, class54 arg4) {
        if (arg0) {
            return null;
        }
        field1066++;
        class54 var5 = class23.method208(0, 0, arg3, arg4.field1293, class132.field3230[arg4.field1293 >> 16], arg4.field1383, arg2, arg4.field1403, arg4.field1296, 127, arg1, arg4.field1378);
        if (var5 == null) {
            if (arg4.field1344 != null) {
                var5 = class23.method208(0, 0, arg3, arg4.field1293, arg4.field1344, arg4.field1383, arg2, arg4.field1403, arg4.field1296, 123, arg1, arg4.field1378);
            }
            return var5;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public static final void method380(byte arg0) {
        field1072++;
        class59.field1578.method874((byte) -99);
        int var1 = 125 / ((44 - arg0) / 60);
        class32.field773.method216(0, 0);
        class61.field1623 = class40.method336(class61.field1623);
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V")
    public static final void method381(byte arg0) {
        int var1 = -50 % ((50 - arg0) / 61);
        class37.field929.method998(true);
        field1082++;
    }
}
