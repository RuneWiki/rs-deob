import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class163 extends class222 {

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field2873 = 0;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "Lcf;")
    public static class93 field2874 = class147.method1066("<col=ff7000>", -48);

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Lcf;")
    public static class93 field2875 = class147.method1066("mem=", -48);

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Lcf;")
    public static class93 field2881 = class147.method1066("_labels", -48);

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Lcf;")
    public static class93 field2876 = class147.method1066("Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3", -48);

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "[I")
    public static int[] field2878 = new int[4096];

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public int field2877;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public int field2880;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public int field2883;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static void method1178(int arg0) {
        int var1 = 76 / ((67 - arg0) / 59);
        field2874 = null;
        field2875 = null;
        field2876 = null;
        field2878 = null;
        field2881 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BIIIIIIIIILna;ZLbk;I)Lbk;")
    public static final class20 method1179(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class31 arg10, boolean arg11, class20 arg12, int arg13) {
        field2882++;
        long var14 = ((long) arg4 << 32) + (long) ((arg3 << 16) + (arg9 << 24) + arg13) + ((long) arg2 << 48);
        class20 var16 = (class20) class216.field3930.method302(var14, 0);
        if (var16 == null) {
            byte var17;
            if (arg13 == 1) {
                var17 = 9;
            } else if (arg13 == 2) {
                var17 = 12;
            } else if (arg13 == 3) {
                var17 = 15;
            } else if (arg13 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class64 var20 = new class64((var17 * var18) + 1, var17 * var18 * 2 + -var17, 0);
            int var21 = var20.method423(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = arg8 + (class179.field3155[var33] * var30) >> 16;
                    int var35 = class179.field3158[var33] * var31 + arg1 >> 16;
                    var22[var23][var32] = var20.method423(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                byte var27 = (byte) (arg3 * var26 + arg9 * var25 >> 8);
                short var28 = (short) (((arg2 & 0x380) * var25 + (arg4 & 0x380) * var26 & 0x38000) + ((arg2 & 0xFC00) * var25 + (arg4 & 0xFC00) * var26 & 0xFC0000) + ((arg2 & 0x7F) * var25 + (arg4 & 0x7F) * var26 & 0x7F00) >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method421(var21, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method421(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var28, var27);
                        var20.method421(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method436(64, 768, -50, -10, -50);
            class216.field3930.method297(var14, var16, 10414);
        }
        int var36 = arg13 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = arg12.method103();
        int var41 = arg12.method113();
        int var42 = var36;
        if (arg11) {
            if (arg5 > 128 && arg5 < 896) {
                var38 -= 128;
            }
            if (arg5 > 1152 && arg5 < 1920) {
                var39 = var36 + 128;
            }
            if (arg5 > 640 && arg5 < 1408) {
                var42 = var36 + 128;
            }
            if (arg5 > 1664 || arg5 < 384) {
                var37 -= 128;
            }
        }
        class138 var43 = null;
        if (var41 > var39) {
            var41 = var39;
        }
        if (arg0 <= 113) {
            return null;
        }
        if (var38 > var40) {
            var40 = var38;
        }
        int var44 = arg12.method90();
        int var45 = arg12.method105();
        if (var42 < var45) {
            var45 = var42;
        }
        if (arg10 != null) {
            int var46 = arg10.field479[arg6];
            var43 = class65.method452(-126, var46 >> 16);
            arg6 = var46 & 0xFFFF;
        }
        if (var44 < var37) {
            var44 = var37;
        }
        class20 var47;
        if (var43 == null) {
            var47 = var16.method104(true, true, true);
            var47.method100((var41 - var40) / 2, 128, (var45 - var44) / 2);
            var47.method117((var40 + var41) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method104(!var43.method1006(arg6, false), !var43.method1005(-24204, arg6), true);
            var47.method100((var41 - var40) / 2, 128, (var45 - var44) / 2);
            var47.method117((var40 + var41) / 2, 0, (var44 + var45) / 2);
            var47.method99(var43, arg6);
        }
        if (arg5 != 0) {
            var47.method101(arg5);
        }
        class62 var48 = (class62) var47;
        if (class13.method56(arg1 + var44, arg8 + var40, (byte) 30, class138.field2405) != arg7 || arg7 != class13.method56(arg1 + var45, arg8 + var41, (byte) 127, class138.field2405)) {
            for (int var49 = 0; var49 < var48.field1074; var49++) {
                var48.field1065[var49] += class13.method56(var48.field1070[var49] + arg1, var48.field1067[var49] - -arg8, (byte) 35, class138.field2405) - arg7;
            }
            var48.field1054 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILcc;)V")
    public static final void method1180(int arg0, class210 arg1) {
        field2879++;
        int var2 = arg1.field3804 - class275.field4921;
        if (arg0 != 25732) {
            field2874 = null;
        }
        int var3 = arg1.field3851 * 128 + (arg1.method1475(false) * 64);
        int var4 = arg1.field3781 * 128 + (arg1.method1475(false) * 64);
        arg1.field3784 += (var4 - arg1.field3784) / var2;
        arg1.field3823 = 0;
        if (arg1.field3794 == 0) {
            arg1.field3770 = 1024;
        }
        arg1.field3868 += (var3 - arg1.field3868) / var2;
        if (arg1.field3794 == 1) {
            arg1.field3770 = 1536;
        }
        if (arg1.field3794 == 2) {
            arg1.field3770 = 0;
        }
        if (arg1.field3794 == 3) {
            arg1.field3770 = 512;
        }
    }
}
