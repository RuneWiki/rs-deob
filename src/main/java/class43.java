import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class43 {

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lae;")
    public static class6 field970 = class64.method474(119, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field968 = -1;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field981 = 0;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Lae;")
    public static class6 field983 = class64.method474(104, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "[I")
    public static int[] field994 = new int[1000];

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field982 = -1;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lae;")
    private static class6 field986 = class64.method474(106, "Loading sprites )2 ");

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field1003 = 0;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lae;")
    public static class6 field987 = field986;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public int field975;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public int field989;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Lsd;")
    public static class114 field980;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field988;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 3)
    public static void method354(int arg0) {
        field983 = null;
        field994 = null;
        int var1 = 12 / ((7 - arg0) / 38);
        field986 = null;
        field987 = null;
        field980 = null;
        field970 = null;
        field988 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Z", line = 25)
    public static final boolean method355(int arg0, int arg1) {
        field976++;
        if (arg1 != -160) {
            return true;
        } else if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Ldb;", line = 58)
    public static final class22 method356(int arg0, int arg1) {
        field1002++;
        class22 var2 = (class22) class104.field2462.method128((byte) -63, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class59.field1300.method160(30605, 10, arg1);
        class22 var4 = new class22();
        var4.field537 = arg1;
        if (arg0 >= -6) {
            field983 = null;
        }
        if (var3 != null) {
            var4.method213(0, new class77(var3));
        }
        var4.method224((byte) 111);
        if (var4.field526 != -1) {
            var4.method216(1, method356(-65, var4.field536), method356(-32, var4.field526));
        }
        if (!class88.field2111 && var4.field538) {
            var4.field542 = null;
            var4.field561 = null;
            var4.field535 = 0;
            var4.field549 = class76.field1769;
        }
        class104.field2462.method130(var4, (long) arg1, (byte) 102);
        return var4;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZZII[B)V", line = 95)
    public static final void method357(boolean arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        field991++;
        if (arg1 || class108.field2590 == null) {
            return;
        }
        if (class49.field1094 >= 0) {
            arg2 -= 20;
            if (arg2 < 1) {
                arg2 = 1;
            }
            class87.field2102 = arg2;
            if (class49.field1094 == 0) {
                class105.field2503 = 0;
            } else {
                int var5 = class76.method610(929, class49.field1094);
                int var6 = var5 - class130.field3160;
                class105.field2503 = (var6 + arg2 + 3600 - 1) / arg2;
            }
            class51.field1155 = arg4;
            class61.field1343 = arg0;
            class134.field3267 = arg3;
        } else if (class87.field2102 == 0) {
            class87.method737(arg3, arg0, arg4, arg1);
        } else {
            class51.field1155 = arg4;
            class134.field3267 = arg3;
            class61.field1343 = arg0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIIZIIII)Z", line = 147)
    public static final boolean method358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class15.field315[var12][var36] = 0;
                class57.field1248[var12][var36] = 99999999;
            }
        }
        field969++;
        class15.field315[arg9][arg10] = 99;
        int var13 = arg9;
        class57.field1248[arg9][arg10] = 0;
        byte var14 = 0;
        if (arg0 != 24134) {
            method356(127, 44);
        }
        int var15 = 0;
        int var16 = arg10;
        class6.field131[var14] = arg9;
        int var37 = var14 + 1;
        class121.field2993[var14] = arg10;
        int var17 = class6.field131.length;
        int[][] var18 = class90.field2160[class15.field305].field1051;
        boolean var19 = false;
        while (var37 != var15) {
            var16 = class121.field2993[var15];
            var13 = class6.field131[var15];
            var15 = (var15 + 1) % var17;
            if (arg11 == var13 && arg2 == var16) {
                var19 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class90.field2160[class15.field305].method386(arg2, var16, arg11, arg3, 28543, var13, arg1 - 1)) {
                    var19 = true;
                    break;
                }
                if (arg1 < 10 && class90.field2160[class15.field305].method384(arg2, arg11, (byte) -119, arg1 - 1, arg3, var16, var13)) {
                    var19 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg6 != 0 && class90.field2160[class15.field305].method374(arg8, (byte) -103, var16, arg2, var13, arg6, arg11, arg5)) {
                var19 = true;
                break;
            }
            int var35 = class57.field1248[var13][var16] + 1;
            if (var13 > 0 && class15.field315[var13 - 1][var16] == 0 && (var18[var13 - 1][var16] & 0x1280108) == 0) {
                class6.field131[var37] = var13 - 1;
                class121.field2993[var37] = var16;
                class15.field315[var13 - 1][var16] = 2;
                class57.field1248[var13 - 1][var16] = var35;
                var37 = (var37 + 1) % var17;
            }
            if (var13 < 103 && class15.field315[var13 + 1][var16] == 0 && (var18[var13 + 1][var16] & 0x1280180) == 0) {
                class6.field131[var37] = var13 + 1;
                class121.field2993[var37] = var16;
                var37 = (var37 + 1) % var17;
                class15.field315[var13 + 1][var16] = 8;
                class57.field1248[var13 + 1][var16] = var35;
            }
            if (var16 > 0 && class15.field315[var13][var16 - 1] == 0 && (var18[var13][var16 - 1] & 0x1280102) == 0) {
                class6.field131[var37] = var13;
                class121.field2993[var37] = var16 - 1;
                var37 = (var37 + 1) % var17;
                class15.field315[var13][var16 - 1] = 1;
                class57.field1248[var13][var16 - 1] = var35;
            }
            if (var16 < 103 && class15.field315[var13][var16 + 1] == 0 && (var18[var13][var16 + 1] & 0x1280120) == 0) {
                class6.field131[var37] = var13;
                class121.field2993[var37] = var16 + 1;
                var37 = (var37 + 1) % var17;
                class15.field315[var13][var16 + 1] = 4;
                class57.field1248[var13][var16 + 1] = var35;
            }
            if (var13 > 0 && var16 > 0 && class15.field315[var13 - 1][var16 - 1] == 0 && (var18[var13 - 1][var16 - 1] & 0x128010E) == 0 && (var18[var13 - 1][var16] & 0x1280108) == 0 && (var18[var13][var16 - 1] & 0x1280102) == 0) {
                class6.field131[var37] = var13 - 1;
                class121.field2993[var37] = var16 - 1;
                var37 = (var37 + 1) % var17;
                class15.field315[var13 - 1][var16 - 1] = 3;
                class57.field1248[var13 - 1][var16 - 1] = var35;
            }
            if (var13 < 103 && var16 > 0 && class15.field315[var13 + 1][var16 - 1] == 0 && (var18[var13 + 1][var16 - 1] & 0x1280183) == 0 && (var18[var13 + 1][var16] & 0x1280180) == 0 && (var18[var13][var16 - 1] & 0x1280102) == 0) {
                class6.field131[var37] = var13 + 1;
                class121.field2993[var37] = var16 - 1;
                var37 = (var37 + 1) % var17;
                class15.field315[var13 + 1][var16 - 1] = 9;
                class57.field1248[var13 + 1][var16 - 1] = var35;
            }
            if (var13 > 0 && var16 < 103 && class15.field315[var13 - 1][var16 + 1] == 0 && (var18[var13 - 1][var16 + 1] & 0x1280138) == 0 && (var18[var13 - 1][var16] & 0x1280108) == 0 && (var18[var13][var16 + 1] & 0x1280120) == 0) {
                class6.field131[var37] = var13 - 1;
                class121.field2993[var37] = var16 + 1;
                var37 = (var37 + 1) % var17;
                class15.field315[var13 - 1][var16 + 1] = 6;
                class57.field1248[var13 - 1][var16 + 1] = var35;
            }
            if (var13 < 103 && var16 < 103 && class15.field315[var13 + 1][var16 + 1] == 0 && (var18[var13 + 1][var16 + 1] & 0x12801E0) == 0 && (var18[var13 + 1][var16] & 0x1280180) == 0 && (var18[var13][var16 + 1] & 0x1280120) == 0) {
                class6.field131[var37] = var13 + 1;
                class121.field2993[var37] = var16 + 1;
                class15.field315[var13 + 1][var16 + 1] = 12;
                var37 = (var37 + 1) % var17;
                class57.field1248[var13 + 1][var16 + 1] = var35;
            }
        }
        class8.field179 = 0;
        if (!var19) {
            if (!arg7) {
                return false;
            }
            byte var20 = 10;
            int var21 = 1000;
            int var22 = 100;
            for (int var23 = arg11 - var20; var23 <= arg11 + var20; var23++) {
                for (int var24 = arg2 - var20; var24 <= arg2 + var20; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class57.field1248[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var24 < arg2) {
                            var26 = arg2 - var24;
                        } else if (arg2 + arg6 - 1 < var24) {
                            var26 = var24 + 1 - arg2 - arg6;
                        }
                        if (arg11 > var23) {
                            var25 = arg11 - var23;
                        } else if (var23 > arg11 + arg5 - 1) {
                            var25 = var23 + 1 - arg5 - arg11;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var21 || var21 == var27 && var22 > class57.field1248[var23][var24]) {
                            var13 = var23;
                            var22 = class57.field1248[var23][var24];
                            var16 = var24;
                            var21 = var27;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg9 == var13 && arg10 == var16) {
                return false;
            }
            class8.field179 = 1;
        }
        byte var28 = 0;
        class6.field131[var28] = var13;
        int var38 = var28 + 1;
        class121.field2993[var28] = var16;
        int var29;
        int var30 = var29 = class15.field315[var13][var16];
        while (arg9 != var13 || arg10 != var16) {
            if (var29 != var30) {
                class6.field131[var38] = var13;
                var29 = var30;
                class121.field2993[var38++] = var16;
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
            var30 = class15.field315[var13][var16];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class121.field2993[var38];
            int var33 = class6.field131[var38];
            if (arg4 == 0) {
                class111.field2660.method938((byte) 63, 99);
                class111.field2660.method641((byte) -28, var31 + var31 + 3);
                class104.field2454++;
            }
            if (arg4 == 1) {
                class19.field383++;
                class111.field2660.method938((byte) 63, 80);
                class111.field2660.method641((byte) -28, var31 + var31 + 3 + 14);
            }
            if (arg4 == 2) {
                class111.field2660.method938((byte) 63, 81);
                class67.field1475++;
                class111.field2660.method641((byte) -28, var31 + var31 + 3);
            }
            class111.field2660.method632(-21994, class130.field3164 + var33);
            class111.field2660.method621(1474, class19.field370[82] ? 1 : 0);
            class111.field2660.method622(class61.field1329 + var32, (byte) 108);
            class54.field1201 = class6.field131[0];
            class87.field2091 = class121.field2993[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class111.field2660.method641((byte) -28, class6.field131[var38] - var33);
                class111.field2660.method633(false, class121.field2993[var38] - var32);
            }
            return true;
        } else if (arg4 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLae;Lae;I)V", line = 503)
    public static final void method359(boolean arg0, class6 arg1, class6 arg2, int arg3) {
        short var4 = 151;
        int var7 = var4 - 3;
        field1000++;
        if (class32.field772) {
            class32.field772 = false;
            class63.method458(false);
            class8.method81(17);
            class75.method600(8);
            class133.method1093(false);
            class138.method1116(class12.field244, class116.field2725, class102.field2397, 41, class15.field304);
            class118.method970(class102.field2412, class126.field3086 == -1, (byte) 105, -1, class68.field1493);
            class102.field2405 = true;
            class81.field1964 = true;
            class15.field312 = true;
        }
        class32.method294(-6414);
        class102.field2397.method88(arg1, 257, var7, 0);
        class102.field2397.method88(arg1, 256, var7 - 1, 16777215);
        int var5 = -30 % ((-arg3 - 1) / 60);
        if (arg2 != null) {
            var7 += 15;
            if (arg0) {
                int var6 = class102.field2397.method96(arg2) + 4;
                class74.method579(257 - var6 / 2, var7 + -11, var6, 11, 0);
            }
            class102.field2397.method88(arg2, 257, var7, 0);
            class102.field2397.method88(arg2, 256, var7 - 1, 16777215);
        }
        class89.method754((byte) -103);
    }
}
