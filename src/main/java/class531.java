import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class531 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Lnd;")
    public static class547 field7380;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lvl;ILvl;IIIIIIZ)V", line = 3)
    public static final void method3051(class13 arg0, int arg1, class13 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field7379++;
        int var10 = arg2.method79(-1);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class481 var12 = (class481) class450.field5950.method3079((long) var10, 0);
        if (var12 == null) {
            class728[] var13 = class728.method4067(class268.field3369, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class386.field4930.method508(var13[0], true);
            class450.field5950.method3077((byte) -125, (long) var10, var12);
        }
        class694.method3884(false, arg0.field5797, arg0.method82((byte) 49) * 256, 0, arg5, arg7 >> 1, arg0.field5801, arg0.field5796, arg1 >> 1, arg4);
        int var14 = arg6 + class83.field1136[0] - 18;
        int var15 = arg8 / 4 * 18 + var14;
        int var16 = class83.field1136[1] + arg3 - 16 - 54;
        int var17 = arg8 % 4 * 18 + var16;
        var12.method2759(var15, var17);
        if (arg0 == arg2) {
            class386.field4930.method532(18, 18, var15 - 1, var17 + -1, arg9, -256);
        }
        class236.method1478(-118, var17 - 1, var15 + 18, var15 - 1, var17 - -18);
        class580 var18 = class551.method3202(98);
        var18.field8116 = arg2;
        var18.field8112 = var15;
        var18.field8114 = var17 + 16;
        var18.field8111 = var15 + 16;
        if (!arg9) {
            method3052(-80);
        }
        var18.field8113 = var17;
        class669.field9385.method166(-8839, var18);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 66)
    public static void method3052(int arg0) {
        field7380 = null;
        if (arg0 < 122) {
            method3053(74, 45, 61, -75, -122, (byte) 27, -18);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIBI)I", line = 77)
    public static final int method3053(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var7 = arg4 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg2;
            arg2 = var8;
        }
        field7378++;
        if (var7 == 0) {
            return arg1;
        }
        int var9 = -97 / ((arg5 - 41) / 41);
        if (var7 == 1) {
            return arg3;
        } else if (var7 == 2) {
            return 1 + 7 - arg6 - arg1;
        } else {
            return 1 + 7 - arg2 - arg3;
        }
    }
}
