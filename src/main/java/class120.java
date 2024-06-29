import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class120 {

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2169 = 0;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2173 = 99;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "[Z")
    public static boolean[] field2174 = new boolean[112];

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2175 = 1;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lqm;")
    public static class222 field2172;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "[[I")
    public static int[][] field2165;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V", line = 10)
    public static final void method846(int arg0, int arg1) {
        field2168++;
        if (class159.method1148(-1, arg0)) {
            class283.method1966(-118, class272.field4675[arg0], -1);
            if (arg1 >= -4) {
                method846(13, -89);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLcd;)Loi;", line = 24)
    public static final class306 method847(boolean arg0, class64 arg1) {
        field2167++;
        if (!arg0) {
            return (class306) null;
        }
        for (class306 var2 = (class306) class267.field4603.method778(0); var2 != null; var2 = (class306) class267.field4603.method775(26517)) {
            if (var2.field5233.method519((byte) 120, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)V", line = 60)
    public static final void method848(byte arg0, int arg1) {
        if (arg0 != -102) {
            method849(-63);
        }
        class195.field3332.method1197((byte) 100, arg1);
        field2170++;
        class96.field1759.method1197((byte) 57, arg1);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 72)
    public static void method849(int arg0) {
        field2172 = null;
        if (arg0 >= 45) {
            field2174 = null;
            field2165 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIII)V", line = 101)
    public static final void method850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2166++;
        int var7 = arg1 - arg4;
        int var8 = arg2 + arg4;
        int var9 = arg3 + arg4;
        int var10 = arg6 - arg4;
        for (int var11 = arg2; var11 < var8; var11++) {
            class31.method268(arg6, 121, arg3, class124.field2241[var11], arg5);
        }
        for (int var12 = arg1; var12 > var7; var12--) {
            class31.method268(arg6, 126, arg3, class124.field2241[var12], arg5);
        }
        if (arg0 != 5186) {
            field2174 = (boolean[]) null;
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class124.field2241[var13];
            class31.method268(var9, 121, arg3, var14, arg5);
            class31.method268(arg6, arg0 - 5060, var10, var14, arg5);
        }
    }
}
