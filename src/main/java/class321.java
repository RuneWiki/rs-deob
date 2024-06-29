import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class321 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)B", line = 4)
    public static final byte method1905(int arg0, byte arg1, int arg2) {
        field4413++;
        if (arg2 == 9) {
            if (arg1 >= -46) {
                method1907(-3, 3, 73, -28, null, (byte) 16, 47, 7, 70, -106, null, 63, -22, null, -64);
            }
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IBI)I", line = 25)
    public static final int method1906(int arg0, byte arg1, int arg2) {
        field4412++;
        if (arg2 == -1) {
            return 12345678;
        }
        if (arg1 != 103) {
            method1906(82, (byte) 4, 33);
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIILza;BIIIILe;IILjp;I)Le;", line = 50)
    public static final class285 method1907(int arg0, int arg1, int arg2, int arg3, class295 arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, class285 arg10, int arg11, int arg12, class55 arg13, int arg14) {
        field4415++;
        if (arg10 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg13 != null) {
            int var16 = var15 | arg13.method365(-1, (byte) -103, false, arg3);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = (long) ((arg0 << 16) + (arg7 << 24) + arg12) - (-((long) arg1 << 32) - ((long) arg8 << 48));
        class473 var19 = class11.field127;
        class285 var20;
        synchronized (class11.field127) {
            var20 = (class285) class11.field127.method2767(var17, 0);
        }
        if (var20 == null || arg4.method459(var20.method671(), var15) != 0) {
            if (var20 != null) {
                var15 = arg4.method525(var15, var20.method671());
            }
            byte var21;
            if (arg12 == 1) {
                var21 = 9;
            } else if (arg12 == 2) {
                var21 = 12;
            } else if (arg12 == 3) {
                var21 = 15;
            } else if (arg12 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class496 var24 = new class496(var21 * var22 + 1, var21 * 2 * var22 + -var21, 0);
            int var25 = var24.method2944(0, 0, 15687, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class51.field743[var31] * var28 >> 15;
                    int var33 = class51.field731[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method2944(var33, var32, 15687, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg0 * var36 + arg7 * var35 >> 8);
                short var38 = (short) (((arg1 & 0x380) * var36 + (arg8 & 0x380) * var35 & 0x38000) + ((arg1 & 0x7F) * var36 + (arg8 & 0x7F) * var35 & 0x7F00) + ((arg1 & 0xFC00) * var36 + (arg8 & 0xFC00) * var35 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method2934((byte) 1, var38, arg5 - 33, var37, (byte) -1, var25, var26[0][(var39 + 1) % var21], (short) -1, var26[0][var39]);
                    } else {
                        var24.method2934((byte) 1, var38, arg5 - 30, var37, (byte) -1, var26[var34 - 1][var39], var26[var34 - 1][(var39 + 1) % var21], (short) -1, var26[var34][(var39 + 1) % var21]);
                        var24.method2934((byte) 1, var38, arg5 ^ 0x25, var37, (byte) -1, var26[var34 - 1][var39], var26[var34][(var39 + 1) % var21], (short) -1, var26[var34][var39]);
                    }
                }
            }
            var20 = arg4.method501(var24, var15, class488.field7065, 64, 768);
            class473 var40 = class11.field127;
            synchronized (class11.field127) {
                class11.field127.method2777(arg5 ^ 0x45C, var20, var17);
            }
        }
        int var41 = (arg12 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        if (arg5 != -93) {
            return null;
        }
        int var44 = var41;
        int var45 = var41;
        if (arg6 != 0) {
            if ((arg6 & 0x1) != 0) {
                var45 = var41 + 128;
            }
            if ((arg6 & 0x8) != 0) {
                var42 -= 128;
            }
            if ((arg6 & 0x2) != 0) {
                var43 -= 128;
            }
            if ((arg6 & 0x4) != 0) {
                var44 = var41 + 128;
            }
        }
        int var46 = arg10.method700();
        int var47 = arg10.method681();
        int var48 = arg10.method723();
        if (var47 > var44) {
            var47 = var44;
        }
        int var49 = arg10.method682();
        if (var42 > var46) {
            var46 = var42;
        }
        if (var48 < var43) {
            var48 = var43;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class420 var50 = null;
        if (arg13 != null) {
            int var51 = arg13.field796[arg3];
            var50 = class50.field716.method827(var51 >> 16, (byte) -125);
            arg3 = var51 & 0xFFFF;
        }
        class285 var52;
        if (var50 == null) {
            var52 = var20.method697((byte) 3, var15, true);
            var52.method712(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method675(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method697((byte) 3, var15, true);
            var52.method712(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method675(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method1636(123, var50, arg3);
        }
        if (arg2 != 0) {
            var52.method690(arg2);
        }
        if (arg11 != 0) {
            var52.method692(arg11);
        }
        if (arg14 != 0) {
            var52.method675(0, arg14, 0);
        }
        return var52;
    }
}
