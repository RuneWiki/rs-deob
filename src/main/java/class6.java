import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field111 = -1;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static volatile int field112 = -1;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "J")
    public static long field108;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static final void method35(boolean arg0) {
        if (class130.field2464 == null || class27.field440 == null) {
            class130.field2464 = new int[256];
            class27.field440 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class130.field2464[var1] = (int) (Math.sin(var2) * 4096.0D);
                class27.field440[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0) {
            field110++;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZIIBIIIIIII)Z")
    public static final boolean method36(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field109++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class111.field2000[var12][var36] = 0;
                class24.field360[var12][var36] = 99999999;
            }
        }
        class111.field2000[arg2][arg6] = 99;
        class24.field360[arg2][arg6] = 0;
        int var13 = arg2;
        byte var14 = 0;
        class25.field392[var14] = arg2;
        boolean var15 = false;
        int var16 = arg6;
        int var17 = 0;
        int var37 = var14 + 1;
        class201.field3901[var14] = arg6;
        int[][] var18 = class145.field2822[class114.field2145].field2916;
        int var19 = class25.field392.length;
        while (var37 != var17) {
            var13 = class25.field392[var17];
            var16 = class201.field3901[var17];
            var17 = (var17 + 1) % var19;
            if (arg11 == var13 && arg7 == var16) {
                var15 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class145.field2822[class114.field2145].method944(arg4 + 1, arg11, arg0 - 1, arg10, arg7, var16, var13)) {
                    var15 = true;
                    break;
                }
                if (arg0 < 10 && class145.field2822[class114.field2145].method949(arg10, arg7, arg11, 6, var16, var13, arg0 - 1)) {
                    var15 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg9 != 0 && class145.field2822[class114.field2145].method937(arg8, arg4 + 3, arg11, arg3, var13, arg9, arg7, var16)) {
                var15 = true;
                break;
            }
            int var35 = class24.field360[var13][var16] + 1;
            if (var13 > 0 && class111.field2000[var13 - 1][var16] == 0 && (var18[var13 - 1][var16] & 0x12C0108) == 0) {
                class25.field392[var37] = var13 - 1;
                class201.field3901[var37] = var16;
                var37 = (var37 + 1) % var19;
                class111.field2000[var13 - 1][var16] = 2;
                class24.field360[var13 - 1][var16] = var35;
            }
            if (var13 < 103 && class111.field2000[var13 + 1][var16] == 0 && (var18[var13 + 1][var16] & 0x12C0180) == 0) {
                class25.field392[var37] = var13 + 1;
                class201.field3901[var37] = var16;
                var37 = (var37 + 1) % var19;
                class111.field2000[var13 + 1][var16] = 8;
                class24.field360[var13 + 1][var16] = var35;
            }
            if (var16 > 0 && class111.field2000[var13][var16 - 1] == 0 && (var18[var13][var16 - 1] & 0x12C0102) == 0) {
                class25.field392[var37] = var13;
                class201.field3901[var37] = var16 - 1;
                class111.field2000[var13][var16 - 1] = 1;
                class24.field360[var13][var16 - 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var16 < 103 && class111.field2000[var13][var16 + 1] == 0 && (var18[var13][var16 + 1] & 0x12C0120) == 0) {
                class25.field392[var37] = var13;
                class201.field3901[var37] = var16 + 1;
                var37 = (var37 + 1) % var19;
                class111.field2000[var13][var16 + 1] = 4;
                class24.field360[var13][var16 + 1] = var35;
            }
            if (var13 > 0 && var16 > 0 && class111.field2000[var13 - 1][var16 - 1] == 0 && (var18[var13 - 1][var16 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var16] & 0x12C0108) == 0 && (var18[var13][var16 - 1] & 0x12C0102) == 0) {
                class25.field392[var37] = var13 - 1;
                class201.field3901[var37] = var16 - 1;
                var37 = (var37 + 1) % var19;
                class111.field2000[var13 - 1][var16 - 1] = 3;
                class24.field360[var13 - 1][var16 - 1] = var35;
            }
            if (var13 < 103 && var16 > 0 && class111.field2000[var13 + 1][var16 - 1] == 0 && (var18[var13 + 1][var16 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var16] & 0x12C0180) == 0 && (var18[var13][var16 - 1] & 0x12C0102) == 0) {
                class25.field392[var37] = var13 + 1;
                class201.field3901[var37] = var16 - 1;
                class111.field2000[var13 + 1][var16 - 1] = 9;
                var37 = (var37 + 1) % var19;
                class24.field360[var13 + 1][var16 - 1] = var35;
            }
            if (var13 > 0 && var16 < 103 && class111.field2000[var13 - 1][var16 + 1] == 0 && (var18[var13 - 1][var16 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var16] & 0x12C0108) == 0 && (var18[var13][var16 + 1] & 0x12C0120) == 0) {
                class25.field392[var37] = var13 - 1;
                class201.field3901[var37] = var16 + 1;
                class111.field2000[var13 - 1][var16 + 1] = 6;
                class24.field360[var13 - 1][var16 + 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var13 < 103 && var16 < 103 && class111.field2000[var13 + 1][var16 + 1] == 0 && (var18[var13 + 1][var16 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var16] & 0x12C0180) == 0 && (var18[var13][var16 + 1] & 0x12C0120) == 0) {
                class25.field392[var37] = var13 + 1;
                class201.field3901[var37] = var16 + 1;
                class111.field2000[var13 + 1][var16 + 1] = 12;
                class24.field360[var13 + 1][var16 + 1] = var35;
                var37 = (var37 + 1) % var19;
            }
        }
        class207.field4038 = 0;
        if (!var15) {
            if (!arg1) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg11 - var22; var23 <= arg11 + var22; var23++) {
                for (int var24 = arg7 - var22; var24 <= arg7 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class24.field360[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var23 < arg11) {
                            var25 = arg11 - var23;
                        } else if (var23 > arg11 + arg3 - 1) {
                            var25 = var23 + 1 - arg11 - arg3;
                        }
                        if (arg7 > var24) {
                            var26 = arg7 - var24;
                        } else if (arg9 + arg7 - 1 < var24) {
                            var26 = var24 + 1 - arg7 - arg9;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && class24.field360[var23][var24] < var21) {
                            var21 = class24.field360[var23][var24];
                            var20 = var27;
                            var13 = var23;
                            var16 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg2 == var13 && arg6 == var16) {
                return false;
            }
            class207.field4038 = 1;
        }
        byte var28 = 0;
        class25.field392[var28] = var13;
        int var38 = var28 + 1;
        class201.field3901[var28] = var16;
        if (arg4 != -2) {
            return false;
        }
        int var29;
        int var30 = var29 = class111.field2000[var13][var16];
        while (arg2 != var13 || arg6 != var16) {
            if (var29 != var30) {
                var29 = var30;
                class25.field392[var38] = var13;
                class201.field3901[var38++] = var16;
            }
            if ((var30 & 0x1) != 0) {
                var16++;
            } else if ((var30 & 0x4) != 0) {
                var16--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class111.field2000[var13][var16];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class25.field392[var38];
            int var33 = class201.field3901[var38];
            if (arg5 == 0) {
                class151.field2908.method47(2, 8);
                class151.field2908.method1069(var31 + var31 + 3, (byte) -26);
                class34.field565++;
            }
            if (arg5 == 1) {
                class65.field1057++;
                class151.field2908.method47(191, 8);
                class151.field2908.method1069(var31 + var31 + 17, (byte) -26);
            }
            if (arg5 == 2) {
                class151.field2908.method47(31, 8);
                class82.field1510++;
                class151.field2908.method1069(var31 + var31 + 3, (byte) -26);
            }
            class18.field297 = class201.field3901[0];
            class35.field574 = class25.field392[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class151.field2908.method1069(class25.field392[var38] - var32, (byte) -26);
                class151.field2908.method1039(128, class201.field3901[var38] - var33);
            }
            class151.field2908.method1046((byte) 86, class68.field1242 + var33);
            class151.field2908.method1061(class49.field787 + var32, 12184);
            class151.field2908.method1039(128, class112.field2083[82] ? 1 : 0);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
