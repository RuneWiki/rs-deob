import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class226 {

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field4049 = 0;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lqj;")
    public static class196 field4050 = class80.method502("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", -48);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field4043 = 0;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lbk;")
    public static class136 field4044;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lbk;")
    public static class136 field4048;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Ll;")
    public static class190 field4045;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1526(int arg0) {
        if (arg0 == 0) {
            field4045 = null;
            field4050 = null;
            field4044 = null;
            field4048 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIBLck;)V")
    public static final void method1527(int arg0, int arg1, int arg2, int arg3, byte arg4, class72 arg5) {
        field4046++;
        if (arg5.field1039 == -1 && arg5.field1046 == null) {
            return;
        }
        int var6 = 0;
        if (arg5.field1047 < arg0) {
            var6 += arg0 - arg5.field1047;
        } else if (arg0 < arg5.field1021) {
            var6 += arg5.field1021 - arg0;
        }
        if (arg5.field1033 < arg3) {
            var6 += arg3 - arg5.field1033;
        } else if (arg3 < arg5.field1028) {
            var6 += arg5.field1028 - arg3;
        }
        if (arg5.field1044 < var6 - 64 || class70.field977 == 0 || arg5.field1025 != arg2) {
            if (arg5.field1019 != null) {
                class161.field2589.method690(arg5.field1019);
                arg5.field1019 = null;
            }
            if (arg5.field1017 != null) {
                class161.field2589.method690(arg5.field1017);
                arg5.field1017 = null;
            }
            return;
        }
        var6 -= 64;
        if (arg4 != 50) {
            return;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg5.field1044 - var6) * class70.field977 / arg5.field1044;
        if (arg5.field1019 != null) {
            arg5.field1019.method1634(var7);
        } else if (arg5.field1039 >= 0) {
            class115 var8 = class115.method701(class230.field4091, arg5.field1039, 0);
            if (var8 != null) {
                class89 var9 = var8.method702().method552(class96.field1411);
                class239 var10 = class239.method1615(var9, 100, var7);
                var10.method1611(-1);
                class161.field2589.method697(var10);
                arg5.field1019 = var10;
            }
        }
        if (arg5.field1017 != null) {
            arg5.field1017.method1634(var7);
            if (!arg5.field1017.method794((byte) -92)) {
                arg5.field1017 = null;
            }
        } else if (arg5.field1046 != null && (arg5.field1038 -= arg1) <= 0) {
            int var11 = (int) ((double) arg5.field1046.length * Math.random());
            class115 var12 = class115.method701(class230.field4091, arg5.field1046[var11], 0);
            if (var12 != null) {
                class89 var13 = var12.method702().method552(class96.field1411);
                class239 var14 = class239.method1615(var13, 100, var7);
                var14.method1611(0);
                class161.field2589.method697(var14);
                arg5.field1038 = arg5.field1023 + (int) ((double) (arg5.field1022 - arg5.field1023) * Math.random());
                arg5.field1017 = var14;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lqj;")
    public static final class196 method1528(int arg0, int arg1) {
        field4047++;
        if (arg0 == 64) {
            return class52.field650[arg1].method1299(37) > 0 ? class93.method572(~arg0, new class196[] { class65.field916[arg1], class150.field2408, class52.field650[arg1] }) : class65.field916[arg1];
        } else {
            return null;
        }
    }
}
