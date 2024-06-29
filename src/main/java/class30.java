import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 {

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field697 = 0;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Loa;")
    public static class98 field698 = class38.method349(255, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field702 = 0;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Loa;")
    private static class98 field703 = class38.method349(255, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Loa;")
    private static class98 field701 = class38.method349(255, "Loading sprites )2 ");

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Loa;")
    public static class98 field704 = class38.method349(255, "Handel)4Duell");

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Loa;")
    public static class98 field696 = field703;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Loa;")
    public static class98 field695 = field701;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Ltb;")
    public static class130 field705;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method299(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field703 = null;
        field704 = null;
        field695 = null;
        field705 = null;
        field701 = null;
        field698 = null;
        field696 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIZIIIIII)Z")
    public static final boolean method300(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class52.field1164[var12][var36] = 0;
                class11.field228[var12][var36] = 99999999;
            }
        }
        if (arg7 > -114) {
            field701 = null;
        }
        field706++;
        class52.field1164[arg2][arg10] = 99;
        class11.field228[arg2][arg10] = 0;
        int var13 = arg2;
        int var14 = arg10;
        byte var15 = 0;
        int var16 = 0;
        class27.field654[var15] = arg2;
        boolean var17 = false;
        int var37 = var15 + 1;
        class88.field2009[var15] = arg10;
        int var18 = class27.field654.length;
        int[][] var19 = class137.field3323[class114.field2572].field3675;
        while (var37 != var16) {
            var13 = class27.field654[var16];
            var14 = class88.field2009[var16];
            var16 = (var16 + 1) % var18;
            if (arg8 == var13 && arg6 == var14) {
                var17 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class137.field3323[class114.field2572].method1195(21728, var14, arg1, arg6, arg8, arg3 - 1, var13)) {
                    var17 = true;
                    break;
                }
                if (arg3 < 10 && class137.field3323[class114.field2572].method1186(arg3 - 1, true, arg1, arg8, var14, var13, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg4 != 0 && class137.field3323[class114.field2572].method1192(arg11, var13, arg9, arg6, arg4, arg8, true, var14)) {
                var17 = true;
                break;
            }
            int var35 = class11.field228[var13][var14] + 1;
            if (var13 > 0 && class52.field1164[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0) {
                class27.field654[var37] = var13 - 1;
                class88.field2009[var37] = var14;
                class52.field1164[var13 - 1][var14] = 2;
                var37 = (var37 + 1) % var18;
                class11.field228[var13 - 1][var14] = var35;
            }
            if (var13 < 103 && class52.field1164[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0) {
                class27.field654[var37] = var13 + 1;
                class88.field2009[var37] = var14;
                class52.field1164[var13 + 1][var14] = 8;
                class11.field228[var13 + 1][var14] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var14 > 0 && class52.field1164[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class27.field654[var37] = var13;
                class88.field2009[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class52.field1164[var13][var14 - 1] = 1;
                class11.field228[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class52.field1164[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class27.field654[var37] = var13;
                class88.field2009[var37] = var14 + 1;
                class52.field1164[var13][var14 + 1] = 4;
                var37 = (var37 + 1) % var18;
                class11.field228[var13][var14 + 1] = var35;
            }
            if (var13 > 0 && var14 > 0 && class52.field1164[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x128010E) == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class27.field654[var37] = var13 - 1;
                class88.field2009[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class52.field1164[var13 - 1][var14 - 1] = 3;
                class11.field228[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class52.field1164[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x1280183) == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class27.field654[var37] = var13 + 1;
                class88.field2009[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class52.field1164[var13 + 1][var14 - 1] = 9;
                class11.field228[var13 + 1][var14 - 1] = var35;
            }
            if (var13 > 0 && var14 < 103 && class52.field1164[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x1280138) == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class27.field654[var37] = var13 - 1;
                class88.field2009[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class52.field1164[var13 - 1][var14 + 1] = 6;
                class11.field228[var13 - 1][var14 + 1] = var35;
            }
            if (var13 < 103 && var14 < 103 && class52.field1164[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12801E0) == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class27.field654[var37] = var13 + 1;
                class88.field2009[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class52.field1164[var13 + 1][var14 + 1] = 12;
                class11.field228[var13 + 1][var14 + 1] = var35;
            }
        }
        class37.field924 = 0;
        if (!var17) {
            if (!arg5) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg8 - var22; var23 <= arg8 + var22; var23++) {
                for (int var24 = arg6 - var22; var24 <= arg6 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class11.field228[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var24 < arg6) {
                            var26 = arg6 - var24;
                        } else if (var24 > arg6 + arg4 - 1) {
                            var26 = var24 + 1 - arg4 - arg6;
                        }
                        if (var23 < arg8) {
                            var25 = arg8 - var23;
                        } else if (arg8 + arg11 - 1 < var23) {
                            var25 = var23 + 1 - arg11 - arg8;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var21 > class11.field228[var23][var24]) {
                            var20 = var27;
                            var14 = var24;
                            var13 = var23;
                            var21 = class11.field228[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg2 == var13 && arg10 == var14) {
                return false;
            }
            class37.field924 = 1;
        }
        byte var28 = 0;
        class27.field654[var28] = var13;
        int var38 = var28 + 1;
        class88.field2009[var28] = var14;
        int var29;
        int var30 = var29 = class52.field1164[var13][var14];
        while (arg2 != var13 || arg10 != var14) {
            if (var29 != var30) {
                class27.field654[var38] = var13;
                var29 = var30;
                class88.field2009[var38++] = var14;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            var30 = class52.field1164[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38--;
            if (var31 > 25) {
                var31 = 25;
            }
            int var32 = class27.field654[var38];
            int var33 = class88.field2009[var38];
            if (arg0 == 0) {
                class54.field1192++;
                class132.field3116.method177(6624, 237);
                class132.field3116.method95(var31 + var31 + 3, true);
            }
            if (arg0 == 1) {
                class124.field2769++;
                class132.field3116.method177(6624, 54);
                class132.field3116.method95(var31 + var31 + 17, true);
            }
            if (arg0 == 2) {
                class105.field2389++;
                class132.field3116.method177(6624, 100);
                class132.field3116.method95(var31 + var31 + 3, true);
            }
            class132.field3116.method81((byte) -109, var33 + class71.field1479);
            class132.field3116.method82((byte) -116, class21.field470 + var32);
            class132.field3116.method84(class86.field1978[82] ? 1 : 0, -196338008);
            class90.field2055 = class88.field2009[0];
            class44.field1009 = class27.field654[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class132.field3116.method84(class27.field654[var38] - var32, -196338008);
                class132.field3116.method87(class88.field2009[var38] - var33, 0);
            }
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
