import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class47 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1144 = 0;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1148 = -1;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Lpd;")
    public static class94 field1146 = class28.method249(-58, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!he", name = "b", descriptor = "[Lpd;")
    public static class94[] field1143 = new class94[1000];

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Lpd;")
    public static class94 field1149 = class28.method249(-117, "@or3@");

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lpd;")
    public static class94 field1151 = class28.method249(-86, "backbase2");

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V", line = 3)
    public static void method347(boolean arg0) {
        field1143 = null;
        if (!arg0) {
            method348(-41, (byte) 24, false, -101, 66, -12);
        }
        field1149 = null;
        field1146 = null;
        field1151 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBZIII)Ltc;", line = 19)
    public static final class116 method348(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        long var6 = ((long) arg5 << 38) + (long) arg3 + ((long) arg0 << 16) + ((long) arg4 << 40);
        field1150++;
        if (!arg2) {
            class116 var8 = (class116) class120.field2993.method1007(var6, (byte) -115);
            if (var8 != null) {
                return var8;
            }
        }
        class110 var9 = class39.method295(arg3, 1);
        if (arg0 > 1 && var9.field2723 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field2699[var11] <= arg0 && var9.field2699[var11] != 0) {
                    var10 = var9.field2723[var11];
                }
            }
            if (var10 != -1) {
                var9 = class39.method295(var10, arg1 ^ 0x1D);
            }
        }
        class48 var12 = var9.method804(true, 1, true);
        if (var12 == null) {
            return null;
        }
        class116 var13 = null;
        if (var9.field2710 != -1) {
            var13 = method348(10, (byte) 28, true, var9.field2706, 0, 1);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class130.field3242;
        int var15 = class130.field3237;
        int var16 = class130.field3238;
        int var17 = class130.field3240;
        int var18 = class130.field3243;
        int var19 = class130.field3241;
        int var20 = class130.field3239;
        int[] var21 = class124.method995();
        int var22 = class124.field3138;
        int var23 = class124.field3145;
        class116 var24 = new class116(36, 32);
        class130.method1034(var24.field2933, 36, 32);
        class97.field2479 = class124.method985(class97.field2479);
        class130.method1028(0, 0, 36, 32, 0);
        class124.field3154 = false;
        class124.method981(16, 16);
        if (arg1 != 28) {
            return null;
        }
        int var25 = var9.field2716;
        if (arg2) {
            var25 = (int) ((double) var25 * 1.5D);
        } else if (arg5 == 2) {
            var25 = (int) ((double) var25 * 1.04D);
        }
        int var26 = class124.field3152[var9.field2718] * var25 >> 16;
        int var27 = class124.field3146[var9.field2718] * var25 >> 16;
        var12.method354();
        var12.method378(0, var9.field2744, var9.field2738, var9.field2718, var9.field2719, var26 + var12.field297 / 2 + var9.field2742, var9.field2742 + var27);
        if (arg5 >= 1) {
            var24.method880(1);
        }
        if (arg5 >= 2) {
            var24.method880(16777215);
        }
        if (arg4 != 0) {
            var24.method868(arg4);
        }
        class130.method1034(var24.field2933, 36, 32);
        if (var9.field2710 != -1) {
            var13.method873(0, 0);
        }
        if (!arg2 && (var9.field2727 == 1 || arg0 != 1)) {
            class26.field707.method115(class97.method735(arg1 ^ 0x51, arg0), 1, 10, 1);
            class26.field707.method115(class97.method735(arg1 ^ 0x49, arg0), 0, 9, 16776960);
        }
        if (!arg2) {
            class120.field2993.method1012(50, var24, var6);
        }
        class130.method1034(var14, var20, var15);
        class130.method1019(var16, var19, var17, var18);
        class124.method985(var21);
        class124.field3145 = var23;
        class124.field3138 = var22;
        class124.method992();
        class124.field3154 = true;
        return var24;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILpd;Lpd;Ls;)[Ltc;", line = 188)
    public static final class116[] method349(int arg0, class94 arg1, class94 arg2, class111 arg3) {
        if (arg0 <= 21) {
            field1143 = null;
        }
        int var4 = arg3.method815(arg2, (byte) 70);
        int var5 = arg3.method828(arg1, false, var4);
        field1142++;
        return class108.method787(var5, -2, var4, arg3);
    }
}
