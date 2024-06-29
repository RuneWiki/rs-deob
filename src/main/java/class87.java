import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class87 {

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field1179 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1176 = new String[100];

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Z")
    public static boolean field1181 = false;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lb;")
    public static class262 field1183;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lbc;")
    public static class282 field1180;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
    public static int[] field1178;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBC)I")
    public static final int method510(int arg0, byte arg1, char arg2) {
        field1182++;
        if (arg1 != 84) {
            return 97;
        }
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)V")
    public static final void method511(int arg0, byte arg1) {
        class203.field2883.method62(-93, arg0);
        int var2 = 114 / ((arg1 - 61) / 40);
        field1185++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)V")
    public static final void method512(int arg0, int arg1, int arg2, int arg3) {
        field1186++;
        int var4 = 66 % ((-arg0 - 18) / 53);
        String var5 = "::tele " + arg2 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var5);
        class200.method1286(var5, true);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public static void method513(boolean arg0) {
        field1180 = null;
        if (!arg0) {
            field1184 = 24;
        }
        field1183 = null;
        field1176 = null;
        field1178 = null;
    }
}
