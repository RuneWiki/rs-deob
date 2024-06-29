import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class196 {

    @OriginalMember(owner = "client!o", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3098 = new String[8];

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3097 = "Connected to update server";

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Laf;")
    public static class168 field3101 = new class168();

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Lnj;")
    public static class215 field3103;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method1368(int arg0) {
        field3101 = null;
        if (arg0 <= 119) {
            method1368(92);
        }
        field3097 = null;
        field3103 = null;
        field3098 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZI)I")
    public static final int method1369(int arg0, int arg1, boolean arg2, int arg3) {
        field3100++;
        if (!arg2) {
            method1370(-44, 94, 40, -12, 60, -57, -63, 66, -128, -1);
        }
        if (arg3 > arg1) {
            return arg3;
        } else if (arg0 < arg1) {
            return arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3102++;
        if (arg4 != -18719) {
            field3097 = null;
        }
        if (class56.field816 <= arg3 && arg3 <= class187.field2938 && class56.field816 <= arg2 && class187.field2938 >= arg2 && arg9 >= class56.field816 && class187.field2938 >= arg9 && arg8 >= class56.field816 && arg8 <= class187.field2938 && arg7 >= class115.field1678 && arg7 <= class60.field882 && arg0 >= class115.field1678 && class60.field882 >= arg0 && arg1 >= class115.field1678 && arg1 <= class60.field882 && class115.field1678 <= arg6 && arg6 <= class60.field882) {
            class236.method1656(arg9, arg7, arg6, arg0, arg3, arg8, arg1, arg5, arg2, true);
        } else {
            class118.method779(arg2, arg0, arg9, arg1, arg8, arg5, true, arg3, arg6, arg7);
        }
    }
}
