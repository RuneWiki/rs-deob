import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class55 {

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "Llc;")
    public static class143 field1059 = class66.method374("_labels", -1);

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Ltg;")
    public static class277 field1062 = new class277(16);

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Llc;")
    public static class143 field1067 = null;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "Llc;")
    private static class143 field1073 = class66.method374("Jun", -1);

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "Llc;")
    private static class143 field1075 = class66.method374("Aug", -1);

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "Llc;")
    private static class143 field1077 = class66.method374("Nov", -1);

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Llc;")
    private static class143 field1068 = class66.method374("Jan", -1);

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Llc;")
    private static class143 field1069 = class66.method374("Mar", -1);

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Llc;")
    private static class143 field1072 = class66.method374("Sep", -1);

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Llc;")
    private static class143 field1074 = class66.method374("Jul", -1);

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "Llc;")
    private static class143 field1079 = class66.method374("Apr", -1);

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "Z")
    public static boolean field1076 = false;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "Llc;")
    private static class143 field1080 = class66.method374("Dec", -1);

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "Llc;")
    private static class143 field1071 = class66.method374("May", -1);

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "Llc;")
    private static class143 field1082 = class66.method374("Feb", -1);

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "Llc;")
    private static class143 field1081 = class66.method374("Oct", -1);

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "[Llc;")
    public static class143[] field1070 = new class143[] { field1068, field1082, field1069, field1079, field1071, field1073, field1074, field1075, field1072, field1081, field1077, field1080 };

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "Ltg;")
    public static class277 field1078;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZZIZ)Lgf;")
    public static final class7 method331(int arg0, boolean arg1, boolean arg2, int arg3, boolean arg4) {
        field1065++;
        class164 var5 = null;
        if (arg0 != 13140) {
            return null;
        }
        if (class257.field4619 != null) {
            var5 = new class164(arg3, class257.field4619, class254.field4558[arg3], 1000000);
        }
        class136.field2395[arg3] = class71.field1352.method24(var5, class71.field1347, arg3, class25.method178(arg0, 20109));
        if (arg2) {
            class136.field2395[arg3].method936((byte) 26);
        }
        return new class7(class136.field2395[arg3], arg1, arg4);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static final void method332(int arg0) {
        if (class229.field4189 != null) {
            class192 var1 = class229.field4189;
            synchronized (class229.field4189) {
                class229.field4189 = null;
            }
        }
        field1061++;
        if (arg0 != -18245) {
            method333(93);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public static void method333(int arg0) {
        field1069 = null;
        field1080 = null;
        field1068 = null;
        field1079 = null;
        field1072 = null;
        field1078 = null;
        field1062 = null;
        field1075 = null;
        field1082 = null;
        field1077 = null;
        field1073 = null;
        field1067 = null;
        field1071 = null;
        field1081 = null;
        field1074 = null;
        field1070 = null;
        if (arg0 != 1000000) {
            method331(-76, false, true, 41, false);
        }
        field1059 = null;
    }
}
