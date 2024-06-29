import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class86 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field1216 = 0;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lae;")
    public static class172 field1215 = null;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1217 = 1;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V", line = 4)
    public static void method729(boolean arg0) {
        if (arg0) {
            field1215 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Lem;", line = 17)
    public static final class390 method730(int arg0, int arg1, int arg2) {
        class52 var3 = class385.field5285[arg0][arg1][arg2];
        return var3 == null || var3.field758 == null ? null : var3.field758;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIIIIIIII)V", line = 27)
    public static final void method731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field1219++;
        class418 var15;
        if (arg9 < 0) {
            int var14 = -arg9 - 1;
            if (class168.field2432 == var14) {
                var15 = class262.field3781;
            } else {
                var15 = class112.field1570[var14];
            }
        } else {
            int var16 = arg9 - 1;
            var15 = class163.field2377[var16];
        }
        if (var15 == null) {
            return;
        }
        class267 var17 = class468.field6599.method506(-121, arg5);
        int var18;
        int var19;
        if (arg7 == 1 || arg7 == 3) {
            var18 = var17.field3843;
            var19 = var17.field3856;
        } else {
            var18 = var17.field3856;
            var19 = var17.field3843;
        }
        int var20 = (var19 >> 1) + arg2;
        int var21 = (var19 + 1 >> 1) + arg2;
        int var22 = arg4 + (var18 >> 1);
        int var23 = (var18 + 1 >> 1) + arg4;
        class241 var24 = class340.field4692[arg6];
        int var25 = var24.method591(var20, var22) + var24.method591(var21, var22) + var24.method591(var20, var23) + var24.method591(var21, var23) >> 2;
        class436 var26 = new class436();
        var26.field6196 = class364.field5010 + arg11;
        var26.field6197 = arg12;
        var26.field6187 = arg7;
        var26.field6199 = arg2;
        if (arg10 <= 95) {
            return;
        }
        if (arg1 < arg13) {
            int var27 = arg13;
            arg13 = arg1;
            arg1 = var27;
        }
        var26.field6198 = var15.field4531;
        var26.field6194 = class364.field5010 + arg8;
        var26.field6184 = arg4;
        var26.field6185 = arg5;
        if (arg3 > arg0) {
            int var28 = arg3;
            arg3 = arg0;
            arg0 = var28;
        }
        var26.field6207 = arg1 + arg2;
        var26.field6204 = arg2 + arg13;
        var26.field6203 = var25;
        var26.field6201 = var26.field6184 * 128 + var18 * 64;
        var26.field6190 = arg3 + arg4;
        var26.field6186 = var26.field6199 * 128 + var19 * 64;
        var26.field6195 = arg0 + arg4;
        class484.field6848.method766(var26, -1);
        var15.field5813 = var26;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIB)Z", line = 132)
    public static final boolean method732(int arg0, int arg1, byte arg2) {
        if (arg2 >= -41) {
            method729(true);
        }
        field1218++;
        class267 var3 = class468.field6599.method506(-122, arg1);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method1814(arg0, (byte) 121);
    }
}
