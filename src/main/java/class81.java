import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class81 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lqe;")
    private static class168 field1217 = class66.method448("Jul", -115);

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Lqe;")
    private static class168 field1226 = class66.method448("Mar", -108);

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lqe;")
    private static class168 field1218 = class66.method448("Apr", -113);

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lqe;")
    private static class168 field1227 = class66.method448("World", 39);

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lqe;")
    public static class168 field1224 = field1227;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lqe;")
    private static class168 field1221 = class66.method448("Feb", -118);

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field1233 = -1;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Lqe;")
    private static class168 field1234 = class66.method448("May", 85);

    @OriginalMember(owner = "client!te", name = "n", descriptor = "Lqe;")
    private static class168 field1230 = class66.method448("Oct", 30);

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Lqe;")
    private static class168 field1223 = class66.method448("Aug", 9);

    @OriginalMember(owner = "client!te", name = "o", descriptor = "Lqe;")
    private static class168 field1231 = class66.method448("Sep", -112);

    @OriginalMember(owner = "client!te", name = "s", descriptor = "Lqe;")
    private static class168 field1235 = class66.method448("Dec", 118);

    @OriginalMember(owner = "client!te", name = "w", descriptor = "Lqe;")
    private static class168 field1239 = class66.method448("Jan", 105);

    @OriginalMember(owner = "client!te", name = "u", descriptor = "Lqe;")
    private static class168 field1237 = class66.method448("Nov", 71);

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lqe;")
    public static class168 field1220 = class66.method448("Angreifen", -119);

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field1232 = 0;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "Lqe;")
    private static class168 field1238 = class66.method448("Jun", -125);

    @OriginalMember(owner = "client!te", name = "c", descriptor = "[Lqe;")
    public static class168[] field1219 = new class168[] { field1239, field1221, field1226, field1218, field1234, field1238, field1217, field1223, field1231, field1230, field1237, field1235 };

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1236++;
        if (arg2 == arg5) {
            class98.method647(arg4, arg3, arg1, arg7, (byte) 125, arg6, arg5);
            return;
        }
        if (arg4 - arg5 >= class174.field3055 && class249.field4314 >= arg4 + arg5 && class222.field3811 <= arg7 - arg2 && class196.field3402 >= arg2 + arg7) {
            class194.method1255(arg5, arg4, arg1, -3, arg3, arg2, arg6, arg7);
        } else {
            class83.method548(false, arg5, arg3, arg6, arg7, arg1, arg4, arg2);
        }
        if (arg0 != 15) {
            field1226 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method539(int arg0) {
        int var1 = 4 / ((arg0 - 24) / 43);
        field1221 = null;
        field1231 = null;
        field1218 = null;
        field1230 = null;
        field1238 = null;
        field1237 = null;
        field1227 = null;
        field1226 = null;
        field1234 = null;
        field1223 = null;
        field1235 = null;
        field1217 = null;
        field1224 = null;
        field1219 = null;
        field1220 = null;
        field1239 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZIIIIIIIII)V")
    public static final void method540(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1225++;
        if (!arg0) {
            method541(113, true, 58, -67, -1);
        }
        if (arg2 >= class174.field3055 && arg2 <= class249.field4314 && class174.field3055 <= arg3 && arg3 <= class249.field4314 && arg8 >= class174.field3055 && class249.field4314 >= arg8 && class174.field3055 <= arg6 && arg6 <= class249.field4314 && class222.field3811 <= arg9 && class196.field3402 >= arg9 && class222.field3811 <= arg5 && class196.field3402 >= arg5 && arg4 >= class222.field3811 && arg4 <= class196.field3402 && class222.field3811 <= arg1 && arg1 <= class196.field3402) {
            client.method268(arg9, arg3, arg6, arg7, 122, arg1, arg4, arg8, arg5, arg2);
        } else {
            class125.method851(arg1, arg7, arg5, (byte) -85, arg6, arg3, arg4, arg2, arg9, arg8);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZIII)V")
    public static final void method541(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1229++;
        if (class97.method636(arg2, -125)) {
            class251.method1649((byte) -103, arg0, arg3, arg1, arg4, class108.field1741[arg2]);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public static final void method542(int arg0) {
        field1228++;
        while (class112.field1815.method660(class31.field377, (byte) -127) >= 11) {
            int var1 = class112.field1815.method671(11, 7);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class104.field1677[var1] == null) {
                var2 = true;
                class104.field1677[var1] = new class121();
                if (class229.field3902[var1] != null) {
                    class104.field1677[var1].method829(class229.field3902[var1], 0);
                }
            }
            class115.field1868[class132.field2322++] = var1;
            class121 var3 = class104.field1677[var1];
            var3.field165 = class133.field2326;
            int var4 = class112.field1815.method671(1, 7);
            int var5 = class112.field1815.method671(1, 7);
            if (var5 == 1) {
                class38.field521[class84.field1278++] = var1;
            }
            int var6 = class112.field1815.method671(5, 7);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class112.field1815.method671(5, 7);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class249.field4320[class112.field1815.method671(3, 7)];
            if (var2) {
                var3.field193 = var3.field194 = var8;
            }
            var3.method91(class7.field85.field206[0] + var6, -105, class7.field85.field219[0] + var7, var4 == 1);
        }
        if (arg0 != 2047) {
            method539(-128);
        }
        class112.field1815.method666((byte) 106);
    }
}
