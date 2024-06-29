import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class59 extends class172 {

    @OriginalMember(owner = "client!jn", name = "O", descriptor = "Z")
    public boolean field1013 = false;

    @OriginalMember(owner = "client!jn", name = "W", descriptor = "Z")
    public boolean field1021 = false;

    @OriginalMember(owner = "client!jn", name = "M", descriptor = "I")
    public int field1011 = -1;

    @OriginalMember(owner = "client!jn", name = "T", descriptor = "Z")
    public static boolean field1018 = false;

    @OriginalMember(owner = "client!jn", name = "L", descriptor = "Ljl;")
    public static class332 field1010 = new class332(30);

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "I")
    public int field1008;

    @OriginalMember(owner = "client!jn", name = "K", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!jn", name = "N", descriptor = "I")
    public int field1012;

    @OriginalMember(owner = "client!jn", name = "P", descriptor = "I")
    public int field1014;

    @OriginalMember(owner = "client!jn", name = "Q", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!jn", name = "R", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!jn", name = "S", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "client!jn", name = "U", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!jn", name = "V", descriptor = "Z")
    public static boolean field1020;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIBII)V", line = 17)
    public static final void method499(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1016++;
        if (arg2 != -35) {
            field1010 = (class332) null;
        }
        if (arg1 >= arg3) {
            class161.method1253(arg1, class353.field5599[arg0], arg2 + 34, arg4, arg3);
        } else {
            class161.method1253(arg3, class353.field5599[arg0], -1, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(Z)V", line = 36)
    public static void method500(boolean arg0) {
        field1010 = null;
        if (!arg0) {
            method500(false);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIZLd;ILo;IIBII)Lo;", line = 49)
    public static final class96 method501(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class43 arg6, int arg7, class96 arg8, int arg9, int arg10, byte arg11, int arg12, int arg13) {
        field1009++;
        long var14 = ((long) arg3 << 48) + ((long) arg7 << 32) + (long) ((arg0 << 24) + (arg10 << 16) + arg4);
        class96 var16 = (class96) class77.field1342.method2329((byte) 107, var14);
        if (var16 == null) {
            byte var17;
            if (arg4 == 1) {
                var17 = 9;
            } else if (arg4 == 2) {
                var17 = 12;
            } else if (arg4 == 3) {
                var17 = 15;
            } else if (arg4 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            class114 var19 = new class114(var17 * var18 + 1, var17 * var18 * 2 - var17, 0);
            int[][] var20 = new int[var18][var17];
            int var21 = var19.method872(0, 0, 0);
            int[] var22 = new int[] { 64, 96, 128 };
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var22[var23];
                int var25 = var22[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = arg13 + (class153.field2438[var27] * var24) >> 16;
                    int var29 = class153.field2445[var27] * var25 + arg1 >> 16;
                    var20[var23][var26] = var19.method872(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg0 * var31 + arg10 * var32 >> 8);
                short var34 = (short) (((arg3 & 0xFC00) * var31 + (arg7 & 0xFC00) * var32 & 0xFC0000) + ((arg3 & 0x380) * var31 + (arg7 & 0x380) * var32 & 0x38000) + ((arg3 & 0x7F) * var31 + (arg7 & 0x7F) * var32 & 0x7F00) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var19.method874(var21, var20[0][(var35 + 1) % var17], var20[0][var35], (byte) 1, var34, var33);
                    } else {
                        var19.method874(var20[var30 - 1][var35], var20[var30 - 1][(var35 + 1) % var17], var20[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var19.method874(var20[var30 - 1][var35], var20[var30][(var35 + 1) % var17], var20[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var19.method880(64, 768, -50, -10, -50);
            class77.field1342.method2333(var14, 0, var16);
        }
        int var36 = arg4 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = var36;
        int var40 = -var36;
        if (arg5) {
            if (arg2 > 1152 && arg2 < 1920) {
                var38 = var36 + 128;
            }
            if (arg2 > 128 && arg2 < 896) {
                var37 -= 128;
            }
            if (arg2 > 1664 || arg2 < 384) {
                var40 -= 128;
            }
            if (arg2 > 640 && arg2 < 1408) {
                var39 = var36 + 128;
            }
        }
        int var41 = arg8.method540();
        if (var41 < var37) {
            var41 = var37;
        }
        if (arg11 > -59) {
            field1018 = false;
        }
        int var42 = arg8.method547();
        if (var38 < var42) {
            var42 = var38;
        }
        int var43 = arg8.method542();
        int var44 = arg8.method520();
        if (var43 < var40) {
            var43 = var40;
        }
        class257 var45 = null;
        if (var44 > var39) {
            var44 = var39;
        }
        if (arg6 != null) {
            int var46 = arg6.field677[arg12];
            var45 = class230.method1782(var46 >> 16, -75);
            arg12 = var46 & 0xFFFF;
        }
        class96 var47;
        if (var45 == null) {
            var47 = var16.method532(true, true, true);
            var47.method521((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method512((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method532(!var45.method1968(arg12, (byte) 71), !var45.method1972(arg12, -480), true);
            var47.method521((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method512((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method745(var45, arg12);
        }
        if (arg2 != 0) {
            var47.method544(arg2);
        }
        if (class42.field607) {
            class337 var50 = (class337) var47;
            if (class271.method2034(-1, arg1 + var43, arg13 + var41, class186.field2991) != arg9 || arg9 != class271.method2034(-1, arg1 + var44, arg13 - -var42, class186.field2991)) {
                for (int var51 = 0; var51 < var50.field5325; var51++) {
                    var50.field5365[var51] += class271.method2034(-1, var50.field5332[var51] + arg1, var50.field5344[var51] + arg13, class186.field2991) - arg9;
                }
                var50.field5362.field4288 = false;
                var50.field5330.field4634 = false;
            }
        } else {
            class62 var48 = (class62) var47;
            if (class271.method2034(-1, arg1 + var43, arg13 - -var41, class186.field2991) != arg9 || arg9 != class271.method2034(-1, arg1 + var44, arg13 - -var42, class186.field2991)) {
                for (int var49 = 0; var49 < var48.field1040; var49++) {
                    var48.field1042[var49] += class271.method2034(-1, var48.field1062[var49] + arg1, var48.field1044[var49] - -arg13, class186.field2991) - arg9;
                }
                var48.field1037 = false;
            }
        }
        return var47;
    }
}
