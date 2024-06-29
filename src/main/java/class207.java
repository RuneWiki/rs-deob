import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class207 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[Ltf;")
    public static class114[] field3309;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIB)I")
    public static final int method1469(int arg0, int arg1, byte arg2) {
        if (arg2 >= -123) {
            field3308 = -17;
        }
        field3307++;
        int var3 = arg1 >> 31 & arg0 - 1;
        return ((arg1 >>> 31) + arg1) % arg0 + var3;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZIIIIIILrk;IILdj;III)Lrk;")
    public static final class293 method1470(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class293 arg7, int arg8, int arg9, class200 arg10, int arg11, int arg12, int arg13) {
        field3310++;
        long var14 = ((long) arg9 << 32) + ((long) arg5 << 48) + (long) ((arg12 << 24) + (arg8 << 16) + arg13);
        class293 var16 = (class293) class60.field923.method149((byte) -50, var14);
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
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            int[][] var20 = new int[var19][var17];
            class228 var21 = new class228(var17 * var19 + 1, var19 * 2 * var17 - var17, 0);
            int var22 = var21.method1609(0, 0, 0);
            for (int var23 = 0; var23 < var19; var23++) {
                int var30 = var18[var23];
                int var31 = var18[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = arg11 + (class172.field2669[var33] * var30) >> 16;
                    int var35 = class172.field2658[var33] * var31 + arg6 >> 16;
                    var20[var23][var32] = var21.method1609(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var19; var24++) {
                int var25 = (var24 * 256 + 128) / var19;
                int var26 = 256 - var25;
                short var27 = (short) (((arg5 & 0x7F) * var25 + (arg9 & 0x7F) * var26 & 0x7F00) + ((arg5 & 0xFC00) * var25 + (arg9 & 0xFC00) * var26 & 0xFC0000) + ((arg5 & 0x380) * var25 + (arg9 & 0x380) * var26 & 0x38000) >> 8);
                byte var28 = (byte) (arg8 * var26 + arg12 * var25 >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var21.method1581(var22, var20[0][(var29 + 1) % var17], var20[0][var29], (byte) 1, var27, var28);
                    } else {
                        var21.method1581(var20[var24 - 1][var29], var20[var24 - 1][(var29 + 1) % var17], var20[var24][(var29 + 1) % var17], (byte) 1, var27, var28);
                        var21.method1581(var20[var24 - 1][var29], var20[var24][(var29 + 1) % var17], var20[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var21.method1594(64, 768, -50, -10, -50);
            class60.field923.method152(var16, var14, true);
        }
        int var36 = arg13 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = -var36;
        int var40 = var36;
        if (arg0) {
            if (arg1 > 640 && arg1 < 1408) {
                var38 = var36 + 128;
            }
            if (arg1 > 128 && arg1 < 896) {
                var39 -= 128;
            }
            if (arg1 > 1152 && arg1 < 1920) {
                var40 = var36 + 128;
            }
            if (arg1 > 1664 || arg1 < 384) {
                var37 -= 128;
            }
        }
        int var41 = arg7.method1319();
        if (var39 > var41) {
            var41 = var39;
        }
        int var42 = arg7.method1322();
        if (var42 > var40) {
            var42 = var40;
        }
        int var43 = arg7.method1297();
        if (arg2 >= -46) {
            method1470(false, 58, 25, -3, -32, -67, 95, (class293) null, -84, 119, (class200) null, 5, -12, 79);
        }
        if (var37 > var43) {
            var43 = var37;
        }
        class146 var44 = null;
        int var45 = arg7.method1309();
        if (arg10 != null) {
            int var46 = arg10.field3167[arg4];
            var44 = class31.method184(var46 >> 16, (byte) -19);
            arg4 = var46 & 0xFFFF;
        }
        if (var38 < var45) {
            var45 = var38;
        }
        class293 var47;
        if (var44 == null) {
            var47 = var16.method1295(true, true, true);
            var47.method1302((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method1315((var41 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method1295(!var44.method976(arg4, 0), !var44.method977(arg4, -101), true);
            var47.method1302((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method1315((var41 + var42) / 2, 0, (var43 + var45) / 2);
            var47.method2044(var44, arg4);
        }
        if (arg1 != 0) {
            var47.method1327(arg1);
        }
        class191 var48 = (class191) var47;
        if (class12.method66(arg11 + var41, class165.field2600, arg6 + var43, 0) != arg3 || arg3 != class12.method66(arg11 + var42, class165.field2600, arg6 + var45, 0)) {
            for (int var49 = 0; var49 < var48.field2945; var49++) {
                var48.field2965[var49] += class12.method66(var48.field2944[var49] + arg11, class165.field2600, var48.field2973[var49] + arg6, 0) - arg3;
            }
            var48.field2971 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method1471(int arg0) {
        if (arg0 < 89) {
            field3308 = -44;
        }
        field3309 = null;
    }
}
