import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class199 {

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public int field3567 = 0;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field3561 = 0;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lcc;")
    public static class209 field3565 = class95.method669(109, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lcc;")
    private static class209 field3563 = class95.method669(121, "Connected to update server");

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "Lcc;")
    public static class209 field3570 = field3563;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method1358(int arg0) {
        field3563 = null;
        field3570 = null;
        field3565 = null;
        if (arg0 <= 90) {
            field3563 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIBIIIIIZLfl;IILvc;)Lvc;")
    public static final class189 method1359(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, class241 arg10, int arg11, int arg12, class189 arg13) {
        long var14 = ((long) arg2 << 32) + ((long) arg8 << 48) + (long) ((arg7 << 24) + (arg0 - -(arg1 << 16)));
        class189 var16 = (class189) class238.field4308.method670((byte) -72, var14);
        field3568++;
        if (var16 == null) {
            byte var17;
            if (arg0 == 1) {
                var17 = 9;
            } else if (arg0 == 2) {
                var17 = 12;
            } else if (arg0 == 3) {
                var17 = 15;
            } else if (arg0 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class208 var20 = new class208(var17 * var18 + 1, var17 * 2 * var18 + -var17, 0);
            int var21 = var20.method1421(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = arg11 + (class15.field278[var33] * var30) >> 16;
                    int var35 = class15.field280[var33] * var31 + arg4 >> 16;
                    var22[var23][var32] = var20.method1421(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                short var27 = (short) (((arg2 & 0x7F) * var26 + (arg8 & 0x7F) * var25 & 0x7F00) + ((arg2 & 0x380) * var26 + (arg8 & 0x380) * var25 & 0x38000) + ((arg2 & 0xFC00) * var26 + (arg8 & 0xFC00) * var25 & 0xFC0000) >> 8);
                byte var28 = (byte) (arg1 * var26 + arg7 * var25 >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method1416(var21, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var27, var28);
                    } else {
                        var20.method1416(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var27, var28);
                        var20.method1416(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var20.method1413(64, 768, -50, -10, -50);
            class238.field4308.method673(var14, -5087, var16);
        }
        int var36 = -82 % (-arg3 / 34);
        int var37 = arg0 * 64 - 1;
        int var38 = -var37;
        int var39 = var37;
        int var40 = arg13.method420();
        int var41 = -var37;
        int var42 = var37;
        if (arg9) {
            if (arg6 > 640 && arg6 < 1408) {
                var39 = var37 + 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var38 -= 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var42 = var37 + 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var41 -= 128;
            }
        }
        if (var41 > var40) {
            var40 = var41;
        }
        int var43 = arg13.method414();
        if (var43 > var42) {
            var43 = var42;
        }
        int var44 = arg13.method409();
        int var45 = arg13.method421();
        if (var44 < var38) {
            var44 = var38;
        }
        if (var45 > var39) {
            var45 = var39;
        }
        class47 var46 = null;
        if (arg10 != null) {
            int var47 = arg10.field4341[arg5];
            var46 = class253.method1747(var47 >> 16, -105);
            arg5 = var47 & 0xFFFF;
        }
        class189 var48;
        if (var46 == null) {
            var48 = var16.method425(true, true);
            var48.method406((var43 - var40) / 2, 128, (var45 - var44) / 2);
            var48.method433((var40 + var43) / 2, 0, (var44 + var45) / 2);
        } else {
            var48 = var16.method425(!var46.method344(36, arg5), true);
            var48.method406((var43 - var40) / 2, 128, (var45 - var44) / 2);
            var48.method433((var40 + var43) / 2, 0, (var44 + var45) / 2);
            var48.method430(var46, arg5);
        }
        if (arg6 != 0) {
            var48.method413(arg6);
        }
        class55 var49 = (class55) var48;
        if (class94.method661(arg4 + var44, 19452, class99.field1937, arg11 + var40) != arg12 || class94.method661(arg4 + var45, 19452, class99.field1937, arg11 + var43) != arg12) {
            for (int var50 = 0; var50 < var49.field1071; var50++) {
                var49.field1116[var50] += class94.method661(var49.field1079[var50] + arg4, 19452, class99.field1937, var49.field1072[var50] + arg11) - arg12;
            }
            var49.field1074 = false;
        }
        return var48;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILtf;)V")
    private final void method1360(int arg0, int arg1, class106 arg2) {
        if (arg1 == 5) {
            this.field3567 = arg2.method736(121);
        }
        field3566++;
        if (arg0 != 256) {
            field3561 = -97;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static final void method1361(byte arg0) {
        if (arg0 > 36) {
            field3562++;
            class285.field5025.method664(126);
            class37.field639.method664(119);
            class93.field1848.method664(-62);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBI)I")
    public static final int method1362(int arg0, byte arg1, int arg2) {
        field3569++;
        if (arg1 >= -103) {
            return -89;
        }
        class75 var3 = (class75) class31.field554.method1755((long) arg2, (byte) -116);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && var3.field1401.length > arg0) {
            return var3.field1401[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ltf;B)V")
    public final void method1363(class106 arg0, byte arg1) {
        if (arg1 != -85) {
            method1361((byte) 85);
        }
        field3564++;
        while (true) {
            int var3 = arg0.method774((byte) 104);
            if (var3 == 0) {
                return;
            }
            this.method1360(256, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIILlk;I)V")
    public static final void method1364(int arg0, int arg1, int arg2, int arg3, int arg4, class81 arg5, int arg6) {
        field3559++;
        class50.method380(-68, arg6, arg4, arg5.field1534, arg5.field1571, arg2, arg0, arg1);
        if (arg3 != -129) {
            method1361((byte) 38);
        }
    }
}
