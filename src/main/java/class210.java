import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class210 {

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "[J")
    public static long[] field3586 = new long[1000];

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Lwa;")
    public static class75 field3587 = class66.method560("<)4col>", false);

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field3588 = -1;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Lgb;")
    public static class158 field3591 = new class158(30);

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lcl;")
    public static class124 field3585;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "[I")
    public static int[] field3590;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIZII)V", line = 6)
    public static final void method1557(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3589++;
        if (class59.field984 == arg5 && class104.field1759 == arg6 && class76.field1319 == arg2 || class300.method2067(-12461)) {
            return;
        }
        class59.field984 = arg5;
        class104.field1759 = arg6;
        class76.field1319 = arg2;
        if (class300.method2067(-12461)) {
            class76.field1319 = 0;
        }
        if (arg4) {
            class52.method380(arg0 ^ 0xFFFFFFCC, 28);
        } else {
            class52.method380(121, 25);
        }
        class145.method1110(class282.field4861, -1, true);
        int var7 = class275.field4737;
        class275.field4737 = (arg5 - 6) * 8;
        int var8 = class175.field2939;
        class175.field2939 = (arg6 - 6) * 8;
        class152.field2619 = class125.method970(class104.field1759 * 8, class59.field984 * 8, arg0 ^ 0xFFFFADE9);
        int var9 = class275.field4737 - var7;
        int var10 = class275.field4737;
        int var11 = class175.field2939 - var8;
        int var12 = class175.field2939;
        if (arg4) {
            class121.field2031 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class295 var14 = class35.field521[var13];
                if (var14 != null) {
                    var14.field3259 -= var9 * 128;
                    var14.field3218 -= var11 * 128;
                    if (var14.field3259 >= 0 && var14.field3259 <= 13184 && var14.field3218 >= 0 && var14.field3218 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field3236[var15] -= var9;
                            var14.field3205[var15] -= var11;
                        }
                        class132.field2281[class121.field2031++] = var13;
                    } else {
                        class35.field521[var13].field5070 = null;
                        class35.field521[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class295 var17 = class35.field521[var16];
                if (var17 != null) {
                    for (int var18 = 0; var18 < 10; var18++) {
                        var17.field3236[var18] -= var9;
                        var17.field3205[var18] -= var11;
                    }
                    var17.field3218 -= var11 * 128;
                    var17.field3259 -= var9 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class96 var20 = class169.field2842[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field3236[var21] -= var9;
                    var20.field3205[var21] -= var11;
                }
                var20.field3218 -= var11 * 128;
                var20.field3259 -= var9 * 128;
            }
        }
        class67.field1174 = arg2;
        class279.field4831.method741(arg1, arg3, true, false);
        byte var22 = 0;
        byte var23 = 104;
        byte var24 = 0;
        byte var25 = 1;
        byte var26 = 104;
        if (var11 < 0) {
            var25 = -1;
            var26 = -1;
            var24 = 103;
        }
        byte var27 = 1;
        if (var9 < 0) {
            var27 = -1;
            var22 = 103;
            var23 = -1;
        }
        for (int var28 = var22; var28 != var23; var28 += var27) {
            for (int var29 = var24; var29 != var26; var29 += var25) {
                int var30 = var11 + var29;
                int var31 = var9 + var28;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var31 >= 0 && var30 >= 0 && var31 < 104 && var30 < 104) {
                        class130.field2245[var32][var28][var29] = class130.field2245[var32][var31][var30];
                    } else {
                        class130.field2245[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class85 var33 = (class85) class216.field3701.method1250(true); var33 != null; var33 = (class85) class216.field3701.method1256((byte) -127)) {
            var33.field1406 -= var11;
            var33.field1396 -= var9;
            if (var33.field1396 < 0 || var33.field1406 < 0 || var33.field1396 >= 104 || var33.field1406 >= 104) {
                var33.method1527(arg0 ^ 0x3D);
            }
        }
        if (arg4) {
            class172.field2887 -= var9;
            class152.field2607 -= var9;
            class14.field190 -= var11;
            class121.field2029 -= var11;
        } else {
            class163.field2777 = 1;
        }
        if (class158.field2719 != 0) {
            class158.field2719 -= var9;
            class91.field1497 -= var11;
        }
        class311.field5301 = 0;
        if (arg4 && (Math.abs(var9) > 104 || Math.abs(var11) > 104)) {
            class32.method216(true);
        }
        class51.field853 = -1;
        if (arg0 == -1) {
            class5.field52.method1261(2);
            class311.field5302.method1261(2);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 254)
    public static void method1558(int arg0) {
        if (arg0 != 1000) {
            method1558(88);
        }
        field3587 = null;
        field3590 = null;
        field3591 = null;
        field3586 = null;
        field3585 = null;
    }
}
